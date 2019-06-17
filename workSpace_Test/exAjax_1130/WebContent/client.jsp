<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax로 회원 가입</title>
<script src="js/jquery-3.3.1.js"></script>

<script>
$(function(){
	$('#submit').click(function(){
		var formData = $('form').serialize();
		$('#result').text(formData);
		//ajax 요청
		$.post(
				"register.jsp",
				formData,
				function(msg){
					//alert(msg);
					$("#msg").html(msg);
				}
		)
	}); 	
});
</script>

</head>
<body>
    <p> 
    	<a href="main.jsp">main</a>
    <hr>
	<form>
		<p>아이디<input type="text"  name="id"  value="ID"/>
		<p>비밀번호<input type="password" name="pw">
		<p>이름<input type="text"  name="name"  value="testname"/>
		<p>연락처<input type="text"  name="tel"  value="010-3456-7890"/>
		<br><input type="button" value="가입" id="submit"/> 
	</form>
	
	<div id="result"></div>
	<div id="msg"> </div>
</body>
</html>