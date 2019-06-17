$(function(){
		//필수입력사항이 입력이 다 되어있으면 true, 
		//입력이 되어있지 않으면 false; 
		var InputStatus = false ; 
		
		function checkInput(){
			//필수입력사항 입력 유무 확인
			if( $("#id").val()=='' ){
				$("#id").focus();
				InputStatus = false;
			}else if($('#name').val()==''){
				$("#name").focus();
				InputStatus = false;
			}else if($('#passwd').val()==''){
				$("#passwd").focus();
				InputStatus = false;
			}else{
				InputStatus = true;
			}				
			
			alert("필수 입력사항 "+InputStatus);
			return false;		
		}
		
		//아이디 중복 체크
		$("#checkId").click(function(){				
			if( $("#id").val() ){
				//서버에게 id 중복 확인 요청
				var query ={id:$("#id").val()};
				
				$.post("confirmId.jsp",query,function(msg){
					if(msg == 1){
						alert("아이디가 있습니다");//아이디 중복 확인 결과
						$('#id').val("");//아이디를 지운다
					}else{
						alert("아디를 사용할 수 있습니다.");
					}
				});
			}else{ //아이디 입력이 되지 않은 경우
				alert("사용할 아이디 입력");
				$('#id').focus();
			}
		});
	
		
		$("#process").click(function(){
			//필수 입력사항 검사하기
			checkInput();
			
			if( InputStatus == true ){					
				if( $("#passwd").val() != $("#re_passwd").val() ){ 					
				//비밀번호와 재입력한 비밀번호 값이 같은지 확인
			    	alert("비밀번호가 같지 않습니다");
					$("#passwd").focus();
					return false;
				}else{ 
					// 회원가입 요청
					var query={ id:$("#id").val(),
							    passwd:$("#passwd").val(),
							    name:$("#name").val(),
							    tel:$("#tel").val(),
							    address:$("#address").val()
							    };							
					 $.ajax({
						url:"registerPro.jsp",
						type:"post",
						data:query,
						success:function(msg){
							alert(msg);
							$(location).attr('href',"main.jsp");
						}
					  } );
				}//else	
			}
		});//click 
		
		//취소 버튼 클릭 동작
		$("#cancle").click(function(){
			//window.location.href("main.jsp");
			$(location).attr('href','main.jsp');
		});
		
		$("#btnLogin").click(function(){
			window.location.replace("main.jsp");
		})
			
});