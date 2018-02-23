<%@page import="com.yeogi.jspweb.entity.Nation"%>
<%@page import="com.yeogi.jspweb.dao.jdbc.JdbcNationDao"%>
<%@page import="com.yeogi.jspweb.dao.NationDao"%>
<%@page import="com.yeogi.jspweb.dao.DayDao"%>
<%@page import="com.yeogi.jspweb.entity.TourLog"%>
<%@page import="com.yeogi.jspweb.dao.jdbc.JdbcTourLogDao"%>
<%@page import="com.yeogi.jspweb.dao.jdbc.JdbcDayDao"%>
<%@page import="com.yeogi.jspweb.entity.Day"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	DayDao dayDao = new JdbcDayDao();
	List<Day> dayList = dayDao.getList();
	
	NationDao nationDao = new JdbcNationDao();
	List<Nation> nationList = nationDao.getList();
	
	JdbcTourLogDao tourLogDao = new JdbcTourLogDao();
	List<TourLog> tourLogList = tourLogDao.getList();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>story main page</title>
<link type="text/css" href="../../../../CSS/story-write.css" rel="stylesheet">
<script>
	window.addEventListener("load", function(){
		var btnPlaceAdd = document.getElementsByClassName("btn-place-add");
		var btnPlaceEdit = document.getElementsByClassName("btn-place-edit");
		var btnPlaceDelete = document.getElementsByClassName("btn-place-delete");
		var btnDetailPostBoxClose = document.getElementsByClassName("btn-detail-post-box-close");
		var detailPostBox = document.getElementsByClassName("detail-post-box");
		
		for(var i=0; i<btnPlaceAdd.length; i++){
			btnPlaceAdd[i].onclick = function(){
				for(var i=0; i<detailPostBox.length; i++){
					detailPostBox[i].style.visibility = "visible";
				}
			};
		}
		
		for(var i=0; i<btnPlaceEdit.length; i++){
			btnPlaceEdit[i].onclick = function(){
				for(var i=0; i<detailPostBox.length; i++){
					detailPostBox[i].style.visibility = "visible";
				}
			};
		}
		
		for(var i=0; i<btnDetailPostBoxClose.length; i++){
			btnDetailPostBoxClose[i].onclick = function(){
				for(var i=0; i<detailPostBox.length; i++){
					detailPostBox[i].style.visibility = "hidden";
				}
			};
		}
	});
