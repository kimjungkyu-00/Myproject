<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import ="mvc.dao.MemberDao" %>
<%@ page import="mvc.dto.Member" %>
<%
		    MemberDao dao = new MemberDao(application);
		    if( dao == null || dao.size() <= 0){
		    	out.print("회원 가입 정보가 없습니다.");
		    }else{
		    	for(int i=0; i < dao.size(); ++i){
		    		Member mem = dao.getMember(i);
		    		out.print(i+ " : "+ mem.getName() + ", "+mem.getTel()+", " +mem.getId() +"<br>");
		    		
		    	}
		    }
%>