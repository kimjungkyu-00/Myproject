<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<jsp:include page="../tab/header.jsp"></jsp:include>

<div class="container">
<main role="main">

  <img src="/resources/image/main1_2.jpg" width="100%" height="300px">
    <p>


  <div class="card-deck mb-3 text-center">
    <div class="card mb-4 shadow-sm">
      <div class="card-header">
        <h4 class="my-0 font-weight-normal">관련뉴스</h4>
      </div>
      <div class="card-body">
        <ul class="list-unstyled mt-3 mb-4">
	        <c:forEach items="${list}" var="news" end="4">
				 <a href="${news.originallink }">${news.title }</a>
			</c:forEach>
		</ul>
        <a href="/info"><button type="button" class="btn btn-sm btn-outline-warning">더 보기</button></a>
      </div>
    </div>
        <div class="card mb-4 shadow-sm">
      <div class="card-header">
        <h4 class="my-0 font-weight-normal">공지사항</h4>
      </div>
      <div class="card-body">
      <table class="table">
      <thead class="thead-light">

            </thead>
            <tbody>
         <c:forEach items="${noticeList }" var="noticeVO" varStatus="status" end="4">
         <tr>
            <td>
                <a href="/noticeView.do/${noticeVO.nidx}">${noticeVO.ntitle} </a>
            </td>
            <tr>
            
         </c:forEach>
         </tbody>
   </table>

        <a href="/notice2List.do"><button type="button" class="btn btn-sm btn-outline-primary">더 보기</button></a>
      </div>
    </div>

  </div>
  
    <div class="container"  style="display: inline-block;text-align: center;" id="center">
  <div class="row" >
      <div class="col-lg-3">
        <h2>보호/실종</h2>
        <a href="/findList">
        <img src="/resources/image/1.png" class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img">
       </a>
      </div><!-- /.col-lg-4 -->
      <div class="col-lg-3">
        <h2>유기동물센터</h2>
        <a href="/rescue2">
        <img src="/resources/image/2.png" class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img">
      	</a>
      </div><!-- /.col-lg-4 -->
       <div class="col-lg-3">
        <h2>입양안내</h2>
        <a href="/info3">
        <img src="/resources/image/4.png" class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img">
      	</a>
      </div><!-- /.col-lg-4 -->
      <div class="col-lg-3">
        <h2>건강상식</h2>
        <a href="/know2">
        <img src="/resources/image/3.png" class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img">
    	</a>
    	</div>
    </div>
    </div>
    <p>
    <p>
    <p>
  

    
    

<!-- 
<div class="album py-5 bg-light">
  <h1 align="center">유기동물 공고<br> <a href="/rescue1" class="btn btn-sm btn-outline-danger"> 더 보기 </a></h1>
  <p>
    <div class="container">
      <div class="row">
		<c:forEach items="${result}" var="data" end="5">
	        <div class="col-md-4">
	          <div class="card mb-4 shadow-sm">
	            <img src="${data.popfile}" width="100%" height="250"  >
	            
	          </div>
	        </div>
     	</c:forEach>
       </div>
    </div>
  </div>
 -->
</main>
</div>

<style>
#center img:hover{
opacity: 0.4;
}

</style>

<jsp:include page="../tab/footer.jsp"></jsp:include>
