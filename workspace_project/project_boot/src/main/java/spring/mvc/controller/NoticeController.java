package spring.mvc.controller;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.dto.CommentVO;
import spring.mvc.dto.NoticeVO;
import spring.mvc.service.NoticeService;

@Controller
public class NoticeController {

	@Autowired
	NoticeService noticeService;

//	  @Autowired
//	  private JavaMailSender mailSender;
	// 1:1 문의하기
		@RequestMapping(value = "/view")
		public String view(Model model) {
			return "notice/view";
		}
		

	 
	    // 다중파일업로드
	    @RequestMapping(value = "/file_uploader_html5.do",
	                  method = RequestMethod.POST)
	    @ResponseBody
	    public String multiplePhotoUpload(MultipartHttpServletRequest request) {
	        // 파일정보
	        StringBuffer sb = new StringBuffer();
	        try {
	            // 파일명을 받는다 - 일반 원본파일명
	            String oldName = request.getHeader("file-name");
	            // 파일 기본경로 _ 상세경로
	            String filePath = "C:\\fileupload\\";
	            String saveName = sb.append(new SimpleDateFormat("yyyyMMddHHmmss")
	                          .format(System.currentTimeMillis()))
	                          .append(UUID.randomUUID().toString())
	                          .append(oldName.substring(oldName.lastIndexOf("."))).toString();
	            InputStream is = request.getInputStream();
	            OutputStream os = new FileOutputStream(filePath + saveName);
	            int numRead;
	            byte b[] = new byte[Integer.parseInt(request.getHeader("file-size"))];
	            while ((numRead = is.read(b, 0, b.length)) != -1) {
	                os.write(b, 0, numRead);
	            }
	            os.flush();
	            os.close();
	            // 정보 출력
	            sb = new StringBuffer();
	            sb.append("&bNewLine=true")
	              .append("&sFileName=").append(oldName)
	              .append("&sFileURL=").append("http://localhost:8090/Spring/resources/fileupload/")
	        .append(saveName);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return sb.toString();
	    }
	
	    
	// 1:1 문의하기
	@RequestMapping(value = "/notice1")
	public String notice1(Model model) {
		return "notice/notice1";
	}

//	 //공지사항 
	@RequestMapping(value = "/notice2List.do")
	public ModelAndView notice(NoticeVO noticeVO) {
		List<NoticeVO> noticeList = noticeService.NoticeList();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/notice/notice2");
		mav.addObject("noticeList", noticeList);
		return mav;
	}

	// 공지사항 -> 글 작성
	@RequestMapping(value = "/notice2WriteForm")
	public String notice2WriteForm(Model model) {
		return "notice/notice2WriteForm";
	}

	// 글작성 -> 리스트
	@RequestMapping(value = "/noticeWriterForm.do" ,method = {RequestMethod.GET, RequestMethod.POST})
	public String noticeWriterForm(NoticeVO noticeVO , String editor) {

		noticeService.InsertWriter(noticeVO);
		System.out.println("저장 데이터 : "+editor);
		return "redirect:/notice2List.do";
	}

	// 리스트 - > 상세보기
	@RequestMapping(value = "/noticeView.do/{nidx:.+}", method = RequestMethod.GET)
	public String view(NoticeVO noticeVO, Model model, CommentVO commentVO) {
		NoticeVO noticeVO1 = noticeService.NoticeView(noticeVO);
		model.addAttribute("notice", noticeVO1);
		// 게시글에 담겨있는 모든 댓글을 가져온다. (001)
		// 그리고 아래처럼 담는다.
		List<CommentVO> commentList = noticeService.getCommentListByNoticeNidx(noticeVO1.getNidx());
		model.addAttribute("commentList", commentList);

		return "notice/noticeView";
	}

	// 상세보기 -> 글 수정
	@RequestMapping(value = "/notice2ViewUpdate/{nidx:.+}", method = RequestMethod.GET)
	public String noticeViewUpdate2(NoticeVO noticeVO, Model model) {
		NoticeVO noticeVO1 = noticeService.NoticeView(noticeVO);

		model.addAttribute("notice", noticeVO1);
		return "notice/notice2ViewUpdate";
	}

	// 글수정 -> 글 수정 후 리스트
	@RequestMapping(value = "/notice2ViewUpdate.do")
	public String noticeViewUpdate(NoticeVO noticeVO, Model model) {
		noticeService.noticeViewUpdate(noticeVO);
		model.addAttribute("updateNotice", noticeVO);

		return "redirect:/notice2List.do";

	}

	// 글수정 -> 글 삭제 후 리스트
	@RequestMapping(value = "/noticeDelete/{nidx}", method = RequestMethod.GET)
	public String noticedelete(@PathVariable int nidx, Model model, NoticeVO noticeVO) {
		noticeService.noticeDelete(noticeVO);
		System.out.println(nidx);
		return "redirect:/notice2List.do";
	}
}