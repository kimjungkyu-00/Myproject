package mvc.model;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.dao.BorderDao;
import mvc.dto.Border;

public class DeleteModel implements Model {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		String forward = "/list.jsp";
		
		//list.jsp에서 인덱스번호 받아오기
		//받은 번호 == 글인덱스와 같음
		int num = (int)request.getSession().getAttribute("num");
		System.out.println("*****select num: "+num);
		
		//해당 글 삭제
		//list 가져오기 삭제하기 저장하기
		BorderDao dao = new BorderDao(request);
		
		Border delBorder = dao.delBorder(num);
		System.out.println("del border: "+delBorder.getTitle());		
						
		return forward;
	}

}
