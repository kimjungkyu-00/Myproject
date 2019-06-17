<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="dao.MyDB" %>

    <%
	/*
	request.setCharacterEncoding("utf-8"); // 한글처리

		String reqId= request.getParameter("reg_id");
		String reqPw= request.getParameter("reg_pw");
		String reqName= request.getParameter("reg_name");
		out.print(reqId+","+reqPw+","+reqName+"<br>");

		MyDB mydb =null;
	try{
		mydb = new MyDB();
		mydb.connect();
		mydb.insertMember(reqId,reqPw,reqName);
	}catch(Exception e){
		out.print(e.getMessage());

	}finally{
		mydb.close();
	}
	*/
		%>
		
		
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>

<jsp:useBean id="member" class="dto.Member"/>
	<jsp:setProperty name="member"  property="*" /> 

<%
		MyDB mydb =null;
	try{
		mydb =new MyDB();
		mydb.connect();
		mydb.insertMember(member);
	}catch(Exception e){
		out.print(e.getMessage());
		e.printStackTrace();

	}finally{
		mydb.close();
	}
%>
</body>
</html>