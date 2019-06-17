package spring.mvc.dao;

import javax.servlet.http.HttpSession;

import spring.mvc.dto.MemberVO;

public interface MemberDAO {
	public void memberSignUp(MemberVO memberVO);
	
	// 아이디 중복 체크
	public int CheckDuplication(String inputId);
	
	//로그인	
	
	public MemberVO memberInfo(MemberVO memberVO);
	
	//회원정보 수정
	public void memberModify(MemberVO memberVO);
	
	public void memberDelete(MemberVO memberVO);
	
	public void logout(HttpSession session);
}
