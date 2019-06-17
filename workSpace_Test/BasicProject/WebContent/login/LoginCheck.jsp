<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//loginForm에서 입력한 id pw 가져오기 
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");

	
	//가져온 id와 pw 세션에 등록
	session.setAttribute("id", id);
	session.setAttribute("pw",pw);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<h3> 로그인 </h3>
<hr>
로그인 id :  <%= id %>
로그인 pw :  <%= pw %>
<hr>
세션에 저장된 id : <%= (String)session.getAttribute("id") %>
세센에 저장된 pw : <%= (String)session.getAttribute("pw") %>
	<form action="LogOut.jsp" method="post">
   		<input type="submit" value="logout">
    </form>
</body>
</html>