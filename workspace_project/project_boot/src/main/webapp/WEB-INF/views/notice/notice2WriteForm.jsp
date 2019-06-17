<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="text/javascript"></script>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="./resources/editor/js/HuskyEZCreator.js" charset="utf-8"></script>

<style>
	#ncontent { 
		height:100%; width:100%; border:1px solid #ccc; 
	
	}


</style>


<jsp:include page="../tab/header.jsp"></jsp:include>
<!-- Page Content -->
<jsp:include page="../tab/notice_side.jsp"></jsp:include>
<div class="col-lg-9">

	<!--게시판 넓이 -->
	<div class="card card-outline-secondary my-4">
		
		
		 <form action="noticeWriterForm.do" method="post" id="insertBoardFrm" enctype='multipart/form-data'>
		 <input type="text" id="ntitle" name="ntitle" >
		 <input type="text" value="${member.userid}">
        <textarea name="editor" id="editor" style="width: 700px; height: 400px;"></textarea>
        <input type="submit" id="insertBoard" value="등록" />
    </form>
	</div>
</div>




<jsp:include page="../tab/footer.jsp"></jsp:include>
<script type="text/javascript">
    $(function(){
        //전역변수
        var obj = [];              
        //스마트에디터 프레임생성
        nhn.husky.EZCreator.createInIFrame({
            oAppRef: obj,
            elPlaceHolder: "editor",
            sSkinURI: "./resources/editor/SmartEditor2Skin.html",
            htParams : {
                // 툴바 사용 여부
                bUseToolbar : true,            
                // 입력창 크기 조절바 사용 여부
                bUseVerticalResizer : true,    
                // 모드 탭(Editor | HTML | TEXT) 사용 여부
                bUseModeChanger : true,
            }
        });
        //전송버튼
        $("#insertBoard").click(function(){
            //id가 smarteditor인 textarea에 에디터에서 대입
            obj.getById["editor"].exec("UPDATE_CONTENTS_FIELD", []);
            //폼 submit
            $("#insertBoardFrm").submit();
            alert("눌렀니?");
        });
    });
</script>

