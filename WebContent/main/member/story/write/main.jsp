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
			<a id="logo" href="../../../main.html"><img alt="로고" src="../../../../images/logo.png" height="60px;"></a>
			<nav>
				<h1 class="hidden">메인메뉴</h1>
				<ul class="menu-hor menu-main">
					<li><a href="../../plan/newplan/new-plan.html">계획하기</a></li>
					<li><a href="main.html">기록하기</a></li>
					<li><a href="#">여행기</a></li>
					<li><a href="#">커뮤니티</a></li>
				</ul>
				<h1 class="hidden">로그인메뉴</h1>
				<ul class="menu-hor menu-login">
					<li><a href="#">로그인</a></li>
					<li><a href="#">회원가입</a></li>
				</ul>
			</nav>
		</div>
	</header>
	<div id="visual">
		<div class="root-container">
			<input class="title-box" type="text" maxlength="40" placeholder="여행 타이틀을 작성하세요 :)">
			<a id="btn-cover" href="#">커버교체</a>
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
							<img alt="장소이미지" src="../../../../resources/small_visual.jpg">
						</div>
						
						<div class="place-frame">
							<p>인천공항</p>
						</div>
						<div class="place-btn-container">
							<script type="text/javascript">
							function doPopupopen() {
							   window. open("detail.html","게시물입력폼","resizable=no scrollbars=no menubar=no toolbar=no location=no directories=no status=no width=800 height=500");
							}
							</script>
							<a href="#"><img alt="삭제" src="../../../../images/delete.png"></a>
							<a href="#" onclick="doPopupopen()"  onfocus='this.blur()'><img alt="편집" src="../../../../images/write.png"></a>
						</div>
					</div>
					<div class="place-add">
						<div class="large-loca"></div>
						<a href=# onclick="doPopupopen()" onfocus='this.blur()'>장소추가</a>
					</div>
					<div class="card-frame">
						<div class="image-frame">
							<img alt="장소이미지" src="../../../../resources/small_visual.jpg">
						</div>
						
						<div class="place-frame">
							<p>인천공항</p>
						</div>
						<div class="place-btn-container">
							<a href="#"><img alt="삭제" src="../../../../images/delete.png"></a>
							<a href=# onclick="doPopupopen()" onfocus='this.blur()'><img alt="편집" src="../../../../images/write.png"></a>
						</div>
					</div>
					<div class="place-add">
						<div class="large-loca"></div>
						<a href=# onclick="doPopupopen()" onfocus='this.blur()'>장소추가</a>					
					</div>
					<div class="card-frame">
						<div class="image-frame">
							<img alt="장소이미지" src="../../../../resources/small_visual.jpg">
						</div>
						<div class="place-frame">
							<p>인천공항</p>
						</div>
						<div class="place-btn-container">
							<a href="#"><img alt="삭제" src="../../../../images/delete.png"></a>
							<a href=# onclick="doPopupopen()" onfocus='this.blur()'><img alt="편집" src="../../../../images/write.png"></a>
						</div>
					</div>
					<div class="place-add">
						<div class="large-loca"></div>
						<a href=# onclick="doPopupopen()" onfocus='this.blur()'>장소추가</a>					
					</div>
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
           				</div>           				<div class="line">
           				</div>
       				</div>
   				</div>
				<div class="view-container">
					<div class="view-frame-box">
						<p>인천공항 (Incheon International Airport, ICN)</p>
						<div class="view-frame">
							<p>기내식은 언제 제공하나?</p>
							<p>승무원들은 비행기에 탑승하자마자 기내식을 준비한다. 승객들이 잠들기 전에 식사를 제공하기 위해서다. 보통 비행시간이 8시간 이상의 경우 두 끼, 그 이하는 한 끼를 제공한다. 아침, 점심, 저녁을 기본으로 늦은 아침(Brunch), 늦은 점심(Heavey Snack), 늦은 저녁(Supper) 등으로 나뉜다. 아침이나 늦은 저녁의 경우엔 위에 부담이 적고 소화가 잘되는 메뉴로 구성하고 그 외는 밥과 면류가 포함된 다양한 음식이 나온다.</p>
							<div class="view-frame-photo">
								<img alt="게시물사진" src="../../../../resources/small_visual.jpg">
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