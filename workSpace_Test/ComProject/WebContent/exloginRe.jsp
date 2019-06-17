<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//아래 배열에 있는 id로 
	String[] user = {"abc", "king", "hong" };
	String[] pw = {"1234", "1111", "2222"};
	
	String mId = request.getParameter("id");
	String mPw = request.getParameter("pw");
	if(mId != null && mPw != null){
		//exLogin.jsp에서 id, pw를 입력받은내용 확인
		out.println("확인용 : id : "+mId + ", pw : "+mPw+"<br>");
		boolean isID=false;
		for(int i=0; i < user.length; ++i ){
			//mId와 user[i] 같은지 확인
			if( mId.equals(user[i])){
				//같으면 pw가 맞는 확인
				isID = true;
				if( mPw.equals(pw[i]) ){
					//로그인 성공
					out.println("로그인 성공");					
				}else{ //pw가 틀린경우
					out.println("비밀번호가 틀렸습니다");	
				}
				break;
			}
		}		
		
		if( isID == false){
			out.println("아이디가 틀립니다 <br>");
			response.sendRedirect("exlogin.jsp");
		}
	}
	
%>



</body>
</html>