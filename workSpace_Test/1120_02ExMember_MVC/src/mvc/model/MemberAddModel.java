package mvc.model;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.dto.Member;

public class MemberAddModel implements Model {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		String forward="/memberinfor.jsp";
		System.out.println("MemberAddModel---process");
		
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		
		Member newMember= new Member();
		newMember.setName(name);
		newMember.setPhone(phone);
		
		//새로운 멤버를 memberlist에 저장한다.
		//1.memberlist를 가져온다
		ArrayList<Member> list = (ArrayList)request.getServletContext().getAttribute("memberlist");
		//2.memberlist가 없는 경우 생성
		if( list == null ) {
			list = new ArrayList<>();
		}
		//3.새로운 멤버를 memberlist에 저장
		list.add(newMember);
		
		//4.application 영역에 저장한다. (저장은 setAttr ) ok..?
		request.getServletContext().setAttribute("memberlist", list);
		
		//memberInfor.jsp에 전달하기 위하여 request영역에 저장
		request.setAttribute("newMember", newMember);
		
		return forward;
	}

}
