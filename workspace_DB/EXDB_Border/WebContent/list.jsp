<%@page import="java.util.ArrayList"%>
<%@page import="database.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
BorderDao dao = null;
try{
	
	dao =new BorderDao();
	ArrayList<Border> list= dao.getBorderList();
	if(null != list){
		out.print("size :"+list.size());
		for(int i=0; i<list.size() ; ++i){
			Border border = list.get(i);
			out.print("" +border.getTitle());
			out.print("" +border.getAuthor());
			out.print("" +border.getContent()+"<br>");
			}
		}
	}catch(Exception e){ out.print(e.getMessage());}
	finally{}
%>
</body>
</html>