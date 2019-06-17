<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = (String)session.getAttribute("ID"); 
	boolean login = false ;
	if( id != null){
		login = true;		
	}
	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 정보 확인하기</title>
</head>
<body>
<h3>세션 정보 확인</h3>
<hr>
session ID : <%= id %><br>
<% 
	if(login){
		out.print("login 했습니다.");
		String name = (String)session.getAttribute("NAME");		
%>
		<br>
        <%=name %>님 로그인 상태
<% 
	}else{
		out.print("login 하지 않음");
	}
%>
</body>
</html>