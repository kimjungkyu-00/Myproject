package mvc.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.dto.Login;

public class LoginAdminModel implements Model {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("============LoginAdminModel - process()");
		String forwardPage = "/login_admin.jsp";
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		//id=admin pw=1234 ������ �˻�.
		if( id != null && pw != null ) {
			String adminPw 
			      = request.getServletContext().getInitParameter("adminPw");
			System.out.println("----initparam(adminPw):"+adminPw);			
			String adminId 
		         = request.getServletContext().getInitParameter("adminID");
		      System.out.println("----initparam(adminID):"+adminId);			
		
			       
			if(id.equals(adminId) && pw.equals(adminPw) ) {
				Login  log = new Login();
				if( log != null ) {
					log.setId(id);
					log.setPw(pw);
					
					request.getSession().setAttribute("admin",log );
					forwardPage="/loginadmin_process.jsp";
				}
			}
		}
		return forwardPage;

	}
}
