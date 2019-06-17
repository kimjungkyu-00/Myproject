<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>

<nav>
<jsp:include page="header.jsp"/>
</nav>

<h3>회원가입</h3>
<hr>
	<form action="memberAdd.do" method="post">
		<p/><input type="text" value="이름" name="name"/>
		<p/><input type="text" value="전화번호" name="phone"/>
		<p/><input type="submit" value="가입"/>
	</form>
	
</body>
</html>