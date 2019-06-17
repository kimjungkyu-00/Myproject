<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<header>
	<jsp:include page="header.jsp"/>
</header>
<hr>
<h3>결제하기</h3>
 <hr>
 
 <form action="payment_process.do"  method="post">
	 받는사람 정보 
	  <p> 이름 : <input type="text" name="name">
	  <p> 연락처 : <input type="text" name="phone">
	  <p> 주소 : <input type="text" name="addr">
	  
	  결제정보
	  <p> <input type="radio" name="pay" value ="cash">현금
	  	  <input type="radio" name="pay" value ="card">카드
	  <p> <input type="submit"  value="결제하기" >
	      <input type="reset"   value="초기화"> 
 </form>
  
</body>
</html>