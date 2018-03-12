<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href = "../../../../CSS/search-detail.css"  type="text/css" rel="stylesheet"/>
</head>
<body>

	<header id="header">
		<div class="root-container">
			<h1 id="logo">
				<img src="../../../../images/logo.png" alt="여기" />
			</h1>
			<nav class="hor-menu main-menu first-pad-none">
				<ul>
					<li><a href="">계획하기</a></li>
					<li><a href="">기록하기</a></li>
					<li><a href="">여행기</a></li>
					<li><a href="">커뮤니티</a></li>
				</ul>
			</nav>

			<nav class="hor-menu member-menu first-pad-none">
				<ul>
					<li><a href="">로그인</a></li>
					<li><a href="">회원가입</a></li>
					<li><a href="" class="mypageBtn">마이페이지</a></li>
				</ul>
			</nav>
		</div>	
	</header>

	<div id="body">

			<div id="sub-main">
				<div id="tab">
					<section>
					<ul>
						<li id="search-btn"><a href="">Search</a></li>
						<li id="wishbox-btn"><a href="">Wishbox</a></li>
						<li id="cost-btn"><a href="">Cost</a></li>
						<li id="review-btn"><a href="">Plan</a></li>
						
					</ul>
					
					<ul id="save">
						<li><a href="">Save</a></li>
					</ul>
					</section>
					
				</div>
				
				<div id="search">
					<div id="travel-dayname">
						<p id="travelName">${tourPlan.title}</p>
						<p id="travelDay">${tourPlan.startDate} ~ ${tourPlan.endDate} / ${tourPlan.period}</p>
					</div>
					<div id="search-box">
						<!-- 검색창  -->
						<div id="search-form">
							<form>
							<input type="text" placeholder="지역검색(ex 프랑스, 파리)"/>
							<input class = "button" type = "submit" value = "검색" type="submit" value="검색" />
							</form>
							
							<form>
							<input type="text" placeholder="명소검색(ex 에펠탑, 자유의 여신상)"/>
							<input class = "button" type = "submit" value = "검색" type="submit" value="검색" />
							</form>
						</div>
						
						<!-- 정렬 버튼 -->
						<div id="sort">
							<ul>
								<li><a href="">전체</a></li>
								<li><a href="">명소</a></li>
								<li><a href="">맛집</a></li>
								<li><a href="">숙박</a></li>
							</ul>
						</div>
						
						
						<div id="searched-content">
							검색결과
							<div class="searched-result">
							 	
							 	<div class="searched-pic">
							 	 	
							 	</div>
							 	
							 	<div class="searched-info">
							 	 	
							 	 	<div class="searched-name">
							 	 		에펠탑
							 	 	</div>
							 	 	
							 	 	<div class="wishput-btn">
								 	 	<div class="searched-wish">
								 	 		장바구니(111)
								 	 		담기+
								 	 	</div>
								 	 	<div class="searched-put">
								 	 		일정담기
								 	 	</div>
							 	 	</div>
							 	</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			
			<div id="main">
			<!-- 지도 -->
				 <div id="map">
				  <script>
				      var map;
				      function initMap() {
				        map = new google.maps.Map(document.getElementById('map'), {
				          center: {lat: 37.541, lng: 126.986},
				          zoom: 8
				        });
				      }
				   </script>
				   
				   <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAfcHbvgPNc6lfCcsU7NaG1xc2qO6heLFU&callback=initMap"
    async defer></script>
				 <!-- detail 추가 부분 -->
				 	<div id="plan-detail">
				 		<div class="detail-top">
				 			<p class="back-btn"><a href=""></a></p>
				 			<p class="wishbox-put">담기</p>
				 		</div>
				 		
				 		<div class="detail-img">
					<!-- <p class="detail-pic"></p> -->
				 		</div>
				 		
				 		<div class="detail-name">
				 			<p class="spot-name">에펠탑</p>
				 			<p class="detail-famous">인기도(111)</p>
				 			<p class="timeline-put">계획넣기</p>
				 		</div>
				 		
				 		<div class="detail-info">
				 			에펠 탑은 1889년 파리 마르스 광장에 지어진 탑이다. 프랑스의 대표 건축물인 이 탑은 격자 구조로 이루어져 파리에서 가장 높은 건축물이며, 매년 수백만 명이 방문할 만큼 세계적인 유료 관람지이다. 이를 디자인한 프랑스 공학자 및 건축가 귀스타브 에펠의 이름에서 명칭을 얻었으며, 1889년 프랑스 혁명 100주년 기념 세계 박람회의 출입 관문으로 건축되었다. 에펠 탑은 그 높이가 324 m이며, 이는 81층 높이의 건물과 맞먹는 높이이다
				 		</div>
				 	</div>
				 	<div id="map-right">				 	
					 	<p id="map-friendadd">
					 	</p>
					 	
					 	<div id="check-map">
							<div class="up">
								<a href="" class="btn"></a>
							</div>
							<div class="center">
								<b>day 1</b>
							</div>
							<div class="down"></div>
						</div>
					</div>
				
				 </div>
				 
				 
				
				
				 <div id="table">
				 	<div id="table-control">
				 	
				 	 	<div id="button">
					 	 	<p id="control-leftbtn">
					 	 		<a href=""></a>
					 	 	</p>
					 	 	
					 	 	<p id="control-day">
				 	 			Day1
				 	 		</p>
					 	 	<p id="control-rightbtn">
					 	 		<a href=""></a>
					 	 	</p>
				 	 	</div>
				 	 	
				 	 	<p id="control-date">
				 	 		2018년 1월 5일
				 	 	</p>
				 	 	
				 	 	
				 	 	
				 	 	<p id="control-dayadd">
				 	 		<a href="">Day추가</a>
				 	 	</p>
				 	 	
				 	 	<p id="control-daydelete">
				 	 		<a href="">해당일정 삭제하기</a>
				 	 	</p>
				 	 	
				 	 	<p id="control-alldelete">
				 	 		<a href="">전체일정 삭제하기</a>
				 	 	</p>
				 	</div>
				 	
				 	<div class="table-planFrame">
							<table class="table">
								<tbody>
									<tr>
										<td class="table-time">07:00</td>
										<td class="table-spot">몽마르뜨</td>
										<td class="memo-pad">챙겨라!</td>		
									</tr>
									<tr>
										<td class="table-time">08:00</td>
										<td class="table-spot">개선문</td>
										<td class="memo-pad"></td>		
									</tr>
									<tr>
										<td class="table-time">09:00</td>
										<td class="table-spot">샹제리제거리</td>
										<td class="memo-pad"></td>		
									</tr>
									<tr>
										<td class="table-time">10:00</td>
										<td class="table-spot">르브루</td>
										<td class="memo-pad"></td>		
									</tr>
									
									<tr>
										<td class="table-time">11:00</td>
										<td class="table-spot">공항</td>
										<td class="memo-pad"></td>		
									</tr>
								</tbody>
							</table>
						</div>
				 	
				 	<div id="table-info">
				 		<p id="info-weather">
				 			<a href="">날씨</a>
				 		</p>
				 		
				 		<p id="info-emergency">
				 			경보
				 		</p>
				 	</div>
				 	
				 	
				 </div> 
			</div>
	</div>

</body>
</html>