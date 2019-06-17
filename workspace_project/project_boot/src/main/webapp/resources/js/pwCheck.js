$(document).ready(function() {

	$("#btnPwCheck").click(function() {

		var pwCheck = $("#pwCheck").val();
		var pw = $("#user_pw").val();

		if (pwCheck == pw) {
			alert("확인");
			window.location.href = "/memberInfo";
		} else {
			alert("비밀번호 다시확인해주세요");
			$("#pwCheck").focus();
			return false;
		}

	});
});