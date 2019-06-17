<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
    
  <%
	String driver="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC"
			+"&useUnicode=true"+"&characterEncoding=utf-8";
	String id="root";
	String pw="1234";
	Connection conn = null;
	PreparedStatement preStmt = null;
	
	try{
	//1driver 로드
	Class.forName(driver).newInstance();
	//2db연결
	 conn =DriverManager.getConnection(url,id,pw);
	//3쿼리전송 (string query)
	String query = "delete from student where name=? ";
	
	//3-1 쿼리전송ㅇ을위한PreparedStatement 생성
	preStmt =conn.prepareStatement(query);
	preStmt.setString(1,"박보검");
	
	//3-2 쿼리문출력
	int ret=preStmt.executeUpdate();
	
	//4, 쿼리 결과 처리
	out.println("쿼리결과 : "+ret);
	}catch(Exception e){
		out.println(e.getMessage());
		e.printStackTrace();
	}finally{
	//5. 쿼리 자원해제
		//6. db자원해제
	if(preStmt != null){
		try{preStmt.close();	}catch(SQLException e){}
		
		if(conn != null){
			try{conn.close();	}catch(SQLException e){}
	}
	}
	}
  
  %>