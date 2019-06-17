<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="js/jquery-3.3.1.js"></script>
<script>
$(function(){
	//1.버튼이 클릭했을때 text창에 값을 alert에 출력하기
	$('#submit').click(function(){
		var name = $('#name').val();
		var sendData = "name="+name;
		$('#result').text(sendData);
		//alert(name);
		//2.버튼을 클릭했을때 text창에 입력된 값(이름)을
		//   가진 회원이 있는지 찾아달라고 서버에 요청("searchServer.jsp")
		//  searchServer.jsp : 요청한 이름을 출력
		//   search.jsp <div>에 searchServer.jsp 출력
		$.post("searchServer.jsp",sendData,
				 function(msg){
					$('#msg').html(msg);
			} );
	});
	
	//3. 2번에 + searchServer.jsp에서 name값에 있는 회원이 유무 전송
});
</script>
</head>
<body>
<p> 
    	<a href="index.jsp">index</a>
    <hr>
	
	<form>
		<input type="text"  name="searchname" id="name"/>
		<input type="button" value="검색"  id="submit"/>
	</form>
	<hr>
	 <h3>전송할 데이타 확인</h3>	 
	<div id="result"></div>
	<hr>
	 <h3>ajax로 받은 데이타 출력</h3>
	<div id="msg"></div>

</body>
</html>