<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<meta charset="UTF-8">
<title>LOGIN PAGE</title>
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/login.js"></script>
<jsp:include page="../tab/header.jsp"></jsp:include>

			<div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
				<div class="card card-signin my-5">
					<div class="card-body">
						<h5 class="card-title text-center">Sign In</h5>
						<form class="form-signin">
							<div class="form-group">
					<input class="form-control" placeholder="아이디" name="userid"
						id="userid" type="text" autofocus>
				</div>
				<div class="form-group">
					<input class="form-control" placeholder="비밀번호" name="userpw"
						id="userpw" type="password" value="">
				</div>
							<!--  <div class="custom-control custom-checkbox mb-3">
								<input type="checkbox" class="custom-control-input"
									id="customCheck1"> <label class="custom-control-label"
									for="customCheck1">Remember password</label>
							</div>-->
							<button type="button" class="btn btn-lg btn-primary btn-block" id="btnLogin">로그인</button>
							<br>
							<button type="button" class="btn btn-outline btn-warning"
						onclick="location.href='/signUp'">회원가입</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>




<jsp:include page="../tab/footer.jsp"></jsp:include>
