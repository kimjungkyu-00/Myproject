<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="loginserver.jsp" method="post">
		<input id="UserId" type="text" name="id" value="MyId"> 
		<input id="Userpw" type="password" name="pw" value="Mypw"> 
		<input type="submit" value="로그인">
	</form>
	<div id="message"></div>
</body>
</html>