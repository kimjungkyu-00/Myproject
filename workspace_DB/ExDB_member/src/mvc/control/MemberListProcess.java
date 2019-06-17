package mvc.control;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MyDB;
import dto.Member;
import mvc.model.Service;

public class MemberListProcess implements Service {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		String nextPage="member_list.jsp";
		MyDB mydb =null;


			try {
				mydb = new MyDB();		
		
				ArrayList<Member> list = mydb.getMemberList();
				
				request.getServletContext().setAttribute("memberlist", list);
				
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}finally {
				try {mydb.close();} catch(SQLException e) {e.printStackTrace();		}
			}
	

	
		
		return nextPage;
	}

}
