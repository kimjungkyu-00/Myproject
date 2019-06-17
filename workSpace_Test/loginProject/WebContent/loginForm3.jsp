<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<script type="text/javascript">
	function LoginCheck() {
		var form = document.loginForm;

		//아이디가 4~10 이내로 입력 확인
		form.id.value.length; //입력된 글자수
		if(form.id.value.length < 4 || form.id.value.length > 10){
			alert("아이디는 4 ~ 10 이내로 입력해주세요.")
			form.id.select();
			return ;
		}
		
		if(form.pw.value.length < 6){
			alert("비밀번호는 6자 이상 입력하여 주세요.")
			form.pw.select();
			return ;
		}
	}
	
</script>
</head>
<body>

<form action ="loginForm_process3.jsp" method="post" name="loginForm">
<p> 아이디 <input type="text" name="id">
<p> 비밀번호 <input type="password" name="pw">
<p> <input type="submit" value="login" onclick="loginCheck()">
</form>
</body>
</html>