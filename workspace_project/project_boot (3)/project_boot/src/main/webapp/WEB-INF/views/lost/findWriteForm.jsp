<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<jsp:include page="../tab/header.jsp"></jsp:include>
<!-- Page Content -->
<jsp:include page="../tab/lost_side.jsp"></jsp:include>

<div class="col-lg-9">
	<div class="card card-outline-secondary my-4">
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/resources/js/writeFile.js"></script>
		<form id="findWriteForm" name="findWriteForm" enctype="multipart/form-data">
			<div class="container-fluid">
				<div class="col-lg-20">
					<!--게시판 넓이 -->
					<h1 class="page-header">강아지 찾습니다 게시글</h1>

					<div class="row">
						<div class="col-lg-12"></div>
					</div>
					<div class="panel panel-default">
						<div class="panel-body">

							<div class="sel_board">
								<label class="col-lg-2">종류</label> <select id="sel_board" name="sel_board">
									<option value="분실">분실</option>
									<option value="보호">보호</option>
									<option value="완료">완료</option>
								</select> 
								
								<label class="col-lg-2">시/도</label> <span><select
									id="area" name="area">
										<option value="">전체</option>
										<option value="서울특별시">서울특별시</option>
										<option value="부산광역시">부산광역시</option>
										<option value="대구광역시">대구광역시</option>
										<option value="인천광역시">인천광역시</option>
										<option value="광주광역시">광주광역시</option>
										<option value="세종특별자치시">세종특별자치시</option>
										<option value="대전광역시">대전광역시</option>
										<option value="울산광역시">울산광역시</option>
										<option value="경기도">경기도</option>
										<option value="강원도">강원도</option>
										<option value="충청북도">충청북도</option>
										<option value="충청남도">충청남도</option>
										<option value="전라북도">전라북도</option>
										<option value="전라남도">전라남도</option>
										<option value="경상북도">경상북도</option>
										<option value="경상남도">경상남도</option>
										<option value="제주특별자치도">제주특별자치도</option>
								</select></span>
								
								</div>
							
							<div class="sel_board">

								<label class="col-lg-2"> 견종 </label> <select id="dogKind"
									name="dogKind">
									<option value="기타">기타</option>
									<option value="골든 리트리버">골든 리트리버</option>
									<option value="닥스 훈트">닥스 훈트</option>
									<option value="달마시안">달마시안</option>
									<option value="도베르만">도베르만</option>
									<option value="동경견">동경견</option>
									<option value="롯트와일러">롯트와일러</option>
									<option value="말라뮤트">말라뮤트</option>
									<option value="말티즈">말티즈</option>
									<option value="미니어쳐 종">미니어쳐 종</option>
									<option value="믹스견">믹스견</option>
									<option value="보스턴 테리어">보스턴 테리어</option>
									<option value="비글">비글</option>
									<option value="비숑 프리제">비숑 프리제</option>
									<option value="사모예드">사모예드</option>
									<option value="삽살개">삽살개</option>
									<option value="시바">시바</option>
									<option value="시베리안 허스키">시베리안 허스키</option>
									<option value="시츄">시츄</option>
									<option value="웰시 코기">웰시 코기</option>
									<option value="이탈리안그레이하운드">이탈리안그레이하운드</option>
									<option value="진도견">진도견</option>
									<option value="차우차우">차우차우</option>
									<option value="치와와">치와와</option>
									<option value="코카">코카</option>
									<option value="페키니즈">페키니즈</option>
									<option value="포메라니안">포메라니안</option>
									<option value="푸들">푸들</option>
									<option value="핏불테리어">핏불테리어</option>
								</select> <label class="col-lg-2">성별</label> <select id="gender"
									name="gender">
									<option value="암컷">암컷</option>
									<option value="수컷">수컷</option>
								</select>

							</div>

							<div class="sel_board">
								<label class="col-lg-2">날짜</label> <input type="date"
									id="sel_date" name="sel_date">
							</div>


							<div class="sel_board">
								
								<label class="col-lg-2"> 작성자 ${member.username } </label> <input type="text"
									id="writer" name="writer" value="${member.username }"
									readonly="readonly" />

							</div>

							<div class="row form-group">
								<label class="col-lg-2">특징</label>
								<div class="col-lg-8">
									<textarea class="form-control" id="ncontent" name="content"></textarea>
								</div>
							</div>
							<div class="row form-group">
								<label class="col-lg-2">첨부파일</label>
								<div class="col-lg-8">
									<div class="uploadDiv">
										<input type="file" name="uploadFile" multiple> <input
											type="file" name="uploadFile" multiple>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</form>
	</div>
	<button class="btn btn-outline btn-info" onclick="doFindWrite();">글올리기</button>
	<input type="button" class="btn btn-outline btn-primary" value="리스트" />




</div>
<jsp:include page="../tab/footer.jsp"></jsp:include>
