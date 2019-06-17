<%@page import="dto.Member"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
     <%@page import="dao.MyDB" %>
  <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>db예제</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<h3>회원목록</h3>
<hr>
</body>
</html>
<%@page import="java.sql.*"%>
<%
	MyDB mydb =null;

try{
	mydb = new MyDB();
	mydb.connect();
	ArrayList<Member> list = mydb.getMemberList();
	if(null != list){
		for (int i=0; i< list.size(); ++i){
			Member mem = list.get(i);
			out.print(" "+mem.getId());
			out.print("&nbsp;&nbsp;&nbsp; "+mem.getName());
			out.print(" &nbsp;&nbsp;&nbsp;"+mem.getDate()+"<br>");
			
		}
	}
}catch(Exception e){
		out.print(e.getMessage());
	}finally{
		mydb.close();
	}
%>
