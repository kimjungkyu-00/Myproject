function sendMail() {
	var formData = $('#mainForm').serialize();
	alert(formData);
	$.ajax({
		url: "/mailSending",
		type: "post",
		data: formData,
		success:function(data) {
			alert("관리자에게 메일이 성공적으로 보내졌습니다.");
			location.href = "/";
		}
	}); //ajax
	
	
	
}
