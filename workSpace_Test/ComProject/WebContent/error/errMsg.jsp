<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error Page</title>
</head>
<body>
<br>
에러타입 : <%= exception.getClass().getName() %>
<br>
에러메시지 : <%= exception.getMessage() %>
</body>
</html>