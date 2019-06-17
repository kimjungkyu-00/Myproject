<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="mvc.dto.User" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 주문</title>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script></script>
</head>
<body>
<header>

	<jsp:include page="header.jsp" />
</header>
<hr>
<h3>상품주문 목록</h3>
<hr>

<table border="1">
	<c:set var="sum" value="0"/>
	<c:forEach var="item"  items="${cartlist}">		
	 	<tr>
			<td>${item.getNo()}</td>
			<td>${item.getName()}</td>
			<td>${item.getDesc()}</td>
			<td> <img class ="imgItem" src="<%=request.getContextPath()%>/images/${item.getImg()}" width="250" height="250"/> </td>
			
			<td>
				<c:set var="sum" value="${sum+item.getPrice() }"/>
			    <c:set var="price" value="${item.getPrice() }"/>
				<fmt:formatNumber value="${price}" type="number" pattern="#,###" />원
			</td>
		</tr>
	</c:forEach>
	<tr>
		<td>합계</td>
		<td></td>
		<td></td>
		<td><fmt:formatNumber value="${sum}" type="number" pattern="#,###" />원</td>
	</tr>
</table>

<form action="payment.do" >
 <input type="submit"  value="주문하기">
 </form>

</body>
</html>