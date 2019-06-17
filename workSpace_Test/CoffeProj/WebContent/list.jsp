
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Page Title</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
<script type="text/javascript" src="js/jquery_3.3.1.js" ></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
<script src="main.js"></script>

<title>게시판</title>
</head>
<body>

<header>
<jsp:include page="header.jsp"/>
</header>

<hr>



<div class="container">
	<h2 class="text-center text-heading">글목록<h2>
</div>

<div class="container">
	<table class="table table-hover" id="list-table">
		<tr class="table-danger">
			<th>No</th><th>글제목</th><th>작성자</th><th>글내용</th><th>작성일자</th>
		</tr>
		<c:if test="${!empty list }">
			<c:forEach var="newBorder" items="${list }" varStatus="status">
			<fmt:formatDate var="dateFmt" value="${newBorder.date }" pattern="yyyy. MM. dd"/>
				<tr>
					<td><a href="content.do?num=${status.index }">${status.index+1}</a></td><td>${newBorder.title }</td><td>${newBorder.author }</td><td>${newBorder.content }</td><td>${dateFmt }</td>
				</tr>
			</c:forEach>
		</c:if>
		<c:if test="${empty list }">
			<p>작성된 게시글이 없습니다.
		</c:if>
	</table>
</div>
</body>
</html>