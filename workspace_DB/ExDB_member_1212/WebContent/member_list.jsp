<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
  <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>db예제</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<h3>회원목록</h3>
<hr>
</body>
</html>
<%@page import="java.sql.*"%>
    <%
    
    String driver="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC"
			+"&useUnicode=true"+"&characterEncoding=utf-8";
	String id="root";
	String pw="1234";
	
	Connection conn=null;
	PreparedStatement preStmt = null;
	
	try{
		//1.driver 로드
		Class.forName(driver).newInstance();
		
		//2. db연결 
		conn = DriverManager.getConnection(url,id,pw);
		
		//3. Statmement 쿼리전송
		String query = "SELECT * FROM MEMBER";
		preStmt = conn.prepareStatement(query); 
		
		//query 전송
		ResultSet resultSet = preStmt.executeQuery();
		//query 전송결과 처리 (출력)
		while(resultSet.next()){
			out.print( resultSet.getString("id"));
			out.print( " "+resultSet.getString("passwd"));
			out.print( " "+resultSet.getString("name"));
			out.print( " "+resultSet.getTimestamp("reg_date")+"<br>");
		}
	}catch(Exception e){
		out.print(e.getMessage()); e.printStackTrace();
	}finally{
		if(preStmt!=null) preStmt.close();
		if(conn !=null) conn.close();
	}
		%>
