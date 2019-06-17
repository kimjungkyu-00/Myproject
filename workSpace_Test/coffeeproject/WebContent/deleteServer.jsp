<%@page import="org.apache.jasper.tagplugins.jstl.core.Remove"%>
<%@page import="mvc.dto.Member"%>
<%@page import="mvc.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	MemberDao dao= new MemberDao(application);
	Member delMember =	dao.getMember(request.getParameter("del_name"));
	if(delMember != null){
		dao.deleteMember(delMember);
		out.println(delMember+"님 데이타가 삭제되었습니다.");
	}else{
		out.print(delMember+"님 데이타는 존재하지 않습니다.");
	}
		
		
%>
</body>
</html>