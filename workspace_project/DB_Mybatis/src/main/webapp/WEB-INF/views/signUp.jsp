<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>


<body>

	<div class="container">
		<div class="row">
			<div class="col-md-4 col-md-offset-3" style="width: 50%">
				<div class="login-panel panel panel-default"
					style="margin-top: 10%; margin-bottom: 10%;">
					<div class="panel-heading">
						<h3 class="panel-title">Please Sign Up</h3>
					</div>
					<div class="panel-body">
						<form role="form" action="userSignUp.do" method="post">
							<fieldset>
								<div class="form-group">
									<label>아이디</label> <input class="form-control"
										placeholder="아이디" name="signUpUserId" type="text" />
								</div>
								<div class="form-group">
									<label>비밀번호</label> <input class="form-control"
										placeholder="비밀번호" name="signUpUserPwd" type="password" />
								</div>
								<div class="form-group">
									<label>회사명</label> <input class="form-control"
										placeholder="회사명" name="signUpUserCompanyName" type="text" />
								</div>
								<div class="form-group">
									<label>전화번호</label> <input class="form-control"
										placeholder="전화번호" name="signUpUserTelNo" type="text" />
								</div>
								<div class="form-group">
									<label>이메일</label> <input class="form-control"
										placeholder="이메일" name="signUpUserEmail" type="text" />
								</div>
								<div class="form-group">
									<label>사업자번호</label> <input class="form-control"
										placeholder="사업자번호" name="signUpUserCompanyNo" type="text" />
								</div>
								<div class="form-group">
									<label style="display: block;">회사주소</label> <input
										class="form-control" style="width: 40%; display: inline;"
										placeholder="우편번호" name="signUpUserPostNo" type="text">
									<button type="button" class="btn btn-default"
										data-toggle="modal" data-target="#myModal">
										<i class="fa fa-search"></i> 우편번호 찾기
									</button>
									<div class="modal fade" id="myModal" tabindex="-1"
										role="dialog" aria-labelledby="myModalLabel"
										aria-hidden="true">
										<div class="modal-dialog">
											<div class="modal-content">
												<div class="modal-header">
													<button type="button" class="close" data-dismiss="modal"
														aria-hidden="true">&times;</button>
													<h4 class="modal-title" id="myModalLabel">우편번호 서비스</h4>
												</div>
												<div class="modal-body">
													<label>주소 입력</label>
													<div class="form-group input-group">
														<input type="text" class="form-control"
															name="dlgSearchAddress"> <span
															class="input-group-btn">
															<button class="btn btn-default" type="button">
																<i class="fa fa-search"></i>
															</button>
														</span>
													</div>
													<p class="help-block">아래와 같은 조합으로 검색을 하시면 더욱 정확한 결과가
														검색됩니다.</p>
													<p class="help-block">도로명 + 건물번호</p>
													<p class="text-primary">예) 판교역로 235, 제주 첨단로 242</p>
													<p class="help-block">지역명(동/리) + 번지</p>
													<p class="text-primary">예) 삼평동 681, 제주 영평동 2181</p>
													<p class="help-block">지역명(동/리) + 건물명(아파트명)</p>
													<p class="text-primary">예) 분당 주공, 연수동 주공3차</p>
													<p class="help-block">사서함명 + 번호</p>
													<p class="text-primary">예) 분당우체국사서함 1~100</p>
												</div>
												<div class="modal-footer">
													<button type="button" class="btn btn-default"
														data-dismiss="modal">닫기</button>
													<button type="button" class="btn btn-primary">저장</button>
												</div>
											</div>
											<!-- /.modal-content -->
										</div>
										<!-- /.modal-dialog -->
									</div>
								</div>
								<div class="form-group">
									<input class="form-control" style="top: 5px;"
										placeholder="도로명 주소" name="signUpUserCompanyAddress"
										type="text" />
								</div>
								<div class="form-group">
									<input class="form-control" placeholder="상세주소"
										name="signUpUserCompanyAddressDetail" type="text" />
								</div>
								<button class="btn btn-lg btn-success btn-block">회원가입</button>
								<!-- <a href="#" class="btn btn-lg btn-success btn-block">회원가입</a> -->
							</fieldset>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>


</body>

<!-- </html> -->