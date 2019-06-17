<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<meta charset="UTF-8">
<jsp:include page="../tab/header.jsp"></jsp:include>
<h1 >회원가입완료</h1>
<% request.setCharacterEncoding("utf-8"); %>
<%

String userid = request.getParameter("userid");
String no = request.getParameter("userpw");
String addr = request.getParameter("signUpUserCompanyAddress");
String address = request.getParameter("signUpUserCompanyAddressDetail");
%>


<%= userid %> <br>
<%= no %> <br>
<%= addr %> <br>
<%= address %> <br>




<jsp:include page="../tab/footer.jsp"></jsp:include>
