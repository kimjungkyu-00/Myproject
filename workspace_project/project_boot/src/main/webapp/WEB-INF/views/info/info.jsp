<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<jsp:include page="../tab/header.jsp"></jsp:include>
<!-- Page Content -->
<jsp:include page="../tab/info_side.jsp"></jsp:include>

<div class="col-lg-9">
	<div class="card card-outline-secondary my-4">
		<div class="media border p-3">
			<img src="/resources/image/KakaoTalk_20181221_173220720.png" class="mr-3 mt-3 rounded-circle" style="width: 150px;">
				<div class="media-body">
				<h4>유기견 관련뉴스</h4>
					<c:forEach items="${list}" var="data">
						<p><a href="${data.originallink }">${data.title }</a>
					</c:forEach>
				</div>
		</div>
	</div>
</div>
<!-- /.container -->
<jsp:include page="../tab/footer.jsp"></jsp:include>

