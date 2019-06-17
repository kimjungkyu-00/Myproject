package mvc.model;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.dao.BorderDao;
import mvc.dto.Border;

public class ContentModel implements Model {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		String forward = "/content.jsp";
		
		//list.jsp에서 인덱스번호 받아오기
		//받은 번호 == 글인덱스와 같음
		int num = Integer.parseInt(request.getParameter("num"));
		System.out.println("*****select num: "+num);
		
		//list의 해당 인덱스의 상세내용을 저장
		BorderDao dao = new BorderDao(request);
		
		//if(list != null) {
		if(dao != null) {
			Border contBorder = dao.searchIndex(num);
			request.getSession().setAttribute("contBorder", contBorder);
			request.getSession().setAttribute("num", num);
		}
		
		return forward;
	}

}
