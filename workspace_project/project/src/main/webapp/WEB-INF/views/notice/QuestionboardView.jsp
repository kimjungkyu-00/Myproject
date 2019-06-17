<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta charset="UTF-8">
<jsp:include page="../tab/header.jsp"></jsp:include>
<!-- Page Content -->
<jsp:include page="../tab/notice_side.jsp"></jsp:include>
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>

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
									type="text" value="${questionboard.title }" readonly="readonly" />
							</div>
							<div class="row form-group">
								<label class="col-lg-2">작성자</label> <input class="form-control"
									type="text" value="${questionboard.writer}" readonly="readonly" />
							</div>
							
							<div class="row form-group">
								<label class="col-lg-2">번호</label> <input class="form-control"
									type="text" value="${questionboard.idx}" readonly="readonly" id="nidx" />
							</div>			

							<div class="row form-group">
								<label class="col-lg-2"> 내용 </label>
								<textarea class="form-control" id="textarea_test"
									readonly="readonly">${questionboard.content}</textarea>
							</div>
							
						</div>
					</div>
				</div>
			</div>
		</form>
	</div>


		<form action="">
			<a href="/questionboardViewUpdate/${questionboardVO.idx}"> <input type="button"
				name="upDate" value="글수정"></a> <a
				href="/questionboardDelete/${questionboardVO.idx }"> <input type="button"
				name="delete" value="글삭제"></a>

		</form>


</div>


<jsp:include page="../tab/footer.jsp"></jsp:include>
