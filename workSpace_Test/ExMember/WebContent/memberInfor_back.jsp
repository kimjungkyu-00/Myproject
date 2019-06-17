<%@page import="java.util.ArrayList"%>
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
<nav>
	<jsp:include page="header.jsp"/>
</nav>
<h3>회원 상세 정보</h3>
<hr>
<%
	request.setCharacterEncoding("utf-8"); // 한글처리
	String Mname=request.getParameter("name");
	String Mphone=request.getParameter("phone");

	User newUser=new User();
	newUser.setName(Mname);
	newUser.setPhone(Mphone);
	
	//Enu=request.getParameterNames();
%>
	<div>
		<table border=1>
			<tr>
				<td><%=newUser.getName() %></td>
				<td><%=newUser.getPhone() %></td>				
			</tr>
		</table>
	</div>
<hr>
<h3> jsp :useBean사용</h3>
<hr>

<jsp:useBean id="newUser2" class="mvc.dto.User" scope="request">
	<jsp:setProperty name="newUser2" property="*"/>
</jsp:useBean>
<div>
		<table border=1>
			<tr>
				<td><jsp:getProperty name="newUser2" property="name"/> </td>
				<td><jsp:getProperty name="newUser2" property="phone"/> </td>				
			</tr>
		</table>
	</div>
	<hr>
	<h4>EL 사용</h4>
	<hr>
	<div>
		<table border=1>
			<tr>
				<td>${newUser2.getName() } </td>
				<td> ${newUser2.getPhone() } </td>				
			</tr>
		</table>
	</div>
<%
	ArrayList<User> list = null;
	list=(ArrayList)application.getAttribute("User");
	
	if(list ==null){
	//1.회원정보를 저장할 list를 만든다.
	list = new ArrayList<>();
	}
	//2.회원정보를 list에 저장한다.
	list.add(newUser);
	
	//3.회원리스트를 application영역에 저장한다.
	application.setAttribute("userlist", list);
%>
</body>
</html>