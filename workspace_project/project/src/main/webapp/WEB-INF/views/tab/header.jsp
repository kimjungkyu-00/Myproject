<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
 
<!-- Bootstrap core CSS -->
<link href="<%=request.getContextPath()%>/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet"> 
 
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>

<script src="<%=request.getContextPath()%>/resources/vendor/jquery/jquery.min.js"></script>
		
</head>

<body>

	<!-- Navigation -->
	<header>
		<nav
			class="navbar navbar-default navbar-expand-lg navbar-dark bg-dark">
			<div class="container">
				<a class="navbar-brand" href="/">COME_DOG</a>
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarResponsive" aria-controls="navbarResponsive"
					aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				
				
				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse " id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav ml-auto">
						<li class="nav-item dropdown">
							<a class="text-muted nav-link dropdown-toggle" href="" data-toggle="dropdown" role="button"
							aria-haspopup="true" aria-expanded="false"> 안내 </a>
							<div class="dropdown-menu">
								<a class="dropdown-item" href="/info.do"> 관련뉴스 </a> 
								<a class="dropdown-item" href="/info4.do"> 실종시 대처안내 </a> 
								<a class="dropdown-item" href="/info3.do"> 입양안내 </a>
								<a class="dropdown-item" href="/info5.do"> 보호절차 </a>
								<a class="dropdown-item" href="/knowledge2"> 동물 보호법 </a>
							</div>
						</li>

						<li class="nav-item dropdown">
							<a class="text-muted nav-link dropdown-toggle" href="" data-toggle="dropdown" role="button"
							aria-haspopup="true" aria-expanded="false"> 실종/보호 </a>
							<div class="dropdown-menu">
								<a class="dropdown-item" href="/findList"> 게시판 </a>
							</div>
						</li>


						<li class="nav-item dropdown">
							<a class="text-muted nav-link dropdown-toggle" href="" data-toggle="dropdown" role="button"
								aria-haspopup="true" aria-expanded="false"> 유기센터 </a>
							<div class="dropdown-menu">
								<a class="dropdown-item" href="/rescue1"> 유기견 </a> 
								<a class="dropdown-item" href="/rescue2"> 보호센터 찾기</a>
							</div>
						</li>

						<li class="nav-item dropdown">
							<a class="text-muted nav-link dropdown-toggle" href="" data-toggle="dropdown" role="button"
							aria-haspopup="true" aria-expanded="false"> 문의 </a>
								<div class="dropdown-menu">
									<a class="dropdown-item" href="/mail"> 1 : 1 문의 </a> 
									<a class="dropdown-item" href="/notice2List.do"> 공지사항 </a>
								</div>
						</li>

						<li class="nav-item dropdown">
							<a class="text-muted nav-link dropdown-toggle" href="" data-toggle="dropdown" role="button"
							aria-haspopup="true" aria-expanded="false"> 상식 </a>
								<div class="dropdown-menu">
									<a class="dropdown-item" href="/knowledge"> 일반상식 </a> 
									<a class="dropdown-item" href="/know2"> 건강상식 </a>
									<a class="dropdown-item" href="/photo"> 강아지 갤러리 </a>
									
								</div>
						</li>
					</ul>
				</div>
				
				<div class="col-4 d-flex justify-content-end align-items-center">
					<c:if test="${member.userid == null }">
						<a class="btn btn-sm btn-outline-secondary" href="/login">login</a>
						<a class="btn btn-sm btn-outline-secondary" href="/signUp">Sign up</a>
					</c:if>
					<c:if test="${member.userid != null}">
						<a href="/pwCheckSubmit">${member.username}</a> <span style="color:white"> 님이 로그인중입니다</span>
						<a class="btn btn-sm btn-outline-secondary" href="/logout">logout</a>
					</c:if>
					<c:if test="${member.userid == 'admin' }">
						<a class="btn btn-sm btn-outline-secondary" href="/memberList.do">회원list</a>
					</c:if>
				</div>
			</div>
		</nav>
		

	</header>
