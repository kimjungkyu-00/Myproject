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
<title>item list</title>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script></script>
<style>
	.imgform tr{
		background:grey;
	}

	.imgform table{
		width:100%;
		height: 100%;
	}
</style>
</head>
<body>
<header>
	<jsp:include page="header.jsp"/>
</header>
<hr>
<h3>item list</h3>
<hr>
<section>

<form action="orderlist.do"  method="get" class="imgform">
	<table border="1">
		<c:forEach var="item"  items="${itemlist }"  varStatus="status">			
			<tr>
				<td> <input type='checkbox' name='checkItem'  value='${status.index }' >
				     </td>
				<td> ${ item.getNo()}</td>
				<td> ${ item.getName()}</td>
				<td> ${ item.getDesc()} </td>				
				<td> <img class ="imgItem" src="<%=request.getContextPath()%>/images/${item.getImg()}" width="250" height="250"/> </td>
				
			
				<td> <c:set var="price" value="${item.getPrice()}" />
				    <fmt:formatNumber value="${price}"  type="number" pattern="#,###"/>원				 
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan ="5">
			    <input type="submit" value="상품 주문">
				<input type="reset" value="선택해제">
			</td>
		</tr>
	</table>
</form>
</section>

</body>
</html>