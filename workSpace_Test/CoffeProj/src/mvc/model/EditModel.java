package mvc.model;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.dto.Border;

public class EditModel implements Model {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		String forward = "/edit.jsp";
		
		//글번호 저장
		int num = (int)request.getSession().getAttribute("num");
		request.getSession().setAttribute("editNo", num);
		System.out.println("*****editNo: "+num);
		
		return forward;
	}

}
