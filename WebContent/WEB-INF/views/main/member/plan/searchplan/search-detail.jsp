<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath}" />
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
					<li><a href="${ctx }/main/member/plan/newplan/newplan">계획하기</a></li>
						<li><a href="${ctx }/main/member/story/write/select">기록하기</a></li>
						<li><a href="${ctx }/main/public-board/travel-log/log-main/log-main">여행기</a></li>

						<li><a href="${ctx }/main/public-board/community/communitymain">커뮤니티</a></li>
				</ul>
			</nav>

			<nav class="hor-menu member-menu first-pad-none">
				<ul>
					<c:if test="${empty sessionScope.id }">
						<li><a href= "${ctx}/main/login">로그인</a></li>
					</c:if> 
					<c:if test="${not empty sessionScope.id }">
						<li><a href= "${ctx}/main/login">로그아웃</a></li>
					</c:if> 
					<li><a href= "${ctx}/main/join">회원가입</a></li>
						<li><a href ="${ctx}/main/member/mypage/mypage" class ="btn btn-mypage">마이페이지</a></li>
				</ul>
			</nav>
		</div>	
	</header>

	<div id="body">

			<div id="sub-main">
				<div id="tab">
					<section>
					
					<ul>
						<li id="search-btn"><a href="${ctx}/main/member/plan/searchplan/search-detail">Search</a></li>
						<li id="wishbox-btn"><a href="">Wishbox</a></li>
						<li id="cost-btn"><a href="${ctx}/main/member/plan/cost/cost">Cost</a></li>
						<li id="review-btn"><a href="${ctx}/main/member/plan/schedule/schedule">Plan</a></li>
						
					</ul>
					
					<ul id="save">
						<li><a href="">Save</a></li>
					</ul>
					</section>
					
				</div>
				
				<div id="search">
					<div id="travel-dayname">
						<p id="travelName">'${tourPlan.title}'</p>
						<p id="travelDay">${tourPlan.startDate} ~ ${tourPlan.endDate} <br> 총 ${tourPlan.period-1}박 ${tourPlan.period}일</p>
					</div>
				<form id="data-form" method="post">
					<div id="search-box">
						<div id="plan-detail">
					 		<div class="detail-top">
					 			<p class="back-btn"><a href=""></a></p>
					 			
								 <input class="put-table-btn" type="button" name ="addLocation" value="일정담기+"/>
								 <select id="time-selector" name="time">
									
									<option>07:00</option>
									<option>08:00</option>
									<option>09:00</option>
									<option>10:00</option>
									<option>11:00</option>
									<option>12:00</option>
									<option>13:00</option>
									<option>14:00</option>
									<option>15:00</option>
									<option>16:00</option>
									<option>17:00</option>
									<option>18:00</option>
									<option>19:00</option>
									<option>20:00</option>
									<option>21:00</option>
									<option>22:00</option>
									<option>23:00</option>
									<option>00:00</option>
									<option>01:00</option>
								 </select>
							</div>
					 		
					 	<!-- 	<div class="detail-img">
						<p class="detail-pic"></p>
					 		</div> -->
					 		
					 		<div class="detail-name">
					 			<p class="spot-name"></p>
								 <!-- <p class="detail-famous">인기도(111)</p> -->
								 <input class="put-wishbox-btn" type="button" name ="addWish" value="장바구니+"/>
					 		</div>
					 		
					 		<div class="detail-info">
					 			
					 		</div>
					 	</div>
					</div>
				</form>
				</div>
			</div>
			
			<div id="main">
				<!--추가-->
				<input id="pac-input" class="controls" type="text" placeholder="지역검색(ex 프랑스, 파리)"/>
			<!-- 지도 -->
				 <div id="map"></div>
				 <div id="infowindow-content">
						
					<img id="photo-place" src="" style="width:100px;"/>
			
					<span id="place-name"  class="title"></span><br>
					<span id="place-id"></span><br>
					<span id="place-address"></span>
					<span id="place-type"></span>
				</div>
				 <!-- detail 추가 부분 -->
				 	
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
					</div>
				 -->
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
								${tourPlan.startDate}
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
										<td class="table-spot"></td>
										<td class="memo-imgbox"><a id="memo-img" href="#"></a></td>
										<td class="memo-pad"></td>
									</tr>
									<tr>
										<td class="table-time">08:00</td>
										<td class="table-spot"></td>
										<td class="memo-imgbox"><a id="memo-img" href="#"></a></td>
										<td class="memo-pad"></td>
									</tr>
									<tr>
										<td class="table-time">09:00</td>
										<td class="table-spot"></td>
										<td class="memo-imgbox"><a id="memo-img" href="#"></a></td>
										<td class="memo-pad"></td>
									</tr>
									<tr>
										<td class="table-time">10:00</td>
										<td class="table-spot"></td>
										<td class="memo-imgbox"><a id="memo-img" href="#"></a></td>
										<td class="memo-pad"></td>
									</tr>
		
									<tr>
										<td class="table-time">11:00</td>
										<td class="table-spot"></td>
										<td class="memo-imgbox"><a id="memo-img" href="#"></a></td>
										<td class="memo-pad"></td>
									</tr>
									
									<tr>
										<td class="table-time">12:00</td>
										<td class="table-spot"></td>
										<td class="memo-imgbox"><a id="memo-img" href="#"></a></td>
										<td class="memo-pad"></td>
									</tr>
									
									<tr>
										<td class="table-time">13:00</td>
										<td class="table-spot"></td>
										<td class="memo-imgbox"><a id="memo-img" href="#"></a></td>
										<td class="memo-pad"></td>
									</tr>
									
									<tr>
										<td class="table-time">14:00</td>
										<td class="table-spot"></td>
										<td class="memo-imgbox"><a id="memo-img" href="#"></a></td>
										<td class="memo-pad"></td>
									</tr>
									
									<tr>
										<td class="table-time">15:00</td>
										<td class="table-spot"></td>
										<td class="memo-imgbox"><a id="memo-img" href="#"></a></td>
										<td class="memo-pad"></td>
									</tr>
									
									<tr>
										<td class="table-time">16:00</td>
										<td class="table-spot"></td>
										<td class="memo-imgbox"><a id="memo-img" href="#"></a></td>
										<td class="memo-pad"></td>
									</tr>
									
									<tr>
										<td class="table-time">17:00</td>
										<td class="table-spot"></td>
										<td class="memo-imgbox"><a id="memo-img" href="#"></a></td>
										<td class="memo-pad"></td>
									</tr>
									
									<tr>
										<td class="table-time">18:00</td>
										<td class="table-spot"></td>
										<td class="memo-imgbox"><a id="memo-img" href="#"></a></td>
										<td class="memo-pad"></td>
									</tr>
									
									<tr>
										<td class="table-time">19:00</td>
										<td class="table-spot"></td>
										<td class="memo-imgbox"><a id="memo-img" href="#"></a></td>
										<td class="memo-pad"></td>
									</tr>
									
									<tr>
										<td class="table-time">20:00</td>
										<td class="table-spot"></td>
										<td class="memo-imgbox"><a id="memo-img" href="#"></a></td>
										<td class="memo-pad"></td>
									</tr>
									
									<tr>
										<td class="table-time">21:00</td>
										<td class="table-spot"></td>
										<td class="memo-imgbox"><a id="memo-img" href="#"></a></td>
										<td class="memo-pad"></td>
									</tr>
									
									<tr>
										<td class="table-time">22:00</td>
										<td class="table-spot"></td>
										<td class="memo-imgbox"><a id="memo-img" href="#"></a></td>
										<td class="memo-pad"></td>
									</tr>
									
									<tr>
										<td class="table-time">23:00</td>
										<td class="table-spot"></td>
										<td class="memo-imgbox"><a id="memo-img" href="#"></a></td>
										<td class="memo-pad"></td>
									</tr>
									
									<tr>
										<td class="table-time">00:00</td>
										<td class="table-spot"></td>
										<td class="memo-imgbox"><a id="memo-img" href="#"></a></td>
										<td class="memo-pad"></td>
									</tr>
									
									<tr>
										<td class="table-time">01:00</td>
										<td class="table-spot"></td>
										<td class="memo-imgbox"><a id="memo-img" href="#"></a></td>
										<td class="memo-pad"></td>
									</tr>
									
									
									
									
								</tbody>
							</table>
						</div>

						<div id="table-info">
							<div class="box1">
		                     3월 몰디브에 대하여 <span style="color: red">여기</span>가 드리는 팁! :)
		                  	</div>
						<div class="box2">기상정보</div>
		                  <div class="box3">
		                     평균기온 : 5.1°/11.8°<br> 평균강수량 : 48.5mm/10일
		                  </div>
		                  <div class="box4">옷차림</div>
		                  <div class="box5">옷차림 정보 : 쌀쌀한 기온이므로 가벼운 겉옷과 긴소매 옷을 가져가시면
		                     되겠습니다. 비의 양이 많지는 않으나 한 달 중 열흘정도 비가 오는 기간이므로 우산을 준비하시길 바랍니다.</div>
		                  <div class="box6">경보</div>
		                  <div class="box7">
		                  	 몰디브 비상사태 선포 관련 신변안전 유의 안내 ○ 몰디브 정부는 몰디브의
		                     국가 안보와 공공 안전을 위해 2.5(월)부터 향후 15일동안 국가 비상사태를 선포한다고 발표했습니다. ※ 비상사태
		                     선포로 사전영장 없이 수색, 압수, 체포, 구금이 가능하고 공항에서 수하물 검색이 강화 ○ 이와 관련, 몰디브에
		                     거주하거나 체류 예정인 우리 국민들께서는 수도 말레섬으로 방문을 자제해 주시고, 불가피하게 방문해야 할 경우에는
		                     정치적 언행, 현지인들의 데모 및 집회 장소 방문 등을 삼가하여 주시기 바랍니다.
		                     </div>
						
						 		
						 	</div>
						
						
					</div> 
				 
				 
				
				

			</div>
	</div>


