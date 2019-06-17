<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>

<jsp:include page="../tab/header.jsp"></jsp:include>
<!-- Page Content -->
<jsp:include page="../tab/lost_side.jsp"></jsp:include>
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/4.0.7/handlebars.min.js"></script>

<div class="col-lg-9">
	<div class="card card-outline-secondary my-4">
		<form id="findWriteForm" name="findWriteForm">
			<div class="container-fluid">
				<div class="col-lg-20">
					<h1 class="page-header">강아지 찾습니다 게시글</h1>


					<div class="row">
						<div class="col-lg-12"></div>
					</div>
					<div class="panel panel-default">
						<div class="panel-body">

							<div class="sel_board">
								<label class="col-lg-2"> 작성자 </label> <input type="text"
									id="view_writer" name="view_writer" value="${find.writer }"
									readonly="readonly" />
							</div>

							<div class="sel_board">
								<label class="col-lg-2">성별</label> <input type="text"
									id="view_gender" name="view_gender" value="${find.gender }"
									readonly="readonly" />
							</div>
							<div class="sel_board">
								<label class="col-lg-2"> 견종 </label> <input type="text"
									id="view_dogKind" name="view_dogKind" value="${find.dogKind }"
									readonly="readonly" />
							</div>
							<div class="sel_board">
								<label class="col-lg-2"> 날짜 </label> <input type="text"
									id="view_sel_date" name="view_sel_date"
									value="${find.sel_date }" readonly="readonly" />
							</div>

							<div class="sel_board">
								<label class="col-lg-2"> 시/도 </label> <input type="text"
									id="view_area" name="view_area" value="${find.area }"
									readonly="readonly" />

							</div>

							<div class="row form-group">
								<label class="col-lg-2">특징</label>
								<div class="col-lg-8">
									<input type="text" id="view_content" name="view_content"
										value="${find.content }" readonly="readonly" />
								</div>
							</div>
							<div class="row form-group">
								<label class="col-lg-2"> 사진 </label>
								<div class="col-lg-8">
									${pageContext.request.contextPath} -------------------------
									${find.fileName} <img src="/display?name=${find.fileName}" />
								</div>

							</div>
						</div>
					</div>
				</div>
			</div>
		</form>

		<form action="" id="replyForm" name="replyForm">
			<input type="hidden" id="replyer" name="replyer"
				value="${member.username}"> ${member.username} : <input
				type="hidden" id="board_no" name="board_no" value="${find.board_no}">
			<input type="text" id="reply" name="reply"> 
			<button type="submit" class="btn btn-outline btn-primary" id="btnreply"
				name="btnreply">댓글등록</button>

		</form>

		<table id="listReply">
			<thead class="thead-light">
			<tr>
				<th scope="col">댓글번호</th>
				<th scope="col">작성자</th>
				<th scope="col">내용</th>
				
			</tr>
			</thead>
			<tbody>
				<c:forEach items="${listReply}" var="listReply" ><tr>
				
					<td scope="row">${listReply.reply_no }</td>
					<td scope="row">${listReply.replyer }</td>	
					<td scope="row">${listReply.reply }</td></tr>				
				</c:forEach>
				
			</tbody>
		</table>



		<a href="/findList"><input type="button"
			class="btn btn-outline btn-primary" value="리스트"></a> <a
			href="/findUpdateForm/${find.board_no}"><input type="button"
			class="btn btn-outline btn-primary" name="update" value="수정"></a>

		<form action="/find_delete/${find.board_no}">
			<input type="hidden" value="${find.board_no}" name="bodrd_no">
			<button type="submit" class="btn btn-sm btn-outline-secondary" id="deleteBtn">삭제</button>
		</form>
	</div>
</div>

<script>
	$(document).ready(function() {
		$('#deleteBtn').click(function() {
			var result = confirm("정말 삭제하실껀지;");
			if (result) {
				return true;
			} else {
				return false;
			}
		});

		$('#btnreply').click(function() {
			alert("댓글등록");
			var dataAll = $('#replyForm').serialize();
			
			$.ajax({
				type: "POST",
				url :"/replyInsert.do",
				datatype: 'json',
				data : dataAll,
				success:function(data, status, xhr) {
					var str='<thead class="thead-light">';
					str +='<tr>';
					str += '<th scope="col">글번호</th>';
		            str += '<th scope="col">내용</th>';
		            str += '</tr>';
		            str += '</thead>';
		            str += '<tbody>';
		             str += '<tr>';
		            for(var i=0;i<data.length;i++)
		            {
		               str += '<td scope="row">'+data[i].idx+'</td>';
		               str += '<td>'+data[i].contents+'</td>';
		               str += '</tr>';
		            }
					str += '</tbody>';
					$("#listReply").html(str);					
					
					alert("성공");
					/* $(location).attr('href', "/listReply"); */
					
				}, error:function(){
					alert("err");
			}
		}); //ajax
	});
});
		
		
</script>

<jsp:include page="../tab/footer.jsp"></jsp:include>