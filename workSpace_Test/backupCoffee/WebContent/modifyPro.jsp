<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="mvc.dao.*" %>
<%@ page import="mvc.dto.*" %>
<% 
//client별 존재하는 sessison에서 가져온다
	String id = (String)session.getAttribute("id");
    
	//id/pw 검사(member list받기)
	LogonDao dao = new LogonDao(application);
	
    //회원정보를 알려준다
    LogonDataBean member = dao.getMember(id);
      out.print("아이디 : "+member.getId());
      out.print("<br>이름 : "+member.getName());
      out.print("<br>tel : "+member.getTel());
      out.print("<br>가입날짜 :" +member.getReg_date());
      out.print("<br>주소 :" +member.getAddress());
   
%>