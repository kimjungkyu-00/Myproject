<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단 출력</title>
</head>
<body>
<%
	String num = request.getParameter("num");
	out.println("받은 데이타  str: "+num);
	
	int inputNum = Integer.parseInt(num);
	out.println("받은 데이타  int: "+inputNum);
	
	for(int i=1; i < 10; ++i ){
		out.println(i +" * "+"= "+ (i * inputNum) );
%>	
		<br>
<% 
	}
%>
</body>
</html>