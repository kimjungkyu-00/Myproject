<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3> login</h3>
<hr>
<% 
	String islog=(String)session.getAttribute("id");
	if(islog ==null){
			out.print("login 실패");
	}else{
%>

<form action = "exLogin">
		<p> ID : <input type="text" name="id">
		<p> PW : <input type="password" name="pw">
		<p><input type="submit" name="login">
		<p><input type="reset" name="reset">
</form>
<%
	}
%>
</body>
</html>