<%@page import="mvc.dao.MemberDao"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    	<%@ page import="mvc.dto.Member" %>

	<h3> ajax로 가입 요청이 들어오는것을 처리결과 .</h3>
<jsp:useBean id="member"  class="mvc.dto.Member">
	<jsp:setProperty name="member" property="*"/>
</jsp:useBean>

<p> ${member.name } 님 가입이 완료 되었습니다.
	
<%	//data저장하기
	application.setAttribute("newMember",member);
	
	MemberDao dao = new MemberDao(application);

	dao.insertMember(member);

%>
	
