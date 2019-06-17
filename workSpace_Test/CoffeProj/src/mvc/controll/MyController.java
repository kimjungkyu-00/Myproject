package mvc.controll;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.dao.BorderDao;
import mvc.dto.*;
import mvc.model.*;

@WebServlet("*.do")
public class MyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Map<String, Model> map = new HashMap<>();
	
	boolean initBorderState = true;
	
	private void initMap() {
		map.put("list.do", new ListModel());
		map.put("content.do", new ContentModel());
		map.put("delete.do", new DeleteModel());
		map.put("edit.do", new EditModel());
		map.put("editProcess.do", new EditProcessModel());
		System.out.println("***** map.size(): "+map.size());
	}

	private void initBorderList(HttpServletRequest request) {
		System.out.println("init");
		BorderDao dao = new BorderDao(request);
	}
	
	@Override
	public void init() throws ServletException {
		initMap();
		//initBorderList();
	}

	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(initBorderState) {
			initBorderList(request);
			initBorderState = false;
		}
		
		System.out.println("uri: "+request.getRequestURI());
		
		String[] urlArr = request.getRequestURI().split("/");
		String reqUrl = urlArr[urlArr.length-1];
		System.out.println("reqUrl: "+reqUrl);
		
		String forward = null;
		Model service = map.get(reqUrl);
		if(service != null) {
			System.out.println("service != null");
			forward = service.process(request, response);
		}else {
			System.out.println("service == null");
		}
		
		System.out.println("forward: "+forward);
		
		if(forward != null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
			dispatcher.forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
