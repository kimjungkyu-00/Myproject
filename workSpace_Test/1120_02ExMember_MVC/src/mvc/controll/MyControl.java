package mvc.controll;

import java.io.*;
import java.util.*;

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
@WebServlet("*.do")
public class MyControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//1.1map만들기 위해서 생성
	Map<String,Model>  map = new HashMap<>();
	
	
	@Override
	public void init() throws ServletException {
//		initMap();		//소스에서 직접 등록
		initLoadMap();  //파일을 읽어서 등록
	}

	
	//1.map을 만든다.
	private void initMap() {
		System.out.println("initMap()---");
		//1.2map에 데이타 넗기
		map.put("memberAdd.do", new MemberAddModel());
		map.put("Memberlist.do", new MemberListModel());
		map.put("memberinfor2.do", new MemberInforModel());		
	}
	
	//파일을 읽어서 map으로 만든다.
	private void initLoadMap() {
		//파일을 읽는다
		//String file = "/WEB-INF/mapfile";//web저장주소(context)
		String file = getServletContext().getInitParameter("map");
		String mapfile = getServletContext().getRealPath(file);//서버의 HDD 저장위치
		System.out.println("mapfile : "+mapfile);
	
		FileReader fis = null;
		try {
			//FILE 읽기(OPEN)
			fis = new FileReader(mapfile);
			//key, value변경해줄->map저장하기위해서
			Properties prop = new Properties();
			//파일 읽기( 로딩(key,value) )
			prop.load(fis);	
		
			//MAP구성위한 작업
			//KEY값만 배열로 나열
			Iterator keyInter = prop.keySet().iterator();
			//KEY값을 전부 읽을 때까지 반복
			while( keyInter.hasNext()) {
				//KEY값을 가져옴
				String key = (String) keyInter.next();
				//KEY값에 해당되는 클래스명을 가져오기
				String className = prop.getProperty(key);
				
				//가져온 클래스명으로 OBJECT 생성
				Class<Model> classModel=null;
				try {
					classModel = (Class<Model>) Class.forName(className);
				} catch (ClassNotFoundException e) { e.printStackTrace(); }//class 받기
				Model service = null;
				try {
					service = (Model)classModel.newInstance();
				} catch (InstantiationException | IllegalAccessException e) {	e.printStackTrace();
				}//생성
				
				//map에 넣기
				map.put(key, service);
			}
		
		} catch (FileNotFoundException e) {			e.printStackTrace();	}
		 catch (IOException e1) {			e1.printStackTrace();	}
		
	}
	

	private String findReqUrl(String url) {
		String reqUrl=null;
		String[] splitArr = url.split("/");
		reqUrl = splitArr[splitArr.length-1];
		System.out.println(" reqUrl : "+ reqUrl);
		return reqUrl;
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() --- contextPath : "+request.getContextPath());
		System.out.println(" uri : "+request.getRequestURI());
		
		//1. 접속한 url정보를 가져온다.
		String url = findReqUrl( request.getRequestURI() );
		
		
		//2. 해당되는 요청에 따른 처리하기(map형식으로)
		String forwardPage = null;		
		
		//map에서 요청에 따른 처리 model를 받아온다.
		Model service =(Model) map.get(url);
		if( service != null )
			forwardPage = service.process(request, response);
		
		if( forwardPage == null ) {
			System.out.println("forwardPage error");
			forwardPage = "index.jsp";
		}
		
		//3.요청의 처리후 처리 결과 보여줌
		//처리후에 view함( 처리결과 page이동)
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardPage);
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		doGet(request, response);
	}

}
