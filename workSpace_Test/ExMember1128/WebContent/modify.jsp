<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member</title>
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
	<div class="container">
		<div class="row fullscreen d-flex align-items-center">
			<ul>
				<li><label for="passwd"> 비밀번호 </label>
				     <input id="passwd" name="passwd" type="password" class="form-control"
				            size="10" placeholder="6~10자 숫자/문자입력" maxlength="10">
				      </li>
				<li> <br><button id='modify' class='btn'>정보수정</button>
				 	 <button id='delete' class='btn'>회원탈퇴</button>
				</li>      
			</ul>
		</div>
		<div id="message"></div>
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
 
 <script>
 	$(function(){
 		
 		$('#modify').click(function(){
	 		//회원정보 수정
	 		//1. 입력된  비밀번호 검사요청
	 		//입력된 비밀번호 값 받아오기
	 			 		
	 		//1. ajax로 서버에게 비밀번호 검사 의뢰
	 		//1.1 전송할 쿼리스트링을 생성한다.
	 		var query={ passwd:$('#passwd').val()};
	 		
	 		$.ajax({
	 			type:"post",
	 			url:"checkPW.jsp",//비빌번호 검증
	 			data:query,
	 			success:function(msg){//성공한경우 
	 				alert(msg);		//2. 서버 검사 결과 출력
	 				//2. 비밀번호 일치 경우 회원정보 출력(main)
	 				if( msg == 0){ //pw 일치하는 경우
	 					//회원출력 //ajax로 (modifiPro.jsp)정보요청
	 					$('#message').load("modifyPro.jsp");
	 				}else{ 
	 		 			//3. 비밀번호 틀린경우 비번 재입력요청
	 		 			alert("비밀번호 상이합니다 다시입력해주세요");
	 		 			$('#passwd').focus();
	 				}
	 			}
	 		});
 		});	
 		
 		//회원탈퇴
 		$('#delete').click(function(){
 			//modify.jsp : 회원 비밀번호 검사요청
 			//1. 비밀번호 입력값을 가져온다.
 			//alert( $('#passwd').val() );
 			//2. 쿼리를 만든후 서버에 요청
 			//var query = { passwd:$('#passwd').val()};
 			var sendData = "pd="+ $('#passwd').val();
 			// alert(sendData);
 			$.post(
 					"checkPW.jsp",
 					sendData,
 					function(msg){
 						alert(msg);
 						//pw가 일치하는 경우
 						if( msg ==0 ){
 							//탈퇴요청을 서버에 보낸다
 							$.post("deletePro.jsp",
 									sendData,
 									function(msg){ //탈퇴요청처리 결과 
 								     if(msg==0){
 								    	 $(location).attr('href',"main.jsp");
 								     }else{
 								    	 alert("실패하였습니다.");
 								     }
 							});
 						}
 			  });
 			//2.1 쿼리를 만든다.
 			//2.2. ajax로 요청url(deletePro.jsp), type(post),data(query) 
 			//2.3  요청 성공시 탈퇴됨을 알림
 		});
 
 		
 	});
 </script>
	
</body>
</html>