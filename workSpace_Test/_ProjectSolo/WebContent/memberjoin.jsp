<%@page import="my.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean id="member" class="my.dto.Member">
  <jsp:setProperty name="member"  property="*"/>
</jsp:useBean>

<h3>정보</h3>

<p>${member.id } 
<p>${member.name }
님 가입이완료되었습니다.</p>
<%
	application.setAttribute("newMember", member);
	MemberDao dao = new MemberDao(application);
	dao.insultMember(member);
%>
</html>