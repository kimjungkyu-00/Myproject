<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.Date" %>
    <%@ page import="mvc.dao.LogonDao" %>
    <%@ page import="mvc.dao.LogonDataBean" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="newMember" class="mvc.dto.LogonDataBean">
	<jsp:setProperty name="newMember" property="*"/>
</jsp:useBean>

<%
	//가입한 날짜 저장하기
	newMember.setReg_data(new Data());
	//새로 가입한 member 리스트에 저장하기
	//1.멤버리스트 가져오기
	LogonDao dao = new LogonDao(application);
	//2.멤버리스트에 저장하기
	dao.insertMember(newMember);
%>
</body>
</html>