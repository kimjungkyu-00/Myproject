<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	request.setCharacterEncoding("euc-kr");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내장객체</title>
</head>
<body>


<%
	String txt  = request.getParameter("content");
	String text = pageContext.getRequest().getParameter("content");
%>
<br>
 request를 통한 text  내용 <%= txt %>
 <br>
 pageContext를 통한 text 내용<%= text %>

</body>
</html>