<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.net.URLDecoder" %>
<%
	//쿠키를 생성한다.
	Cookie cookie = new Cookie("name",URLEncoder.encode("홍길동","utf-8"));
	response.addCookie(cookie);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cookie 생성하기</title>
</head>
<body>
<h3> 쿠키 생성</h3>
<hr>
쿠키값 출력<br>
name :  <%= cookie.getName() %><br>
value : <%= URLDecoder.decode(cookie.getValue(),"utf-8"); %>
<br>
</body>
</html>