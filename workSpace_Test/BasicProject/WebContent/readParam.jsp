<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="/error/ErrorMsg.jsp" %>
<!DOCTYPE html>
<html>
<head>
<title>파라메타 출력</title>
</head>
<body>
<h3>파라메타 출력</h3>
<hr>

<p> 
	name Parameter 출력 하기
 	<%= request.getParameter("name").toUpperCase() %>
</p>
</body>
</html>