<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login 확인</title>
</head>
<body>
<%
	/*1. client요청된 내용은 request에 저장됨
	 	request를 통하여 데이타를 받음
		*/
	String recvid = request.getParameter("id");
	String recvpw = request.getParameter("pw");
%>

<p>아이디 : <%=recvid %>
<p>비밀번호 : <%=recvpw %>

</body>
</html>