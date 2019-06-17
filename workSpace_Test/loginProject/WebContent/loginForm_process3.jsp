<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>입력에 성공하였습니다.
<%
	String id= request.getParameter("id");
	String pw= request.getParameter("pw");
%>
<p> 아이디 : <%=id %>
<p> 비밀번호 : <%= pw %>
</body>
</html>