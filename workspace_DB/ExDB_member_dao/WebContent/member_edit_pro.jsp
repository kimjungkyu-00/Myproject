<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
           <%@page import="dao.MyDB" %>
    
<%
  		//한글처리
	    request.setCharacterEncoding("utf-8");
    	//form에서 넘겨준 데이터 받기
    	String reqId = request.getParameter("edit_id");
    	String reqPw = request.getParameter("edit_pw");
    	out.print("변경할 id : "+reqId+","+"변경될암호"+reqPw);
  
    	
    	//db접속하여 db정보 변경
    	//1.드라이버 로드. db연결
	    MyDB mydb=null;
    	try{

	    	mydb = new MyDB();
			mydb.connect();
			
	    	
	    	mydb.editMemberPw(reqId,reqPw);
	    	

    	}catch(Exception e){
    		out.print(e.getMessage()); e.printStackTrace();
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