<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page buffer="1kb" autoFlush="false" %>
<%@ page errorPage ="/error/ErrorMsg.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bufferOverflow 발생</title>
</head>
<body>
<%
    for(int i=0; i < 30000; ++i ){
		out.println(i);
	}
%>

</body>
</html>