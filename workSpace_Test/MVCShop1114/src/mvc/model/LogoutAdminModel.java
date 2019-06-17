package mvc.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutAdminModel implements Model {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("LogoutAdminModel---process()");
		String forwardPage = "/item_list.jsp";
		if( null != request.getSession().getAttribute("admin")) {
			request.getSession().invalidate();
			forwardPage = "index.jsp";
			System.out.println("       logout");
		}
		
		return forwardPage;
	}

}
