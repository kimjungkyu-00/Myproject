<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<jsp:include page="../tab/header.jsp"></jsp:include>
<jsp:include page="../tab/notice_side.jsp"></jsp:include>


<style>
	#ncontent { 
		height:100%; width:100%; border:1px solid #ccc; 
	
	}


</style>


<!-- Page Content -->
<div class="col-lg-9">

	<!--게시판 넓이 -->
	<div class="card card-outline-secondary my-4">
		<form id="boardFrm" name="boardFrm" action="/noticeWriterForm.do"
			method="post">
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
					<textarea id="ncontent"  name="ncontent" value=""></textarea>
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


