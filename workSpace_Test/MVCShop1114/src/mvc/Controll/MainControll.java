package mvc.Controll;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.dto.Product;
import mvc.model.*;

/**
 * Servlet implementation class MainControll
 */
//@WebServlet("/main/*")
public class MainControll extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Map<String,Model> map  = new HashMap<>();
	
	@Override
	public void init() throws ServletException {
		//(url/model) 설정 파일에 있는 내용을 map만들기
		///////////////////////////////////////////////////////////////////////////
		//1. 파일을 읽기
		//1.1 파일명 및 서버 디스크에 저장된 위치 가져오기
		String fileName = this.getServletContext().getInitParameter("urlMapFile");
		String filePath = this.getServletContext().getRealPath(fileName);
		System.out.println("fileName : "+fileName+", path : "+filePath);
		//1.2파일을 읽기위한 fileReader 생성
		try {
			FileReader fileReader = new FileReader(filePath);
			//1.3 key와 value로 구분하여 읽어주는 Properties를 생성
			Properties properties = new Properties();
			//1.4 properties를 이용한 파일 load
			properties.load(fileReader);
			
		//2.읽은 파일을 key와 value로 구분하기
			//2.1 구분을 위하여 key만 배열로 만듬
			Iterator keyIterator = properties.keySet().iterator();
			//2.2 key값 배열로 만든 iteror를 통하여 하나씩 읽는다.
			while(keyIterator.hasNext() ) {
				//2.3 key가져오기
				String key = (String)keyIterator.next();
				System.out.print("key :"+key);
				//2.4 key를 이용하여 value가져옴
				String modelName = properties.getProperty(key);
				System.out.println(", Model :"+ modelName);
		//3.key값에 맞는 className을 받은것으로 class생성
				Class<Model> modelClass = (Class<Model>) Class.forName(modelName);
				Model model = (Model)modelClass.newInstance(); 
		//4. map에 저장하기	
				map.put(key, model);
			}
		
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch (ClassNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	  
		initItemlist();
	}


	private void initItemlist() {		
		ArrayList<Product>  list = new ArrayList<>();
		for(int i=0 ; i < 10 ; ++i) {
			Product item = new Product("item"+i,i+1+"","item",1000*1+i,"img0"+i+".jpg");
			list.add(item);
		}
		this.getServletContext().setAttribute("itemlist", list);
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("contextPath : "+request.getContextPath());
		System.out.println("url : "+request.getRequestURI());
		
		//1. 사용자 요청 확인
		String url = request.getRequestURI();
		String[] split = url.split("/");
		String reqUrl =  split[split.length-1];
		System.out.println("reqUrl : "+ reqUrl);
		//map 다른 동작
		
		//2. 사용자 요청에 맞는 model 실행
		String forwardPage = null;
		Model model = map.get(reqUrl);
		if(model != null) 
		forwardPage = model.process(request, response);
		
		if(null == forwardPage || null == model) {
			forwardPage = "/error/err404.jsp";
		}
		System.out.println("forwardPage : "+forwardPage);
		if( null!= forwardPage) {
		//3. 사용자 요청 처리 결과 반영 (forwardPage 변환)
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardPage);
		dispatcher.forward(request, response);
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}