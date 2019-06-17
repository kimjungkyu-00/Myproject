package mvc.model;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.dto.Member;

public class MemberListModel implements Model {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		String forward = "/memberlist.jsp";
		ArrayList<Member> list=null;
		//memberlist를 불러준다.
		list = (ArrayList)request.getServletContext().getAttribute("memberlist");
		
		//memberlist가 없으면 생성
		if(null == list ) {
			//memberlist생성 최초인경우
			list = new ArrayList<Member>();
		}
		//memberlist를 넘겨준다
		request.getServletContext().setAttribute("memberlist", list);
		
	
		
		return forward;
	}

}
