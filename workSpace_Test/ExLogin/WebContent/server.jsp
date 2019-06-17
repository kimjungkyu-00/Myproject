<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="my.dao.UserDao"%>
<html>
<head></head>
<body>
<!-- 
<jsp:useBean id="user" class="my.dto.User">
	<jsp:setProperty property="*" name="user"/>
</jsp:useBean>

 ${user.id }<br>${user.pw }
 -->
<%
//1. client(client.jsp)---(쿼리스트링-id,pw)---->server(server.jsp)
  //client보낸 쿼리 스트링을 받아온다.
   String id = request.getParameter("id");
	String pw = request.getParameter("pw");
//2. client(client.jsp) <---(받은데이타 그대로 보냄)---- server(server.jsp)
	
//userlist가져오기
	UserDao dao = new UserDao();
	
	//login검사
	int check = dao.loginCheck(id,pw);
	if(check==0){
		out.print("로그인 성공");
	}else{
		out.print("로그인 실패");
	}
%>

</body>
</html>