<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="mvc.dao.*"%>
<!DOCTYPE html>
<html>
<head></head>
<body>
<%
	String id=request.getParameter("id");
	String pw=request.getParameter("pw");
	
	MemberDao dao=new MemberDao();
	int check = dao.Logincheck(id, pw);
	if(check==0){
		out.print("로그인 성공");
	}else{
		out.print("로그인 실패");
	}
	
%>
</body>
</html>