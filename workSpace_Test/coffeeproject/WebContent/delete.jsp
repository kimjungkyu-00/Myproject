<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색후 삭제</title>
<script src="js/jquery.js"></script>
<script>
$(function() {
	//1. 버튼이 클릭했을때 text창에 값을 alert에 출력하기
	$("#submit").click(function() {
		var delname = $('#del_name').val();
		var deleteData = "del_name="+delname;

	$("#result").text(deleteData);
	//alert(name);
	//search--(del_name)---->deleteServer.jsp
	$.post(
		"deleteServer.jsp",
		deleteData,
		function (msg) { // serach <----------deleteServer.jsp
			$('#msg').html(msg);
		}
		
	)
	});
})
	</script>
</head>
<body>
	<h3>삭제할 이름을 입력</h3>
	<form>
		<input type="text" name="del_name" id="del_name" />
		<input type="button" value="삭제" id="submit" />
	</form>
	<hr>
	<h3>전송할 데이타 확인</h3>
	<div id="result"></div> // 전송할 데이타 확인
	<hr>
	<h3>ajax로 (deleteServer.jsp) 삭제 결과 출력</h3>
	<div id='msg'></div>	
</body>
</html>