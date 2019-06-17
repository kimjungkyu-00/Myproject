package spring.mvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	@RequestMapping(value = "/noticeWriterForm.do")
	public String noticeWriterForm(NoticeVO noticeVO) {

		noticeService.InsertWriter(noticeVO);

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
	@RequestMapping(value = "/notice2ViewUpdate.do", method = RequestMethod.GET)
	public String noticeViewUpdate(NoticeVO noticeVO, Model model) {
		noticeService.noticeViewUpdate(noticeVO);
		model.addAttribute("updateNotice", noticeVO);

		return "redirect:/notice2List.do";

	}

	// 글수정 -> 글 삭제 후 리스트
	@RequestMapping(value = "/noticeDelete/{nidx}", method = RequestMethod.GET)
	public String noticedelete(@PathVariable int nidx, Model model, NoticeVO noticeVO) {

		noticeService.noticeDelete(noticeVO);

		System.out.println("delete");
		System.out.println(nidx);

		return "redirect:/notice2List.do";
	}

}
