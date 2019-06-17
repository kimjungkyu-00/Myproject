<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	//필수 입력 사항 id/pw 
	//client가 form에 입력한 데이타를 받아옴.
	
	//서버가 client가 member.jsp에 입력된 데이타를 받기
	String id = request.getParameter("id");
	String pw  = request.getParameter("pw");
	String pw2 = request.getParameter("pw2");
	String addr  = request.getParameter("address");
	//checkbox에 선택된 수 만큼 가져온다.
	String[] hobbyArr = request.getParameterValues("hobby");
	
	
	System.out.println("id : "+id+", pw : "+pw+", pw2 : "+pw2);
	System.out.println("addr : "+addr);
	out.println("id : "+id+", pw : "+pw +", pw2 : "+pw2+"<br>");
	
	//id와 pw가 입력이 되어있지 않으면 
	//서버가 client에게 member.jsp 보내기 한다.
	if( id.equals("") || pw.equals("")){
		response.sendRedirect("member.jsp");
	}else{
	//id와 pw가 입력이 되면 서버가 client에게 memberOk.jsp 보내기
		//session에 id값을 저장한다.
		session.setAttribute("mID", id);
		session.setAttribute("mAddr", addr);
		
		//가져온 내용 확인하기
		if( hobbyArr != null ){
			System.out.println("hobby : "+hobbyArr.length+"개");
			for(int i=0; i < hobbyArr.length ; ++i){
				System.out.println(i + " :" +hobbyArr[i]);
				//out.println(i + " :" +hobbyArr[i]+"<br>");
			}
			//선택된것중 하나만 넘겨준다.
			//session.setAttribute("mHobby",hobbyArr[0]);
			
			
			//여러개의 데이타를 session에 저장하여 사용하기
			//1.ArrayList를 생성한다.
			ArrayList<String>  list = new ArrayList<String>();			
			if( list != null ){
				//2.ArrayList에 데아타(item)를 넣는다
				for(int i=0; i < hobbyArr.length ; ++i){
					list.add(hobbyArr[i] );
				}				
			}
			//3. sesson에 Arraylist를 넣어준다
			session.setAttribute("mHobbyArrayList",list);
			
		}
	
		response.sendRedirect("memberOK.jsp");
	}
%>
</body>
</html>