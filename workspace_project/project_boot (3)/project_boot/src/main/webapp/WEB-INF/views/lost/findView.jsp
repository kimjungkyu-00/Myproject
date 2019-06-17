<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<jsp:include page="../tab/header.jsp"></jsp:include>
<!-- Page Content -->
<jsp:include page="../tab/lost_side.jsp"></jsp:include>


<div class="col-lg-9">
	<div class="card card-outline-secondary my-4">
		<h1>찾습니다</h1>

		<c:if test="${member.userid == null}">
			<p>* 로그인 시 작성 가능합니다.</p>
		</c:if>
		
				<p>
			<a href="<%=request.getContextPath()%>/"> main </a>
		</p>
		<c:if test="${member.userid != null }">
				<a href="<%=request.getContextPath()%>/write"> write</a>
		</c:if>


		<form name="form1" method="post" action="/search.do">
			<select name="searchOption">
				<option value="all">전체</option>
				<option value="content">내용</option>
				<option value="writer">작성자</option>
			</select> <input name="keyword" value="${map.keyword }"> <input
				type="submit" value="검색">

		</form>
		
		
		<table class="table">
			<thead class="thead-light">
				<tr>
					<th scope="col">글번호</th>
					<th scope="col">글 종류</th>
					<th scope="col">지역</th>
					<th scope="col">작성자</th>
					<th scope="col">작성날짜</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listBoard}" var="list">
					<tr>
						<th scope="row"><a href="/findView.do/${list.board_no}">${list.board_no}</a></th>
						<td>${list.sel_board}</td>
						<td>${list.area}</td>
						<td>${list.writer}</td>
						<td>${list.content }</td>

					</tr>
				</c:forEach>
			</tbody>
		</table>




	</div>

	

</div>
<!-- /.card -->

<jsp:include page="../tab/footer.jsp"></jsp:include>