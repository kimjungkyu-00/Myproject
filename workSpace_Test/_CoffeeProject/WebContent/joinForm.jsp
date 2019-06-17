<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원가입폼</h3>
<hr>

<form action="joinForm.do">
<p>아이디<input type="text" name="id">
<input type="button" id="bt" value="중복확인">
<p>비밀번호<input type="password" name="pw">
<p>비밀번호확인<input type="password" name="pw2">
<p>이름<input type="text" name="name">
<p>전화번호<input type="tel" name="tel">
<p>이메일<input type="email" name="email">
<p><input type="submit" value="회원가입">
</form>
</body>
</html>