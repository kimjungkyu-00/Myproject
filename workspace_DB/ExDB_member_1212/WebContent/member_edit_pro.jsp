<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
           <%@page import="java.sql.*" %>
    
    <%
    String driver="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC"
			+"&useUnicode=true"+"&characterEncoding=utf-8";
	String id="root";
	String pw="1234";
	request.setCharacterEncoding("utf-8"); // 한글처리
	Connection conn=null;
	PreparedStatement preStmt = null;
	
	try{
		//1.driver 로드
		Class.forName(driver).newInstance();
		//2. db연결 
		conn = DriverManager.getConnection(url,id,pw);
		
		//3쿼리 전송
		String query="UPDATE MEMBER SET passwd=? WHERE id=?";
		
		//4 prestatement 생성
		preStmt = conn.prepareStatement(query);

		//5. form으로받은 데이터 추가	
		//5-1 form에서 데이터 받기 
		String reqPw= request.getParameter("edit_pw");
		String reqId= request.getParameter("edit_id");

		out.print(reqPw+","+reqId+"<br>");

		//6 [?] 값 넣기
		preStmt.setString(1,reqPw);
		preStmt.setString(2,reqId);
	
		//7 query문 db실행
		int ret = preStmt.executeUpdate();
		out.print("결과 출력 "+ret);
		
	}catch(Exception e){
		out.print(e.getMessage());
		e.printStackTrace();
	}finally{
		if(preStmt != null) preStmt.close();
		if(conn!= null) conn.close();
	}
		%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>