<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>로그인</h3>
<% 
	String id=(String)session.getAttribute("userId");
	String pw=(String)session.getAttribute("userPw");
%>										
<p><%= id %> 님 로그인이 완료 되었습니다.

<form action="out" method="get">
		<input type="submit" value="logout">
</form>

														
</body>
</html>