<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<nav>
<jsp:include page="header.jsp"/>
</nav>


	<div >
	<table border=1>
		<theader>
		<tr>
		</theader>
		
		<tr>
			<td>${infomemberlist.getName()} </td>
			<td> ${infomemberlist.getPhone()} </td>				
		</tr>
	</table>
	</div>

</body>
</html>