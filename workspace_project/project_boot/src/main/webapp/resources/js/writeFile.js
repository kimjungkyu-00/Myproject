function doFindWrite() {
	alert("test");
	var formDatall = $('#findWriteForm').serialize();
	console.log(formDatall);
	console.log("================");
	console.log("눌러짐");
	var formData = new FormData();

	var inputFile = $("input[name='uploadFile']");

	var files = inputFile[0].files;

	console.log(files);

	for (var i = 0; i < files.length; i++) {
		formData.append("uploadFile", files[i]);
	}

	$.ajax({
		url : '/uploadAjaxAction',
		processData : false,
		contentType : false,
		data : formData,
		type : 'POST',
		success : function(result) {			
			
			$.ajax({
				url : "db_findWrite.do",
				type : "POST",
				data : formDatall,
				datatype: 'json',
				success : function(data, status, xhr) {
					console.log(data);
					alert(data + "성공");
					$(location).attr('href', "/findList");
				},
				error : function() {
					alert("err");
				}
			}); // ajax
		}
	});// ajax


}
