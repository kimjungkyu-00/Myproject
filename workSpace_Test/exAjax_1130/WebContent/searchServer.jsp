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

<p> ${param.name} 결과
<p>

<%
	MemberDao dao = new MemberDao(application);
	Member mem = dao.getMember(request.getParameter("name"));
	if( mem == null ){
		out.println("찾는 이름이 없습니다.");
	}else{
		out.println(mem.getName() + ","+mem.getTel() );
	}
%>
</body>
</html>