package spring.mvc.controller;


import java.util.HashMap;
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

import spring.mvc.dto.MemberLoginVO;
import spring.mvc.dto.MemberVO;
import spring.mvc.service.MemberService;



@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	//로그인폼
	@RequestMapping(value = "/login")
	public String login(Model model) {		
		return "member/login";
	}
	
	//회원가입 폼
	@RequestMapping(value = "/signUp")
	public String signUp(Model model) {		
		return "member/signUpForm";
	}
	
	//로그인 완료
	@RequestMapping(value = "/loginOk")
	public String loginOk(Model model) {		
		return "member/loginOk";
	}

	//회원가입 완료
	//@RequestMapping(value = "/signUp.do")
	public String signUpOk(Model model) {
		return "member/signUpOk";
	}
	
	//회원정보 불러오는 페이지
	@RequestMapping(value = "/memberInfo")
	public String list(MemberVO memberVO, Model model) {
		MemberVO memberVO1 = memberService.memberInfo(memberVO);
		
		model.addAttribute("member" , memberVO1);
		return "member/updateMember";
	}
	
	//회원가입
	@RequestMapping(value = "/db_signup.do", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> test(MemberVO memberVO){
		memberService.memberSignUp(memberVO);
		System.out.println("in?");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("data", "success");
		return map;
	}
	
	
	// 아이디 중복 체크
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
	
	//회원정보 수정
	@RequestMapping(value="/updateMember.do",method=RequestMethod.GET)
	public String update(MemberVO memberVO,HttpSession session ) {
		memberService.memberModify(memberVO);
		session.setAttribute("member", memberVO);
		return "redirect:/";
	
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String delete(MemberVO memberVO,HttpSession session) {
		memberService.memberDelete(memberVO);
		session.invalidate();
		return "redirect:/";
	
	}
	
	//메인에서 이름누르면 회원정보수정하는 페이지 넘어가기전 비밀번호확인
	@RequestMapping(value = "/pwCheckSubmit")
	public String pwCheck(Model model) {		
		return "member/pwCheck";
	}
	

	
	
	
}
