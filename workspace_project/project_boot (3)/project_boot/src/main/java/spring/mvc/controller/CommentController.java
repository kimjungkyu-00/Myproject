package spring.mvc.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mysql.cj.Session;

import spring.mvc.dto.CommentVO;
import spring.mvc.dto.MemberVO;
import spring.mvc.dto.NoticeVO;
import spring.mvc.service.CommentService;
import spring.mvc.service.NoticeService;

@Controller
public class CommentController {

	@Autowired
	private CommentService commentService;

	@Autowired
	private NoticeService noticeService;

	@RequestMapping(value = "/comment")
	public String main(Model model) {
		return "tab/comment";
	}

	@RequestMapping(value = "/writeComment.do")
	public @ResponseBody CommentVO writeComment(@RequestParam Map<String, Object> params) {
		
		System.out.println("CommentVO");
		CommentVO com = new CommentVO();
		com.setBoardidx(Integer.parseInt((String) params.get("nidx")));
		com.setContents((String) params.get("contents"));
		com.setWriter((String) params.get("userid"));
		System.out.println((String) params.get("userid"));
		System.out.println((String) params.get("contents"));

		
		
		int commentIdx = commentService.WriteComment(com);
		// CommentVO commentVO= commentService.getComment(com.getIdx());
		return com;	
	}

	@RequestMapping(value = "/updateComment.do")
	@ResponseBody
	public CommentVO updateComment(@RequestParam Map<String, Object> params) {
		CommentVO com = new CommentVO();
		com.setIdx(Integer.parseInt((String) params.get("idx")));
		com.setContents((String) params.get("contents"));

		int commentUpdate = commentService.UpdateComment(com);

		return com;
	}

	@RequestMapping(value = "/updateCommentview.do")
	@ResponseBody
	public CommentVO updateCommentview(@RequestParam Map<String, Object> params) {
		CommentVO com = new CommentVO();
		com.setIdx(Integer.parseInt((String) params.get("idx")));
		com.setContents((String) params.get("contents"));

		return com;
	}

	@RequestMapping(value = "/deleteComment.do")
	@ResponseBody
	public CommentVO updateDelete(@RequestParam Map<String, Object> params) {
		CommentVO com = new CommentVO();
		com.setIdx(Integer.parseInt((String) params.get("idx")));
		com.setContents((String) params.get("contents"));
		
		int commentdelete = commentService.DeleteComment(com);
		
		return com;
				
			
		
	}
}