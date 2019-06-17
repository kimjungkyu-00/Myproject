<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>
 
<!DOCTYPE html>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/sendMail.js"></script>
<jsp:include page="../tab/header.jsp"></jsp:include>
<div class="container">
<p>
	  <h1 align="center"> 1:1 문의 </h1>
	  <form method="post" id="mainForm">
	
	    <div align="center"><!-- 받는 사람 이메일 -->
	      <input type="hidden" value = "ahreum4146@gmail.com" readonly="readonly" id="mail" name="mail" size="100" style="width:100%" placeholder="관리자"
	       class="form-control" >
	    </div>     
	    <div align="center"><!-- 제목 -->
	      <input type="email" name="title" size="120" style="width:100%" placeholder="보내는분 메일 주소" class="form-control" >
	    </div>
	    <p>
	    <div align="center"><!-- 내용 --> 
	      <textarea name="content" cols="120" rows="12" style="width:100%; resize:none" placeholder="내용을 입력해주세요" class="form-control"></textarea>
	    </div>
	    <p>
	    <div align="center">
	      <input type="button" value="send" class="btn btn-lg btn-warning" onclick="sendMail();">
	      
	      <input type="button" value="취소" class="btn btn-lg btn-secondary" onClick="history.back()">
	      <p>
	    </div>
	  </form>
	</div>


<jsp:include page="../tab/footer.jsp"></jsp:include>
