<%@page import="mvc.dao.MemberDao"%>
<%@page import="mvc.dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p> 가입내용확인 </p>
	<%
		Member member = (Member) application.getAttribute("newMember");
		if(member !=null){
			out.print(member.getName() + ", "+member.getTel() );
		}else{
			out.print("newMember가 없습니다.");
		}
	%>
	<hr>
	<h3>member list 확인하기</h3>
	<%
		MemberDao dao = new MemberDao(application);
	if(dao == null || dao.size() <=0){
			out.print("회원가입 정보가 없습니다.");
		}else{
			for(int i=0 ; i< dao.size(); ++i){
				Member mem = dao.getMember(i);
				out.print(i + " : "+mem.getName() + ", "+mem.getTel()+"<br>");
			}
		}
	%>
</body>
</html>