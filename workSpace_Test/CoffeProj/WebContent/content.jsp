<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Page Title</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
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
	<h2 class="text-center">글상세</h2>
</div>

<div class="container">
	<table class="table table-hover">
		<thead>
			<tr class="table-light">
				
			</tr>
		</thead>
		<tbody>
			<tr>
				<th>글제목</th><td>${contBorder.title }</td>
			</tr>
			<tr>
				<th>작성자</th><td>${contBorder.author }</td>
			</tr>
			<tr>
				<th>글내용</th><td>${contBorder.content }</td>
			</tr>
			<tr>
				<th>작성일자</th><td>${contBorder.date }</td>
			</tr>
		</tbody>
	</table>
</div>

<div class="container">
	<div class="form-group">
		<form action="delete.do">
			<p><input class="btn btn-primary" type="submit" value="글삭제">
		</form>
	</div>
	<div class="form-group">
		<form action="edit.do">
			<p><input class="btn btn-primary" type="submit" value="글수정">
		</form>
	</div>
</div>
</body>
</html>