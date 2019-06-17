<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<meta charset="UTF-8">
<jsp:include page="../tab/header.jsp"></jsp:include>
<h1 >로그인 완료</h1>

 <h2>회원 전용 페이지</h2>
 <c:if test = "${member != null }">
 <h2>${member}</h2>
  님으로 로그인 하셨습니다.<br>
</c:if>

<jsp:include page="../tab/footer.jsp"></jsp:include>
