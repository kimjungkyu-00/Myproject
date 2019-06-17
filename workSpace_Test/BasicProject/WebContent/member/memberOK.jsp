<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%
	//session에 저장된  mID값을 가져온다.
	String id = (String)session.getAttribute("mID");
	String addr = (String)session.getAttribute("mAddr");
	//String hobby = (String)session.getAttribute("mHobby"); //1개의 데이타만 받을때
	//여러개의 데이타를 받기
	ArrayList<String>  list =(ArrayList)session.getAttribute("mHobbyArrayList");
		
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원가입</h3>
<hr>
<%= id %>님 회원가입이 완료 되었습니다
<br>
가입정보
<hr>
주소 : <%= addr %> <br>
취미 : 
<%
	if( list != null ){
	 	out.print("취미는 "+list.size()+"개 입니다<br>");
		for(int i=0 ; i < list.size(); ++i){
			out.print( i + " : " + list.get(i)+"<br>");
		}
	}

 %>
</body>
</html>