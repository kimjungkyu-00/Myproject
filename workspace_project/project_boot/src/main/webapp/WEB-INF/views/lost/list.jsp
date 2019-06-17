<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<jsp:include page="../tab/header.jsp"></jsp:include>
<!-- Page Content -->
<jsp:include page="../tab/lost_side.jsp"></jsp:include>

<script>
	



</script>

<div class="col-lg-9">
	<div class="card card-outline-secondary my-4">
	<h1>찾습니다</h1>
	
	<c:if test="${member.userid == null}">
		<p>* 로그인 시 작성 가능합니다.</p>
	</c:if>
	
	
	<form name = "form1" method="post" action="/search.do">
		<select name="searchOption">
			<option value ="all"> 전체</option>
			<option value="content"> 내용</option>
		</select>
		<input name = "keyword" value="${map.keyword }">
		<input type=  "submit" value="검색">
	
	</form>
	${map.count }개의 게시물이 있습니다.
	<table class="table">
		<thead class="thead-light">
			<tr>
				<th scope="col">글번호</th>
				<th scope="col">제목</th>
				<th scope="col">작성자</th>
				<th scope="col">작성날짜</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach items="${searchList}" var="searchList">
				<tr>
					<th scope="row"><a href="/findView.do/${searchList.board_no}">${searchList.board_no}</a></th>
					<td>${searchList.area}</td>
					<td>${searchList.writer}</td>
					<td>${searchList.content }</td>

				</tr>
			</c:forEach>
		</tbody>
	</table>
	<p>
		<a href="<%=request.getContextPath()%>/"> main </a>
	</p>
	<c:if test="${member.userid != null }">
		<p>
			<a href="<%=request.getContextPath()%>/write"> write</a>
		</p>
	</c:if>
</div>
		
	</div>
	<!-- /.card -->

<jsp:include page="../tab/footer.jsp"></jsp:include>