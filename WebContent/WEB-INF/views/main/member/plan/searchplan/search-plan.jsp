<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
						<p id="travelName">'${tourPlan.title}'</p>
						<p id="travelDay">${tourPlan.startDate} ~ ${tourPlan.endDate} <br> 총 ${tourPlan.period}박 ${tourPlan.period+1}일</p>
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
							
							<%-- <c:if test="${placeId != null}"> --%>
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
											<input class="put-wishbox-btn" type="submit" name ="addWish" value="장바구니+"/>
								 	 	</div>
								 	 	<div class="searched-put">
											<input class="put-table-btn" type="submit" name ="addLocation" value="계획담기+"/>
								 	 	</div>
								 	 	<div class="searched-db">
											<input class="put-db-btn" type="submit" name ="addDb" value="DB담기+"/>
								 	 	</div>
							 	 	</div>
							 	</div>
							</div>
							<%-- </c:if> --%>
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
						
							<img id="photo-place" src="https://maps.googleapis.com/maps/api/place/photo?maxwidth=400&photoreference=CmRaAAAAOXFuuKHROZH1h-SWC2eWPBSnz6viL2_CtoOy9HkqMMCQUFqrUeUpPh-rccmzPnpDudBctvefWVOoVl1Al_WEDovFBPZkzlHqm877x5SZwKAufQBbTTIMsHd5Wik1K5D4EhAkECN5UZ-TE-PdjL8kPPLDGhTE_NtKMiH6D7TToHwRPY9MtAffLA&key=AIzaSyAfcHbvgPNc6lfCcsU7NaG1xc2qO6heLFU" style="width:100px;"/>
					
					 
			      <span id="place-name"  class="title"></span><br>
			       <span id="place-id"></span><br>
			      <span id="place-address"></span>
			      <span id="place-type"></span>
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
								<td class="table-spot">몽마르뜨</td>
								<td class="memo-imgbox"><a id="memo-img" href="#"></a></td>
								<td class="memo-pad">챙겨라!</td>
							</tr>
							<tr>
								<td class="table-time">08:00</td>
								<td class="table-spot">개선문</td>
								<td class="memo-imgbox"><a id="memo-img" href="#"></a></td>
								<td class="memo-pad">챙겨라!</td>
							</tr>
							<tr>
								<td class="table-time">09:00</td>
								<td class="table-spot">샹제리제거리</td>
								<td class="memo-imgbox"><a id="memo-img" href="#"></a></td>
								<td class="memo-pad">챙겨라!</td>
							</tr>
							<tr>
								<td class="table-time">10:00</td>
								<td class="table-spot">르브루</td>
								<td class="memo-imgbox"><a id="memo-img" href="#"></a></td>
								<td class="memo-pad">챙겨라!</td>
							</tr>

							<tr>
								<td class="table-time">11:00</td>
								<td class="table-spot">공항</td>
								<td class="memo-imgbox"><a id="memo-img" href="#"></a></td>
								<td class="memo-pad">챙겨라!</td>
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
			var searchedName = document.querySelector(".searched-name");
			var putDbButton = document.querySelector(".put-db-btn");

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
								alert(searchedName.textContent);

								//변수에 값들 담기
								resultId = place.place_id;
								resultName = place.name;
								resultNation = place.adr_address;
								resultAddress = place.formatted_address;
								//값 담았는지 확인
								alert();
								alert(resultId);
								alert(resultName);
								alert(resultNation);

							});

				}
					putDbButton.onclick = function(){
									//값 담은것들 보여주기
									alert(resultId);
									alert(resultName);
									
									alert(searchedName.textContent);
									
									//address substring 나누기
									var addressStartNum = resultNation.indexOf('name') + 6;
									var addressEndNum = resultNation.indexOf('<', addressStartNum);
									var nation = resultNation.substring(addressStartNum,addressEndNum);
									alert(nation);
									// alert(addressEndNum);
									// alert(resultNation);
									//data append 방식
									var data = new FormData();
									data.append('id', resultId);
									data.append('name', resultName);
									data.append('nation', nation);
									data.append('address', resultAddress);

									//JASON 형식
									/* var dataList = {
											dataId: resultId,
											dataName: resultName,
											dataNation: resultNation
										}; */
									//data.append("", resultId);
									//alert(data.has("id", resultId));
									var request = new XMLHttpRequest();
									request.onload = function() {
										if (request.status === 200 || request.status === 201) {
											console.log(request.responseText);
										} else {
											console.error(request.responseText);
										}
									};
									request.open('POST', 'search-plan', true);
									request.send(data); // 폼 데이터 객체 전송
									/* request.open('POST', 'search-plan');
									request.setRequestHeader('Content-Type', 'application/json'); // 컨텐츠타입을 json으로
									request.send(JSON.stringify(dataList)); // 데이터를 stringify해서 보냄 */
									
									
									
									
									
									// var request = new XMLHttpRequest();
									// request.onload = function(){
										
									// };
									// if(searchedName.textContent != null){
									// 	alert("추가할 장소를 선택해주세요");
									// 	return;
									// }
									// else
									//     alert("아이디를 입력하세요.");

									// var request = new XMLHttpRequest();

									// request.onreadystatechange = function() {
										
									//     if(request.readyState != 4)
									//         return;

									//     var member = JSON.parse(request.responseText);

									//     if(member == null){
									//         alert("사용할 수 있는 아이디입니다.");
									//         check = true;
									//     }
									//     else
									//         alert("이미 "+member.name+"님이 사용중입니다.");
									// };
									
									// request.open("GET", "idcheck?id="+memberId, true);
									// request.send();   
							};

	</script>
	<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAfcHbvgPNc6lfCcsU7NaG1xc2qO6heLFU&callback=initMap&libraries=places" async defer></script>
				
</body>
</html>

