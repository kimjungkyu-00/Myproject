<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<style>
	form {
	  border:1px solid green;
	}
</style>
</head>
<body>
 
 <form action="LoginCheck.jsp" method="post"  >
 	<input type="text"  name="id" size="8"> <br>
 	<input type="password" name="pw" size="10"><br>
 	<input type="submit"  value="로그인">
 </form>
 
</body>
</html>