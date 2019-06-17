package spring.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.dto.BoardVO;
import spring.mvc.dto.ReplyVO;
import spring.mvc.service.ReplyService;

@Controller
public class ReplyController {

	@Autowired
	private ReplyService replyService;

//	@RequestMapping(value = "/replyInsert.do" , method=RequestMethod.POST)
//	public @ResponseBody void insertReply (ReplyVO replyVO) {
//		
//		System.out.println("왓다");
//		replyService.insert(replyVO);
//		System.out.println(replyVO);
//		
//		
//	}

	
//	@RequestMapping(value = "/replyInsert.do")
//	public ModelAndView listReply(ReplyVO replyVO) {
//		List<BoardVO> list = replyService.getReplyBoard();
//
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("lost/detail_findView");
//		mav.addObject("listReply", list);
//		
//		replyService.insert(replyVO);
//
//		return mav;
//	}
	
	@RequestMapping(value = "/replyInsert.do")
	@ResponseBody
	public ModelAndView listReply(ReplyVO replyVO) {
		replyService.insert(replyVO);
		System.out.println("insert : " +replyVO );
		List<BoardVO> list = replyService.getReplyBoard();
		
		System.out.println(list);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("lost/detail_findView");
		mav.addObject("listReply", list);
		

		return mav;
	}
	
	
	

}
