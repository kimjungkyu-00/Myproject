<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@page import="java.util.regex.Pattern" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>���� �Խ��� - �Խñ� ��ȸ</title>
<style type="text/css">
    table, td, th   {
    border:1px solid green;
    }
    th{
    background-color:green;
    color:white;
    }
</style>
</head>
<%
String idx = request.getParameter("idx");
try { 
	String driver = "com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC"
			+"&useUnicode=true"+"&characterEncoding=utf-8";
	
        ResultSet rs = null;
 
    	String id="root";
		String pw="1234";
 
        Class.forName(driver);
 
        Connection con = DriverManager.getConnection(url,id,pw);
  
        Statement stmt = con.createStatement();        
 
        String sql = "select * from board.board where idx = "+ idx;
              rs = stmt.executeQuery(sql);
		
        while(rs.next()){
        	request.setAttribute("idx", rs.getString("idx"));
        	request.setAttribute("writer", rs.getString("writer"));
        	request.setAttribute("regdate", rs.getString("regdate"));
        	request.setAttribute("count", rs.getString("count"));
        	request.setAttribute("title", rs.getString("title"));
        	request.setAttribute("content", rs.getString("content"));
        }
        con.close();
}catch(Exception e){
	out.print("Database COnnection Something Problem.");
	out.print(e.getMessage());
	e.printStackTrace();
	}
	
%>
<body>

<h1>�Խñ� ��ȸ</h1>
<table border="1">
		<tr>
			<th>��ȣ</th>
			<td>${idx}</td>
			<th>�ۼ���</th>
			<td>${writer}</td>			
			<th>��¥</th>
			<td>${regdate}</td>
			<th>��ȸ��</th>
			<td>${count}</td>
		</tr>
		
		<tr>
			<th colspan="2">����</th> <!-- colspan �� �ິ�� �Ӽ� -->
			<th colspan="6">${title}</th>
		</tr>
		
		<tr>
			<th colspan="2">����</th> 
			<th colspan="6">${content}</th>
		</tr>
		
		</table>
		 <a href="delete.jsp?idx=${idx }">�Խñۻ���</a>
		
		<a href="list.do">�������</a>
</body>
</html>