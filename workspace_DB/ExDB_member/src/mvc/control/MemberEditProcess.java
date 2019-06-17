package mvc.control;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MyDB;
import mvc.model.Service;

public class MemberEditProcess implements Service {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		String nextPage = "member_list.jsp";
		
		//member_edit.jsp에서 넘겨준 값을 받아온다.
		String reqId =request.getParameter("edit_id");
		String reqPw =request.getParameter("edit_pw");

		
		//db연결해서 내용수정하기
		MyDB mydb= null;
		try {
			mydb = new MyDB();
		
			mydb.editMemberPw(reqId, reqPw);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {mydb.close();}catch(Exception e){e.printStackTrace();}
		}
		return nextPage;
	}

}
