<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko" class="no-js">

<head>

</head>
<body>

        <div id="login-row" class="row  justify-center-center mb-3">
            <div id="login-column" class="col-md-3"> 
              <div   id="main_auth"  class="box">                    
                   <div class="form-group">
                       <label for="username" class="text-white">아이디:</label><br>                              
                       <input class="form-control" id="id" type="email" name="id" size="20" maxlength="50"
                       placeholder="abc@digital.com">
                   </div>
                   <div class="form-group">
                       <label for="password" class="text-white">비밀번호:</label><br>                               
                       <input class="form-control"  id="passwd" type="password" name="passwd" size="20" 
                       placeholder="6~10자 숫자/문자" maxlength="10">
                   </div>
                   <div class="form-group">
                       <input id="login" type="button" name="login" class="btn btn-info btn-md" value="login">
                       <input id="register" type="button" name="register" class="btn btn-info btn-md" value="회원가입">
                   </div>                  
            </div>          
        </div>
    </div>
 

</body>
</html>