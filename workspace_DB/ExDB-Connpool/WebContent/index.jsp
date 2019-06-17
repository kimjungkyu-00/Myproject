<%@page import="com.db.Member"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.db.MyConnPool"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "com.db.MyConnPool" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	MyConnPool mycp = new MyConnPool();
	ArrayList<Member> list= mycp.getMemberList();
	if(list != null)
		out.print(list.size()+"개 있음");
%>
</body>
</html>