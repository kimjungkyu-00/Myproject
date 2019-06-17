<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>쿠키</h3>
<hr>

<%
		//request를 통하여 id/pw정보를 가져온다.
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		out.println("id : "+id+",pw : "+pw);
		
		//쿠키를 생성하여 저장하기
		//쿠키는 저장위치는 client
		if(id.equals("admins") && pw.equals("1234")	){
			//쿠키에 id.pw을 저장한다.
			//쿠키를 만든다.
			Cookie cookie = new Cookie("userId",id);
			//쿠키를 저장 - > client가 cookie 정보를 저장하므로 response에 추가
			response.addCookie(cookie);
			
			//쿠키 정보 출력
			Cookie[] cookieArr = request.getCookies();
			out.println("cookie 정보 출력 <br>"+cookieArr.length+"개 있음<br>");
			for(int i=0; i< cookieArr.length ; ++i){
				out.print(" cookie name"+cookieArr[i].getName());
				out.print(", cookie value"+cookieArr[i].getValue()+"<br>");
			}
		}
		
%>
</body>
</html>