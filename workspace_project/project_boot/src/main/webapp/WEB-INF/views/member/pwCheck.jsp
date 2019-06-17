<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<meta charset="UTF-8">

<jsp:include page="../tab/header.jsp"></jsp:include>
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/pwCheck.js"></script>

<div class="col-sm-5 col-md-5 col-lg-5 mx-auto">
	<div class="card card-signin my-5">
		<div class="card-body">
			<h5 class="card-title text-center">비밀번호 확인</h5>
			회원 정보 수정을 위해 비밀번호를 입력하세요 <input type="hidden"
				value="${member.userpw}" name="user_pw" id="user_pw">
			<p>
				비밀번호 : <input type="password" name="pwCheck" id="pwCheck">

				<button type="button" class="btn btn-primary" id="btnPwCheck">확인</button>
		</div>
	</div>
</div>

<jsp:include page="../tab/footer.jsp"></jsp:include>