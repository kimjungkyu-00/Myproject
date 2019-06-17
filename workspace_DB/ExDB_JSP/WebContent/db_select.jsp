<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>

<%


	String driver="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC"
			+"&useUnicode=true"+"&characterEncoding=utf-8";
	String id="root";
	String pw="1234";
	Connection conn= null;
	PreparedStatement preStmt= null;
try{

	//1. driver 로드
	Class.forName(driver).newInstance();
	
	//2. db 연결
	conn=DriverManager.getConnection(url,id,pw);
	
	//3.쿼리 전송
	String query = "select * from student";
	//3-1 쿼리전송을위한 PreparedStatement 생성
	preStmt = conn.prepareStatement(query);
	
	//3.2 query 전송
	ResultSet resultSet =preStmt.executeQuery();
	out.print("select 출력");
	while(resultSet.next()){
		out.println(resultSet.getString("id"));
		out.println("\t"+resultSet.getString("name"));
		out.println("\t"+resultSet.getString("dept")+"<br>");
	}
	
	}catch(Exception e){
		out.print(e.getMessage());
		e.printStackTrace();
	}finally{
		if(preStmt !=null)
			try{preStmt.close();	}catch(SQLException e){}
		if(conn !=null)
			try{conn.close();	}catch(SQLException e){}
		}

	
	
	
%>    