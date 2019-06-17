<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<h3>회원가입</h3>
  <hr>
   <form action="memberCheck.jsp" method="post">
   	  아이디 : <input type="text" name="id" size="10"><br>
   	  비밀번호 : <input type="pw" name="pw" size="10"><br>
   	  비밀번호 확인 : <input type="pw2"  name="pw2" size="10"><br>
   	  주소 : <input type="text"  name="address"><br>
 	  취미 : <input type="checkbox"  name="hobby"  value="java"> java 	  
			<input type="checkbox"  name="hobby"  value="book"> book
			<input type="checkbox"  name="hobby"  value="tv"> tv
	 <br>
	 <input type="submit" value="회원가입">  	  
   </form>
</body>
</html>
