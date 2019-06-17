package mvc.model;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MyDB;
import dto.Member;

public class RegisterProcess implements Service {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		
		String forwardPage = "member_list.jsp";
		String id = request.getParameter("id");
		String pw = request.getParameter("passwd");
		String name = request.getParameter("name");
		String date = request.getParameter("date");
		
		Member newMember = new Member(id,pw,name,date);
		
		MyDB mydb=null;
		try {
			mydb = new MyDB();
			//mydb.connect();
			mydb.insertMember(newMember); 
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {	e.printStackTrace();
		}finally {
			try { 	mydb.close();	}catch(SQLException e) { e.printStackTrace();
		}
	}
		return forwardPage;
	}
}


