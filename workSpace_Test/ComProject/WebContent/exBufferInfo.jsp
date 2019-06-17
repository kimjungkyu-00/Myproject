<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page buffer="8kb" autoFlush="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>buffer 정보 출력</title>
</head>
<body>
<h3>버퍼 정보 출력</h3>
<hr>
버퍼 크기 <%= out.getBufferSize() %> <br>
남은크기  <%= out.getRemaining() %> <br>
autoFlush <%= out.isAutoFlush() %> <br>

<%
	for(int i=0; i < 100; ++i){
		out.println( out.getRemaining() +"<br>" );
		
	}
%>

</body>
</html>