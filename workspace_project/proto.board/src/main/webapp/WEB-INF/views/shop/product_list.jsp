<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<meta charset="UTF-8">
<title>Insert title here</title>
<h2>상품 목록</h2>
<table border="1">
	<tr>
	<th>상품ID</th>
	<th>&nbsp;</th>
	<th>상품명</th>
	<th>가격</th>
	</tr>
	<c:forEach var="row" itmes="${list }">
		<tr>
		<td>${row.product_id }</td>
		<td><img src="${path }/images/${row.pictur_url}"
			width="100px" height="100px"></td>
		<td>${row.product_name }</td>
		<!-- formatNumber value="값" pattern="출력형식 -->
		<td><fmt:formatNumber value="${row.price }"
			pattern="#,###" /> <!-- 천단위 컴머 처리 -->
			
			</td>
		</tr>
	</c:forEach>
</table>
<ul>
	<li><a href="info">관련 뉴스</a></li>
	<li><a href="info4">실종시 대처방법</a></li>	
	<li><a href="info2">구조시 대처방법</a></li>
	<li><a href="info3">입양 안내</a></li>	
	
	
</ul>

