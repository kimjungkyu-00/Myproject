package spring.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.dto.NoticeVO;
import spring.mvc.dto.QuestionboardVO;
import spring.mvc.service.QuestionboardService;

@Controller
public class QuestionboardController {

	@Autowired
	QuestionboardService questionboardService;
	
	//자주하는 게시판
		@RequestMapping(value = "/Questionboard")
		public ModelAndView Questionboard(QuestionboardVO questionboardVO) {
			List<QuestionboardVO> questionboardList = questionboardService.QuestionboardList();
			ModelAndView mav = new ModelAndView();
			mav.setViewName("/notice/Questionboard");
			mav.addObject("questionboardList",questionboardList);
			return mav;
		}
		
		@RequestMapping(value = "/QuestionboardWriteForm")
		public String QuestionboardWriteForm(Model model) {
			return "notice/QuestionboardWriteForm";
		}
		
		
		//글작성폼
		@RequestMapping(value = "/QuestionboardWriteForm.do")
		public String QuestionboardWriteForm(QuestionboardVO questionboardVO) {
			questionboardService.InsertWriter(questionboardVO);
			
			return "redirect:/Questionboard";
		}
		
		//글 상세보기
		@RequestMapping(value= "/QuestionboardView.do/{idx:.+}", method = RequestMethod.GET)
			public String QuestionboardView(Model model,QuestionboardVO questionboardVO) {
				QuestionboardVO questionboardVO1 = questionboardService.questionboardView(questionboardVO);
				model.addAttribute("questionboard",questionboardVO1);
				
				System.out.println(questionboardVO1);

				return "notice/QuestionboardView";
			}

	
		
}
