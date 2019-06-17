<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<jsp:include page="../tab/header.jsp"></jsp:include>
<!-- Page Content -->
<jsp:include page="../tab/res_side.jsp"></jsp:include>

<div class="col-lg-9">
<h1 class="font-weight-light text-center text-lg-center mt-4 mb-0"> 보호센터 찾기 </h1>
  <hr class="mt-2 mb-5">
		
			<c:forEach items="${result}" var="data">
				<c:if test="${key eq 'sido'}">
					<a href="/rescueSiGunGu?uprCd=${data.orgCd}">
						<button type="button" class="btn btn-link">${data.orgdownNm}</button>
					</a>
				</c:if>
				<c:if test="${key eq 'sigungu'}">
					<a href="/rescueCenter?uprCd=${data.uprCd}&orgCd=${data.orgCd}">
						<button type="button" class="btn btn-light">${data.orgdownNm}</button>
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