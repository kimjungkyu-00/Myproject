package mvc.control;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MyDB;
import mvc.model.Service;

public class MemberDelProcess implements Service {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		String nextPage = "member_list.jsp";
		//1delte.jsp 에서 넘겨준 값 받아오기
		String Delid =request.getParameter("Del_id");
		
		//2. db연결
		MyDB mydb=null;
		
		try {
			mydb= new MyDB();
		
		mydb.deleteMember(Delid);
		}catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
				e.printStackTrace();
		}finally {
			try {mydb.close();}catch(Exception e) {e.printStackTrace();		}
		}
			return nextPage;
	}

}
