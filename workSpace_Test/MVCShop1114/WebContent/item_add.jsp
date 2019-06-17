<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품등록</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script>
 $(document).ready(function(){
	$('input[name=name]').key	 
	
 });
</script>
</head>
<body>

<header>
 <jsp:include page="header.jsp" />
</header>
<hr>
<h3>상품등록</h3>
<hr>

<div>
	<form action="itemadd_process.do" method="post" enctype="multipart/form-data">
		<p> 제품명  <input type="text" name="name" >
		<p> 제품번호 <input type="text" name="no" >
		<p> 제품사진 <input type="file" name="file" />
		<p> 제품설명 <input type="text" name="desc" >
		<p> 제품가격 <input type="text" name="price" >
		<p> <input type="submit" value="등록">
		<input type="reset" value="지우기">
	</form>
</div>

</body>
</html>