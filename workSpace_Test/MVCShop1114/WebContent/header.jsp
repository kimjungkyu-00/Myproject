<table width= '800'>
	<tr>
		 <td> <a href="index.jsp">home</a></td>
		 <td> <a href="itemlist.do">item list</a></td>
		 <td> <a href="orderlist.do">order list</a></td>
		 <td> <a href="itemadd.do">item add</a></td>
		 <% if( null != session.getAttribute("admin")) { %>
		 <td> ${admin.getId() } <a href="logoutadmin.do"> logout</a></td>
		 <%	} %>
		
	 </tr>
</table>