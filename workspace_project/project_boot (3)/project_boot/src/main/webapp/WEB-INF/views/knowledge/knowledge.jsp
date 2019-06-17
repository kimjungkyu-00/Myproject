<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="../tab/header.jsp"></jsp:include>
<jsp:include page="../tab/knowledge_side.jsp"></jsp:include>

<style>
table {
	width: 100%;
}

table, th, td {
	border: 1px solid #bcbcbc;
}

#textcenter {
	text-align: center;
}

div.button {
	margin: auto;
}

div.button input {
	padding: 5px;
}
</style>

<div class="col-lg-9">
	<div class="card card-outline-secondary my-4">
		<div class="card-header">
			<h3 id="textcenter">
				<strong>동물의 사육 관리방법에 관한 기준(동물보호법 제8조 별표2) </strong>
			</h3>
		</div>
		<ol>
			<li>동물의 소유자등은 동물을 사육ㆍ관리할 때에 동물의 생명과 그 안전을 보호하고 복지를 증진하기 위하여 성실히
				노력하여야 한다.</li>
			<br>
			<li>동물의 소유자등은 동물로 하여금 갈증ㆍ배고픔, 영양불량, 불편함, 통증ㆍ부상ㆍ질병, 두려움과 정상적으로
				행동할 수 없는 것으로 인하여 고통을 받지 아니하도록 노력하여야 한다.</li>
			<br>
			<li>동물의 소유자등은 사육ㆍ관리하는 동물의 습성을 이해함으로써 최대한 본래의 습성에 가깝게 사육ㆍ관리하고,
				동물의 보호와 복지에 책임감을 가져야 한다.</li>
			<br>
			<li>동물의 소유자등은 자신이 기르는 동물이 공포감을 조성하거나 털, 소리, 냄새 등으로 인하여 다른 사람에게
				피해를 주지 아니하도록 노력하여야 한다.</li>
			<br>
		</ol>
		<hr>
		<h3 id="textcenter">개별 기준</h3>
		<Br>
		<ol>
			<h4>
				<strong>사육 환경</strong>
			</h4>
			<li>동물의 종류, 크기, 특성, 건강상태, 사육 목적 등을 고려하여 최대한 적절한 사육환경을 제공하여야 한다.
				야외에서 사육하는 경우에는 직사광선, 비바람 등을 피할 수 있는 공간이나 우리 등의 시설을 갖추어야 한다. 이 경우 우리는
				동물에게 상해를 입히지 아니하는 재료로 제작된 것이어야 한다. 동물의 사육공간 및 사육시설은 동물이 자연스러운 자세로
				일어나거나 눕거나 움직이는 등 일상적인 동작을 하는 데에 지장이 없는 크기이어야 한다.</li>
			<br />


			<h4>
				<strong>건강관리</strong>
			</h4>
			<li>전염병 예방을 위하여 정기적으로 동물의 특성에 따른 예방접종을 하여야 한다. 개는 분기마다 1회 이상 구충을
				하여야 한다. 번식을 목적으로 하지 아니하는 개나 고양이는 수의사가 권고하는 연령이 되면 중성화(中性化) 수술을 시키도록
				하여야 한다.</li>
			<br />

			<h4>
				<strong>훈련</strong>
			</h4>
			<li>공동주택에서 사육하는 개는 짖지 못하게 하는 등 주변 사람들에게 피해를 주지 아니하도록 필요한 훈련을 시켜야
				한다. 개의 경우에는 사람에 대한 공격성을 감소시키기 위하여 복종훈련을 시켜야 한다.</li>
			<br />


		</ol>
		<hr>

		<h4 id="textcenter">
			<strong>질병의 종류</strong>
		</h4>

		<div class="button">
			<input value="더보기"
				onclick="if(this.parentNode.getElementsByTagName('div')[0].style.display != '')
						{this.parentNode.getElementsByTagName('div')[0].style.display = '';this.value = '숨기기';}
							else{this.parentNode.getElementsByTagName('div')[0].style.display = 'none'; this.value = '더보기';}"
				type="button" />
			<div style="display: none;">

				<table>
					<thead>
						<tr>
							<th>질환기</th>
							<th>질환내용</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<th>호흡기</th>
							<th>콧물, 계속되는 재체기, 기침, 구역질, 호흡 곤란, 심한코골이</th>
						</tr>
						<tr>
							<th>눈</th>
							<th>눈의 분비물, 시력 감퇴, 염증, 감염으로 인한 출혈, 흐린 테가 끼는 경우</th>
						</tr>
						<tr>
							<th>귀</th>
							<th>귀 고름, 머리를 흔들어 대는 경우, 귀가 부어 오르는 경우, 균형상실, 난청</th>
						</tr>
						<tr>
							<th>입</th>
							<th>침을 질질 흘리는 경우, 식욕 저하, 잇몸의 염증, 구취, 이빨이 부러지거나 흔들리는 경우</th>
						</tr>
						<tr>
							<th>피와 심장</th>
							<th>지나친 기침, 빈혈, 무기력증, 지나친 기침, 운동을 기피하는 경우</th>
						</tr>
						<tr>
							<th>뼈,근육,관절</th>
							<th>감염된 부분의 부어 오름, 다리를 만지면 통증을 느끼는 경우, 마비, 절룩거림</th>
						</tr>
						<tr>
							<th>신경성</th>
							<th>발작이나 경련, 비틀거리는 걸음걸이 일부 또는 전신 마비</th>
						</tr>
						<tr>
							<th>소화기</th>
							<th>행동상의 변화, 균형의 상실, 졸도체중의 과도한 변화, 식욕 상실, 변비, 설사 구토</th>
						</tr>
						<tr>
							<th>피부 및 털</th>
							<th>갑자기 씹어 대거나 핥는 경우, 염증 또는 종양, 탈모, 계속 긁어 대는 경우</th>
						</tr>
						<tr>
							<th>생식기</th>
							<th>유방의 통증, 생식 불능, 유산, 출산 후의 이상, 이상 분비물</th>
						</tr>
						<tr>
							<th>비뇨기</th>
							<th>배뇨가 힘든 경우, 혈뇨, 대소변 실금, 소변량의 증가, 배뇨의 감소</th>
						</tr>
						<tr>
							<th>기생충</th>
							<th>분비물에서 기생충을 발견하는 경우, 배가 부어 오르는 경우, 설사, 항문에서 이 물질을 발견 하는
								경우, 체중 감소</th>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>


<jsp:include page="../tab/footer.jsp"></jsp:include>