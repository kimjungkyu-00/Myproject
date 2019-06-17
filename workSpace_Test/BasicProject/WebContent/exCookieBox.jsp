<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="jsp.util.CookieBox" %>
<%
	response.addCookie(CookieBox.create("name","jsp"));
	response.addCookie( CookieBox.create("id","digital","/BasicProject",-1));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CookieBox</title>
</head>
<body>
   cookiebox를 이용하여 cookie를 생성함.
</body>
</html>