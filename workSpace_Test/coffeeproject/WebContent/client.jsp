<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax로 회원가입</title>
<script src="js/jquery.js"></script>
<script>
$(document).ready(function () {
	
	$("#submit").click(function() {
		var formData=  $('form').serialize();
		 $("#results").text(formData);
		 
		 $.post(
			"register.jsp",
			formData,
			function (msg) {
				//alert("메세지");
				$("#msg").html(msg);
			}
		 )
	});
});
</script>
</head>
<body>
	<p>
		<a href="index.jsp">index</a>
	<hr>
	<form>
		<input type="text" name="name" value="testname"/>
		<br><input type="text" name="tel" value="010-3456-7890"/>
		<br><input type="button" value="가입"  id="submit"/>
		<div id="results"></div>
		<div id="msg"></div>
	</form>
</body>
</html>