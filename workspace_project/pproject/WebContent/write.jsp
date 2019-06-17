<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
<form action="insert.jsp" method="post" onsubmit="return formCheck();">
		제목 <input type="text" name="title"/><br/>
		작성자 <input type="email" name="writer"/><br/>
		글내용 <textarea rows="10" cols="20" name="content"></textarea><br>
		<input type="submit"/>
	</form>
	
	<script>
	
	function formCheck(){
		var length= document.forms[0].length-1;
		//submit을 제외한 모든 input 태그의 갯수를 가져옴
		
		for(var i=0;i<length;i++){ //루프를 돌면서
			if(document.forms[0][i].value ==null || document.forms[0][i].value ==""){
				alert(document.forms[0][i].name+"을 /를 입력하세요."); // 경고창 띄우기
				
				document.forms[0][i].focus(); // null인 태그에 포커스를 줌
				
				return false;
			}// end if
		} //end for
		

		if(title=="" ||title== null) out.println("title이 null입니다");
		if(writer=="" ||writer== null) out.println("writer가 null입니다");
		else if(!Pattern.matches("^[_0-9a-zA-Z-]+@[0-9a-zA-Z-]+(.[_0-9a-zA-Z-]+)*$",writer))
			out.println("이메일 형식이 아닙니다.");
		
		if(regdate =="" || regdate == null)
			out.println("regdate가 null입니다.");
		
		else if(!Pattern.matches("^[0-9]*$*",regdate))
			out.println("숫자형식이 아닙니다.");
		
		if(content == "" ||content == null) out.println("content가 null입니다.");

		
	}
	</script>
</body>
</html>