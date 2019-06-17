package spring.mvc.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import spring.mvc.dto.BoardVO;
import spring.mvc.dto.Criteria;
import spring.mvc.dto.PageMaker;
import spring.mvc.dto.SearchCriteria;
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



	@RequestMapping(value = "/db_findWrite.do" )
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
	   public String listBoard(@ModelAttribute("cri") Criteria cri,BoardVO boardVO, Model model) throws Exception {
		    
		   model.addAttribute("list", boardService.listCriteria(cri)); // JSP에 계산된 페이징 출력
			
		   
		   
		   PageMaker pageMaker = new PageMaker(); // 객체생성

			pageMaker.setCri(cri); // setCri 메소드 사용

			pageMaker.setTotalCount(boardService.totalCount(cri)); // 전체 게시글 갯수 카운트

			model.addAttribute("pageMaker", pageMaker);

	      return "lost/findView";
	   }
	   

	@RequestMapping(value = "/findView.do/{board_no}")
	public String contentView(@PathVariable int board_no, BoardVO boardVO, @ModelAttribute("cri") Criteria cri, Model model) throws Exception {
		
		BoardVO boardVO1 = boardService.getFindView(boardVO);
		
		model.addAttribute("cri", cri);
		model.addAttribute("find", boardVO1);
		
		return "lost/detail_findView";
	}

	// detail에서 수정 버튼 눌렀을때
	@RequestMapping(value = "/findUpdateForm/{board_no}")
	public String findUpdateForm(BoardVO boardVO, Model model) throws Exception {
		BoardVO boardVO2 = boardService.getFindView(boardVO);
		model.addAttribute("findupdate", boardVO2);

		return "lost/findUpdateForm";

	}

	// 글수정 -> 글 수정 후 리스트
	@RequestMapping(value = "/findUpdate", method = RequestMethod.POST)
	public String update_list(BoardVO boardVO, Model model) throws Exception {
		System.out.println(boardVO.getBoard_no());
		
		//작성자가 수정한것만 update
		boardService.findUpdateForm(boardVO);
		
		BoardVO boardVO2 = boardService.getFindView(boardVO);
		
		model.addAttribute("list", boardVO2);

		return "redirect:/findList";

	}

	// 글수정 -> 글 삭제 후 리스트
	@RequestMapping(value = "/find_delete", method = RequestMethod.GET)
	public String boardDelete(BoardVO boardVO, @ModelAttribute("cri") SearchCriteria cri,RedirectAttributes rttr) {


		System.out.println(boardVO.getBoard_no());
		boardService.findDeleteForm(boardVO);
		rttr.addFlashAttribute("cri", cri);

		System.out.println("delete");
		
		return "redirect:/findList";
	}

	@RequestMapping(value = "/uploadAjaxAction", method = RequestMethod.POST)
	public @ResponseBody void uploadAjaxAction( MultipartFile[] uploadFile, HttpSession session) {
		
		System.out.println("uploadAjaxAction");
		
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
	
	

	@RequestMapping(value="/display")
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
		public ModelAndView searchList(@ModelAttribute("scri") SearchCriteria scri) throws Exception {
			 
			List<BoardVO> list = boardService.listSearchCriteria(scri); // 검색기능
			 
			 
			 System.out.println(list);
		      ModelAndView mav = new ModelAndView();
		      PageMaker maker = new PageMaker();// 페이징 처리
		      maker.setCri(scri);
		      maker.setTotalCount(boardService.listSearchCount(scri)); // 전체 게시물에 대한 페이징

		      mav.addObject("list", list);
		      mav.addObject("pageMaker", maker);
		      mav.setViewName("lost/findView");
		      return mav;
	   

	}
	
          
	
	/** 글 읽기(detail) 
	 * @throws Exception */
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public String read(@RequestParam("board_no") int board_no, BoardVO boardVO, @ModelAttribute("cri") Criteria cri, Model model) throws Exception {
			// page정보와 perPageNum을 받을 수 있도록 Criteria 객체를 추가해주고요
			// 게시글 bno 정보도 같이 넘어오니까 bno도 가지고 있어야겠죠
		
			
			BoardVO boardVO1 = boardService.getFindView(boardVO);
			
			model.addAttribute("cri", cri);
			model.addAttribute("list", boardVO1);
			

		return "lost/detail_findView"; // 글 읽기 페이지 뷰를 띄운다.
	}
	
	
	
	
	

}
