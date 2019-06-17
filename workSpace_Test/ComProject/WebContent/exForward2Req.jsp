<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Map" %>
<%
 	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<h3> radio 확인 </h3>
<%--
	String strForward = null ;
	String select = request.getParameter("test");	
	out.println(select);
	
	if( select != null ){
		out.println(select);
		if(select.equals("1") ){
			strForward = "info.jsp";	
		}else if(select.equals("2")){
			strForward = "exform.jsp";
		}else{
			strForward = "exBuffer.jsp";
		}		
	}
	out.println(strForward);

--%>
<%
	String strForward = null ;
	Map map = request.getParameterMap();	
	String[] valueArr =(String[])map.get("test");
	String select = valueArr[0];
	if( select != null ){
		out.println(select);
		if(select.equals("1") ){
			strForward = "info.jsp";	
		}else if(select.equals("2")){
			strForward = "exform.jsp";
		}else{
			strForward = "exBuffer.jsp";
		}		
	}
	out.println(strForward);
		
%>
<jsp:forward page="<%= strForward %>"/>

</body>
</html>