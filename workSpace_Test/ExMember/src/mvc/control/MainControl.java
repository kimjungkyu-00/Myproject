package mvc.control;

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
import com.sun.org.apache.xpath.internal.operations.Lte;

import mvc.dto.User;
import mvc.model.Model;


/**
 * Servlet implementation class MainControl
 */
@WebServlet("/MC/*")
public class MainControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Map<String,Model> map  = new HashMap<>();

	
	@Override
	public void init() throws ServletException {
		String fileName = this.getServletContext().getInitParameter("urlMapFile");
		String filePath = this.getServletContext().getRealPath(fileName);
		System.out.println("fileName : "+fileName+", path : "+filePath);
		
		FileReader fileReader;
		try {
			fileReader = new FileReader(filePath);
			Properties properties = new Properties();
			properties.load(fileReader);
			
			Iterator keyIterator = properties.keySet().iterator();
			
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
			e.printStackTrace();
		}  catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		initItemlist();

	}

    private void initItemlist() {
    	ArrayList<User> list = new ArrayList<>();
    	for(int i=0 ; i < 2 ; ++i) {
			User item = new User("name"+i,"phone"+i);
			list.add(item);
		}
		this.getServletContext().setAttribute("itemlist", list);
	}



	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("contextPath"+request.getContextPath());
		System.out.println("url"+request.getRequestURI());
		
		String url = request.getRequestURI();
		String[] split = url.split("/");
		String reqUrl =  split[split.length-1];
		System.out.println("reqUrl : "+ reqUrl);
		
		String forwardPage=null;
		Model model = map.get(reqUrl);
		if(model != null) 
		forwardPage = model.process(request, response);
		
		if(forwardPage==null || null==model) {
			forwardPage="/error/error404.jsp";
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
		doGet(request, response);
	}

}
