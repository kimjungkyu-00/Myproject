<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<!-- ajax를 사용하기 위해 ajax 프레임웍 포함  -->
<script src="js/jquery.js"></script>
<script>
//1.jquery 로드가 잘되는지 확인
//dom tree완성후에 실행해달라는 문장 기술
$(function(){ // === $(document).ready(function(){}
	//button(id="login")을 클릭했을때 확인
	$('#login').click(function(){
		//id/pw값 읽어오기
				
		//ajax로 서버에게 데이타 전송
		
		//1. client(client.jsp)---(쿼리스트링-id,pw)---->server(server.jsp)
		//1.1 data를 전송하기 위해서 규약 따른다
		// key(attr)=value&key(attr/param)=value
		//var data = "id="+$('#userId').val() +"&"+"pw="+$('#userPw').val();
		var data ={ 
				id:$('#userId').val(),
				pw:$('#userPw').val()
			}
		alert(data);
		//1.2 데이터 요청을 위해서 .post() 사용 데이터전송시 post방식으로 보냄
		//.post(url,data,function(){//서버가 데이타 처리 결과 수행  })
		$.post("server.jsp",data,
			function(msg){
			//2. client(client.jsp) <---(받은데이타 그대로 보냄)---- server(server.jsp)
			alert(msg);
			$('#message').html(msg);
		} );
		
	});
	
});

</script>
</head>

<body>
	<input id="userId"  type="text"  value="myid" />
	<input id="userPw"  type="password" value="1234"/>
	<button id="login"   > 로그인 </button>
	<div id="message"></div>

</body>
</html>