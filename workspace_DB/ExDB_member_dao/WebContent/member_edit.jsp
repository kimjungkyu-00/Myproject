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
<form action="member_edit_pro.jsp" method="post">
	수정할 회원 아이디<input type="text" name="edit_id" value="한글"><br>
	수정할 내용(비밀번호) <input type="password" name="edit_pw" value="1" /><br>
	<input type="submit" value="수정하기"/>
</form>

</body>
</html>