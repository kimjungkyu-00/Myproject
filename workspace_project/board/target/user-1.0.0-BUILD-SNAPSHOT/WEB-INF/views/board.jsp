<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="layout-content">
	<div class="page-wrapper">
		<div class="container-fluid">
			<div class="col-lg-20">
				<!--게시판 넓이 -->
					<h1 class="page-header">글 작성</h1>
				
				<div class="row">
					<div class="col-lg-12"></div>
				</div>
				<div class="panel panel-default">
					<div class="panel-body">
						<form id="boardFrm" name="boardFrm" action="home.do"
							method="post">
							<div class="row form-group">
								<label class="col-lg-2">제목</label>
								<div class="col-lg-8">
									<input type="text" class="form-control" id="ntitle"
										name="title" min="1" max="3">
								</div>
							</div>
							<div class="row form-group">
								<label class="col-lg-2">내용</label>
								<div class="col-lg-8">
									<textarea class="form-control" id="content" name="content"></textarea>
								</div>
							</div>
							
							<button class="btn btn-outline btn-info">글 올리기</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>