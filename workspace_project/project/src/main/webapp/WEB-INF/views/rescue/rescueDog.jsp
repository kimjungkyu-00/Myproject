<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<style>
#img{
height : 200px;
width : 200px;

}

</style>
<jsp:include page="../tab/header.jsp"></jsp:include>

  <!-- Page Content -->
<div class="container">
  <h1 class="font-weight-light text-center text-lg-left mt-4 mb-0">유기동물 공고</h1>
  <hr class="mt-2 mb-5">
 <h3 class="text-center text-md-center mt-4 mb-0">입양문의는 보호소로 연락 또는 관리자에게 <a href="/notice1">문의</a> 바랍니다.</h3> 
<p>
  <div class="row text-center text-lg-left">

    <c:forEach items="${result}" var="data" end="39">
    <div class="col-lg-3 col-md-4 col-6">
    	{data}
            <img class="img-fluid img-thumbnail" src="${data.popfile}" id="img"><p>
             <p class="center"><h2>${data.processState }</h2></p>
             <p class="center">품종-${data.kindCd }</p>
             <p class="center">발견장소-${data.happenPlace }</p>
             <p class="center">보호소-${data.careNm }</p>
             <p class="center">보호소 연락처-${data.officetel }</p>
      
            
    </div>
      </c:forEach>

  </div>

</div>
<!-- /.container -->
<!-- 
<div class="col-lg-9">
		<br><img src="/resources/image/subimg02.gif">
	<p>
<div class="container">
      <div class="row">
		<c:forEach items="${result}" var="data" end="20">
	        <div class="col-md-4">
	          <div class="card mb-4 shadow-sm">
	            <img src="${data.popfile}" width="100%" height="250" >
	            <div class="card-body">
	              <p class="card-text">${data.processState }</p>
	              <p class="card-text">품종-${data.kindCd }</p>
	              <p class="card-text">발견장소-${data.happenPlace }</p>
	              <p class="card-text">보호소-${data.careNm }</p>
	              <p class="card-text">보호소 연락처-${data.officetel }</p>
	             </div>
	          </div>
	        </div>
     	</c:forEach>
       </div>
    </div>
</div> -->


<script>
$(document).ready(function() {
	/* $('input[type="text"]').keydown(function() {
		if (event.keyCode === 13) {
			event.preventDefault();
		}
	}); */
	//name="reply_${data.desertionNo }"
	$('#databtn').click(function() {
		var value = $('#databtn').val();
		console.log(value);
		
		$.ajax({
			url: '/detail_dog/'+value,
			data :   value,
			type : "POST",
			success : function(data){
				if(data =="1") {
					
					alert("아니아니");
				}
			},error:function(error){
				alert("에러"+error);
			}
			
		}); //ajax
	});
});

</script>
<jsp:include page="../tab/footer.jsp"></jsp:include>