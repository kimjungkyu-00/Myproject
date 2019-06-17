package mvc.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JoinFormModel implements Model {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		String forwardPage="joinProcess.jsp";
		
		return forwardPage;
	}

}
