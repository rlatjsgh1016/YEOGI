<%@page import="com.yeogi.jspweb.entity.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href = "../../../../CSS/mypage-style.css" type ="text/css" rel ="stylesheet" />
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
			<div class ="pro-pic"> <img src="../../../../resources/unknown-person.png" width="250" />
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
					
					
					<div class="virtual">
					<nav class="ver-menu">
						<h1 = class ="back-import" >마이페이지</h1>
						<ul>
							<li><a href="../mymap/mymap.html">내 지도</a></li>
							<li><a href="../myplan/myplan.html">내 계획</a></li>
							<li><a href="../mystory/mystory.html">내 기록</a></li>
							<li><a href="../friends/friends.html">내 친구</a></li>
							<li><a href="scrap-main.html">스크랩</a></li>
							<li><a href="../my-info-edit/my-info-edit.html">개인정보수정</a></li>
						</ul>
					</nav>
					</div>

			</aside>
			<!-- main 시작-------------------------------------------------------------------------------------------------------------- --> 
		
				<section id ="main">

				<section>
				<form action="friends-proc.jsp">
				<span class="title">친구 검색</span>
				
					<input name="id" class="title-box" type="text" maxlength="40" placeholder=" 사용자 아이디를 검색하세요"> <input type="submit" class="btn btn-cancel" name="btn" value="검색" style="height: 30px;">
				
					<% Member m = ((Member)request.getAttribute("mem")); 
						if(m != null){
					%>
					
					<div name="mem" style ="width: 295px; height: 35px; border:1px solid black; margin-left: 120px; padding-left:0px; padding-top:0px; padding-bottom:0px; display: table; border-radius: 5px; border:1px solid #BDBDBD;">
						<img src="../../../../resources/unknown-person.png" width="20px"  style ="padding-top: 5px; margin-left:10px;"/>
					     ID <span style="font-weight: normal;"> ${mem.id}(${mem.name})     </span> <input type="submit" name="btn" class="btn btn-cancel" value ="친구신청"/>
					</div>
					<% } %>
		
				</form>
						<section class = "title">
							친구 목록
						</section>
						
						<section class = "travel-cont">
							<div class="friends-list">
								<img src="../../../../resources/unknown-person.png" width="150px" hspace="10px"/>
								<div class="friends-list-info">
									KIMSH<br>
									도리토스
								</div>
								<div class="friends-req">
									친구요청 <span class="friends-answer"><a href="">수락</a></span> <span class="friends-answer"><a href="">거절</a></span>
								</div>
							</div>
							
							<div class="friends-list">
								<img src="../../../../resources/unknown-person.png" width="150px" hspace="10px"/>
								<div class="friends-list-info">
									KIMSH<br>
									도리토스
								</div>
								<div class="friends-req">
									친구요청 <span class="friends-answer"><a href="">수락</a></span> <span class="friends-answer"><a href="">거절</a></span>
								</div>
							</div>
							
							<div class="friends-list">
								<img src="../../../../resources/unknown-person.png" width="150px" hspace="10px"/>
								<div class="friends-list-info">
									KIMSH<br>
									도리토스
								</div>
							</div>
							
							<div class="friends-list">
								<img src="../../../../resources/unknown-person.png" width="150px" hspace="10px"/>
								<div class="friends-list-info">
									KIMSH<br>
									도리토스
								</div>
							</div>
							
								<div class="friends-list">
								<img src="../../../../resources/unknown-person.png" width="150px" hspace="10px"/>
								<div class="friends-list-info">
									KIMSH<br>
									도리토스
								</div>
							</div>
						</section>
						
						<div class="line"></div>
						
						
						<section class = "travel-cont">
							<div class="friends-list">
								<img src="../../../../resources/unknown-person.png" width="150px" hspace="10px"/>
								<div class="friends-list-info">
									KIMSH<br>
									도리토스
								</div>
							</div>
							
							<div class="friends-list">
								<img src="../../../../resources/unknown-person.png" width="150px" hspace="10px"/>
								<div class="friends-list-info">
									KIMSH<br>
									도리토스
								</div>
							</div>
							
							<div class="friends-list">
								<img src="../../../../resources/unknown-person.png" width="150px" hspace="10px"/>
								<div class="friends-list-info">
									KIMSH<br>
									도리토스
								</div>
							</div>
							
							<div class="friends-list">
								<img src="../../../../resources/unknown-person.png" width="150px" hspace="10px"/>
								<div class="friends-list-info">
									KIMSH<br>
									도리토스
								</div>
							</div>
							
								<div class="friends-list">
								<img src="../../../../resources/unknown-person.png" width="150px" hspace="10px"/>
								<div class="friends-list-info">
									KIMSH<br>
									도리토스
								</div>
							</div>
						</section>
						
						<div class="line"></div>
						
						<section class = "travel-cont">
							<div class="friends-list">
								<img src="../../../../resources/unknown-person.png" width="150px" hspace="10px"/>
								<div class="friends-list-info">
									KIMSH<br>
									도리토스
								</div>
							</div>
							
							<div class="friends-list">
								<img src="../../../../resources/unknown-person.png" width="150px" hspace="10px"/>
								<div class="friends-list-info">
									KIMSH<br>
									도리토스
								</div>
							</div>
							
							<div class="friends-list">
								<img src="../../../../resources/unknown-person.png" width="150px" hspace="10px"/>
								<div class="friends-list-info">
									KIMSH<br>
									도리토스
								</div>
							</div>
							
							<div class="friends-list">
								<img src="../../../../resources/unknown-person.png" width="150px" hspace="10px"/>
								<div class="friends-list-info">
									KIMSH<br>
									도리토스
								</div>
							</div>
							
								<div class="friends-list">
								<img src="../../../../resources/unknown-person.png" width="150px" hspace="10px"/>
								<div class="friends-list-info">
									KIMSH<br>
									도리토스
								</div>
							</div>
						</section>
						
						<nav class="number-change hor-menu main-menu first-pad-none">
							<ul>
								<li><a href=""  class ="font-import">1</a></li>
								<li><a href="">2</a></li>
								<li><a href="">3</a></li>
								<li><a href="">4</a></li>
								<li><a href="">5</a></li>
							</ul>
						</nav>
						
					
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