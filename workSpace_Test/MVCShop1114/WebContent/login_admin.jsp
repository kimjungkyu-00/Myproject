<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 로그인</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>

<script>
	$(document).ready(function(){
	
		$('#id').keypress(function(){
			if(event.keyCode >=48 && event.keyCode <=57){
				event.returnValue = false;
			};
		});
		
		$('#pw').keypress(function(){
			if(event.keyCode < 48 || event.keyCode > 57){
				event.returnValue = false;
			};
		});	
		
		$('#bt').click(function(){
			if( $('#id').val() =='' ){
				alert("아이디를 입력하여 주세요");
				$('#id').focus();//아이디입력창으로 커서가 깜빡이게 해줌
				return false;
			}
			
			if( $('#pw').val()==''){
				alert("비밀번호를 입력하여 주세요");
				$('#pw').focus();
				return false;
			}
			//아이디와 비밀번호를입력하면 action처리
			$('#logform').attr("action","loginadmin.do").submit();
		});
	});
</script>
</head>
<body>

<header>
	<jsp:include page="header.jsp"/>
</header>

<h3>관리자 로그인</h3>
<hr>

 <form method="post" id="logform">
	<p> 아이디 <input type="text" name="id" id="id">
	<p> 비밀번호 <input type="password" name="pw" id="pw">
	<p> <input type="button" value="login" id="bt">
 </form> 

</body>
</html>