<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link type="text/css" href="${ctx}/CSS/communitymain.css" rel="stylesheet">

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
</body>
</html>

<!-- main 시작------------------------------------------------------------------------------------------------------------- --> 
	<main>
		<div class ="allmain clear">
			<div class ="leftmain">
				<table border = "5">
					<h1>메인메뉴</h1>
					<div>
						<tr>
							<td class="sidemenu">
								<a>
									<a href="reg" class="btn btn-text default-btn">월간BEST</a>	
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
			<div class="rightmain div">
			<div class ="rightmain">
				<p class="p1">월간BEST</p>
				<p class="p2">
				
<a href="CommunityWritting.jsp" class="btn btn-text default-btn">글쓰기</a>
				</p>
					<div class ="clear">
						<img alt="" src="">
			
						<img alt="" src="">
							<div class ="p3">
								<p>
									<a>
										공지게시판
									</a>
								</p>
								<p>
									<a>
										제목:사이트 점검 시간 있습니다.
									</a>
								</p>
								<p>
									<a>
										<a href="reg" class="btn btn-text default-btn">2월 13일 00~22시까지..</a>
									</a>	
								</p>
						</div>	
							<div class="border-top">
						<div>
							<img alt="" src="">
								<p>
									<a>
							
									</a>
								</p>
								<p>
									<a>
										질문게시판
									</a>
								</p>
								<p>
									<a>
										제목:여행 준비할때 옷은 몇개 준비해야...
									</a>
								</p>
								<p>
									<a>
										<a href="reg" class="btn btn-text default-btn">방문 할 나라의 날씨에 맞는 옷을 준비...</a>
									</a>
								</p>
				    </div>
					<div class="border-top">
						<img alt="" src="">
						
								<p>
							 		<a>
										정보게시판
									</a>
								</p>
								<p>
									<a>
										제목:여행시 챙겨야할 필수 아이템
									</a>
								</p>
								<p>
										<a href="reg" class="btn btn-text default-btn">국제학생증 꼭 발급.....</a>
								</p>
					</div>
					<div class="border-top">
					</div>
					<div>
		            	<img alt="" src="">
								<p>
									<a>			
										동행게시판
									</a>
								</p>
								<p>
									<a>
										제목:카풀 사람 구합니다.
									</a>	
								</p>
								<p>
									<a href="reg" class="btn btn-text default-btn">돌아다닐 장소는 파리....</a>
								</p>
					</div> 
						<div class="border-top">
					<div>
						<img alt="" src="">
								<p>
									<a>
										잡답게시판
									</a>
								</p>
								<p>
									<a>
										제목:인생을 사는데 필요한조언
									</a>
								</p>
								<p>
									<a href="reg" class="btn btn-text default-btn">아침에 일찍 일어나는 아침형...</a>
								</p>
					</div>
					<div class="border-top">
					</div>
					</div>
					</div>
					</div>
					</div>
					</div>
					<div class ="rightmain clear">
					<div>
					<a href="reg" class="btn btn-text default-btn">1/100페이지 이전/다음</a>
					</div>
					</div>
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
		