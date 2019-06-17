package spring.mvc.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.dto.MemberVO;
import spring.mvc.service.MemberService;



@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	//濡쒓렇�씤�뤌
	@RequestMapping(value = "/login")
	public String login(Model model) {		
		return "member/login";
	}
	
	//�쉶�썝媛��엯 �뤌
	@RequestMapping(value = "/signUp")
	public String signUp(Model model) {		
		return "member/signUpForm";
	}
	
	//濡쒓렇�씤 �셿猷�
	@RequestMapping(value = "/loginOk")
	public String loginOk(Model model) {		
		return "member/loginOk";
	}

	//�쉶�썝媛��엯 �셿猷�
	//@RequestMapping(value = "/signUp.do")
	public String signUpOk(Model model) {
		return "member/signUpOk";
	}
	
	//�쉶�썝�젙蹂� 遺덈윭�삤�뒗 �럹�씠吏�
	@RequestMapping(value = "/memberInfo")
	public String list(MemberVO memberVO, Model model) {
		MemberVO memberVO1 = memberService.memberInfo(memberVO);
		
		model.addAttribute("member" , memberVO1);
		return "member/updateMember";
	}
	
	//�쉶�썝媛��엯
	@RequestMapping(value = "/db_signup.do", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> test(MemberVO memberVO){
		memberService.memberSignUp(memberVO);
		System.out.println("in?");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("data", "success");
		return map;
	}
	
	
	// �븘�씠�뵒 以묐났 泥댄겕
	@RequestMapping("duplicationCheck.do")
	@ResponseBody
	public String CheckDuplication(@RequestBody String inputId) {

		String checkRst;
		int idCnt = memberService.CheckDuplication(inputId);
		if(idCnt > 0) 
			checkRst = "F";
		else 
			checkRst = "S";

		return checkRst;
	}
	
	@RequestMapping("loginCheck.do")
	public @ResponseBody String loginCheck(@ModelAttribute MemberVO memberVO, HttpSession session) {
		boolean result = memberService.loginCheck(memberVO, session);
		System.out.println(result);
		if(result == true) {
			return "success";
		}else {
			
			return "failure";
		}
	}
	
	@RequestMapping("/logout")
	public ModelAndView logout(HttpSession session) {
		memberService.logout(session);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/");
		return mav;
		
	}
	
	//�쉶�썝�젙蹂� �닔�젙
	@RequestMapping(value="/updateMember.do",method=RequestMethod.GET)
	public String update(MemberVO memberVO,HttpSession session ) {
		memberService.memberModify(memberVO);
		session.setAttribute("member", memberVO);
		return "redirect:/";
	
	}
	
	//�쉶�썝�깉�눜
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String delete(MemberVO memberVO,HttpSession session) {
		memberService.memberDelete(memberVO);
		session.invalidate();
		return "redirect:/";
	
	}
	
	//硫붿씤�뿉�꽌 �씠由꾨늻瑜대㈃ �쉶�썝�젙蹂댁닔�젙�븯�뒗 �럹�씠吏� �꽆�뼱媛�湲곗쟾 鍮꾨�踰덊샇�솗�씤
	@RequestMapping(value = "/pwCheckSubmit")
	public String pwCheck(Model model) {		
		return "member/pwCheck";
	}
	
	//硫붿씤�뿉�꽌 �씠由꾨늻瑜대㈃ �쉶�썝�젙蹂댁닔�젙�븯�뒗 �럹�씠吏� �꽆�뼱媛�湲곗쟾 鍮꾨�踰덊샇�솗�씤
	@RequestMapping(value = "/memberList.do")
	public ModelAndView memberList() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("member/memberList");
		mav.addObject("memberList", memberService.memberList());
		return mav;
	}
	
	@RequestMapping(value="/adminMemberDelete",method=RequestMethod.POST)
	@ResponseBody
	public void deleteMember(@RequestParam(value="selArr[]") List<String> selArr) {
		System.out.println("deleteMember �뱾�뼱�샂");
		
		MemberVO memberVO = new MemberVO();
		for(int i =0; i<selArr.size(); i++) {
			
			memberVO.setUserid(selArr.get(i));
			System.out.println(selArr.get(i));
			MemberVO member1 = memberService.getMember(memberVO);
			memberService.memberDelete(member1);
		}
	}
	

	
	
	
}
