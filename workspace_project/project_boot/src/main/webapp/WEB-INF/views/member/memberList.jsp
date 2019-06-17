<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<jsp:include page="../tab/header.jsp"></jsp:include>
<!-- Page Content -->
<jsp:include page="../tab/lost_side.jsp"></jsp:include>


<div class="col-lg-9">
	<div class="card card-outline-secondary my-4">
		<table class="table table-hover">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">아이디</th>
					<th scope="col">이름</th>
					<th scope="col">전화번호</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="member" items="${memberList }">
					<tr>
						<th scope="row">
						<input type="checkbox" value="${member.userid }" id="mem_userid" name="mem_userid" ></th>
						<td>${member.userid }</td>
						<td>${member.username }</td>
						<td>${member.tel}</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>

		
			<button type="submit" class="btn btn-sm btn-outline-secondary" onclick ="adminMemberDelete();"id="adminMemberDelete">삭제</button>

	</div>
</div>
<script>
	function adminMemberDelete() {
		var sel_mem =  [];
		$("input[name=mem_userid]:checked").each(function() {
			sel_mem.push($(this).val());
			alert(sel_mem);
		});
		
	
		
		if(sel_mem.length == 0) {
			alert("선택하세요");
			return;
		}
		
		$.ajax({
			url:"/adminMemberDelete",
			data : {
				selArr:sel_mem,
				
			},
			dataType: "text",
			type : 'POST',
			success : function(){
				alert("삭제 되었습니다");
				location.href = "/memberList.do";
	
			}
		}); //ajax
		
		
	}

</script>

<jsp:include page="../tab/footer.jsp"></jsp:include>