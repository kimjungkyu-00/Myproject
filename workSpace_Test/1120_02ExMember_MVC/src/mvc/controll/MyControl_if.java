package mvc.controll;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.model.*;

/**
 * Servlet implementation class MyControl
 */
//@WebServlet("*.do")
public class MyControl_if extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String findReqUrl(String url){
		String reqUrl=null;
		String[] splitArr = url.split("/");
		reqUrl = splitArr[splitArr.length-1];
		System.out.println("reqUrl : "+ reqUrl);
		return reqUrl;
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() --- contextPath : "+request.getContextPath());
		System.out.println(" uri : "+request.getRequestURI());
		
		//1. 접속한 url정보를 가져온다
		String url = request.getRequestURI();
		url = findReqUrl(url);
		System.out.println("url : "+url);
		//2.해당되는 요청에 따른 처리하기
		String forward = null;
		if( url.equals("memberAdd.do") ) {
			//실행하기 위하여 인스턴스화한다->객체 만들어짐
			MemberAddModel service = new MemberAddModel();
			//member 가입에 해당되는 처리
			forward = service.process(request, response);
		}else if(url.equals("Memberlist.do")) {
			MemberListModel service = new MemberListModel();
			
			forward = service.process(request, response);
		}else if(url.equals("memberinfor2.do")) {
			MemberInforModel service = new MemberInforModel();
			
			forward = service.process(request, response);
		}
		
		if( forward == null ) {
			System.out.println("forwardPage error");
			forward="index.jsp";
		}
		//3.요청의 처리후 처리 결과 보여줌
		//처리후 에 view함( 처리 결과 화면)
		RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
		dispatcher.forward(request, response);
		
								//다음페이지를 이동하기위해 톰켓한테 알려주는 것.?
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
