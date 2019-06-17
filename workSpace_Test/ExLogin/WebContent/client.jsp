<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>


</head>

<body>
  <form action="server.jsp" method="post">
	<input id="userId"  name="id"  type="text"  value="myid" />
	<input id="userPw"  name="pw"  type="password" value="1234"/>
	<input type="submit"  id="login" value="login"  />
  </form>
	<div id="message"></div>

</body>
</html>