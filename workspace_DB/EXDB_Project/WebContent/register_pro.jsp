<%@page import="dao.MyDB"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:include page="header.jsp"/>
<%	
   
		 //한글처리
		   request.setCharacterEncoding("utf-8");
		//form에서 넘겨준 데이터 받기
		String reqId = request.getParameter("id");
		String reqPw = request.getParameter("pw");
		String reqName = request.getParameter("name");
		String reqTel = request.getParameter("tel");
				
		MyDB mydb =null;
   
   		try{
		mydb = new MyDB();
		
		mydb.insertMember(reqId,reqPw,reqName,reqTel);
   		}catch(Exception e){
   			e.getMessage();
   			e.printStackTrace();
   		}finally{
   			mydb.close();
   		}
	
	
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<hr>
<%
out.print(reqId+","+reqPw+","+reqName+","+reqTel+"님 회원가입 완료되었습니다.");

	
%>
</body>
</html>