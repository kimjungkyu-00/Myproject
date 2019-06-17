<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

 
<jsp:include page="../tab/header.jsp"></jsp:include>
<!-- Page Content -->
<jsp:include page="../tab/lost_side.jsp"></jsp:include>


<div class="col-lg-9">
<p>

		<c:if test="${member.userid == null}">
			<h1><p align="center">* 로그인 시 작성 가능합니다.</p></h1>
		</c:if>

		<p>
		<form name="form1" method="post" action="/search.do" align="center">
			<select name="searchOption">
				<option value="all">전체</option>
				<option value="분실">분실</option>
				<option value="보호">보호</option>
				<option value="목격">목격</option>
				<option value="완료">완료</option>
			</select> 
			<select name="searchOption1">
				<option value="all">전체</option>
				<option value="area">지역</option>
				<option value="content">내용</option>
				<option value="writer">작성자</option>
			</select> 
			<input name="keyword" value="${map.keyword }"> 
			<input type="submit" class="btn btn-secondary btn-sm" value="검색">

		</form>

		<p>
		<table class="table">
			<thead class="thead-light">
				<tr>
					<th scope="col">글번호</th>
					<th scope="col">글 종류</th>
					<th scope="col">사진</th>
					<th scope="col">지역</th>
					<th scope="col">작성자</th>
					<th scope="col">내용</th>
					<th scope="col">조회수</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="list">
					<tr>
						<th scope="row"><a href="/read${pageMaker.makeQuery( pageMaker.cri.page )}&board_no=${list.board_no}">${list.board_no}</a></th>
						
						<td><h5>${list.sel_board}</h5></td>
						<td><img src="/display?name=${list.fileName}" width="100px" height="100px" /></td>
						<td>${list.area}</td>
						<td>${list.writer}</td>
						<td>${list.content }</td>
						<td>${list.count }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<ul class="pagination">
	<!-- 
		이전 버튼이 클릭가능한 조건이면, a태그를 이용해 이전 버튼이 뜨도록 하고, href로 링크를 걸되
		아까 만든 makeQuery 메서드를 이용해서 쿼리문자열을 만들어 줍니다.
		?page=어쩌고&perPageNum=어쩌고 이 부분을 생성해서 넣게 되는데 단 이전 버튼을 클릭하면 
		현재 페이지가 시작페이지의 - 1 이 되도록 되어야 함으로 그 부분만 신경써 주면 됩니다.
	 -->

	<!-- 
		[1][2][3]....[10] 이 부분을 삽입하는 부분이다. jstl 이용해 for문을 돌면서 startPage ~ endPage까지
		표시해주되, a태그 눌렀을 때 이동하는 page 부분에 index 지정하는 부분을 유의깁게 보길 바란다.
	 -->
	<c:forEach begin="${pageMaker.startPage }" end="${pageMaker.endPage }" var="index">
		<a href="<%=request.getContextPath()%>/findList${pageMaker.makeQuery(index) }">[${index }]</a>
	</c:forEach>


</ul>
		
		
		
		<c:if test="${member.userid != null }">
			<a href="<%=request.getContextPath()%>/write">
				<button class="btn btn-outline btn-secondary"> 글쓰기</button>
			</a>
		</c:if>
	</div>
	

<!-- /.card -->

<jsp:include page="../tab/footer.jsp"></jsp:include>