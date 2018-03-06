<%@page import="com.yeogi.jspweb.entity.Member"%>
<%@page import="com.yeogi.jspweb.dao.MemberDao"%>
<%@page import="com.yeogi.jspweb.dao.jdbc.JdbcMemberDao"%>
<%@page import="java.sql.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import="javax.servlet.http.HttpServlet" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href = "../CSS/style.css" type ="text/css" rel ="stylesheet" />

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


<body>
<!-- 제목 목록 표 문장 폼 -->
		<header id = "header">
			<div class="root-container">
			<a href= "../main/main.html"><h1 id="logo"><img src ="../resources/logo.png" height="65px" alt ="여기" /> </h1></a>
	
			<section>
				<h1 class="hidden">헤더</h1>
				
				<nav class="hor-menu main-menu first-pad-none">
					<h1>메인메뉴</h1>
					<ul>
						<li><a href="">계획하기</a></li>
						<li><a href="member/story/write/main.jsp">기록하기</a></li>
						<li><a href="public-board/travel-log/log-main/log-main.html">여행기</a></li>
						<li><a href="">커뮤니티</a></li>
					</ul>
				</nav>

				<nav class ="hor-menu member-menu first-pad-none" style ="margin-bottom:15px">
					<h1>회원 메뉴</h1>
					<ul>
						<li><a href= "log-in.html">로그인</a></li> 
						<li><a href= "join">회원가입</a></li>
						<li><a href ="member/mypage/mypage.html" class ="btn btn-mypage">마이페이지</a></li>
					</ul>
					
				</nav>	
				
			
			</section> 
			
		</div>
		
	</header>
	
	<!-- Visual 부분 시작 -->
	<div id = "visual2">
		<div class="root-container">
			<div class ="big-loca">
			</div>
		</div>
	</div>
	
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

	<!-- footer 시작------------------------------------------------------------------------------------------------------------ --> 
	
	<footer id = "footer">
	
		<div class="root-container">
				
				<div id = "footer_logo">
				
					<div id = "footer_bar">
				
					</div>
					
				</div>
				회사정보
				서울특별시 마포구 월드컵북로 21 풍성빌딩 2, 3, 4층 쌍용강북교육센터 <br>
				Tel 02)000-0000 | Fax 02)000-0000<br>
				사업자번호 : 000-00-00000 | 제작 : 여행자들 | 개인정보처리관리책임자 : 김땡땡
				<br><br>
				Copyright (C) 2018 Travelers , ALL Right Reserved 


		</div>
		
	</footer>
</body>


</html>

<%

%>