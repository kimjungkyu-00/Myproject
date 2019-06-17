<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<h3> 회원가입 </h3>
<hr>


<form action="register.do" method="post">
	id<input type="text" name="id" value="myid"/>
	passwd<input type="password" name="passwd" value="1234"/>
	name<input type="text" name="name" value="name"/>
	<input type="hidden" name="date" value="<%=new java.util.Date()  %>"/>
	<input type="submit" value="가입"/>
</form>
<script type="text/javascript" src="js/jquery.js"></script>
<script>
	$(document).ready(function() {
		$("#submit").click(function() {
		//전송할데이타
		var query={id:$('input[name=id]').val(),
				passwd:$('input[name=passwd]').val(),
				name:$('input[name=name]').val(),
				date:$('input[name=date]').val()
		}
		console.log(query);
		//ajax실행
		
		$.post("register_ajax.jsp",
				query,
				function(msg) {
				alert(msg);
				$(location).attr("href","member_list.do")
				
				
			});
		});
			
	});
		
</script>
</body>
</html>