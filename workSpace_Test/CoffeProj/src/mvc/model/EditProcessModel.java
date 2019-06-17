package mvc.model;

import java.util.*;

import mvc.dao.BorderDao;
import mvc.dto.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EditProcessModel implements Model {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		String forward = "/list.jsp";
		
		//수정된 모든 내용을 가져온다.
		String no = request.getParameter("no");
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String content = request.getParameter("content");
		
		//가져온 데이터로 Border 객체를 생성한다.
		Border editBorder = new Border(title, author, content, new Date());
		
		//list 가져오기
		BorderDao dao = new BorderDao(request);
		
		//list에 수정한 글을 삭제하고 수정된 글을 저장한다.
		dao.delBorder(Integer.parseInt(no));
		
		//새로 수정된 내용 추가
		dao.addBorder(editBorder);
		
		return forward;
	}

}
