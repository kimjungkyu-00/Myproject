package spring.mvc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.mvc.dto.Criteria;
import spring.mvc.dto.PageMaker;
import spring.mvc.dto.ReplyVO;
import spring.mvc.service.ReplyService;

@Controller
public class ReplyController {

	@Autowired
	private ReplyService replyService;
	

	@RequestMapping(value = "/replyInsert.do/{board_no}", method = RequestMethod.POST )
	@ResponseBody
	public void listReply(ReplyVO replyVO, @RequestParam("board_no")int board_no, @ModelAttribute("cri") Criteria cri, Model model) {
		PageMaker pageMaker = new PageMaker(); // 객체생성

		pageMaker.setCri(cri); // setCri 메소드 사용

		model.addAttribute("pageMaker", pageMaker);
		model.addAttribute("cri",cri);
		replyService.insertReply(replyVO);
		System.out.println("insert : " +replyVO );
		
			
	}
	
	@RequestMapping(value = "/replyGet.do/{board_no}", method = RequestMethod.GET )
	@ResponseBody
	public Map<String, Object> replyVO(ReplyVO replyVO, @RequestParam("board_no")int board_no, @ModelAttribute("cri") Criteria cri, Model model, HttpSession session){
		List<ReplyVO> list = replyService.getCommentListByReplyBoardNo(board_no);
		System.out.println(list);
		model.addAttribute("cri",cri);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list);
		System.out.println(list);
		map.put("session", session.getAttribute("member"));
		return map;
	
	
	
	}
	
	@RequestMapping(value = "/replyUpdate.do/{reply_no}", method = RequestMethod.POST )
	@ResponseBody
	public int updateReply(ReplyVO replyVO, 
			@RequestParam("reply")String reply,
			@RequestParam("reply_no")int reply_no) throws Exception{
		
		System.out.println("update" + replyVO);
		return replyService.updateReply(replyVO);
		
	}
	
	
	
	@RequestMapping(value = "/deleteReply/{reply_no}", method = RequestMethod.GET)
	@ResponseBody
	public int deleteReply(@PathVariable int reply_no, ReplyVO replyVO) throws Exception {

		System.out.println("delete");

		return replyService.deleteReply(reply_no);
	}
	
	
	
	
	
	
	

}
