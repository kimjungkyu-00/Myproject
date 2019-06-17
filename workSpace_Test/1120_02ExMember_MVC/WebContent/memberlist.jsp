<%@page import="mvc.dto.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보</title>
</head>
<body>

<nav>
<jsp:include page="header.jsp"/>
</nav>

<h3>회원 리스트</h3>
<hr>
<!--  최초  -->
	<form action="memberinfor2.do" method="post">  
		<p><input type="submit"  value="회원정보 보기"/>
	 <table border=1>
	 	<tr>
	 		<th> </th>
	 		<th> 이름</th>
	 		<th>전화번호</th>
	 	</tr>
	 	<%
	 		ArrayList<Member> list = (ArrayList)application.getAttribute("memberlist");
	 		if(list ==null || list.size() < 0 ){
	 			out.println("가입된 회원이 없습니다.");
	 		}else{
	 			for(int i =0 ; i <list.size() ; ++i){
	 				Member member = list.get(i);
	 				out.print("<tr><td><input type='radio' name='info' value='"+i+"'/></td> ");
	 				out.print("<td>" +member.getName()+"</td>");
	 				out.print( "<td>"+member.getPhone() +"</td></tr>");

	 	%>
	 	<!-- 
			<tr>
			<td> <a href=""><input type="radio" name="info" value=""/></a></td>
			<td> </td>	
			<td>  </td>
			</tr>
			 -->
		<%
	 			}
	 		}
		%>
	</table>
	
	</form>
</body>
</html>