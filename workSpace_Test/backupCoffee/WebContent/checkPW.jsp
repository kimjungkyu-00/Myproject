<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="mvc.dao.*" %>
<%@ page import="mvc.dto.*" %>
<% 
//client별 존재하는 sessison에서 가져온다
	String id = (String)session.getAttribute("id");
    //1. clinet(modify.jsp)---(쿼리:passwd=value)-->midifypro.jsp
	String pw = request.getParameter("pd");
    
	//2. id/pw 검사(member list받기)
	LogonDao dao = new LogonDao(application);
	
	//id /pw 검사	
	int check = dao.loginCheck(id, pw);
	out.print(check);
	
%>