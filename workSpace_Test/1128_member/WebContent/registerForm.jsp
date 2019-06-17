<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	$(function(){
		$("#process").click(function() {
			if(("#id").val()==''{
				alert("아이디를 입력해주세요");
			}
			var id=$("#id").val();
		});
	})
	
</script>
</head>
<body>

<div class="form-group">
	<ul>
		<li><label for="id">아이디(필수)</label>
			<input id="id" type="email" name="id" size="20" maxlength="50"
						placeholder="abc@digital.com"></li>
		
		<li><label for="passwd">비밀번호(필수)</label>
			<input id="passwd" type="email" name="passwd" size="20" maxlength="10"
						placeholder="6~10자 숫자 /문자 "></li>
		<li> <button class="btn">로그인</button>
		</li>
	</ul>
</div>
</body>
</html>