<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
					
<jsp:include page="../tab/header.jsp"></jsp:include>
<!-- Page Content -->
<jsp:include page="../tab/info_side.jsp"></jsp:include>

<div class="col-lg-9">
<h1 class="font-weight-light text-center text-lg-center mt-4 mb-0"> 관련 뉴스 </h1>
  <hr class="mt-2 mb-5">
		<c:forEach items="${list}" var="data">
			<p>☞ <a href="${data.originallink }">${data.title }</a>
		</c:forEach>
</div>
<!-- /.card -->


<jsp:include page="../tab/footer.jsp"></jsp:include>

