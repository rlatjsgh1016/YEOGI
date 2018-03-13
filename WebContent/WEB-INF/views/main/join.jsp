<%@page import="com.yeogi.jspweb.entity.Member"%>
<%@page import="com.yeogi.jspweb.dao.MemberDao"%>
<%@page import="com.yeogi.jspweb.dao.jdbc.JdbcMemberDao"%>
<%@page import="java.sql.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import="javax.servlet.http.HttpServlet" %>


<script type="text/javascript">



function idCheck(){
	
	window.name ="parentForm";
	window.open("id-check-form.jsp","chkForm",'width=500, height=300,  resizable=no, scrollbars=no');
}

function nameCheck(){
	
	window.name ="parentForm";
	window.open("name-check-form.jsp","chkForm",'width=500, height=300,  resizable=no, scrollbars=no');
}

function mailCheck(){
	
	window.name ="parentForm";
	window.open("mail-check-form.jsp","chkForm",'width=500, height=300,  resizable=no, scrollbars=no');
}



function formCheck() {
    // 사용하기 쉽도록 변수를 선언하여 담아주고,
    var id = document.forms[0].id.value;
   	var pwd = document.forms[0].pwd.value;
   	var pwdChk = document.forms[0].pwdChk.value;
   	var email = document.forms[0].email.value;
   	var name = document.forms[0].name.value;
   	var phone = document.forms[0].phone.value;
   	var birth = document.forms[0].birth.value;

 
    // || pwd == null || pwd == "" || pwdChk == null || pwdChk == "" || email == null || email == "" || name == null || name == "" || phone == null || phone == "" || phone == null || phone == "" || birth == null || birth == ""
    
    if (id == null || id == "") { // null인지 비교한 뒤 
        alert('ID를 입력하세요'); // 경고창을 띄우고 
        document.forms[0].id.focus(); // 해당태그에 포커스를 준뒤
        event.preventDefault();
        return false; // false를 리턴합니다.
    }
    
    else if (pwd == null || pwd == "") { // null인지 비교한 뒤 
        alert('패스워드를 입력하세요'); // 경고창을 띄우고 
        document.forms[0].pwd.focus(); // 해당태그에 포커스를 준뒤
        event.preventDefault();
        return false; // false를 리턴합니다.
    }
    else if (pwdChk == null || pwdChk == "") { // null인지 비교한 뒤 
        alert('패스워드를 확인해주세요'); // 경고창을 띄우고 
        document.forms[0].pwdChk.focus(); // 해당태그에 포커스를 준뒤
        event.preventDefault();
        return false; // false를 리턴합니다.
    }
    else if (email == null || email == "") { // null인지 비교한 뒤 
        alert('이메일을 입력하세요'); // 경고창을 띄우고 
        document.forms[0].email.focus(); // 해당태그에 포커스를 준뒤
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
    else if (pwd != pwdChk) { // null인지 비교한 뒤 
        alert('입력하신 패스워드가 같지 않습니다'); // 경고창을 띄우고 
        document.forms[0].pwdChk.focus(); // 해당태그에 포커스를 준뒤
        event.preventDefault();
        return false; // false를 리턴합니다.
    }
   
    
}

</script>

</head>


	
	
	<div id = "body">
		<div class="root-container" > <!-- 따옴표 안에 clear-fix --> 
			
			<!-- main 시작-------------------------------------------------------------------------------------------------------------- --> 
		
		

				<section id ="main">

				<section>
						<div class="title">
							여기의 회원이 되어보세요!
						</div>
						
						<form class="join" name ="form" action ="join-proc.jsp">
	
							<fieldset class="join">
							
							<legend class="hidden">검색필드</legend>

								<div class="join-label">
								
									<label>아이디</label>&ensp;&nbsp;
									<input type ="text" name="id" id="idinput"/>&nbsp;<input class="btn btn-cancel" type ="button"  name="btn" value ="중복확인" onclick="idCheck() "/>
									<% %>
									<br>
									<br>
									<label>비밀번호</label>
									<input type ="password"  name="pwd"/><br><br>
									&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&nbsp;<input type ="password"  name="pwdChk" placeholder=" 비밀번호 확인"/> 
									<br>
									<br>
									<label>이메일</label>&ensp;&nbsp;
									<input type ="email"  name="email"/>&nbsp;<input class="btn btn-cancel" type ="button" name="btn" value ="중복확인" onclick="mailCheck() "/>
									<br>
									<br>
									<label>별명</label>&ensp;&ensp;&ensp;&nbsp;
									<input type ="text"  name="name" id="nameinput" />&nbsp;<input class="btn btn-cancel" type ="button" name="btn" value ="중복확인" onclick="nameCheck() "/>
									<br>
									<br>
									<label>전화번호</label>
									<input type ="tel"  name="phone" placeholder=" 숫자만 입력하세요"/>
									<br>
									<br>
									<label>생년월일</label>
									<input type ="date" name="birth"/><br><br>
									<br>
									<br>
									
								</div>
									
								<input class="btn btn-important join-btn" type ="submit"  name="btn" value ="회원가입"  onclick="formCheck()"/>
								<input class="btn btn-cancel" type ="submit" value ="가입취소"/>

							</fieldset>
							
						</form>
					
				</section>
				
	 		</section> 

		</div>
		
	</div>
