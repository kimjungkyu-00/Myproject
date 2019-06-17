<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<jsp:include page="../tab/header.jsp"></jsp:include>
<!-- Page Content -->
<jsp:include page="../tab/lost_side.jsp"></jsp:include>
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>

<div class="col-lg-9">
	<div class="card card-outline-secondary my-4">
		<form
			action="<%=request.getContextPath()%>/findUpdate/${findupdate.board_no}"
			name="findUpdateForm">
			<div class="container-fluid">
				<div class="col-lg-20">
					<h1 class="page-header">강아지 찾습니다 게시글 수정 폼</h1>


					<div class="row">
						<div class="col-lg-12"></div>
					</div>
					<div class="panel panel-default">
						<div class="panel-body">

							<div class="sel_board">
								<label class="col-lg-2"> 작성자 </label> <input type="text"
									id="view_writer" name="view_writer"
									value="${findupdate.writer }" readonly="readonly" />
							</div>

							<div class="sel_board">
								<label class="col-lg-2">성별</label> <input type="text"
									id="view_gender" name="view_gender"
									value="${findupdate.gender }" />
							</div>
							<div class="sel_board">
								<label class="col-lg-2"> 견종 </label> <input type="text"
									id="view_dogKind" name="view_dogKind"
									value="${findupdate.dogKind }" />
							</div>
							<div class="sel_board">
								<label class="col-lg-2"> 날짜 </label> <input type="text"
									id="view_sel_date" name="view_sel_date"
									value="${findupdate.sel_date }" />
							</div>

							<div class="sel_board">
								<label class="col-lg-2"> 시/도 </label> <input type="text"
									id="view_area" name="view_area" value="${findupdate.area }" />

							</div>

							<div class="row form-group">
								<label class="col-lg-2">특징</label>
								<div class="col-lg-8">
									<input type="text" id="content" name="content"
										value="${findupdate.content }" />
								</div>
							</div>


						</div>
					</div>
				</div>
			</div>
			<input type="submit" class="btn btn-outline btn-primary" value="완료">
			<a href="/findDeleteForm"><input type="button"
				class="btn btn-outline btn-primary" value="취소"></a> <a
				href="/findList"><input type="button"
				class="btn btn-outline btn-primary" value="리스트"></a>

		</form>
	</div>
</div>







	<div class="layout-sidebar">
		<ul>
			<li><a href="/findList">실종 강아지</a></li>
			<li><a href="lost2">보호중 강아지</a></li>
		</ul>



	</div>
	<jsp:include page="../tab/footer.jsp"></jsp:include>