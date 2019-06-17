package spring.mvc.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.xml.ws.spi.http.HttpHandler;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.http.MediaType;

import spring.mvc.dto.BoardVO;
import spring.mvc.dto.Criteria;
import spring.mvc.dto.ReplyVO;
import spring.mvc.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;

	static String path;

	// 실종 강아지
	@RequestMapping(value = "/lost1")
	public String find(Model model) {
		return "lost/findView";
	}



	@RequestMapping(value = "/db_findWrite.do")
	public @ResponseBody Map<String, Object> test(BoardVO boardVO) {
		System.out.println(boardVO);
		boardVO.setFileName(path);
		boardService.insertBoard(boardVO);
		System.out.println("in?");
		System.out.println(boardVO.getFileName());
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("data", "success");
		return map;
	}

	// 글쓰고나서 등록된거(첫화면)
	@RequestMapping(value = "/findList")
	public ModelAndView listBoard(BoardVO boardVO) {
		List<BoardVO> list = boardService.getFindListBoard();

		ModelAndView mav = new ModelAndView();
		mav.setViewName("lost/findView");
		mav.addObject("listBoard", list);
		return mav;
	}

//	@RequestMapping(value = "/findView.do/{board_no}")
//	public String contentView(@PathVariable int board_no, BoardVO boardVO, Model model) {
//		BoardVO boardVO1 = boardService.getFindView(boardVO);
//		
//		model.addAttribute("find", boardVO1);
//		
//		
//		return "lost/detail_findView";
//	}
	@RequestMapping(value = "/findView.do/{board_no}")
	public String contentView(@PathVariable int board_no, BoardVO boardVO, Model model,ReplyVO replyVO) {
		BoardVO boardVO1 = boardService.getFindView(boardVO);
		
		model.addAttribute("find", boardVO1);
		//게시판에 담겨있는 모든 댓글 가져오기.
		
		List<ReplyVO> listReply=boardService.getCommentListByReplyBoardNo(boardVO1.getBoard_no());
		model.addAttribute("listReply", listReply);
		
		return "lost/detail_findView";
	}

	// 수정 버튼 눌렀을때
	@RequestMapping(value = "/findUpdateForm/{board_no}")
	public String findUpdateForm(BoardVO boardVO, Model model) {
		BoardVO boardVO2 = boardService.getFindView(boardVO);
		model.addAttribute("findupdate", boardVO2);

		return "lost/findUpdateForm";

	}

	// 글수정 -> 글 수정 후 리스트
	@RequestMapping(value = "/findUpdate/{board_no}", method = RequestMethod.GET)
	public String update_list(BoardVO boardVO, Model model) {
		System.out.println(boardVO.getBoard_no());
		boardService.findUpdateForm(boardVO);
		model.addAttribute("find", boardVO);

		return "redirect:/findList";

	}

	// 글수정 -> 글 삭제 후 리스트
	@RequestMapping(value = "/find_delete/{board_no}", method = RequestMethod.GET)
	public String noticedelete(@PathVariable int board_no, Model model, BoardVO boardVO) {

		boardService.findDeleteForm(boardVO);

		System.out.println("delete");
		System.out.println(board_no);

		return "redirect:/findList";
	}

	@RequestMapping(value = "/uploadAjaxAction")
	public @ResponseBody void uploadAjaxAction( MultipartFile[] uploadFile,
			HttpSession session) {

		String uploadFolder = "C:\\upload";
		String uploadFileName = "";

		for (MultipartFile multipartFile : uploadFile) {
			
			uploadFileName = multipartFile.getOriginalFilename();

			uploadFileName = uploadFileName.substring(uploadFileName.lastIndexOf("\\") + 1);

			System.out.println("only file name : " + uploadFileName);
			File saveFile = new File(uploadFolder, uploadFileName);

			try {
				multipartFile.transferTo(saveFile);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

		path = uploadFileName;
		
		System.out.println(path);
		
	}
	
	

	@RequestMapping(value="/display", method = RequestMethod.GET)
	public ResponseEntity<byte[]> displayFile(@RequestParam("name") String fileName) throws Exception
	{
		InputStream in = null;
		ResponseEntity<byte[]> entity = null;
		try {
			String formatName = fileName.substring(fileName.lastIndexOf(".")+1);
			MediaType mType = null;
			if(formatName.equals("JPG") || formatName.equals("jpg") )
			{
				mType = MediaType.IMAGE_JPEG;
			}
			if(formatName.equals("GIF") || formatName.equals("gif") )
			{
				mType = MediaType.IMAGE_GIF;
			}
			if(formatName.equals("PNG") || formatName.equals("png") )
			{
				mType = MediaType.IMAGE_PNG;
			}
			
			HttpHeaders headers = new HttpHeaders();
			in = new FileInputStream("C:\\upload\\" + fileName);
			
			System.out.println(mType);
			
			if(mType != null)
			{
				headers.setContentType(mType);
			}
			else
			{
				fileName = fileName.substring(fileName.indexOf("_")+1);
				headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
				headers.add("Content-Disposition", "attachment; filename=\""+ new String(fileName.getBytes("UTF-8"),"ISO-8859-1")+"\"");
			}
			
			entity = new ResponseEntity<byte[]>(IOUtils.toByteArray(in),headers,HttpStatus.CREATED);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			entity = new ResponseEntity<byte[]>(HttpStatus.BAD_REQUEST);
		}finally {
			in.close();
		}
		return entity;
	}

	@RequestMapping(value = "/search.do")
	@ResponseBody
	public ModelAndView searchList(@RequestParam("searchOption") String searchOption, @RequestParam("keyword") String keyword) {

		System.out.println("searchOption : " + searchOption);
		System.out.println("keyword :" +keyword);
		List<BoardVO> list = boardService.listAll(searchOption, keyword);
		ModelAndView mav = new ModelAndView();


		mav.addObject("listBoard", list);
		mav.setViewName("lost/findView");
		System.out.println(list);
		return mav;

	}

}
