<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko" class="no-js">

<head>
	<!-- Mobile Specific Meta -->
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<!-- Favicon-->
	<link rel="shortcut icon" href="img/fav.png">
	<!-- Author Meta -->
	<meta name="author" content="colorlib">
	<!-- Meta Description -->
	<meta name="description" content="">
	<!-- Meta Keyword -->
	<meta name="keywords" content="">
	<!-- meta character set -->
	<meta charset="UTF-8">
	<!-- Site Title -->
	<title>digital</title>

	<link href="https://fonts.googleapis.com/css?family=Poppins:100,200,400,300,500,600,700" rel="stylesheet">
	<!-- CSS 	============================================= -->
	<link rel="stylesheet" href="css/linearicons.css">
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<link rel="stylesheet" href="css/bootstrap.css">
	<link rel="stylesheet" href="css/magnific-popup.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/lightgallery/1.6.11/css/lightgallery.min.css">
	<link rel="stylesheet" href="css/nice-select.css">
	<link rel="stylesheet" href="css/animate.min.css">
	<link rel="stylesheet" href="css/owl.carousel.css">
    <link rel="stylesheet" href="css/main.css">
    <link rel="stylesheet" href="css/loginform.css">
    

</head>
<body>

	<!--################ Start Header Area ########-->
	<jsp:include page="header_nav.jsp"/>
	<!--######## End Header Area ########-->
<section class="home-banner-area relative" id="home">
<div class="container" >
<div class="row fullscreen d-flex align-items-center">
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
    </section>
    
 <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>  
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" 
	crossorigin="anonymous"></script> 
	<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBhOdIF3Y9382fqJYt5I_sswSrEw5eihAA"></script>
	<script src="js/easing.min.js"></script>
	<script src="js/hoverIntent.js"></script>
	<script src="js/superfish.min.js"></script>
	<script src="js/jquery.ajaxchimp.min.js"></script>
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/isotope.pkgd.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/jquery.nice-select.min.js"></script>
	  <script src="js/jquery.lightbox.js"></script>  

	<script src="js/main.js"></script>
    <script >
    $(function(){
    	//1.입력창 id, 입력창 pw 입력값을 가지고 온다
    	$('#login').click(function(){
    		//id/pw 입력 검사.
	    	var id =  $('#id').val();
	    	var pw = $('#passwd').val();
	    	alert("id : "+id +" pw: "+pw);
	    	
	    	//2. 서버에게 id/pw 전달 ( ip/pw 맞는 검사)
	    	//2.1 전달할 쿼리스트링 만들기
	    	var query ={
	    		         id:$('#id').val(),
	    		         passwd:$('#passwd').val()
	    		       };
	    	//2.2 서버(loginPro.jsp)에게 id와 pw 맞는지 검사 요청(login)
	    	$.ajax({
	    		type:"POST",//전송방식
	    		url:"loginPro.jsp", //받는 서버의 경로및파일
	    		data:query,//전송할 쿼리스트링
	    		success:function(msg){ //서버에서 요청내용 처리 결과
					alert(msg);//서버에 확인코드가 없어야함
	    			if( msg == 0 ){
	    				alert("login 성공");
	    				$(location).attr('href','main.jsp');
	    			}else if(msg == -1){
	    				alert("id가 없습니다");
	    				$('#id').focus();
	    			}else if(msg == -2){
	    				alert("비밀번호가 상이합니다.");
	    				$('#passwd').focus();
	    			}
	    			
	    		}
	    	});
    	});
    })
    </script>

</body>
</html>





