<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href = "../../../../CSS/mypage-style.css" type ="text/css" rel ="stylesheet" />


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

<body>
<!-- 제목 목록 표 문장 폼 -->
		<header id = "header">
			<div class="root-container">
			<a href= "../../../../main/main.html"><h1 id="logo"><img src ="../../../../resources/logo.png" height="65px" alt ="여기" /> </h1></a>
	
			<section>
				<h1 class="hidden">헤더</h1>
				
				<nav class="hor-menu main-menu first-pad-none">
					<h1>메인메뉴</h1>
					<ul>
						<li><a href="">계획하기</a></li>
						<li><a href="../../../member/story/write/main.jsp">기록하기</a></li>
						<li><a href="../../../public-board/travel-log/log-main/log-main.html">여행기</a></li>
						<li><a href="">커뮤니티</a></li>
					</ul>
				</nav>
				

				<nav class ="hor-menu member-menu first-pad-none"  style ="margin-bottom:15px">
					<h1>회원 메뉴</h1>
					<ul>
						<li><a href= "../../../log-in.html">로그인</a></li> 
						<li><a href= "../../../join.html">회원가입</a></li>
						<li><a href ="../mypage.html" class ="btn btn-mypage">마이페이지</a></li>
					</ul>
				</nav>	
				

			</section> 
		</div>
	</header>
	
	<!-- Visual 부분 시작 -->
	<div id = "visual">
		<div class="root-container">
			<div class ="pro-pic"> <img src="../../../../resources/unknown-person.png" width="250px" />
			</div>
		</div>
	</div>
	
	<div id = "body">
		<div class="root-container" > <!-- 따옴표 안에 clear-fix --> 
			<!-- aside 시작------------------------------------------------------------------------------------------------------------- --> 			
	
			<aside id="aside">
					<h1 class="hidden">여행기</h1>
					
					<nav class="my-info">
						<div class="small-pro-pic"> <img src="../../../../resources/unknown-person.png" width="150px" /></div>
						<div class="follower">친구추가</div>
						<div class="my-info-write">
							<div class="small-loca"></div>내 계획 수: 3개<br>
							<div class="small-loca"></div>내 기록 수: 5개<br>
							<div class="small-loca"></div>게시글 수 : 2개
							
						</div>
					</nav>
					
					
					<nav class="ver-menu">
						<h1 = class ="back-import" >마이페이지</h1>
						<ul>
							<li><a href="../mymap/mymap.html">내 지도</a></li>
							<li><a href="../myplan/myplan.html">내 계획</a></li>
							<li><a href="../mystory/mystory.html">내 기록</a></li>
							<li><a href="../friends/friends.html">내 친구</a></li>
							<li><a href="../scrap/scrap-main.html">스크랩</a></li>
							<li><a href="../my-info-edit/my-info-edit.html">개인정보수정</a></li>
						</ul>
					</nav>

			</aside>
			<!-- main 시작-------------------------------------------------------------------------------------------------------------- --> 
		
				<section id ="main">

				<section>
						<section class = "title">
							개인정보수정
						</section>
						
						
						<form class="join" action ="my-info-edit-proc.jsp">
	
							<fieldset class="join">
							
							<legend class="hidden">검색필드</legend>

								<div class="join-label">
									<label>아이디</label>&ensp;&nbsp;  sist1218

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
									<input id="mail" type ="email"  name="mail" />&nbsp;<input class="btn btn-cancel" type ="button" value ="중복확인" onclick="mailCheck()"/>
									<br>
									<br>
									<label>별명</label>&ensp;&ensp;&ensp;&nbsp;
									<input  id="name" type ="text" name="nameinput"/>&nbsp;<input class="btn btn-cancel"  type ="button" value ="중복확인" onclick="nameCheck()"/>
									<br>
									<br>
									<label>전화번호</label>
									<input name="phone" type =text  />
									<br>
									<br>
									<label>생년월일</label>
									<input name="birth" type ="date" /><br><br>
									<br>
									<br>
									
								</div>
									

								<input class="btn btn-important join-btn" type ="submit"  name= "btn" value ="수정하기" onclick="formCheck()"/>

								<input class="btn btn-cancel" type ="submit" name= "btn" value ="회원탈퇴"/>

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