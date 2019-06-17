<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>project_pet</title>

<!-- Bootstrap core CSS -->
<link
	href="<%=request.getContextPath()%>/resources/main/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link
	href="<%=request.getContextPath()%>/resources/main/css/heroic-features.css"
	rel="stylesheet">

</head>

<body>

	<!-- Navigation -->
	<header>
		<nav
			class="navbar navbar-default navbar-expand-lg navbar-dark bg-dark fixed-top">
			<div class="container">
				<a class="navbar-brand" href="/">PROJECT_NAME</a>
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarResponsive" aria-controls="navbarResponsive"
					aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				
				
				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse " id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav ml-auto">
						<li class="nav-item dropdown"><a
							class="text-muted nav-link dropdown-toggle"
							data-toggle="dropdown" href="notice1" role="button"
							aria-haspopup="true" aria-expanded="false"> 안내 </a>
							<div class="dropdown-menu">
								<a class="dropdown-item" href="/info.do"> 관련뉴스 </a> <a
									class="dropdown-item" href="/info4.do"> 실종시 대처안내 </a> <a
									class="dropdown-item" href="/info2.do"> 구조시 대처안내</a> <a
									class="dropdown-item" href="/info3.do"> 입양안내 </a>
							</div></li>

						<li class="nav-item dropdown"><a
							class="text-muted nav-link dropdown-toggle"
							data-toggle="dropdown" href="notice1" role="button"
							aria-haspopup="true" aria-expanded="false"> 실종/임시보호 </a>
							<div class="dropdown-menu">
								<a class="dropdown-item" href="/findList"> 찾아용 </a>
							</div></li>


						<li class="nav-item dropdown"><a
							class="text-muted nav-link dropdown-toggle"
							data-toggle="dropdown" href="notice1" role="button"
							aria-haspopup="true" aria-expanded="false"> 유기센터 </a>
							<div class="dropdown-menu">
								<a class="dropdown-item" href="/rescue1"> 유기견 </a> <a
									class="dropdown-item" href="/rescue2"> 보호센터 찾기</a>

							</div></li>

						<li class="nav-item dropdown"><a
							class="text-muted nav-link dropdown-toggle"
							data-toggle="dropdown" href="notice1" role="button"
							aria-haspopup="true" aria-expanded="false"> 문의 </a>
							<div class="dropdown-menu">
								<a class="dropdown-item" href="/notice1"> 1 : 1 문의 </a> <a
									class="dropdown-item" href="/notice2List.do"> 공지사항 </a>
							</div></li>

						<li class="nav-item dropdown"><a
							class="text-muted nav-link dropdown-toggle"
							data-toggle="dropdown" href="notice1" role="button"
							aria-haspopup="true" aria-expanded="false"> 상식 </a>
							<div class="dropdown-menu">
								<a class="dropdown-item" href="/knowledge"> 일반상식 </a> <a
									class="dropdown-item" href="/knowledge2"> 동물 보호법 </a>
							</div></li>
					</ul>
				</div>
								<div class="col-4 d-flex justify-content-end align-items-center">
				
					<c:if test="${member.userid == null }">
						<a class="btn btn-sm btn-outline-secondary" href="/login">login</a>
						<a class="btn btn-sm btn-outline-secondary" href="/signUp">Sign
							up</a>
					</c:if>
					<c:if test="${member.userid != null}">

					<a href="/pwCheckSubmit">${member.username}</a>님이 로그인중입니다

						<a class="btn btn-sm btn-outline-secondary" href="/logout">logout</a>
						

					</c:if>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
		</nav>

	</header>
