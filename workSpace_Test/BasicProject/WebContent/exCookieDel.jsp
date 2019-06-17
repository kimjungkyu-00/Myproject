<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 
 //쿠키를 추가한다
 
 //쿠키목록을 보여준다
 
 
//쿠키를 삭제한다. 
 	//1.쿠키를 가져온다
 	Cookie[]  cookies = request.getCookies();
 	
 	if( cookies != null  && cookies.length > 0 ){
 		
 		for(int i=0; i < cookies.length ; ++i){
 			//2.원하는 쿠키를 찾는다
 			if(cookies[i].getName().equals("id") ){ //속성이 name인 cookie를 찾는다
 				//3. 원하는 쿠키를 삭제한다.
 				Cookie cookie = new Cookie("id","");
 				cookie.setMaxAge(0);
 				response.addCookie(cookie);
 			}
 		}
 	}else{
 		out.print("쿠키가 없습니다. <br>");
 	}
 	
//쿠키목록을 보여준다
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 삭제</title>
</head>
<body>
 <h3>쿠키 삭제</h3>
 <hr>
 <p> 쿠키를 삭제 합니다. </p>
</body>
</html>