<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	//쿠키를 읽어온다.()
 	Cookie[]  cookies =  request.getCookies();
 	
 	if( cookies !=null && cookies.length > 0){
 		//수정을 원하는 name을 찾는다,
 		for(int i=0; i < cookies.length ; ++i ){
 			if(cookies[i].getName().equals("id")){
 		      // value를 수정한다.
 				Cookie cookie = new Cookie("id", "hohohohoho");
 		        response.addCookie(cookie);
 			}
 		}
 	}
 %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 수정하기</title>
</head>
<body>

</body>
</html>