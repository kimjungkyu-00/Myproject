<%@page import="dao.MyDB"%>
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
	String id = request.getParameter("id");

	MyDB mydb = null;
	
	mydb = new MyDB();
	boolean ret = mydb.deleteMember(id);
	
	mydb.close();
	
	if(ret == true)
	out.print(id+"님 회원정보를 삭제 하였습니다.");
	else
		out.print(id+"님 회원정보를 삭제되지 않았습니다.");
%>
</body>
</html>