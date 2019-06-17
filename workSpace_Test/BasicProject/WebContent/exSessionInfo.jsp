<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session ="true" %>
<%@ page import= "java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>

<%
	Date time = new Date();
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 정보 </title>
</head>
<body>
<h3>세션 정보</h3>
<hr>

세션 ID : <%= session.getId() %><br>
세션 생성 시간 : <% time.setTime(session.getCreationTime()); %><br>
                <%= format.format(time) %><br>
최근 접근 시간 : <% time.setTime( session.getLastAccessedTime()); %>
                <%= format.format(time) %><br>  
                
 <%
 	//session.invalidate();
 %>

</body>
</html>