<%@page import="org.eclipse.jdt.internal.compiler.flow.FinallyFlowContext"%>
<%@page import="dao.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String DelId=request.getParameter("delid");
	String DelPw=request.getParameter("delpw");
	
	out.print("삭제한 ID : "+DelId +"입니다 ");
	
	MyDB mydb = null;
	try{
	mydb= new MyDB();
	
	mydb.deleteMember(DelId,DelPw);
	}catch(Exception e){
		e.printStackTrace();
		out.print(e.getMessage());
	}finally{
		mydb.close();
	}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>