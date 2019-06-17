<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html lang="ko" class="no-js">

<head>

    
	<link href="https://fonts.googleapis.com/css?family=Poppins:100,200,400,300,500,600,700" rel="stylesheet">
	<!--	CSS			============================================= -->
	<link rel="stylesheet"  href="css/bootstrap.min.css" id="bootstrap-css">
	<link rel="stylesheet" href="css/linearicons.css">
	<link rel="stylesheet" href="css/font-awesome.min.css">   
	<link rel="stylesheet" href="css/magnific-popup.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/lightgallery/1.6.11/css/lightgallery.min.css">
	<link rel="stylesheet" href="css/nice-select.css">
	<link rel="stylesheet" href="css/animate.min.css">
	<link rel="stylesheet" href="css/owl.carousel.css">
    <link rel="stylesheet" href="css/main.css">
    <link href="css/registerForm.css" rel="stylesheet" >
    <!------ Include the above in your HEAD tag ---------->
    
</head>

<body>
       	<!--################ Start Header Area ########-->
	<jsp:include page="header_nav.jsp"/>
	<!--######## End Header Area ########-->
	
<section class="home-banner-area relative" id="home">
    <div class="container register">
        <div class="row">
            <div class="col-md-3 register-left">
                <img src="https://image.ibb.co/n7oTvU/logo_white.png" alt=""/>
                <h3>Welcome</h3>
                <p> 이미 가입 하셨으면 로그인 해주세요 !</p>
                <input type="button" name="" value="Login" id="btnLogin"/><br/>
            </div>
            <div class="col-md-9 register-right">                
                <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                    <h3 class="register-heading">회원가입</h3>
                    <div class="row register-form">
                        <div class="col-md-6">
                            <div class="form-group">
                                    <label for="id">아이디(필수)</label>
                                    <input class="form-control" id="id" type="email" name="id" size="20" maxlength="50"
                                    placeholder="abc@digital.com">
                            </div>
                            <div class="form-group">
                                    <label for="passwd">비밀번호(필수)</label>
                                    <input id="passwd" class="form-control" type="password" id="pw" name="pw" size="20" 
                                            placeholder="6~10자 숫자/문자" maxlength="10">                               
                            </div>
                            <div class="form-group">
                                    <label for="name">이름(필수)</label>
                                    <input id="name" class="form-control"  type="text" name="name" size="20" 
                                            placeholder="이름입력" maxlength="10">                                      
                            </div>
                            <div class="form-group">
                                    <label for="tel">전화번호</label>
                                    <input id="tel"class="form-control"   type="text" name="tel" size="20" 
                                            placeholder="- 없이 입력" maxlength="11"></li>
                             </div>  
                             <div class="form-group">
                                    <label for="address">주소</label>
                                    <input id="address" class="form-control" type="text" name="address" size="50" 
                                            maxlength="50">
                             </div>                          
                        </div>
                        <div class="col-md-6">
                                <div class="form-group"> 
                                    <br>                                 
                                    <input id="checkId" class="btn btn-primary" type="button" value="ID 중복검사">		                            
                                </div>
                            <div classs="form-group">
                            </n>
                                    <label for="passwd">비밀번호 재입력</label>
                                    <input id="re_passwd" class="form-control" type="password" name="passwd" size="20" 
                                        placeholder="비밀번호 재입력" maxlength="10">
                              </div>
                              <p></p>
                            <div class="form-group">
                                    <button class="btnRegister" id="process"> 회원가입</button>
                                    <button  class="btnRegister"  id="cancle">취소</button>
                            </div> 
                        </div>
                    </div>  
                </div>  
            </div>
        </div>
    </div>
    </section>
    
        <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap/bootstrap.js"></script>  
    
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

	<script src="register.js"></script>
	
</body>
</html>