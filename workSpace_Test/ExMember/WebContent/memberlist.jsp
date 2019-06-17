<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="mvc.dto.*" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원리스트</h3>
<hr>
<%
	//회원정보를 출력한다
	ArrayList<User> list = (ArrayList)application.getAttribute("userlist");
	if( list == null || (list.size() ==0) ){
		out.print("회원정보가 없습니다.");
	}else{ %>
	<form action="memberinfor2.jsp" method="post">
	<table border=1>
		<tr>
	<%
		for(User user : list){
%>
				<tr>
				<td><input type="radio" name="info"/></td>
				<td><%= user.getName() %> </td>
				<td><%= user.getPhone()  %> </td>	
				<tr>			
<%	
		}
	}
%>
			</tr>
		</table>
		</form>

</body>
</html>