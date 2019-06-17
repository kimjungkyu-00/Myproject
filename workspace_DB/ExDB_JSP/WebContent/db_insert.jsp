<%@page import="java.sql.Timestamp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.DriverManager" %>
    <%@ page import="java.sql.Connection" %>
    <%@ page import="java.sql.SQLException" %>
    <%@ page import="java.sql.PreparedStatement" %>
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
	String query = " INSERT INTO student values(?,?,?)";
	//3.1 query전송을위한 PreparedStatement 생성
	 preStmt= conn.prepareStatement(query);
	preStmt.setString(1,"31211");
	preStmt.setString(2,"김정규");
	preStmt.setString(3,"digital");
	
	//3.2 query 전송
	int ret = preStmt.executeUpdate();
	
	//4. query 결과 처리
	out.println("insert 결과"+ret);
	}catch(Exception e){
		out.println(e.getMessage());
		e.printStackTrace();
	}finally{
	//5. query 관련 자원해제
	//6.  db 자원해제
	if(preStmt!= null){
		try{ preStmt.close(); } catch(SQLException e){}
		if(conn != null){
			try{ preStmt.close(); } catch(SQLException e){}

		}
	}
}
%>