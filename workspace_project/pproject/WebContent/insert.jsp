<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.regex.Pattern"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("euc-kr");
		int idx=1;
		String title=request.getParameter("title");
		String writer=request.getParameter("writer");
		String regdate=request.getParameter("regdate");
		int count=10000;
		String content=request.getParameter("content");
		
		
		if(content == "" ||content == null) out.println("content가 null입니다.");
	try{
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC"
				+"&useUnicode=true"+"&characterEncoding=utf-8";
		String id="root";
		String pw="1234";
		
		Class.forName(driver);
		
		Connection con= DriverManager.getConnection(url,id,pw);
		Statement stmt= con.createStatement();
		
		//시간 
		long time = System.currentTimeMillis(); 
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd");
		String newDate = dayTime.format(new Date(time));


		String sql = "INSERT INTO BOARD.BOARD "+
	                "(TITLE, WRITER,REGDATE,COUNT, CONTENT) "+
	 				"VALUES ('"+title+"', '"+writer+"', '"+newDate+"', '9', '"+content+"')";
		
		
		//String sql = "insert into board.board values(3,'abc2','sajdflkjlk2','20192',3,'fhfjgjhhgjg');";
		stmt.executeUpdate(sql); 
		
		out.print("데이터 베이스에 접속이 완료되었습니다 ");
		
		con.close();
		}catch(Exception e){
			out.print("데이터 베이스에 문제가 발생하였습니다. ");
			out.print(e.getMessage());
		}finally{
	        out.print("<script>location.href='list.do';</script>");
		}

	
	
	
	
%>	
<a href="write.jsp">글쓰기</a>

</body>
</html>