<script>

			//DB 저장할 내용들
			var resultId;
			var resultName;
			var resultNation;
			var resultImg;
			var resultDetail;
			var resultAddress;
			var resultType;
		
			//변환을 위한 변수
			var formData = document.querySelector("#data-form");
			var searchedName = document.querySelector(".spot-name");
			var putTableButton = document.querySelector(".put-table-btn");
			var timeSelector = document.querySelector("#time-selector");
		function initMap() {
			var map = new google.maps.Map(document.getElementById('map'), {
				center : {
					lat : 37.56,
					lng : 126.97
				},
				zoom : 13
			});
			var input = /** @type {!HTMLInputElement} */
			(document.getElementById('pac-input'));
		
			map.controls[google.maps.ControlPosition.TOP_LEFT].push(input);
		
			var autocomplete = new google.maps.places.Autocomplete(input);
			autocomplete.bindTo('bounds', map);
		
			var infowindow = new google.maps.InfoWindow();
			var marker = new google.maps.Marker({
				map : map,
				anchorPoint : new google.maps.Point(0, -29)
			});
		
			autocomplete.addListener('place_changed',
							function() {
								infowindow.close();
								marker.setVisible(false);
								var place = autocomplete.getPlace();
								if (!place.geometry) {
									// User entered the name of a Place that was not suggested and
									// pressed the Enter key, or the Place Details request failed.
									window.alert("No details available for input: '"
													+ place.name + "'");
									return;
								}
		
								// If the place has a geometry, then present it on a map.
								if (place.geometry.viewport) {
									map.fitBounds(place.geometry.viewport);
								} else {
									map.setCenter(place.geometry.location);
									map.setZoom(17); // Why 17? Because it looks good.
								}
								marker.setIcon(/** @type {google.maps.Icon} */
								({
									url : place.icon,
									size : new google.maps.Size(71, 71),
									origin : new google.maps.Point(0, 0),
									anchor : new google.maps.Point(17, 34),
									scaledSize : new google.maps.Size(35, 35)
								}));
								marker.setPosition(place.geometry.location);
								marker.setVisible(true);
								var formatAddress = place.formatted_address;
								var placeId = place.place_id;
								var placeName = place.name;
								var address = '';
								if (place.address_components) {
									address = [
											(place.address_components[0]
													&& place.address_components[0].short_name || ''),
											(place.address_components[1]
													&& place.address_components[1].short_name || ''),
											(place.address_components[2]
													&& place.address_components[2].short_name || '') ]
											.join(' ');
								}
		
								infowindow.setContent('<div><strong>'
										+ placeName + '</strong><br>'
										+ '주소 : ' + formatAddress + '<br>'
										+ 'id : ' + placeId);
								infowindow.open(map, marker);
								
								
								//sub-main에 띄워주기
								searchedName.textContent = placeName;
		
								//alert(searchedName.textContent);
		
								//변수에 값들 담기
								resultId = place.place_id;
								resultName = place.name;
								resultNation = place.adr_address;
								resultAddress = place.formatted_address;
								//값 담았는지 확인
								// alert();
								// alert(resultId);
								// alert(resultName);
								// alert(resultNation);
		
							});
		
				}
					putTableButton.onclick = function(){
									//값 담은것들 보여주기
									
									/* alert(resultName);
									alert(resultId);
									alert(searchedName.textContent); */
									
									//address substring 나누기
									var addressStartNum = resultNation.indexOf('name') + 6;
									var addressEndNum = resultNation.indexOf('<', addressStartNum);
									var nation = resultNation.substring(addressStartNum,addressEndNum);
									//alert(nation);
									// alert(addressEndNum);
									// alert(resultNation);
									//data append 방식
									var data = new FormData(formData);
									data.append('id', resultId);
									/* data.append('name', resultName);
									data.append('nation', nation);
									data.append('address', resultAddress); */
		
									
									var request = new XMLHttpRequest();
									request.onload = function() {
										if (request.status === 200 || request.status === 201) {
											console.log(request.responseText);
										} else {
											console.error(request.responseText);
										}
									};
									request.open('POST', 'search-detail', true);
									request.send(data); // 폼 데이터 객체 전송
									
		
							};
				
		

	</script>
	<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAfcHbvgPNc6lfCcsU7NaG1xc2qO6heLFU&callback=initMap&libraries=places" async defer></script>
	
</body>
</html>