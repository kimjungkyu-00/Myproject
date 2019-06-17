o<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<meta charset="UTF-8">
<jsp:include page="../tab/header.jsp"></jsp:include>
<!-- Page Content -->
<jsp:include page="../tab/notice_side.jsp"></jsp:include>
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>

<style>
#textarea_test {
	height: 100%;
	width: 100%;
	border: 1px solid #ccc;
}
</style>


<div class="col-lg-9">
	<div class="card card-outline-secondary my-4">
		<form id="findWriteForm" name="findWriteForm">
			<div class="container-fluid">
				<div class="col-lg-20">
					<h1 class="page-header">상세보기</h1>

					<div class="row">
						<div class="col-lg-12"></div>
					</div>

					<div class="panel panel-default">
						<div class="panel-body">

							<div class="row form-group">
								<label class="col-lg-2">제목</label> <input class="form-control"
									type="text" value="${notice.ntitle }" readonly="readonly" />
							</div>
							<div class="row form-group">
								<label class="col-lg-2">작성자</label> <input class="form-control"
									type="text" value="${notice.nwriter}" readonly="readonly" />
							</div>
							
							<div class="row form-group">
								<label class="col-lg-2">번호</label> <input class="form-control"
									type="text" value="${notice.nidx}" readonly="readonly" id="nidx" />
							</div>

							<div class="row form-group">
								<label class="col-lg-2"> 내용 </label>
								<textarea class="form-control" id="textarea_test"
									readonly="readonly">${notice.ncontent}</textarea>
							</div>
							
						</div>
					</div>
				</div>
			</div>
		</form>
	</div>


	<c:if test='${member.userid == "admin" }'>


		<form action="">
			<a href="/notice2ViewUpdate/${notice.nidx}"> <input type="button"
				name="upDate" value="글수정"></a> <a
				href="/noticeDelete/${notice.nidx }"> <input type="button"
				name="delete" value="글삭제"></a>

		</form>
	</c:if>

	<table id="commentList">
		<thead class="thead-light">
			<tr>
				<th scope="col">작성자</th>
				<th scope="col">글번호</th>
				<th scope="col">내용</th>
		</thead>

		<tbody>


			<c:forEach items="${commentList }" var="commentVO" varStatus="status">
				<tr data-commentidx=${commentVO.idx}>
					<td>${commentVO.writer }</td>
					<td>${commentVO.idx}</td>
					<td><input type="text" name="contents"
						value="${commentVO.contents }" readonly="readonly"> 
						 <c:if test="${member.userid eq 'admin' || member.userid eq commentVO.writer}"> 
						<input type="button" value="수정" readonly="readonly"
						onclick="commentUpdateview(${commentVO.idx});">
						 <input type="button" value="삭제" readonly="readonly"
						onclick="commentDelete(${commentVO.idx});">
						</td>
				</tr>
				   </c:if>
			</c:forEach>
		</tbody>
		<!-- 
	rno content 
	update set content where rno

	<form>
	<input type="hidden" value="${b.rno}>
	<textarea >"${b.content} </
-->
	</table>
	<form action="">
	
		<input type="text" name="contents" id="contents" /> 
		<input type="button" class="btn btn-outline btn-primary" value="댓글작성" onclick="addComment();" />
		
	</form>



</div>
<script type="text/javascript">


	function addComment() {
		var params = {};
		params.contents = $("#contents").val();
	    params.nidx = $("#nidx").val();
	    params.userid = "${member.userid }";
	    
	    alert(params.nidx);
	    alert(params.userid);
	    $.ajax({
			type : "POST",
			url : "/writeComment.do",
			data : params,
			success : function(data) {
				var html = '<tr data-commentidx='+ data.idx+'>';
					html += '<td scope="row">'+params.userid+'</td>';
			   		html += '<td scope="row">'+data.idx+'</td>';
					html += '<td scope="row"><input type="text" name="contents" value="'+data.contents+'"><input type="button" value="수정" onclick="commentUpdateview('+ data.idx +');"/>';
					html += '<input type="button" value="삭제" onclick="commentDelete('+data.idx+');"/></td>';
					html += '</tr>';
				
				$("#commentList").prepend(html);
				
			},
			error : function(error) {
				console.log(error);
				alert("에러" + error);
			}
		});
	}
	
	
	function commentUpdateview(commentIdx){
		params = {};
		params.idx= commentIdx;
		params.contents =$("tr[data-commentidx="+ commentIdx +"] [name=contents]").text();
		
		$.ajax({
 			type :"POST",
 			url :"/updateCommentview.do",
			data : params,
 			success : function(data){
 				$("#commnetUpdate").attr('type', 'hidden');
				$("#contentsUpdate").attr('type', 'hidden');
 				var html = '<tr data-commentidx='+ data.idx+'</tr>';

 				html += '<td><input  type="text" name="contents" id="contentsUpdate" value="'+data.contents+'" ><input id="commnetUpdate" type="button" onclick="commentUpdate('+data.idx+');" value="수정완료"/></td>';
 				$("#commentList").prepend(html);
 			},
 			error : function(error){
 				alert("에러"+ error);
 			}
 		});
	}
	
	function commentUpdate(commentIdx){

		params = {};
		params.idx= commentIdx;
		params.contents =$("#contentsUpdate").val();
		
		
 		$.ajax({
 			type :"POST",
 			url :"/updateComment.do",
			data : params,
 			success : function(data){		

				$("#commnetUpdate").attr('type', 'hidden');
				$("#contentsUpdate").attr('type', 'hidden');
				$("tr[data-commentidx="+ data.idx +"] [name=contents]").val(data.contents);
 			},
 			error : function(error){
 				alert("에러"+ error);
 			}
 		});
				
				
	 }
	function commentDelete(commentIdx){
		params = {};
		params.idx= commentIdx;
		params.contents =$("tr[data-commentidx="+ commentIdx +"] [name=contents]").text();

		
		$.ajax({
 			type :"POST",
 			url :"/deleteComment.do",
			data : params,
 			success : function(data){
				$("tr[data-commentidx="+ data.idx +"] [name=contents]").val(data.contents);
				location.reload();

 			},
 			error : function(error){
 				alert("에러"+ error);
 			}
 		});
		
	}
	
	function resize(obj) {
		  obj.style.height = "1px";
		  obj.style.height = (12+obj.scrollHeight)+"px";
		}
	
</script>


<jsp:include page="../tab/footer.jsp"></jsp:include>

