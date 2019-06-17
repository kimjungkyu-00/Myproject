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
<h3>회원가입</h3>
<hr>


<form action="register_from_pro.jsp" method="post">
	id<input type="text" name="reg_id" value="myid"/>
	passwd<input type="password" name="reg_pw" value="1234"/>
	name<input type="text" name="reg_name" value="아이즈원"/>
	<input type="hidden" name="reg_date" value="">
	<input type="submit" value="가입"/>
</form>
</body>
</html>