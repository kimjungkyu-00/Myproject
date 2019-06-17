package mvc.model;

import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.dao.BorderDao;
import mvc.dto.Border;

public class ListModel implements Model {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("ListModel()========================================");
		String forward = "/list.jsp";

		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String content = request.getParameter("content");
		
		Border newBorder = new Border(title, author, content, new Date());
		
		request.getSession().setAttribute("newBorder", newBorder);
		
		BorderDao dao = new BorderDao(request);
		
		if(dao == null) {
			System.out.println("list가 없습니다.");
		}else {
			dao.addBorder(newBorder);
		}
		
		
		return forward;
	}

}
