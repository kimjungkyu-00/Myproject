<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<!DOCTYPE html>

<jsp:include page="../tab/header.jsp"></jsp:include>

<div class="container text-center" >
	<div class="row">
		<h1>${list.board_no }번째 게시물
			<c:if test="${member.userid == list.writer }">
				<a href="/findUpdateForm/${list.board_no}">
					<input type="button" class="btn btn-link" name="update" value="수정">
				</a>
		
				<form action="/find_delete">
					<input type="hidden" value="${list.board_no}" name="board_no">
					<input type="hidden" name="page" value="${cri.page }" />
    				<input type="hidden" name="perPageNum" value="${cri.perPageNum }" />


					<button type="submit" class="btn btn-light" id="deleteBtn">삭제</button>
				</form>
				
			</c:if>
		</h1>
	</div>
					
	<form id="findWriteForm" name="findWriteForm" onsubmit="false">
					
					
					
					<div class="panel panel-default">
						<div class="panel-body">
							<div class="sel_board">
								<h2> ${list.sel_board }</h2>
								
									
							</div>
												    <c:choose>
							<c:when test="${empty list.fileName }">
						       <div class="sel_board">
									<img src="/resources/image/noimage.gif" width="400px" height="300px" />
					
								</div> 
							</c:when>
							<c:when test="${list.fileName != null } ">
						       <div class="sel_board">
					
								</div> 
							</c:when>
						</c:choose>
							
									<img src="/display?name=${list.fileName}" width="400px" height="300px" />

							<div class="sel_board">
								<label>작성자 : </label> ${list.writer }
									
							</div>

							<div class="sel_board">
								<label>성별 : </label> ${list.gender }
									
							</div>
							<div class="sel_board">
								<label> 견종 :  </label>${list.dogKind }
							</div>
							<div class="sel_board">
								<label> 날짜 : </label>${find.sel_date } 
							</div>

							<div class="sel_board">
								<label> 시/도 : </label>${list.area }

							</div>

							<div class="sel_board">
								<label>특징 : </label> ${list.content }
							</div>

							<hr>
						</div>
				</div>
		</form>
		
				

		
		<!-- 댓글작성 -->
		<c:if test="${member == null}">
			<p>* 로그인 시 작성 가능합니다.</p>
		</c:if>
		
		
			<form id="replyListForm" name="replyListForm" method="post" onsubmit="false">
				<div id="replyList"></div>
			</form>

		<c:if test="${member != null }">
			<form action="" id="replyForm" name="replyForm" onsubmit="false">
				<input type="hidden" id="replyer" name="replyer" value="${member.userid}"> ${member.userid} : 
				<input type="hidden" id="board_no" name="board_no" value="${list.board_no}"> 
				<input type="hidden" name="page" value="${cri.page }" />
				<input type="hidden" name="perPageNum" value="${cri.perPageNum }" />
				<input type="text" id="reply" name="reply"> 
				<input type="button" class="btn btn-sm btn-outline btn-success" id="btnreply"name="btnreply" value="등록">

			</form>
		</c:if>
		
		<c:if test="${member == null }">
			<form action="" id="replyForm" name="replyForm" onsubmit="false">
				<input type="hidden" id="replyer" name="replyer" value="${member.userid}"> 
				<input type="hidden" name="page" value="${cri.page }" />
				<input type="hidden" name="perPageNum" value="${cri.perPageNum }" />
				<input type="hidden" id="board_no" name="board_no" value="${list.board_no}"> 
			</form>
		</c:if>
		


		
		<a href="/findList">
			<input type="button" class="btn btn-outline btn-primary" value="리스트">
		</a>
	</div>

<script>

	$(function() {
		getReplyList();
	});
	
	$(document).ready(function() {
		/* $('input[type="text"]').keydown(function() {
			if (event.keyCode === 13) {
				event.preventDefault();
			}
		}); */
		
		$('#deleteBtn').click(function() {
			var result = confirm("정말 삭제하시겠습니까?");
			if (result) {
				return true;
			} else {
				return false;
			}
		});
	});
	
	function writereply() {
		alert("댓글등록");
		var dataAll = $('#replyForm').serialize();

		$.ajax({
			type : "POST",
			url : "/replyInsert.do/${pageMaker.makeQuery(pageMaker.cri.page )}&board_no=${list.board_no}",
			data : dataAll,
			success : function(data) {
				getReplyList();
			}
		});
		
	};
	
	$('#btnreply').click(function() {

		writereply();
	});
	


	function getReplyList() {
		$.ajax({
			type : 'get',
			url : '/replyGet.do/{board_no}',
			dataType : 'json',
			data : $('#replyForm').serialize(),
			contentType : "application/x-www-form-urlencoded; charset=UTF-8",
			success : function(data) {
				var html = "";
				
				var list = data.list;
				var session = data.session;
				if (list.length > 0) {
					for (i = 0; i < list.length; i++) {
					
						html += '<div' +list[i].reply_no+'">'+list[i].reply_no+' / '+list[i].replyer;
						html += '<div class="reply'+list[i].reply_no+'"> 내용 : '+list[i].reply;
						if(session != null) {
							if(session.userid == list[i].replyer) {
								
								html += '<input type="button" class="btn btn-sm btn-link" onclick="replyUpdate('+list[i].reply_no+',\''+list[i].reply+'\');" value="수정">  ';
								html += '<input type="button" class="btn btn-sm btn-light" onclick="replyDelete('+list[i].reply_no+');" value="삭제">  </div>';
							}
						}
						html += '</div>';

					}
				}
				$("#replyList").html(html);
				$("#reply").val("");
			}
		});
	}
	

	
	//댓글 수정 - 댓글 내용 출력을 input 폼으로 변경 
	function replyUpdate(reply_no, reply){
	    var html ='';
	    html += '<hr>'
	    html += '<div class="input-group">';
	    html += '<input type="text" class="form-control" name="reply_'+reply_no+'" value="'+reply+'"/>';
	    html += '<span class="input-group-btn"><button class="btn btn-default" type="button" onclick="replyUpdateProc('+reply_no+');">수정</button> </span>';
	    html += '</div>';
			
	    
	    $('.reply'+reply_no).html(html);
	    
	}
	
	//수정한거 다시 저장
	function replyUpdateProc(reply_no){
		var updateReply = $('[name=reply_'+reply_no+']').val();
		alert(updateReply);
		
		$.ajax({
			url: '/replyUpdate.do/'+reply_no,
			type : 'post',
			data :   {'reply' : updateReply, 'reply_no' : reply_no},

			success : function(data){
				if(data == 1) 
					getReplyList();
			}
			
		}); //ajax
		
		

	}
	
	
	function replyDelete(reply_no) {
		var result = confirm("댓글 삭제하시겠습니까?");
		
		if (result) {
			$.ajax({
		        url : '/deleteReply/'+reply_no,
		        type : 'GET',
		        success : function(data){
		            if(data == 1) {
		            	getReplyList();
		            }
		        }
		    });
		} else {
			return false;
		}
		
	    


	}
	
	
	
	

	
</script>

<jsp:include page="../tab/footer.jsp"></jsp:include>