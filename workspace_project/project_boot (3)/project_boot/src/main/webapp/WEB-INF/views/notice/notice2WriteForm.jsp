<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="text/javascript"></script>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"

"http://www.w3.org/TR/html4/loose.dtd">
<style>
	#ncontent { 
		height:100%; width:100%; border:1px solid #ccc; 
	
	}


</style>


<jsp:include page="../tab/header.jsp"></jsp:include>
<!-- Page Content -->
<jsp:include page="../tab/notice_side.jsp"></jsp:include>
<div class="col-lg-9">

	<!--게시판 넓이 -->
	<div class="card card-outline-secondary my-4">
		<form id="boardFrm" name="boardFrm" action="/noticeWriterForm.do"
			method="post"">
		<div class="col-lg-20">
					<h1 class="page-header">글 작성</h1>

			<div class="row form-group">
				<label class="col-lg-2">제목</label>
				<div class="col-lg-8">
					<input type="text" class="form-control" id="ntitle" name="ntitle">
				</div>
			</div>
			<div class="row form-group">
				<label class="col-lg-2">내용</label>
				<div class="col-lg-8">
					<textarea class="form-control" id="ncontent" name="ncontent"></textarea>
				</div>
			</div>
			<div class="row form-group">
				<label class="col-lg-2">작성자</label>
				<div class="col-lg-8">
					<input type="text" class="form-control" id="nwriter" name="nwriter"
						readonly="readonly" value="${member.userid }">
				</div>
			</div>

			<input type="submit" value="작성하기">

			</div>
		</form>
	</div>
</div>




<jsp:include page="../tab/footer.jsp"></jsp:include>

