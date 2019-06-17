package spring.mvc.service;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.mvc.dao.MemberDAO;
import spring.mvc.dto.MemberLoginVO;
import spring.mvc.dto.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	
	@Autowired
	private MemberDAO dao;
	
	@Override
	public void memberSignUp(MemberVO memberVO) {
		dao.memberSignUp(memberVO);
	}
	
	@Override
	// 아이디 중복 체크
	public int CheckDuplication(String inputId) {

		int idCnt = dao.CheckDuplication(inputId);
		return idCnt;
	}

	@Override
	public boolean loginCheck(MemberVO memberVO, HttpSession session) {
		MemberVO memberVO2 = viewMember(memberVO);
		if(memberVO2 != null) { //true이면 session에 등록
			
			//세션 변수 등록
			session.setAttribute("member", memberVO2);
			
			return true;
		}
		return false;
	}

	@Override
	public MemberVO viewMember(MemberVO memberVO) {
		return dao.memberInfo(memberVO);
	}

	@Override
	public void logout(HttpSession session) {
		session.invalidate(); //세션 정보를 초기화 시켜준다
		System.out.println("logout");
	}

	@Override
	public MemberVO memberInfo(MemberVO memberVO) {
		
		return dao.memberInfo(memberVO);
	}

	@Override
	public void memberModify(MemberVO memberVO) {
		dao.memberModify(memberVO);
		
	}

	@Override
	public void memberDelete(MemberVO memberVO) {
		dao.memberDelete(memberVO);
		
	}



		
	
	
	

}
