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
		
		//4. prestatement 생성
		String query = "updata student set name=? where id=?";
		preStmt = conn.prepareStatement(query); 
		//5. form으로부터 받은 값을 query에 추가
		// form에서 데이타 받기
		String reqId = request.getParameter("id");
		String reqEditName = request.getParameter("edit_Name");
		out.print("reqid : "+reqId + "req name : "+reqEditName+"<br>");
		
		//? 값넣기
		preStmt.setString(2,reqId);
		preStmt.setString(1,reqEditName); 
		
		//query문 db실행
		int ret= preStmt.executeUpdate();
		out.print("edit결과 : "+ret);
	}catch(Exception e){
		out.print(e.getMessage()); e.printStackTrace();
	}finally{
		if(preStmt!=null) preStmt.close();
		if(conn !=null) conn.close();
	}
		%>