package mvc.model;

import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.dto.*;

public class MemberInforModel implements Model {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		String forward = "/memberInfor2.jsp";
		//radio버튼의 선택 학인
		String ck = request.getParameter("info");
		//선택정보에 따른 확인
		if(ck == null || ck=="") {
			//선택이 되지 않았거나 받지못한경우
			System.out.println("(ck == null || ck==)");
		}else {
			//memberlist에서 해당되는 회원정보를 넘겨준다.
			//1.memberlist를 가져온다

			ArrayList<Member> list = (ArrayList)	request.getServletContext().getAttribute("memberlist");
			//2.해당되는 정보를 찾는다.
			int i = Integer.parseInt(ck);
			Member member = list.get(i);
			//3.해당되는 정보를 request넘겨준다
			request.setAttribute("informemberlist", member);
		}
		return forward;
	}

}
