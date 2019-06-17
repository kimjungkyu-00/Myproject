<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
   function loginCheck() {
      //아이디가 영문자 소문자만 입력이 가능 
      
      var form = document.loginform;
      
      for(var i = 0; i < form.id.value.length; ++i){
         var ch = form.id.value.charAt(i);
         if('a' > ch  ||  ch > 'z'){//'a'~'z' 범위 안에 있는 값이 아닌경우 
            alert(" 아이디는 영문자 소문자로만 입력 가능 ");
            return ;
            
         }
      }
      /* for(var i = 0; i < form.passwd.value.length; ++i){
         var ch = form.passwd.value.charAt(i);
         if('0' > ch || ch > '9'){
            alert("비밀번호는 0~9만 입력가능");
            return ;
               
         }
      } */
      if(isNaN(form.passwd.value) ){
         alert("비밀번호는 0~9만 입력가능");
         return ;
            
      }
   }
   
   
   
   
</script>

</head>
<body>
   <form action="" method="post" name="loginform">
   <p> 아 이 디 :  <input type="text" name="id">
   <p> 비밀번호 :<input type="password" name="passwd">
   <p> <input type="submit" value="login" onclick="loginCheck()">
   </form>
</body>
