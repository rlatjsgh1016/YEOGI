<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<link type="text/css" href="../../../CSS/communityreading.css" rel="stylesheet">
    <body>
<!-- header 시작------------------------------------------------------------------------------------------------------------- --> 
	<header>
		<div class="root-container">
			<h1 id="logo"></h1>
			<img src="../../../resources/logo.png" alt="여기" height="70px">		
			<ul>
				<li>
					<a>
						<a href="reg" class="btn btn-text default-btn">내계획</a>
					</a>
				</li>
				<li>
					<a>
						<a href="reg" class="btn btn-text default-btn">내기록</a>
					</a>
				</li>
				<li>
					<a>
						<a href="reg" class="btn btn-text default-btn">여행기</a>
					</a>
				</li>
				<li>
					<a>
						<a href="reg" class="btn btn-text default-btn">커뮤니티</a>
					</a>
				</li>
				<li>
					<a>
						<a href="reg" class="btn btn-text default-btn">마이페이지</a>
					</a>
				</li>
			</ul>
		</div>
	</header>
<!-- visual 시작------------------------------------------------------------------------------------------------------------- --> 	
<visual>		
	<form class="form-control">
			<fieldset>
				<legend class="c1">검색창</legend>
				<label class="reg" for="class">분류</label>
					<select id="class">
						<option>월간BEST</option>
						<option>공지</option>
						<option>질문</option>
						<option>정보</option>
						<option>동행</option>
						<option>잡담</option>
					</select>
				<input type="text"/>
				<input class="btn btn-image btn-search" type="submit" value="검색" />
			</fieldset>
		</form>
</visual>	
    
<!-- main 시작------------------------------------------------------------------------------------------------------------- -->


	<main>
		<div class ="allmain clear">
			<div class ="leftmain">
				<table border = "5">
					<h1>메인메뉴</h1>
					<div>
						<tr>
							<td class ="sidemenu">
								<a>
									<a href="#" class="btn btn-text default-btn">월간BEST</a>
								</a>
							</td>
						</tr>
						<tr>
							<td class ="sidemenu">
								<a>
									<a href="reg" class="btn btn-text default-btn">공지게시판</a>	
								</a>
							</td>
						</tr>
						<tr>
							<td class ="sidemenu">
								<a>
									<a href="reg" class="btn btn-text default-btn">질문게시판</a>	
								</a>
							</td>
						</tr>
						<tr>
							<td class ="sidemenu">
								<a>
									<a href="reg" class="btn btn-text default-btn">정보게시판</a>	
								</a>
							</td>
						</tr>
						<tr>
							<td class ="sidemenu">
								<a>
									<a href="reg" class="btn btn-text default-btn">동행게시판</a>	
								</a>
							</td>
						</tr>
						<tr>
							<td class ="sidemenu">
								<a>
								<a href="reg" class="btn btn-text default-btn">잡담게시판</a>	
								</a>
							</td>
						</tr>
					</div>	
				</table>
			</div>
			<div class ="rightmain">
				<p class="p1">공지게시판</p>
				<img alt="" src="">
			<a href="" class="btn btn-text default-btn">수정</a>
			<a href="Yeogi/main/public-board/community/communitymain" class="btn btn-text default-btn">목록</a>
			<p class="p2">조회수:10</p2>
				<div>
					<p>
						<a>
							제목:사이트 점검 시간 있습니다.
						</a>
					</p>
					<p>
						<a>
							작성자 아이디:qkrwpdnrsist@nate.com
						</a>
					</p>
					<p class="p3">
						<a>
						2018년 2월 13일 홈페이지 서버 점검 시간을 공지합니다.
						<br>00~22시까지 이며 단축 하는데 최선의 노력을 다하도록 하겠습니다.
					<br>허나 시스템 상의 결함으로 인하여 점검 시간이 늘어 날수 있음을 양해 바랍니다.
						</a>
						
						
					
					</div>	
					
					
					<div class ="rightmain clear"></div>	
					</div>
					<form class="form-control">
			<fieldset>
				<legend class="c1">댓글창</legend>
				
				<label class="reg" for="class">내용</label>
					<select id="class">
						
					</select>
				<input type="text"/>
				<input class="btn btn-image btn-search" type="submit" value="입력" />
			</fieldset>
		</form>
	</main>
	
	<!-- footer 시작------------------------------------------------------------------------------------------------------------- -->
	<footer>
		<div class="root-container">
		
			<img src="../../../resources/logo.png" alt="여기" height="70px">		
			<p>회사정보 주소서울특별시 마포구 월드컵북로 21 풍성빌딩 2,3,4층
			<br>쌍용강북교육센터 Tel 사업자번호:000-00-00000 <br>제작 : 여행자들 개인정보처리관리책임자: 컴땡땡 Copyright
			<br>(C) 2018 Travelers, ALL Right Reserved</p>
		
			<div class ="clear"></div>
		</div>
	</footer>
</body>
</html>			
