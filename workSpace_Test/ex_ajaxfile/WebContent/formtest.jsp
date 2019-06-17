<%@ page language="java"  contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>
<%@page import="mvc.dao.Userdao"%>
<%@page import= "mvc.dto.User" %>
<!doctype html>
<html>

<head>
<meta http-equiv="Content-Type"  content="text/html; charset=UTF-8">
</head>

<body>
<jsp:useBean id="user" class="mvc.dto.User">
  <jsp:setProperty name="user"  property="*"/>
</jsp:useBean>

<%	//data저장하기
	application.setAttribute("newUser", user);
	
	//memberlist를 관리하는 memberdao 생성
   	Userdao dao = new Userdao(application);
    //새로운 member를 list추가한다    
    dao.insertMember(user);

%>
<p> ${newUser.pw} 
<p> ${newUser.name}
</body>
</html>