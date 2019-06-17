function doFindWrite() {
	alert("hihi");
	var content = document.forms[0].content.value; // 추가되었습니다. 글내용
    
    if (content == null || content == ""){      // null인지 비교한 뒤
        alert('content을 입력하세요');           // 경고창을 띄우고
        document.forms[0].content.focus();    // 해당태그에 포커스를 준뒤
        return false;                       // false를 리턴합니다.
    }
    
    

    var formDatall = $('#findWriteForm').serialize();
 
    var formData = new FormData();

	var inputFile = $("input[name='uploadFile']");

	var files = inputFile[0].files;

	alert(files);

	for (var i = 0; i < files.length; i++) {
		formData.append("uploadFile", files[i]);
	}

	$.ajax({
		
		url : '/uploadAjaxAction',
		processData : false,
		contentType : false,
		type : "POST",
		data : formData,
		success : function(result) {			
			
			$.ajax({
				url : "db_findWrite.do",
				type : "POST",
				data : formDatall,
				datatype: 'json',
				success : function(data, status) {
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

