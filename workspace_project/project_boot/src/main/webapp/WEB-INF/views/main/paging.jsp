<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<div align="center">
    <!-- pagination -->
        <ul class="pagination">
            <!-- 이전 -->
            <c:choose>
                <c:when test="${pageMaker.prev} ">              
                        <a href="/notice/noticeList.do${pageMaker.makeSearch(pageMaker.startPage-1)}" class="paginate_button previous">     
                        이전 
                        </a>
                </c:when>
                <c:otherwise>                   
                        <a href="/notice/noticeList.do${pageMaker.makeSearch(pageMaker.startPage-1) }" class="paginate_button previous">
                        이전 
                        </a>
                </c:otherwise>
            </c:choose>
 
            <!-- 페이지 번호 -->
            <c:foreach var="idx" begin="${pageMaker.startPage}" end="${pageMaker.endPage}">
                    <a href="/notice/noticeList.do${pageMaker.makeSearch(idx)}">
                      
                    ${idx}
                      
                    </a>
            </c:foreach>
 
            <!-- 이후 -->
            <c:choose>
                <c:when test="${pageMaker.next}">
                        <a href="/notice/noticeList.do${pageMaker.makeSearch(pageMaker.endPage+1)}" class="paginate_button next">
                         다음
                        </a>
                </c:when>
                <c:otherwise>
                        <a href="/notice/noticeList.do${pageMaker.makeSearch(pageMaker.endPage+1)}" class="paginate_button next disabled">                      
                         다음
                        </a>
                </c:otherwise>
            </c:choose>
        </ul>
    </div>