<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="mvc.dao.*" %>

<%
	//1 client(loginForm.jsp-ajax) --(쿼리스트링: id=value&passwd=value)-->server(loginPro.jsp)
	
	//2. 요청 받는 처리 (jsp)코드로 처리
	
	//2.1 쿼리스트링 가져오기
	String id = request.getParameter("id");
	String pw = request.getParameter("passwd");
	//2.1 쿼리스트링 확인
	//out.print("id :"+id+", pw : "+pw);
	//out.print("<br>");
	//2.2 id/pw확인
	//2.2.1 회원정보 가져오기
	LogonDao dao = new LogonDao(application);
	//2.2.2. id/pw 확인 
	int check = dao.loginCheck(id,pw);
	
	//3. 결과는 출력문장인 out.print() 전달
	/*switch(check){
		case 0: out.print("login성공");break;
		case -1: out.print("id가 없습니다");break;
		case -2: out.print("pw가 틀립니다.");break;
	}*/
	//login이 성공하면 session에 정보저장
	if( check ==0 ){
		session.setAttribute("id",id);
	}
	out.print(check);//처리결과 출력
	//4. client(loginForm.jsp-ajax )<--( out.print()결과 )--server(loginPro.jsp)
%>
