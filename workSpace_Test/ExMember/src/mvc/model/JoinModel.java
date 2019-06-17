package mvc.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JoinModel implements Model {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("============JoinModel - process()");
		String forwardPage = "/JoinOk.jsp";
		
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		return forwardPage;
	}

}
