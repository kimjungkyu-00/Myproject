<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="js/jquery.js"></script>
<script>
$(function() {
	//1. 버튼이 클릭했을때 text창에 값을 alert에 출력하기
	$("#submit").click(function() {
		var name = $('#name').val();
		var sendData = "name="+name;

	$("#result").text(sendData);
	
	$.post(
		"searchServer.jsp",
		sendData,
		function (msg) {
			$('#msg').html(msg);
		}
		
	)
	})
	//2. 버튼을 클릭했을대 text창에 입력된 값(이름)을 가진 회원이 있는지 찾아달라고 서버에 요청
	//	가진 회원이 있는지 찾아달라고 서버에 요청 ("search.jsp")
	// 	"search.jsp"에서 요청한 name값을 search.jsp전송
	// seach.jsp <div>에 searchServer.jsp 출력
	//3. 2번에 + search.jsp에서 name값에 있는 회원이 유무를 전송
});
</script>
</head>
<body>
	
	<form>
		<input type="text" name="searchname" id="name" />
		<input type="button" value="검색" id="submit" />
	</form>
	<hr>
	<h3>전송할 데이타 확인</h3>
	<div id="result"></div> // 전송할 데이타 확인
	<hr>
	<div id='msg'></div>	//ajax로받은 데이타 출력
</body>
</html>