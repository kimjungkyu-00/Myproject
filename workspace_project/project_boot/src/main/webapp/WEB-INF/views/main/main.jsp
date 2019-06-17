<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<jsp:include page="../tab/header.jsp"></jsp:include>

<div class="container">
<main role="main">

 <!--  <section class="jumbotron text-center" >
    <div class="container">

      <img src="/resources/image/main1_2.jpg" width="100%" height="300px">
      <p>
        <a href="#" class="btn btn-primary my-2">Main call to action</a>
        <a href="#" class="btn btn-secondary my-2">Secondary action</a>
      </p>
    </div>
  </section> -->
  

  
<!--  <main role="main" class="container">
  <div class="jumbotron">
    <h1>Navbar example</h1>
    <p class="lead">This example is a quick exercise to illustrate how the top-aligned navbar works. As you scroll, this navbar remains in its original position and moves with the rest of the page.</p>
    <a class="btn btn-lg btn-primary" href="/docs/4.3/components/navbar/" role="button">View navbar docs &raquo;</a>
  </div>
</main> -->
  
     
<div class="pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center">
  <h1 class="display-4">Pricing</h1>
</div>

  <div class="card-deck mb-3 text-center">
    <div class="card mb-4 shadow-sm">
      <div class="card-header">
        <h4 class="my-0 font-weight-normal">관련뉴스</h4>
      </div>
      <div class="card-body">
        <ul class="list-unstyled mt-3 mb-4">
        <%-- <c:forEach items="${list}" var="news" end="4">
			<li><a href="${news.originallink }">${news.title }</a></li>
			<p>
		</c:forEach> --%>

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
      			<tr>
				<th scope="col">제목</th>
				</tr>
				</thead>
				<tbody>
			<c:forEach items="${noticeList }" var="noticeVO" varStatus="status">
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

<div class="album py-5 bg-light">
  <h1 align="center">유기동물 공고<br> <a href="/rescue1" class="btn btn-sm btn-outline-danger"> 더 보기 </a></h1>
  <p>
    <div class="container">
      <div class="row">
		<c:forEach items="${result}" var="data" end="5">
	        <div class="col-md-4">
	          <div class="card mb-4 shadow-sm">
	            <%-- <img src="${data.popfile}" width="100%" height="250" > --%>
	            
	          </div>
	        </div>
     	</c:forEach>
       </div>
    </div>
  </div>

</main>
</div>
<!-- /.container -->

<jsp:include page="../tab/footer.jsp"></jsp:include>
