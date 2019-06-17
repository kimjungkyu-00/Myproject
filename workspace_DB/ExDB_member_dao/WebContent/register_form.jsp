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
	id<input type="text" name="id" value="myid"/>
	passwd<input type="password" name="passwd" value="1234"/>
	name<input type="text" name="name" value="name"/>
	<input type="hidden" name="date" value="<%=new java.util.Date()  %>"/>
	<input type="submit" value="가입"/>
</form>
</body>
</html>