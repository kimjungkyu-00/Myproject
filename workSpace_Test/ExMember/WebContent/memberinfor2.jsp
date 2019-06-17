<%@page import="com.sun.glass.ui.Application"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page import="mvc.dto.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>회원 상세 정보</h3>
<hr>
<%
	//member list에서 radio에 선택된 정보를 출력한다.
	//1. radio정보를 받아온다
	String str = request.getParameter("info");
	if(str == null){
		out.println("선택된 내용이 없습니다.");
		//response.sendRedirect("userlist.jsp");
	}else{
		//2. 멤버리스트 받아서 찾아서 넘겨줌
		ArrayList<User> list =(ArrayList)application.getAttribute("userlist");
		out.print("radio : "+Integer.parseInt(str));
		User user = list.get( Integer.parseInt(str));
		
%>
	<div>
		<table border=1>
			<tr>
				<td><%= user.getName() %></td>
				<td><%= user.getPhone() %></td>				
			</tr>
		</table>
	</div>
<%
	}
%>
</body>
</html>