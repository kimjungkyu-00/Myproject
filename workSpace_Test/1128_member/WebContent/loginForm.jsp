<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>member</title>
<link rel="stylesheet" href="css/bootstrap.css"/>
<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
</head>
<body>

	<div id="container">
	<div class="form-group">
		<ul>
			<li><label class="form-control" for="id">아이디</label>
				<input class="form-control" id="id" type="email" name="id" size="20" maxlength="50"
						placeholder="abc@digital.com"></li>
			
			<li><label class="form-control"  for="passwd">비밀번호</label>
				<input class="form-control"  id="passwd" type="email" name="passwd" size="20" maxlength="10"
						placeholder="6~10자 숫자 /문자 "></li>
			<li> <button class="btn">로그인</button>
			</li>
		</ul>
	</div>
</div>

</body>
</html>