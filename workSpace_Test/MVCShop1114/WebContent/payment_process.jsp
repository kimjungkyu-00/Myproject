<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 결제 성공</title>
</head>
<body>
<header>
	<jsp:include page="header.jsp"/>
</header>
<hr>
<p>${user.getName() }
<p>${user.getPhone() }
<p>${user.getAddr() }
<p>${user.getPay() }

<table border="1">
	<c:forEach var="item" items="${cartlist }">
		<tr>
		<td> ${item.getName() }	 </td>
		<td> ${item.getNo() }	 </td>
		<td> ${item.getDesc() }	 </td>
		<td> ${item.getPrice() }	 </td>
		<td> <img class ="imgItem" src="<%=request.getContextPath()%>/images/${item.getImg()}" width="250" height="250"/> </td>
		</tr>
	</c:forEach>
</table>
		<p> 결제 완료</p>

<%--
	for(Product item : cartlist){
	
	}
	
	for(int i=0; i < cartlist.size();++i){
		Product item = cartlist.get(i);
	}
 --%>
</body>
</html>