<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member 수정하기</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<h3>회원정보 수정</h3>
<hr>
<form>
	수정할 회원 아이디<input type="text" name="edit_id" value="한글"><br>
	수정할 내용(비밀번호) <input type="password" name="edit_pw" value="1" /><br>
	<input type="button" id="submit" value="수정하기"/>
</form>

<script src="js/jquery.js"></script>
<script>
	$(function() {
		//"member_edit_ajax.jsp"
		
		$('#submit').click(function(){
			var query ={	id: $('input[name=edit_id]').val(),
							pw: $('input[name=edit_pw]').val()};
			
			$.post("member_edit_ajax.jsp", query, function(msg){
				alert("수정이 완료 되었습니다.");
				$('#msg').html(msg);
			})
		});
		
	});
</script>

</body>
</html>