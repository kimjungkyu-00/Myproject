<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<jsp:include page="../tab/header.jsp"></jsp:include>
<!-- Page Content -->
<jsp:include page="../tab/lost_side.jsp"></jsp:include>


<div class="col-lg-9">
	<div class="card card-outline-secondary my-4">
		<form action="/findUpdate"
			name="findUpdateForm" method="post">
			<div class="container-fluid">
				<div class="col-lg-20">
					<h1 class="page-header">강아지 찾습니다 게시글 수정 폼</h1>

					<div class="row">
						<div class="col-lg-12"></div>
					</div>
					<div class="panel panel-default">
						<div class="panel-body">
						
						<div class="sel_board">
					<label> 글 종류</label> <select class="form-control" id="sel_board"
						name="sel_board">
						<option value="분실">분실</option>
						<option value="보호">보호</option>
						<option value="목격">목격</option>
						<option value="완료">완료</option>
					</select>
				</div>

							<div class="sel_board">
								<label class="col-lg-2"> 작성자 </label> <input type="text"
									id="view_writer" name="view_writer"
									value="${findupdate.writer }" readonly="readonly" />
							</div>

							<div class="sel_board">
								<label class="col-lg-2">날짜</label> <input type="date"
									id="sel_date" name="sel_date"
									value="${findupdate.gender }" />
							</div>
							<div class="sel_board">
								<label class="col-lg-2"> 견종 </label> <select id="dogKind"
									name="dogKind" >
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
								</select>
									
							</div>
							<div class="sel_board">
								<label class="col-lg-2">성별</label> <select id="gender"
									name="gender">
									<option value="암컷">암컷</option>
									<option value="수컷">수컷</option>
								</select>
							</div>

							
							<div class="row form-group">
								<label class="col-lg-2">특징</label>
								<div class="col-lg-8">
									<input type="text" id="content" name="content"
										value="${findupdate.content }" />
								</div>
							</div>



						</div>
					</div>
				</div>
			</div>
			<input type="hidden" name="board_no" value="${findupdate.board_no}">
			<input type="submit" class="btn btn-outline btn-primary" value="완료">
			<input type="button" class="btn btn-outline btn-primary" value="취소" onClick="history.back()">
			<a href="/findList"><input type="button" class="btn btn-outline btn-primary" value="리스트"></a>

		</form>
	</div>
</div>
<jsp:include page="../tab/footer.jsp"></jsp:include>