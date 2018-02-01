<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>story main page</title>
<link type="text/css" href="../../../../CSS/story-write.css" rel="stylesheet">
</head>
<body>
	<header>
		<div class="root-container">
			<a href="../../../main.html"><img id="logo" alt="로고" src="../../../../images/logo.png"></a>
			<nav>
				<ul class="main-menu">
					<li><a href="../../plan/newplan/new-plan.html">계획하기</a></li>
					<li><a href="main.html">기록하기</a></li>
					<li><a href="#">여행기</a></li>
					<li><a href="#">커뮤니티</a></li>
				</ul>
				<ul class="login-menu">
					<li><a href="#">로그인</a></li>
					<li><a href="#">회원가입</a></li>
				</ul>
			</nav>
		</div>
	</header>
	<div id="visual">
		<div class="root-container">
			<input class="title-box" type="text" maxlength="40" placeholder="여행 타이틀을 작성하세요 :)">
			<button id="btn-cover">커버바꾸기</button>
		</div>
	</div>
	<main>
		<div class="root-container">
			<section class="left-main">
				<div class="btn-container">
					<div class="lock-add-btn">
						<a id="lock" href="#">비공개▶공개</a>
						<a class="large-btn clear-fix" href="#">동행자<br>추가</a>
					</div>
					<ul class="console-btn">
						<li><a href="#">임시저장</a></li>
						<li><a href="#">작성완료</a></li>
						<li><a href="#">취소</a></li>
					</ul>
				</div>
				<div class="spending-container">
					<span id="spending-txt">지출내역</span>
					<div class="spending-box">
						<span>KRW</span>
						<span>300,000</span>
					</div>
				</div>
				<div class="day-btn-container clear-fix">
					<a id="left-arrow" href="#"><img alt="좌측화살표" src="../../../../images/left-arrow.png"></a>
					<ul class="day-btn">
						<li><a href="#">DAY1</a></li>
						<li><a href="#">DAY2</a></li>
						<li><a href="#">DAY3</a></li>
					</ul>
					<a id="right-arrow" href="#"><img alt="우측화살표" src="../../../../images/right-arrow.png"></a>
				</div>
				<div class="place-container">
					<div class="card-frame">
						<div class="image-frame">
							<img alt="장소이미지" src="../../../../images/1.jpg">
						</div>
						
						<div class="place-frame">
							<p>인천공항</p>
						</div>
						<div class="place-btn-container">
							<a href="#"><img alt="삭제" src="../../../../images/cancel.png"></a>
							<a href=# onclick="window.open('detail.html','게시물입력폼','width:800px height:500px status:0 toolbar:0 location:0 menubar:0 scrollbars:0 resizable:0');"><img alt="편집" src="../../../../images/edit.png"></a>
						</div>
					</div>
					<div class="place-add">
						<img alt="플러스" src="../../../../images/addition-sign.png">
						<a href=# onclick="window.open('detail.html','게시물입력폼','resizable=no scrollbars=no width=800 height=500');" onfocus='this.blur()'>게시물<br>추가</a>
					</div>
					<div class="card-frame">
						<div class="image-frame">
							<img alt="장소이미지" src="../../../../images/1.jpg">
						</div>
						
						<div class="place-frame">
							<p>인천공항</p>
						</div>
						<div class="place-btn-container">
							<a href="#"><img alt="삭제" src="../../../../images/cancel.png"></a>
							<a href=# onclick="window.open('detail.html','게시물입력폼','resizable=no scrollbars=no width=800 height=500');" onfocus='this.blur()'><img alt="편집" src="../../../../images/edit.png"></a>
						</div>
					</div>
					<div class="place-add">
						<img alt="플러스" src="../../../../images/addition-sign.png">
						<a href=# onclick="window.open('detail.html','게시물입력폼','resizable=no scrollbars=no width=800 height=500');" onfocus='this.blur()'>게시물<br>추가</a>					</div>
					<div class="card-frame">
						<div class="image-frame">
							<img alt="장소이미지" src="../../../../images/1.jpg">
						</div>
						
						<div class="place-frame">
							<p>인천공항</p>
						</div>
						<div class="place-btn-container">
							<a href="#"><img alt="삭제" src="../../../../images/cancel.png"></a>
							<a href=# onclick="window.open('detail.html','게시물입력폼','resizable=no scrollbars=no width=800 height=500');" onfocus='this.blur()'><img alt="편집" src="../../../../images/edit.png"></a>
						</div>
					</div>
					<div class="place-add">
						<img alt="플러스" src="../../../../images/addition-sign.png">
						<a href=# onclick="window.open('detail.html','게시물입력폼','resizable=no scrollbars=no width=800 height=500');" onfocus='this.blur()'>게시물<br>추가</a>					</div>
				</div>
			</section>
			<section class="right-main">
       			<div class="tour-intro">
        			<input type="text" id="tourMessage" class="form-control tour-brief" placeholder="어떤 여행인지 간단히 설명해 주세요 :)" maxlength="300">
       				<textarea class="form-control" id="tourDetailMessage" placeholder="당신의 여행 스토리를 남겨보세요!" maxlength="10000"></textarea>
       				<div class="tour-edit-info">
           				<div class="day-step-theme">
            					<div class="days">
	               					<h6>여행시작일 </h6>
	               					<input id="tourStartDay" type="date" value="2018-01-04" style="height: 34px; margin-left:5px; cursor: pointer;background-color: white;">
            					</div>
            					<div class="days">
              						<h6>일</h6>
            						<input type="number" min="1" max="60" class="form-control" id="maxDay" style="width:50px;">
            					</div>
            					<div class="days">
	               					<h6>명</h6>
	               					<input type="number" class="form-control" min="1" id="persons" style="width:50px;">
            					</div>
           				</div>
           				<div class="day-step theme nations">
            					<h6>여행도시</h6>
         						<select  style="width:70px; height: 38px;">
         							<option>한국</option>
         							<option>일본</option>
         							<option>중국</option>
         						</select>
             			</div>
    					<div class="day-step-theme themes">
             				<h6>여행테마</h6>
							<span class="selected" data-theme="0">나홀로 여행</span>
							<span class="" data-theme="1">친구와 함께</span>								
							<span class="" data-theme="2">가족과 함께</span>
							<span class="selected" data-theme="3">단체여행</span>
							<span class="selected" data-theme="4">패키지 여행</span>
							<span class="selected" data-theme="5">커플</span>
           				</div>
       				</div>
   				</div>
				<div class="view-container">
					<div class="view-frame-box">
						<p>인천공항 (Incheon International Airport, ICN)</p>
						<div class="view-frame">
							<p>이름은 들어봤겠지? 대표적인 라면 맛집 이치란! 사실 킨류 vs 이치란 vs 잇푸도 중 고민하다가 선택한 곳이었다. 한국인의 입맛에 정말 딱인듯! 일본라멘 특유의 구수~한(?) 냄새가 싫다면, 맛은 담백, 마늘 1쪽, 비법소스를 3~4배쯤 첨가하길! 본인의 취향껏 주문서를 작성할 수 있어 더 좋다! 해장용으로도 으뜸! Tip. 도톤보리 다리 밑 매장은 늘 줄이 기니 거기서 20m가량 떨어진 분점으로 가면 웨이팅 없이 먹을 수 있다.</p>
							<div class="view-frame-photo">
								<img alt="게시물사진" src="../../../../images/2.jpg">
							</div>
							<div class="view-info">
								<ul>
									<li>인천공항</li>
									<li><span>KRW</span> <span>190,000</span></li>
									<li>인천공항,공항,인천</li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</section>
		</div>
	</main>
</body>
</html>