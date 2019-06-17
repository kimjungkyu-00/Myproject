<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<meta charset="UTF-8">

<script src="https://code.jquery.com/jquery-3.3.1.js"></script>

<jsp:include page="../tab/header.jsp"></jsp:include>
<!-- Page Content -->
<jsp:include page="../tab/notice_side.jsp"></jsp:include>


<div class="col-lg-9">
	<div class="card card-outline-secondary my-4">
	<h1>공지사항</h1>
	<table class="table">
		<thead class="thead-light">
			<tr>
				<th scope="col">글번호</th>
				<th scope="col">제목</th>
				<th scope="col">작성자</th>
				<th scope="col">작성날짜</th>
			</tr>
		</thead>
		<tbody>
		<!--T002  -->
			<c:forEach items="${noticeList }" var="noticeVO" varStatus="status">

				<tr id="nView">
					<th scope="row">${status.count }</th>
				 	<td><a href="/noticeView.do/${noticeVO.nidx}">${noticeVO.ntitle}
					</a></td>
					<td>${noticeVO.nwriter }</td>
					<td>${noticeVO.nregdate }</td>
				</tr>
			</c:forEach>	
		</tbody>
	</table>
	<!-- <p><a href="<%=request.getContextPath()%>/"> main </a> </p> -->
	<p class=text-right>
		<c:if test="${member.userid == null}">
			<p>* 로그인 시 작성 가능합니다.</p>
		</c:if>
		
		<c:if test="${member.userid != admin}">
			<p>* 관리자만 글작성 가능합니다.</p>
		</c:if>
		
			<c:if test='${member.userid == "admin" }'>		
				<a href="<%=request.getContextPath()%>/notice2WriteForm" > 글작성</a>
			</c:if>
			
			
			
		
	</p>
	<!-- 여기부터 페이징 -->
 </div>
 </div>
    <div>
        <nav>
        <ul class="pagination">
 
            <li><a aria-label="Previous" href="/sap/noriter/noriterList.do?page=1&category=${ category }"><span>«</span></a></li>
 
            <c:if test="${ page <= 1 }">
                <li>이전</li>
            </c:if>
            <c:if test="${ page > 1 }">
                <li><a href="/sap/noriter/noriterList.do?page=${ page - 1 }&category=${ category }">이전</a></li>
            </c:if>
 
          
                <c:if test="${ page == item }">
 
                    <li>${ item }</li>
 
                </c:if>
                <c:if test="${ page != item }">
 
                    <li><a href="/sap/noriter/noriterList.do?page=${ item }&category=${ category }">${ item }</a></li>
 
                </c:if>
           
 
            <c:if test="${ page >= totalPage }">
 
                <li>다음</li>
 
            </c:if>
            <c:if test="${ page < totalPage }">
                <li><a href="/sap/noriter/noriterList.do?page=${ page + 1 }&category=${ category }">다음</a></li>
 
            </c:if>
 
            <li><a aria-label="Next" href="/sap/noriter/noriterList.do?page=${ totalPage }&category=${ category }"><span>»</span></a></li>
 
        </ul>
        </nav>
    </div>

    

<jsp:include page="../tab/footer.jsp"></jsp:include>



