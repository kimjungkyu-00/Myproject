<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> info</title>
</head>
<body>
 <table width="100" border="1" >
 	<tr>
 		<td> 제품번호 </td> <td> 123456789</td>
 	</tr>
 	<tr>
 		<td> 가 격 </td> <td>99,000</td>
 	</tr>
 </table>

 <!--  상세한 내용을 jspinclude를 통하여 출력 -->
 <jsp:include page="exInParamSub.jsp">
 	<jsp:param value="A"  name="type"/>
 </jsp:include>
 
</body>
</html>