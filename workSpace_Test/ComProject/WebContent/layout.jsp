<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>layout </title>
</head>
<body>

<table width="500" border="1" cellpadding="0" cellspacing="0">
	<tr> 
	    <td colspan="2">
	        <jsp:include page="/module/top.jsp" flush="false"/>
	    </td>
	 </tr>
	 <tr>
	    <td width="100" valign="top">
	        <jsp:include page="/module/left.jsp" flush="false"/>
	    </td>
	    <td	width="400" valign="top">
	    	이부분은 layout 작성하여 보자<br><br><br><br><br><br><br><br>
	  	</td>
	 </tr>
	<tr>
		<td colspan="2">
			<jsp:include page="/module/bottom.jsp" flush="false"/>
	</tr>
</table>

</body>
</html>