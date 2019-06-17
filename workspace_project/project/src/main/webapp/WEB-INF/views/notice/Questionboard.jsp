<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
    <meta charset="UTF-8">
<jsp:include page="../tab/header.jsp"></jsp:include>
<!-- Page Content -->
<jsp:include page="../tab/notice_side.jsp"></jsp:include>

<div class="col-lg-9">
	<div class="card card-outline-secondary my-4">
	<h1>자주하는 게시판</h1>
	<table class="table">
		<thead class="thead-light">
			<tr>
				<th scope="col">글번호</th>
				<th scope="col">제목</th>
				<th scope="col">작성자</th>
			</tr>
		</thead>
		<tbody>
		<!--T002  -->
			<c:forEach items="${questionboardList }" var="questionboardVO" varStatus="status">

				<tr>
					<th scope="row">${status.count }</th>
				 	<td><a href="/QuestionboardView.do/${questionboardVO.idx}">${questionboardVO.title}
					</a></td>
					<td>${questionboardVO.writer }</td>
				</tr>
			</c:forEach>	
		</tbody>
	</table>


<a href="<%=request.getContextPath()%>/QuestionboardWriteForm" > 글작성</a>
	
<jsp:include page="../tab/footer.jsp"></jsp:include>
	