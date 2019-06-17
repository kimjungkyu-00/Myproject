<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 로그인</title>
</head>
<body>
<header>
	<jsp:include page="header.jsp"/>
</header>
<h3>관리자 로그인</h3>

<p> ${admin.getId() }
<p> ${admin.getPw() }

</body>
</html>