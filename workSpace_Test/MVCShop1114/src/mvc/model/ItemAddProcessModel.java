package mvc.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import mvc.dto.Product;

public class ItemAddProcessModel implements Model {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		String forwardPage="/itemadd_process.jsp";
		System.out.println("ItemAddProcessModel process() ");
		
		Product newItem=new Product();
		
		newItem.setName(request.getParameter("name"));
		newItem.setNo(request.getParameter("no"));
		newItem.setDesc(request.getParameter("desc"));
		newItem.setPrice(Integer.parseInt(request.getParameter("price")));
		
		try {
			itemSetImg(request, newItem);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ServletException e) {
			e.printStackTrace();
		}


		ArrayList<Product> list= (ArrayList)request.getServletContext().getAttribute("itemlist");
		if(list !=null) {
			list.add(newItem);
		}
		
		request.getSession().setAttribute("newItem", newItem);
		
		return forwardPage;
	}
	
	private void itemSetImg(HttpServletRequest request, Product newItem) throws IOException, ServletException {
		System.out.println("itemSetImg ===start");
		//filename을 newItem 필드추가
		String contentType = request.getContentType();
		System.out.println("contentType : "+contentType);
		
		//파일전송 form맞는지 확인
		if(contentType != null && contentType.toLowerCase().startsWith("multipart/")) {
//			System.out.println("content ok");
//			form에서 name속성이 받아오기
			Collection<Part> parts=request.getParts();
			
			//file type을 찾아서 file upload 및 newItem 필드에 저장
			for(Part part : parts) {
				System.out.println("attr name : "+part.getName());
				
				String partCType = part.getContentType();
				System.out.println("attr type : "+partCType);
				//filename속성확인
				if(part.getHeader("Content-Disposition").contains("filename=")) {
					//fileName받아오기
					String fileName = part.getSubmittedFileName();
					System.out.println("attr file name : "+fileName+" size[ "+part.getSize()+" ] ");
					//파일사이즈가 0byte이상이면 upload
					if(part.getSize()>0) {
						System.out.println("part.write()....");
//						part.write("C:\\JSP\\apache-tomcat-8.5.34\\webapps\\upload "+fileName);
						String savePath = "C:\\JSP\\apache-tomcat-8.5.34\\wtpwebapps\\MVCShop1114\\images\\ ";
						part.write(savePath+fileName);
//						part.write("C:\\Users\\김정규\\Desktop\\workspace_network\\MVCShop1114\\WebContent\\images\\ "+fileName);

						//newItem에 저장
						newItem.setImg(fileName);
						part.delete(); //임시파일삭제
					}
				}	else {
					String value = request.getParameter(part.getName());
					System.out.println(part.getName() + " : "+value);
			}	
		}
		}else {
			System.out.println("multipart 아님");
		}
		
		
	}
}