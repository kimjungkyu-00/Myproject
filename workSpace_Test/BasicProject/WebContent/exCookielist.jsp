<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ page import="java.net.URLDecoder" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키목록 출력</title>
</head>
<body>
<h3>쿠키목록 출력</h3>
<hr>
<%
	Cookie[]  cookies = request.getCookies();
	if( cookies != null && cookies.length > 0){
		for(int i=0; i < cookies.length; ++i){
			out.print(cookies[i].getName() +", " );
			out.print( URLDecoder.decode(cookies[i].getValue(),"utf-8")+"<br>");
		}
	}else{
		out.print("쿠키가 존재하지 않습니다. <br>");
	}
%>

</body>
</html>