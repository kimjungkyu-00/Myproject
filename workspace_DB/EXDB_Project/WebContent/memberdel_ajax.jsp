<%@page import="dao.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    
<%
	String DelId = request.getParameter("delid");
	String DelPw = request.getParameter("delpw");
	
	MyDB mydb = null;
			
	mydb =new MyDB();
	boolean ret = mydb.deleteMember(DelId,DelPw);
	
	mydb.close();
	if(ret = true)
	out.print(DelId+"님 삭제가 완료 되었습니다.");
	else
		out.print(DelPw+"님 회원정보 삭제되지 않았습니다.");
%>
</body>
</html>