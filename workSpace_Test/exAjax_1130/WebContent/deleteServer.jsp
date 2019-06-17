<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="mvc.dao.MemberDao" %>
<%@ page import="mvc.dto.Member" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p> 삭제할 데이타 ${param.del_name }
<%
	MemberDao dao = new MemberDao(application);
	Member delMember = dao.getMember(request.getParameter("del_name"));
	if( delMember != null ){
		dao.deleteMember(delMember);
		out.print(" 데이타가 삭제 되었습니다.");
	}else{
		out.print(" 데이타는 존재하지 않습니다.");
	}
%>
</body>
</html>