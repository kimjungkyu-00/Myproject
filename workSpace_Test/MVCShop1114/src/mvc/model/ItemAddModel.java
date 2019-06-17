package mvc.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//itemadd.do 
public class ItemAddModel implements Model {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		String forwardPage = "/item_add.jsp";
	
		
		if( null != request.getSession().getAttribute("admin") ) {
			//admin이 로그인 되어있으면
			forwardPage ="/item_add.jsp";
		}else {
		//admin으로 로그인 되어있지 않으면
			forwardPage ="/login_admin.jsp";//로 화면 전화
		}
		return forwardPage;
	}

}
