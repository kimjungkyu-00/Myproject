<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="mvc.dto.Member" %>
<%@ page import="mvc.dao.MemberDao" %>
<h3>ajax로 가입 요청이 들어오는것을 처리 결과 </h3>

<jsp:useBean id="member" class="mvc.dto.Member">
  <jsp:setProperty name="member"  property="*"/>
</jsp:useBean>

<p> ${member.name } 
<p> $(member.id) 님 가입 완료
<%	//data저장하기
	application.setAttribute("newMember", member);
	
	//memberlist를 관리하는 memberdao 생성
   	MemberDao dao = new MemberDao(application);
    //새로운 member를 list추가한다    
    dao.insertMember(member);    
%>
