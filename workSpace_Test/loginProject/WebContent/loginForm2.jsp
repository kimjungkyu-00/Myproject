<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
   function loginCheck(){
      
      var e = e | window.event;
      //id와 pw를 입력하지 않으면 화면전환 안됨(LoginForm_process.jsp로 이동금지)
      //default event 동작 하지 않음.
      var id = document.loginform.id;
      var pw = document.loginform.password;
      
      if(id.value == ""){
         alert("아이디를 입력해주세요")
         id.focus(); //아이디에 포커스 활성화
         return false;
      }else if(pw.value == ""){
         alert("비밀번호를 입력해주세요")
         pw.focus();
         return false;
         }
      }
</script>
</head>
<body>
   <h3> 로그인 </h3>
   <hr>
   <form action="login_process.jsp" method="post" name="loginform">
      <p> 아 이 디 <input type="text" name="id">
      <p> 비밀번호 <input type="password" name="password">
      <p> <input type="submit" value="login" onclick="return loginCheck()">
   </form>
</body>
