<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="mvc.dao.LogonDao" %>
<%
	request.setCharacterEncoding("utf-8");

    String id = request.getParameter("id");
    
    //회원 정보를 가져온다.
    LogonDao dao = new LogonDao(application);
    //id가 같은 회원이 있는지 검사한다.
    int check = dao.searchId(id);
    out.print(check);
    /*if( check==1){
    	
    	out.print("아이디가 있음");
    }else{
    	out.print("아이디로 가입 가능합니다.");
    }*/
%>