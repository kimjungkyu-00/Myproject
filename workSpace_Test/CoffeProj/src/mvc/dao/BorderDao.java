package mvc.dao;

import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import mvc.dto.Border;

//데이터(Border list)를 관리함
public class BorderDao {
	final static String LIST = "list";
	ArrayList<Border> list  = null;
	ServletContext context = null;
	
	public BorderDao(HttpServletRequest request) { //생성자(리스트가 없으면 생성, 있으면 불러오기)
		//생성한 리스트를 application에 저장한다.
		context = request.getServletContext();
		
		if(context.getAttribute(LIST) == null) {
			list = new ArrayList<>(); //리스트 생성
			
			context.setAttribute(LIST, list);
		}else { //list가 존재하는 경우에 존재하는 리스트를 가져온다.
			list = (ArrayList<Border>)context.getAttribute(LIST);
		}
	}
	
	public void setBorderList() { //수정한 뒤 저장할때
		context.setAttribute(LIST, list); //context에 수정한 리스트 저장
	}
	
	public ArrayList<Border> getBorderList(){ //리스트 가져오기
		return list;
	}
	
	public Border searchIndex(int index) { //인덱스로 리스트안에 보더 가져오기
		return list.get(index);
	}
	
	public Border delBorder(int index) { //리스트 삭제
		Border delBorder = list.remove(index);
		this.setBorderList();
		return delBorder;
	}
	
	public void addBorder(Border border) { //리스트 수정 후 추가
		list.add(border);
		this.setBorderList();
	}
}
