<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error Message</title>
</head>
<body>
	요청한 처리 결과에 에러가 발생했습니다. <br>
	빠른 시간 내에 문제를 해결하도록 하겠습니다.<br>
	
	<p>
		에러타입 : <%= exception.getClass().getName() %> <br>
		에러 메시지 : <%= exception.getMessage() %><br>
	</p>
	
</body>
</html>