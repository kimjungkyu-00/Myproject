
<%@page import="dto.*"%>
<%@page import="java.util.ArrayList"%>
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
<h3>목록 출력</h3>
<hr>

<%@page import="java.sql.*"%>
<jsp:include page="header.jsp"/>
<%
	MyDB mydb =null;

try{
	mydb = new MyDB();
	ArrayList<Member> list = mydb.Memberlist();
	if(null != list){
		for (int i=0; i< list.size(); ++i){
			Member mem = list.get(i);
			out.print(" "+mem.getId());
			out.print("&nbsp;&nbsp;&nbsp; "+mem.getPw());
			out.print(" &nbsp;&nbsp;&nbsp;"+mem.getName()+"<br>");
			out.print(" &nbsp;&nbsp;&nbsp;"+mem.getTel()+"<br>");
			
		}
	}else{
		out.print("잘못입력?하였다");
	}
}catch(Exception e){
		out.print(e.getMessage());
	}finally{
		mydb.close();
	}
%>

</body>
</html>