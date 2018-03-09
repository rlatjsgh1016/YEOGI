<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href = "../../../../CSS/search-plan.css"  type="text/css" rel="stylesheet"/>
</head>
<body>
	<header id="header">
		<div class="root-container">
			<h1 id="logo">
				<a href="../../../main.html"><img src="../../../../images/logo.png" height="65px" alt="여기" /></a>
			</h1>
			<nav class="hor-menu main-menu first-pad-none">
				<ul>
					<li><a href="">계획하기</a></li>
					<li><a href="../../story/write/main.jsp">기록하기</a></li>
					<li><a href="../../../public-board/travel-log/log-main/log-main.html">여행기</a></li>
					<li><a href="">커뮤니티</a></li>
				</ul>
			</nav>

			<nav class="hor-menu member-menu first-pad-none">
				<ul>
					<li><a href="../../../log-in.html">로그인</a></li>
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
						<li id="wishbox-btn"><a href="../wishbox/wishbox.html">Wishbox</a></li>
						<li id="cost-btn"><a href="../cost/cost.html">Cost</a></li>
						<li id="review-btn"><a href="../schedule/schedule.html">Plan</a></li>
						
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
					
						<!-- 검색창  -->
			<div id="search-form">
						<div id="search-box">
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
							
							<div id="print">검색결과</div>
							<div class="searched-result">
							 	
							 	<div class="searched-pic">
							 	 	<img style="width:120px; height:150px;" src="http://cfs3.blog.daum.net/image/7/blog/2007/07/27/21/08/46a9dff4d049d&filename=%EC%A0%9C%EB%AA%A9%20%EC%97%86%EC%9D%8C33222.bmp">
							 	</div>
							 	
							 	<div class="searched-info">
							 	 	
							 	 	<div class="searched-name">
							 	 		
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
	</div>
	
	<div id="main">
			<!-- 지도 -->
			<input id="pac-input" class="controls" type="text" placeholder="지역검색(ex 프랑스, 파리)"/>
				<div id="map"></div>

				<!--클릭했을 때 나오는 박스 -->
				 <div id="infowindow-content">
			      <span id="place-name"  class="title"></span><br>
			      Place ID <span id="place-id"></span><br>
			      <span id="place-address"></span>
			      </div>

				
				 	<!-- <div id="map-right">				 	
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
					</div> -->
				
				 
				 
				 
				
				
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
	
	<script>
					// This sample uses the Place Autocomplete widget to allow the user to search
					// for and select a place. The sample then displays an info window containing
					// the place ID and other information about the place that the user has
					// selected.

					// This example requires the Places library. Include the libraries=places
					// parameter when you first load the API. For example:
					// <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_API_KEY&libraries=places">

					function initMap() {	
						var map = new google.maps.Map(document.getElementById('map'), {
							center : {lat : 37.56,  lng : 126.97},
							zoom : 13
						});

						var input = document.getElementById('pac-input');
						
						//자동완성기능
						var autocomplete = new google.maps.places.Autocomplete(input);
						autocomplete.bindTo('bounds', map);

						map.controls[google.maps.ControlPosition.TOP_LEFT].push(input);

						var infowindow = new google.maps.InfoWindow();
						var marker = new google.maps.Marker({
							map : map
						});
						//태그 눌렀을 때 반응
						marker.addListener('click', function() {
							infowindow.open(map, marker);
						});

						autocomplete.addListener('place_changed', function() {
							infowindow.close();
							var place = autocomplete.getPlace();
							if (!place.geometry) {
								return;
							}

							if (place.geometry.viewport) {
								map.fitBounds(place.geometry.viewport);
							} else {
								map.setCenter(place.geometry.location);
								map.setZoom(17);
							}

							// Set the position of the marker using the place ID and location.
							marker.setPlace({
										placeId : place.place_id,
										location : place.geometry.location
									});
							marker.setVisible(true);
							



							//사진
							// var API = "AIzaSyAfcHbvgPNc6lfCcsU7NaG1xc2qO6heLFU";
							//var PR = place.photos[0].photo_reference;
							
							// document.querySelector('.searched-pic img').src =
							// "https://maps.googleapis.com/maps/api/place/photo?maxwidth=120&photoreference="+PR+"&key=AIzaSyAfcHbvgPNc6lfCcsU7NaG1xc2qO6heLFU";
							var printDiv = document.querySelector("#print");
							
							printDiv.textContent = place.photos[0].photo_reference;
							//해당 장소 이름, 아이디, 주소, 뿌려준다
							document.querySelector(".searched-name").textContent = place.name;

							document.getElementById('place-name').textContent = place.name;
							document.getElementById('place-id').textContent = place.place_id;
							document.getElementById('place-address').textContent = place.formatted_address;
							infowindow.setContent(document.getElementById('infowindow-content'));
							infowindow.open(map, marker);
							
						});
					}
				</script>
				<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAfcHbvgPNc6lfCcsU7NaG1xc2qO6heLFU&callback=initMap&libraries=places" async defer></script>
				
</body>
</html>

