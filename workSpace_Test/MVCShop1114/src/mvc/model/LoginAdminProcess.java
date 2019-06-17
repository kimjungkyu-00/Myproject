package mvc.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAdminProcess implements Model {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("=======LoginAdminProcessModel-process()");
		
		String forwardPage = "/item_add.jsp";
		return forwardPage;
	}
}