</script>
</head>
<body>
	<header>
		<div class="root-container">
			<a id="logo" href="../../../main.html"><img alt="로고" src="../../../../images/logo.png" height="60px;"></a>
			<nav>
				<h1 class="hidden">메인메뉴</h1>
				<ul class="menu-hor menu-main">
					<li><a href="../../plan/newplan/new-plan.html">계획하기</a></li>
					<li><a class="text-focus" href="main.jsp">기록하기</a></li>
					<li><a href="../../../public-board/travel-log/log-main/log-main.html">여행기</a></li>
					<li><a href="../../../public-board/community/writing.html">커뮤니티</a></li>
				</ul>
				<h1 class="hidden">로그인메뉴</h1>
				<ul class="menu-hor menu-login">
					<li><a href="../../../log-in.html">로그인</a></li>
					<li><a href="#">회원가입</a></li>
				</ul>
			</nav>
		</div>
	</header>
	<div id="visual">
		<h1 class="hidden">타이틀 입력 필드</h1>
		<div class="root-container">
			<input class="title-box" type="text" maxlength="40" placeholder="여행 타이틀을 작성하세요 :)">
			<a id="btn-cover" href="#">커버교체</a>
		</div>
	</div>
	<main>
		<div class="root-container">
			<section class="left-main">
				<div class="btn-container">
					<div class="first-line-btn">
						<p id="lock">현재상태<br>비공개</p>
						<a class="btn btn-default" href="#">▶공개모드<br>전환</a>
						<a class="btn btn-default" href="#">동행자<br>추가</a>
					</div>
					<div class="second-line-btn">
						<input class="btn btn-lg" type="submit" formaction="main.jsp" value="저장">
						<a class="btn btn-lg" href="#">취소</a>
					</div>
				</div>
				<div class="spending-container" onmouseover="" onclick="">
					<span id="spending-txt">지출내역</span>
					<div class="spending-box">
						<span>KRW</span>
						<span>300,000</span>
					</div>
					<div class="spending-detail">
						<div class="table">
							<div class="tr">
								<div class="td width-sm">명소</div>
								<div class="td width-md">
									<span>KRW</span>
									<span>1000</span>
								</div>
							</div>
							<div class="tr">
								<div class="td width-sm">맛집</div>
								<div class="td width-md">
									<span>KRW</span>
									<span>1000</span>
								</div>
							</div>
							<div class="tr">
								<div class="td width-sm">숙소</div>
								<div class="td width-md">
									<span>KRW</span>
									<span>1000</span>
								</div>
							</div>
							<div class="tr">
								<div class="td width-sm">교통</div>
								<div class="td width-md">
									<span>KRW</span>
									<span>1000</span>
								</div>
							</div>
							<div class="tr">
								<div class="td width-sm">쇼핑</div>
								<div class="td width-md">
									<span>KRW</span>
									<span>1000</span>
								</div>
							</div>
							<div class="tr">
								<div class="td width-sm">기타</div>
								<div class="td width-md">
									<span>KRW</span>
									<span>1000</span>
								</div>
							</div>
						</div>
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
							<a class="btn-place-delete" href="#"><img alt="삭제" src="../../../../images/delete.png"></a>
							<a class="btn-place-edit" href="#"><img alt="편집" src="../../../../images/write.png"></a>
						</div>
					</div>
					<div class="place-add">
						<div class="large-loca"></div>
						<a class="btn btn-focus btn-place-add" href=#>장소추가</a>
					</div>
				</div>
			</section>
			<section class="right-main">
       			<div class="form-container">
	       			<form action="main.jsp">
	        			<input type="text" class="form-control" placeholder="어떤 여행인지 간단히 설명해 주세요 :)" maxlength="300">
	       				<textarea class="form-control" placeholder="당신의 여행 스토리를 남겨보세요!" maxlength="10000"></textarea>
	       				<div class="tour-log-info">
	           				<div class="tour-log-info-bottom">
	            					<div class="days">
		               					<h6>여행시작일 </h6>
		               					<input id="tourStartDay" type="date" value="2018-01-04" style="height: 34px; margin-left:5px; cursor: pointer;background-color: white;">
	            					</div>
	            					<div class="days">
	              						<h6>일</h6>
	              						<select id="id-select-day" name="select-day" style="width:50px; height: 38px;">
	              						<%for(Day d : dayList){ %>
	              							<option><%=d.getDay() %></option>
	              						<%} %>
	              						</select>
	            					</div>
	            					<div class="people">
		               					<h6>명</h6>
		               					<input type="number" id="id-input-people" name="input-people" min="1" style="width:50px; height: 32px;">
	            					</div>
	           				</div>
	           				<div class="nations">
	            					<h6>여행도시</h6>
	         						<select id="id-select-nation" name="select-nation" style="width:70px; height: 38px;">
	         							<%for(Nation n : nationList){ %>
	         							<option><%=n.getNation() %></option>
	         							<%} %>
	         						</select>
	             			</div>
	    					<div class="themes">
	             				<h6>여행테마</h6>
								<span class="selected" data-theme="0">나홀로 여행</span>
								<span class="" data-theme="1">친구와 함께</span>								
								<span class="" data-theme="2">가족과 함께</span>
								<span class="" data-theme="3">단체여행</span>
								<span class="" data-theme="4">패키지 여행</span>
								<span class="" data-theme="5">커플</span>
	           				</div>
	       				</div>
       				</form>
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
				<div class="detail-post-box">
					<div class="detail-title-box">
						<p>포스트작성</p>
						<a href="#" class="btn-detail-post-box-close"><img alt="닫기" src="../../../../images/close-button.png"></a>
					</div>
					<div class="detail-form-box">
						<form action="main.jsp">
							<fieldset>
								<textarea class="detail-textarea" name="review" rows="" cols=""></textarea>
								<div class="detail-position-box">
									<img alt="위치" src="">
									<input type="text" name="location" value="" placeholder="장소를 등록해주세요 :)">
									<label for="vehicle" >이동수단</label>
									<select id="vehicle" name="vehicle">
										<option>비행기</option>
										<option>기차</option>
										<option>지하철</option>	
										<option>버스</option>
										<option>도보</option>
										<option>택시</option>
										<option>배</option>
										<option>자가용</option>
									</select>
								</div>
								<div class="detail-spend">
									<img alt="화폐" src="">
									<select >
										<option>입장료</option>
										<option>식비</option>
										<option>숙박비</option>
										<option>교통비</option>
										<option>기타</option>
									</select>
									<input type="text">
									<select>
										<option>KRW(한국)</option>
										<option></option>
										<option></option>
										<option></option>
										<option></option>
										<option></option>
										<option></option>
										<option></option>
									</select>
									<input type="number">
									<button><img alt="행추가" src=""></button>
									<button><img alt="행삭제" src=""></button>
								</div>
								<div>
									<img alt="태그" src="">
									<input type="text">
								</div>
								<div>
									<button><img alt="사진추가" src=""></button>
									<button type="submit">저장</button>
								</div>
								<div id="map"></div>
							</fieldset>
						</form>
					</div>
				</div>
			</section>
		</div>
	</main>
</body>
</html>