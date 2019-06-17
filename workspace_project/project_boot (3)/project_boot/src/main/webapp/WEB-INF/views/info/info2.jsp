<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<jsp:include page="../tab/header.jsp"></jsp:include>
<!-- Page Content -->
<jsp:include page="../tab/info_side.jsp"></jsp:include>
<style>
#h2id {
	text-align: center;
}

#h3id {
	border: 1px solid;
	padding: 10px;
}

#float1 {
	float: right;
	margin: 30px 30px 20px 20px;
}

#plus {
	text-align: center;
}
</style>

<div class="col-lg-9">

	<div class="card card-outline-secondary my-3">
		<div class="card-header">
			<h2 id="h2id">
				<strong>떠돌아 다니는 개를 발견했을 때 </strong>
			</h2>
			<br>
		</div>
		<div class="card-body">

			<ol>
				<li>반려동물의 증가로 유기견(사람의 보살핌 없이 떠도는 개) 또는 길 잃은 개가 주변에 많이 있습니다. 며칠
					이상 늘 같은 자리에서 배회하 고 있다거나 , 청결 상태가 지저분한 개는 유기견 혹은 길 잃은 개일 가능성이 많습니다.
					유기견 혹은 길 잃은 개로 판단하고 데려올 경우 (무조건 유기견이라고 속단해서는 안됩니다. 오히려 주인이 있는 경우가 더
					많습니다.) 가까운 동물병원에 들러 피부병 등 건강상태를 체크하시기 바랍니다. 그리고 임시보호하면서 주인을 찾아주도록
					힘써주셔야 합니다. 임시보호하는 방법은 직접 집에서 돌보거나,주 변에 보호해줄만한 사람을 알아보거나 , 단골동물병원 ,
					봉사카페 등을 이용하면 좋습니다.</li>
				<br>
				<div>
					<input value="내용 더보기"
						onclick="if(this.parentNode.getElementsByTagName('div')[0].style.display != ''){this.parentNode.getElementsByTagName('div')[0].style.display = '';this.value = '숨기기';}else{this.parentNode.getElementsByTagName('div')[0].style.display = 'none'; this.value = '내용 더보기';}"
						type="button" />
					<div style="display: none;">
						<li>유기견 또는 길잃은 개로 판단하는데 있어 신중을 기해주십시요. 지저분하고 여기저기 돌아다닌다고 해서
							모두가 유기견은 아닙니다. 유기견으로 잘못알고 구조해서 견주와 개를 헤어지게 만든다면, 구조자 뿐만 아니라 견주와 그
							개에게 지울 수 없는 깊은 상처를 남기게 됩니다. 개를 기르지 않거나 개에게 관심이 없는 분들보다, 오히려 개를
							기르는 분들이 지나가다 떠돌아 다니는 개를 보면 무조건 "버린개구나!"라고 속단하는 분들이 많습니다.</li> <br>
						<li>개를 구조(보호)한 경우, 반드시 구조당시의 모습을 사진찍어 두시기 바랍니다. 구조후 목욕과 미용을
							다시하여 개의 모습이 많이 달라져 보일경우, 원주인이 알아보지 못할수도 있습니다.</li> <br>
						<li>개를 구조한 경우, 인터넷의 실종신고 글들을 확인하시기 바랍니다. 동물보호관리시스템의 분실신고도
							확인해보시기 바랍니다. 만약 주인으로 생각되는 글을 발견했다면 바로 연락을 취해보십시요.</li> <br>
						<li>만약 개가 이름표나 외장형 마이크로칩 태그가 없다면, 동물병원에 데려가서 내장형 마이크로칩 이식이
							되어있는지 확인해보십시요.</li> <br>
						<li>길거리를 떠도는 개를 주인을 찾아주기위해 데려간 경우, 최소한 일주일 동안은 주인을 찾아주기위해
							노력해주십시요. 어떤 사람은 주인을 찾아주기위한 노력을 반나절도 하지않고 인터넷 무료분양사이트에 올리는 경우도
							있는데, 정말 최악이며 씻지못할 죄를 짓는것입니다.</li> <br>
						<li>소방방재청은 불필요한 구조나 구급활동을 줄이고 꼭 필요한 곳에 신속한 서비스를 제공하기 위한 '119
							구조구급에 관한 법률'에 따라, 동물구조요청을 거부할 수 있으니 참고하시기 바랍니다. 거부할 경우 다른 방법이
							없는지도 물어보시면 알려준답니다.</li> <br>
					</div>
				</div>
			</ol>
			<h3 id="h3id">
				<strong>주인을 찾아주기 위한 가장 효과적인 방법은 구조(보호)동물의 사진을 넣은 전단지를 돌리는
					것입니다.</strong>
			</h3>

			<ol>
				<li>개가 처음 발견된 장소와 그 부근에 전단지를 붙이세요.</li>
				<br>
				<div>
					<input value="내용 더보기"
						onclick="if(this.parentNode.getElementsByTagName('div')[0].style.display != '')
						{this.parentNode.getElementsByTagName('div')[0].style.display = '';this.value = '숨기기';}
							else{this.parentNode.getElementsByTagName('div')[0].style.display = 'none'; this.value = '내용 더보기';}"
						type="button" />
					<div style="display: none;">
						<li>구조지역의 동물병원, 애견센터, 애견샵, 구(군)청, 주민센터에는 전단지를 전달해주시기 바랍니다.</li> <br>
						<li>동물보호관리시스템, 동물보호센터 그외 유기견관련 주요사이트에 구조(보호)신고를 해놓으십시요</li> <br>
						<li>구조(보호)중인 개의 후각기능을 이용해 보십시요. 구조(보호)중인 개를 처음 발견되었던 장소에 데려가서
							목줄을 한 상태에서 개가 가는 곳으로 따라가 보십시요. 개가 두리번거리며 냄새를 계속 맞는 장소에는 전단지를
							붙여두십시요.</li> <br>
			</ol>

		</div>
	</div>
</div>


<!-- /.card -->

<jsp:include page="../tab/footer.jsp"></jsp:include>
