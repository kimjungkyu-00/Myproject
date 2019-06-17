<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward예제</title>
</head>

<body>
	<form action="exForward2Req.jsp" method="get" >
		<input type="radio" name="test" value="1" checked> 1 <br>
		<input type="radio" name="test" value="2"> 2 <br>
		<input type="radio" name="test" value="3"> 3 <br>
	  <input type="submit"  value="전송"> 
	</form>
</body>
</html>