<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String type = request.getParameter("type");
    if( type != null ){%>


<table width="100" border="1" >
	<tr>
		<td>타입</td><td><%= type %></td>
	</tr>
	<tr>
		<td>특징</td>
		<td>
<%	if( type.equals("A")){ %>
			강한 내구성
<%  }else if(type.equals("B")){%>
		   뛰어난 편의성
<%   } %>
		</td>
	</tr>
</table>
<%	
    }
%>