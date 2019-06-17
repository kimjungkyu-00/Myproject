package mvc.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PaymentProcessModel implements Model {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		
		String forwardPage="/payment_process.jsp";
		
		return forwardPage;
	}

}
