<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"/>

<form action="register_pro.jsp" method="post">
	아이디<input type="text" name="id"/><br>
	비밀번호<input type="password" name="pw"/><br>
	이름<input type="text" name="name"/><br>
	전화번호<input type="tel" name="tel"/><br>
	<input type="submit" value="등록">
</form>
			
</body>
</html>