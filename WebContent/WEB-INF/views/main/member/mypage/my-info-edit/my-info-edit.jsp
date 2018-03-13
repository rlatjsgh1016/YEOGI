<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>



<script type="text/javascript">

function nameCheck(){
	
	window.name ="parentForm";
	window.open("my-name-check-form.jsp","chkForm",'width=500, height=300,  resizable=no, scrollbars=no');
}

function mailCheck(){
	
	window.name ="parentForm";
	window.open("my-mail-check-form.jsp","chkForm",'width=500, height=300,  resizable=no, scrollbars=no');
}



function formCheck() {
    // 사용하기 쉽도록 변수를 선언하여 담아주고,
   	var pwd = document.forms[0].pwd.value;
    var newPwd = document.forms[0].newPwd.value;
   	var newPwdChk = document.forms[0].newPwdChk.value;
   	var mail = document.forms[0].mail.value;
   	var name = document.forms[0].name.value;
   	var phone = document.forms[0].phone.value;
   	var birth = document.forms[0].birth.value;

 
    // || pwd == null || pwd == "" || pwdChk == null || pwdChk == "" || email == null || email == "" || name == null || name == "" || phone == null || phone == "" || phone == null || phone == "" || birth == null || birth == ""
    
    if (pwd == null || pwd == "") { // null인지 비교한 뒤 
        alert('패스워드를 입력하세요'); // 경고창을 띄우고 
        document.forms[0].pwd.focus(); // 해당태그에 포커스를 준뒤
        event.preventDefault();
        return false; // false를 리턴합니다.
    }
    
    else if (newPwd == null || newPwd == "") { // null인지 비교한 뒤 
        alert('새로운 패스워드를 입력하세요'); // 경고창을 띄우고 
        document.forms[0].newPwd.focus(); // 해당태그에 포커스를 준뒤
        event.preventDefault();
        return false; // false를 리턴합니다.
    }
    else if (newPwdChk == null || newPwdChk == "") { // null인지 비교한 뒤 
        alert('새로운 패스워드를 확인해주세요'); // 경고창을 띄우고 
        document.forms[0].newPwdChk.focus(); // 해당태그에 포커스를 준뒤
        event.preventDefault();
        return false; // false를 리턴합니다.
    }
    else if (mail == null || mail == "") { // null인지 비교한 뒤 
        alert('이메일을 입력하세요'); // 경고창을 띄우고 
        document.forms[0].mail.focus(); // 해당태그에 포커스를 준뒤
        event.preventDefault();
        return false; // false를 리턴합니다.
    }
    else if (name == null || name == "") { // null인지 비교한 뒤 
        alert('닉네임을 입력하세요'); // 경고창을 띄우고 
        document.forms[0].name.focus(); // 해당태그에 포커스를 준뒤
        event.preventDefault();
        return false; // false를 리턴합니다.
    }
    else if (phone == null || phone == "") { // null인지 비교한 뒤 
        alert('전화번호를 입력하세요'); // 경고창을 띄우고 
        document.forms[0].phone.focus(); // 해당태그에 포커스를 준뒤
        event.preventDefault();
        return false; // false를 리턴합니다.
    }
    else if (birth == null || birth == "") { // null인지 비교한 뒤 
        alert('생년월일을 입력하세요'); // 경고창을 띄우고 
        document.forms[0].birth.focus(); // 해당태그에 포커스를 준뒤
        event.preventDefault();
        return false; // false를 리턴합니다.
    }
    else if (newPwd != newPwdChk) { // null인지 비교한 뒤 
        alert('입력하신 패스워드가 같지 않습니다'); // 경고창을 띄우고 
        document.forms[0].pwdChk.focus(); // 해당태그에 포커스를 준뒤
        event.preventDefault();
        return false; // false를 리턴합니다.
    }
   
    
}

</script>


</head>


				<section id ="main">

				<section>
						<section class = "title">
							개인정보수정
						</section>
						
						
						<form class="join" action ="my-info-edit-proc.jsp">
	
							<fieldset class="join">
							
							<legend class="hidden">검색필드</legend>

								<div class="join-label">
									<label>아이디</label>&ensp;&nbsp; ${member.id} 

									<br>
									<br>
									<label>비밀번호</label>
									<input type ="password" name="pwd" placeholder=" 기존 비밀번호"/><br><br>
									
									<label>비밀번호</label>
									<input type ="password" name="newPwd" placeholder=" 새 비밀번호"/><br><br>
									&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&nbsp;<input type ="password" name="newPwdChk" placeholder=" 비밀번호 확인"/> 
									<br>
									<br>
									<label>이메일</label>&ensp;&nbsp;
									<input id="mail" type ="email"  name="mail"  value= "${member.email }"/>&nbsp;<input class="btn btn-cancel" type ="button" value ="중복확인" onclick="mailCheck()"/>
									<br>
									<br>
									<label>별명</label>&ensp;&ensp;&ensp;&nbsp;
									<input  id="name" type ="text" name="nameinput" value="${member.name }"/>&nbsp;<input class="btn btn-cancel"  type ="button" value ="중복확인" onclick="nameCheck()"/>
									<br>
									<br>
									<label>전화번호</label>
									<input name="phone" type =text  value="${member.phone }"/>
									<br>
									<br>
									<label>생년월일</label>
									<input name="birth" type ="date" value="${member.birthday }" /><br><br>
									<br>
									<br>
									
								</div>
									

								<input class="btn btn-important join-btn" type ="submit"  name= "btn" value ="수정하기" onclick="formCheck()"/>

								<input class="btn btn-cancel" type ="submit" name= "btn" value ="회원탈퇴"/>

							</fieldset>
							
						</form>					
				</section>
				
	 		</section> 
