<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//1. 쿠키 생성
	Cookie cookie = new Cookie("myname","time");
	//2. 쿠키 원하는 설정 
	cookie.setMaxAge(60*60);
	//3. 설정된 쿠키 추가 
	response.addCookie(cookie);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cookie 유효 시간 설정</title>
</head>
<body>
	쿠키의 휴요시간은 1시간 입니다.
</body>
</html>