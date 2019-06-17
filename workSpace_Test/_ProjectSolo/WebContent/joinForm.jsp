<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 회원 가입</title>
<script src="js/jquery-3.3.1.js"></script>
<script>
$(function(){
	$('#submit').click(function() {
		var formData = $('form').serialize();
		$("#client").text(formData);
		
		$.post(
				"memberjoin.jsp",
				formData,
				function(msg) {
					alert(msg);
				}
		)
		
	});
});
</script>
</head>
<body>
<h3>회원가입</h3>
<hr>
	<form>
	<p>아이디<input type="text" name="id">
	<p>비밀번호<input type="password" name="passwd">
	<p>이름<input type="text" name="name">
	<p>전화번호<input type="text" name="tel">
	<p>주소<input type="text" name="address">
	<p><input type="submit" value="회원가입">
	</form>
	<div id="client"></div>
	<div id="msg"></div>
</body>
</html>