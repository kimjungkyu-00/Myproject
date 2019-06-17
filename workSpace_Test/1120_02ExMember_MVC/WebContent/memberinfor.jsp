<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<style>
	li{list-style:none;}
</style>
</head>
<body>

<nav>
<jsp:include page="header.jsp"/>
</nav>

<h3>회원 상세 정보</h3>
<hr>


	<div >
		<table border=1>
			<thead>
				<tr>
					<td>회원이름 </td> <td>전화번호</td>
				</tr>
				</thead>
			<tr>
				<td> ${newMember.getName() } </td>
				<td> ${newMember.getPhone() }</td>				
			</tr>
		</table>
	</div>
 
</body>
</html>