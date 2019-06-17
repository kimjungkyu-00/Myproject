<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<jsp:include page="../tab/header.jsp"></jsp:include>
<!-- Page Content -->
<jsp:include page="../tab/res_side.jsp"></jsp:include>

<div class="col-lg-9">
<div class="col-lg-9">
		<img src="/resources/image/subimg02.gif">
	</div>
	<div class="card card-outline-secondary my-4">
		<div class="card-header">
			<h5>보호센터 찾기</h5>
				
		</div>
		<div class="card-body">
		
			<c:forEach items="${result}" var="data">
				<c:if test="${key eq 'sido'}">
					<a href="/rescueSiGunGu?uprCd=${data.orgCd}">
						<button type="button" class="btn btn-warning">${data.orgdownNm}</button>
					</a>
				</c:if>
				<c:if test="${key eq 'sigungu'}">
					<a href="/rescueCenter?uprCd=${data.uprCd}&orgCd=${data.orgCd}">
						<button type="button" class="btn btn-primary">${data.orgdownNm}</button>
					</a>
				</c:if>
				<c:if test="${key eq 'center'}">
					${data.careNm}
					${data.officetel }
					<p>
				</c:if>
			</c:forEach>
		</div>
	</div>
</div>
<jsp:include page="../tab/footer.jsp"></jsp:include>