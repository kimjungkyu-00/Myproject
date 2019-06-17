<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//세션에 속성추가
	session.setAttribute("ID","java"); 
	session.setAttribute("NAME","홍길동");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션에 정보 저장</title>
</head>
<body>
<h3> 세션에 정보 저장</h3>
<hr>
세션 등록 <br>
<%
	//세션 추가된 정보 확인
	String id = (String)session.getAttribute("ID");
    if(id !=null ){
    	out.print("id : "+ id +"<br>");
    }else{
    	out.print("id정보가 없어요 <br>");
    }
%>
<hr>
세션 삭제
<% 	
	//세션 정보 삭제
	session.invalidate();
%>
<hr>
세션 삭제후 등록했던  attr 확인하기 
<%--
	String id2 = (String)session.getAttribute("ID");
	if(id2 !=null ){
		out.print("id : "+ id2 +"<br>");
	}else{
		out.print("id정보가 없어요 <br>");
	}
--%>

</body>
</html>