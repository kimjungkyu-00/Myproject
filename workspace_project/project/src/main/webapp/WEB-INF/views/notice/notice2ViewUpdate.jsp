<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<jsp:include page="../tab/header.jsp"></jsp:include>
<!-- Page Content -->


<jsp:include page="../tab/notice_side.jsp"></jsp:include>
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
<style>
	#ncontent { 
		height:100%; width:100%; border:1px solid #ccc; 
	
	}


</style>
<div class="col-lg-9">
	<div class="card card-outline-secondary my-4">
		<form action="<%=request.getContextPath()%>/notice2ViewUpdate.do"
			method="GET">
			<div class="container-fluid">
				<div class="col-lg-20">
					<!--게시판 넓이 -->
					<h1 class="page-header">수정하기</h1>

					<div class="row">
						<div class="col-lg-12"></div>
					</div>
					<div class="panel panel-default">
						<div class="panel-body">


							<div class="row form-group">
								<label class="col-lg-2">제목</label>
								<div class="col-lg-8">
									<input type="text" class="form-control" id="ntitle"
										name="ntitle" value="${notice.ntitle }">
								</div>
							</div>
							<div class="row form-group">
								<label class="col-lg-2">내용</label>
								<div class="col-lg-8">
									<textarea class="form-control" id="ncontent" name="ncontent">${notice.ncontent}</textarea>
								</div>
							</div>

							<div class="row form-group">
								<label class="col-lg-2">번호</label>
								<div class="col-lg-8">
									<input class="form-control" id="nidx" name="nidx"
										readonly="readonly" value="${notice.nidx }">
								</div>
							</div>

							<input type="submit" value="완료">
						</div>
					</div>
				</div>
			</div>
		</form>
	</div>
</div>

<jsp:include page="../tab/footer.jsp"></jsp:include>