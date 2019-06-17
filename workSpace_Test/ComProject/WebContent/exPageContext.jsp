<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	HttpServletRequest httpRequest = (HttpServletRequest)pageContext.getRequest();
%>
request기본 객체와 pageContext.getRequest()의 동일 여부 : 
<%= httpRequest == request %>

</body>
</html>