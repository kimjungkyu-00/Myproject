<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그 아웃</title>
</head>
<body>
<h3>로그 아웃</h3>
<hr>
 <%= (String)session.getAttribute("id")  %>님 로그아웃 되었습니다.
<%
	//session 삭제
	session.invalidate();
%>
</body>
</html>