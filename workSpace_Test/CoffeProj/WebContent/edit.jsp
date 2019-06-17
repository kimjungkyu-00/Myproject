<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<h2>글수정</h2>

<form action="editProcess.do">
	<p>번호 <input type="hidden" name="no" value="${editNo }">
	<p>제목 <input type="text" name="title" value="${contBorder.title }">
	<p>작성자 <input type="hidden" name="author" value="${contBorder.author }"> ${contBorder.author }
	<p>내용 <textarea name="content" rows="5" cols="30" value="${contBorder.content }"></textarea>
	<p><input type="submit" value="수정하기">
</form>


</body>
</html>