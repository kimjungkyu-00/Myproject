<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.net.URLEncoder"  %>
<%
	//cookie 추가하기
	Cookie cookie = new Cookie("id","digital");
	cookie.setDomain("daum.net");
	cookie.setPath("/error");
	response.addCookie(cookie);
	
	Cookie cookie2 = new Cookie("only","onlycookie");
	response.addCookie(cookie2);
	
	Cookie  cookie3 = new Cookie("invalid","invalidCookie");
	cookie3.setDomain("www.mycookie.com");
	response.addCookie(cookie3);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cookie 예제</title>
</head>
<body>
<h3>쿠키를 생성 </h3>
<hr>
cookie : 
<%= cookie.getName()%>, <%=cookie.getValue() %>, <%= cookie.getDomain() %>, <%= cookie.getPath() %>
<br>
cookie2 : 
 <%= cookie2.getName()%>, <%=cookie2.getValue() %>, <%= cookie2.getDomain() %>
 <br>
cookie3 : 
 <%= cookie3.getName()%>, <%=cookie3.getValue() %>, <%= cookie3.getDomain() %>
</body>
</html>