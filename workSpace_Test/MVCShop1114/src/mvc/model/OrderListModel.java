package mvc.model;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.dto.Product;

public class OrderListModel implements Model {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		String forwardPage = "/order_list.jsp";
		//1. 상품 선택된 목록 가져오기
		//checkbox 에 선택된 내용 가져오기
		String[] checkArr = request.getParameterValues("checkItem");
		try {
			System.out.println(">>>>>>> checkArr : ");
			for(int i=0; i < checkArr.length; ++i ) {
				System.out.println("checkArr["+i+"] :"+checkArr[i]);
			}
			
			//check된 상품 리스트 만들기
			//context(application)영역에 있는 상품 리스트를 가져오기
			ArrayList<Product>  list = (ArrayList)request.getServletContext().getAttribute("itemlist") ;
			
			//상품리스트 중에 cartlist를 만든다.
			ArrayList<Product> cartlist = new ArrayList<>();
			for(int i=0,checkArrIndex=0; i < list.size(); ++i) {
				//if(checkArr[i].equals(""+i)) {
				if(Integer.parseInt(checkArr[checkArrIndex])==i) {
					cartlist.add(list.get(i));
					System.out.print("checkArr[checkArrIndex]"+checkArr[checkArrIndex] );
					System.out.println(", i : "+i );
					++checkArrIndex;
					if( checkArrIndex == checkArr.length) {
						break;
					}
					
					
				}
			}
			//만든 cartlist를  order_lilst.jsp에 전달하기위하여 session에 저장
			request.getSession().setAttribute("cartlist", cartlist);
		}catch(NullPointerException e) {
			System.out.println(e.getMessage()); //오류메시지
			e.printStackTrace();//오류지점확인
		}
		
		return forwardPage;
	}
}

