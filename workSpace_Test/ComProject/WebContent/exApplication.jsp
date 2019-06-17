<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Application 예제</title>
</head>
<body>
 <%
 	application.log("로그 메시지 ");
    log("log Maessage");
 %> 
 로그 메시지를 기록합니다.
 
 <% 
    //web.xml로 초기 파라메타값을 설정한 내용을 가져 올수 있다
    Enumeration initParam = application .getInitParameterNames();
 	while( initParam.hasMoreElements()){
 		out.println( initParam.nextElement() );
 	}
 %>
</body>
</html>