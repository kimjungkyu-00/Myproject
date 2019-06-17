<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="mvc.dao.*" %>
<%
//client 전송한 데이타
	String pw = request.getParameter("pd");
//login한 id값 가져오기
   String id =(String)session.getAttribute("id");

	//memberlist가져오기
	LogonDao dao = new LogonDao(application);
//id/pw 확인 
     int check = dao.loginCheck(id,pw);
	 int reCheck = 0;
//member삭제
    if(check==0){
    	reCheck = dao.removeMember(id);
    	//세션 삭제
    	session.invalidate();
    }

 //client에서 처리결과 전송
   out.print(reCheck);
   

%>
