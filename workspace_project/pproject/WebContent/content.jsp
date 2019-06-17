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
<title>본격 게시판 - 게시글 조회</title>
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

<h1>게시글 조회</h1>
<table border="1">
		<tr>
			<th>번호</th>
			<td>${idx}</td>
			<th>작성자</th>
			<td>${writer}</td>			
			<th>날짜</th>
			<td>${regdate}</td>
			<th>조회수</th>
			<td>${count}</td>
		</tr>
		
		<tr>
			<th colspan="2">제목</th> <!-- colspan 은 행병합 속성 -->
			<th colspan="6">${title}</th>
		</tr>
		
		<tr>
			<th colspan="2">내용</th> 
			<th colspan="6">${content}</th>
		</tr>
		
		</table>
		 <a href="delete.jsp?idx=${idx }">게시글삭제</a>
		
		<a href="list.do">목록으로</a>
</body>
</html>