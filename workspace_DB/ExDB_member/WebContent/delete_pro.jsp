<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
           <%@page import="dao.MyDB" %>
    <jsp:include page="header.jsp"/>

<%
	//한글처리
	request.setCharacterEncoding("utf-8");
	//form에서 넘겨준 데이터 받기
	
	String DtId= request.getParameter("Del_id");
	out.print("삭제한 ID : "+DtId);
	
	MyDB mydb= null;
	try{
	
		mydb = new MyDB();
		
		//mydb.connect();
		
		mydb.deleteMember(DtId);
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