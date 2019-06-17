package com.han.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.han.user.service.UserAccountService;
import com.han.user.vo.UserAccountVO;

@Controller
public class UserAccountController {
	
	@Autowired
	private UserAccountService acountService;
	
	@RequestMapping("/")
	public String main() {
		return "signUp";
	}

//	// 로그인 페이지로 이동
//	@RequestMapping("login.do")
//	public String GoLoginPage() {
//		return "user/account/login";
//	}
//
//	// 회원가입 페이지로 이동
//	@RequestMapping("signup.do")
//	public String GoSignUpPage() {
//		return "user/account/signup";
//	}
//
//	// 회원 로그인
//	@RequestMapping("userSignIn.do")
//	public String SubmitSignIn() {
//
//		return "";
//	}
//
	// 회원가입
	@RequestMapping("userSignUp.do")
	public String SubmitSignUp(UserAccountVO accountVo) {
		acountService.UserSignUp(accountVo);
		return "signUpOk";
	}
}
