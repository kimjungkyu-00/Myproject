;'<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Page Title</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
<script type="text/javascript" src="js/jquery_3.3.1.js" ></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
<script src="main.js"></script>

<title>게시판</title>
</head>
<body>

<header>
<jsp:include page="header.jsp"/>
</header>

<hr>
<div class="container">
    <h2 class="text-center text-heading">글작성</h2>
</div>

<script>
$(function(){
	
    $("input:button").click(function(){
        if($("input[name=title]").val() == ""){
            alert("제목을 입력하세요.");
            $("input[name=title]").focus();
            return false;
        }
        if($("input[name=author]").val() == ""){
            alert("작성자를 입력하세요.");
            $("input[name=author]").focus();
            return false;
        }
        if($("textarea[name=content]").val().length == 0){
            alert("내용을 입력하세요.");
            $("textarea[name=content]").focus();
            return false;
        }
        if($("input[name=title]").val().length != 0 && $("input[name=author]").val().length != 0 && $("textarea[name=content]").val().length != 0 ){
            $("form").submit();

        }
    });
    var maxlen=10;
    $("#my-textarea").keyup(function(){
        var len = $(this).val().length;
        var count = maxlen-len; //남은 글자 수
        console.log("count: "+count+",  len: "+len);
        $("span").html(len);
        if(count < 0){
            alert("10자 이상 입력이 불가능합니다.")
            //$(this).val(""); //입력내용 삭제
            $(this).focus();
        }
    });
});
</script>

<div class="container">
    <form action="list.do" method="post">
        <p>제목 <input class="form-control" type="text" name="title" placeholder="제목을 입력하세요">
        <p>작성자 <input class="form-control" type="text" name="author">
        <p>내용 &nbsp;&nbsp; <span>0</span>/10 
            <textarea class="form-control" id="my-textarea" name="content" rows="5" placeholder="내용을 입력하세요"></textarea>
        <div class="form-group">
        <p><input class="btn btn-primary" type="button" value="새글등록"> <input class="btn btn-primary" type="reset" value="초기화">
    </div> 
    </form>
</div>

</body>
</html>