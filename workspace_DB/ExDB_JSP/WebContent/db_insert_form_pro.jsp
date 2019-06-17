<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*" %>
    
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
		
		
		//3.query전송
		request.setCharacterEncoding("utf-8"); // 한글처리
		String query = " INSERT INTO student values(?,?,?)";
		 preStmt= conn.prepareStatement(query);
		 //form에서 값 가져온것 확인하기
		 String reqId = request.getParameter("id");
		 String reqName = request.getParameter("name");
		 String reqDept = request.getParameter("dept");
		out.print("request.getParameter : "+reqId+","+reqName+","+reqDept+"<br>");
		//form에서 받은 값을 query 넣기 
		
		preStmt.setString(1,reqId);
		preStmt.setString(2,reqName);
		preStmt.setString(3,reqDept);
		//db전송
		int ret = preStmt.executeUpdate();
		out.print("insert 결과 : "+ret);
	}catch(Exception e){
		out.print(e.getMessage());
		e.printStackTrace();
	}finally{
		if(preStmt !=null) preStmt.close();
		if(conn !=null) conn.close();
		}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert 예제</title>
</head>
<body>

</body>
</html>