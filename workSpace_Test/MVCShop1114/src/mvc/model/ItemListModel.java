package mvc.model;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.dto.Product;

public class ItemListModel implements Model {
	

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		
		String forwardPage="/item_list.jsp";
		
		//initlist(request) ; //Maincontroll.java 로 옮김	
		
		return forwardPage;
	}

}
