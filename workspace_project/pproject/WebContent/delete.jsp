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
 
        out.println("mysql Database Connection Success.");
 
        Statement stmt = con.createStatement();        
 
        String sql = "delete * from board where idx = "+ idx;
              rs = stmt.executeQuery(sql);
		con.close();
}catch (Exception e){
	out.print("Database COnnection Something Problem.");
	out.print(e.getMessage());
	e.printStackTrace();
}

%>
<script>
	alert("�Խñ��� �����Ǿ����ϴ�."); // �Խñ��� �����Ǿ��ٴ� ���â ����
	location.href="redirect.jsp"; // ����Ʈ�������� �̵��մϴ�.
</script>
<body>
		
</body>
</html>