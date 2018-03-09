<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<HEAD>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../../../../CSS/plan-schdule.css" type=text/css
	rel="stylesheet" />
<script src="../../../../js/plan-side-function.js"></script>
</HEAD>
<body>
	<header id="header">
		<div class="root-container">
			<a href="../../../main.html"><div id="logo">
					<img src="../../../../resources/logo.png" height="65px" alt="여기" />
				</div></a>
			<section>
				<h1>헤더</h1>
				<nav class="hor-menu main-menu first-pad-none">
					<h1>메인메뉴</h1>
					<ul>
						<li><a href="">계획하기</a></li>
						<li><a href="">기록하기</a></li>
						<li><a href="../../../member/story/read/main.html">여행기</a></li>
						<li><a href="../../../public-board/community/community.html">커뮤니티</a></li>
					</ul>
				</nav>

				<nav class="hor-menu member-menu first-pad-none"
					style="margin-bottom: 15px">
					<h1>회원 메뉴</h1>
					<ul>
						<li><a href="../../../log-in.html">로그인</a></li>
						<li><a href="../../../join.html">회원가입</a></li>
						<li><a href="../../mypage/mypage.html" class="btn btn-mypage">마이페이지</a></li>
					</ul>
				</nav>
			</section>
		</div>
	</header>


	<div id="fullscreen">
		<div id="menu-plate">
			<div id="tab">
				<nav>
					<h1>선택옵션</h1>
					<a href=""><div class="search">Search</div></a> <a href=""><div class="basket">Basket</div></a> <a href="../cost/cost"><div class="cost">Cost</div></a> <a href="../schedule/schedule"><div class="calendar">Calendar</div></a>
				</nav>
			</div>

			<div id="trip-name">

				<h1>여행이름정하기</h1>

				<div id="name">여행이름</div>
				<div id="period">여행기간</div>


			</div>

        
        
			<div id="cost-option">
			<div id="printer"><!-- <img src="../../../../images/printer.png" height="25px" align="right"/></div> -->
			</div>
				<div class="total-day">
							<div class="b1"><b>DAY 1</b></div>
							
						<c:forEach var="tppsv" items="${tppsv}">
							<div class="b2">
							    <div class ="when">${tppsv.tourDateTime}</div>
								<div class = "where"> ${tppsv.memoTitle} </div>
								<div class = "count-place">${tppsv.id}</div>
								<div class = "picture"><img src="../../../../images/jeju.png"/></div>
								<div class = "write"><img src="../../../../images/memo-pad.png" height="25px" align="left" margine="100px;"  alt="메모" />${tppsv.memoContent}</div>
							</div>	
						</c:forEach>
				</div>
                
                
				
				<div class="total-day">
							<div class="b1"><b>DAY 2</b></div>
							
							<div class="b2">
							    <div class ="when">08:00</div>
								<div class = "where">도깨비 도로</div>
								<div class = "count-place">4</div>
								<div class = "picture"></div>
								<div class = "write"><img src="../../../../images/memo-pad.png" height="25px" align="left" margine="100px;"  alt="메모" /></div>
							</div>	
				</div>
				
				<div class="total-day">
							
							<div class="b2">
							    <div class ="when">08:00</div>
								<div class = "where">섭지코지</div>
								<div class = "count-place">5</div>
								<div class = "picture"></div>
								<div class = "write"><img src="../../../../images/memo-pad.png" height="25px" align="left" margine="100px;"  alt="메모" /></div>
							</div>	
				</div>
			</div>

        
        
			<a href=""><div id="save-trip">
					<b>Save</b>
				</div></a>
		</div>

		<div id="main">

			<div id="map">
					<a href="" id="add-friend"><!--<div id="add-friend">-->
						<h1>친구추가</h1>
						   <!-- <ul>
						        <li><img src="../../../../images/now-friends.png" height="40px"/>
						        <img src="../../../../images/now-friends.png" height="40px"/><img src="../../../../images/now-friends.png" height="40px"/><img src="../../../../images/now-friends.png" height="40px"/><img src="../../../../images/now-friends.png" height="40px"/></li>
						        
						    </ul>-->
					<!--</div>--></a>
				

				<div id="check-map">
					<a href=""><div class="up"></div></a>
					<div class="center">
						<b>day 1</b>
					</div>
					<a href=""><div class="down"></div></a>
				</div>
			</div>


			<div id="time-table">
				<div id="add-day">
					<h1>DAY추가</h1>
					<a href="#"><div class="left-direct"></div></a>
					<div class="now">
						<b>day<span>1</span></b>
					</div>
					<a href="#"><div class="right-direct"></div></a>
					<div class="year">
						<b>2018년 3월 14일</b>
					</div>
				<div>
					<a href="#"><div class="plus">일정 추가하기</div></a> 
					<a href="#"><div class="minus">해당일정 삭제하기</div></a> 
					<a href="#"><div class="all-minus">전체일정 삭제하기</div></a>
				</div>
				</div>


				
				<div id="schedule">
					<table border="1">
						<thead>
							<tr>

								<td width="100px">[AM]06:00</td>
								<td width="300px">김포공항</td>
								
								<td class="memo-pad" width="100px"><a class="btn-memo" href="#"></a></td>
								<td width="300px">일찍일어나서 공항에서 밥먹으러가자</td>

							</tr>
						</thead>

						<tbody>
							<tr>
								<td>07:00</td>
                                <td><a href=""><img src="../../../../images/plus.png" height="20px" alt="my장소" /> <span style="color: darksalmon">My장소</span></a></td>
								<td class="memo-pad"><a href=""></a></td>
								<td></td>

							</tr>
							<tr>
								<td>08:00</td>
								<td><a href=""><img src="../../../../images/plus.png" height="20px" alt="my장소" /> <span style="color: darksalmon">My장소</span></a></td>
								<td class="memo-pad"><a href=""></a></td>
								<td></td>

							</tr>
							<tr>
								<td>09:00</td>
								<td><a href=""><img src="../../../../images/plus.png" height="20px" alt="my장소" /> <span style="color: darksalmon">My장소</span></a></td>
								<td class="memo-pad"><a href=""></a></td>
								<td></td>

							</tr>
							<tr>
								<td>10:00</td>
								<td><a href=""><img src="../../../../images/plus.png" height="20px" alt="my장소" /> <span style="color: darksalmon">My장소</span></a></td>
								<td class="memo-pad"><a href=""></a></td>
								<td></td>

							</tr>
							<tr>
								<td>11:00</td>
								<td><a href=""><img src="../../../../images/plus.png" height="20px" alt="my장소" /> <span style="color: darksalmon">My장소</span></a></td>
								<td class="memo-pad"><a href=""></a></td>
								<td></td>

							</tr>
							<tr>
								<td>12:00</td>
								<td><a href=""><img src="../../../../images/plus.png" height="20px" alt="my장소" /> <span style="color: darksalmon">My장소</span></a></td>
								<td class="memo-pad"><a href=""></a></td>
								<td></td>

							</tr>
							<tr>
								<td>[PM]01:00</td>
								<td><a href=""><img src="../../../../images/plus.png" height="20px" alt="my장소" /> <span style="color: darksalmon">My장소</span></a></td>
								<td class="memo-pad"><a href=""></a></td>
								<td></td>

							</tr>
							<tr>
								<td>02:00</td>
								<td></td>
								<td class="memo-pad"><a href=""></a></td>
								<td></td>

							</tr>
							<tr>
								<td>03:00</td>
								<td></td>
								<td class="memo-pad"><a href=""></a></td>
								<td></td>

							</tr>
							<tr>
								<td>04:00</td>
								<td></td>
								<td class="memo-pad"><a href=""></a></td>
								<td></td>

							</tr>
							<tr>
								<td>05:00</td>
								<td></td>
								<td class="memo-pad"><a href=""></a></td>
								<td></td>

							</tr>
							<tr>
								<td>06:00</td>
								<td></td>
								<td class="memo-pad"><a href=""></a></td>
								<td></td>

							</tr>
							<tr>
								<td>07:00</td>
								<td></td>
								<td class="memo-pad"><a href=""></a></td>
								<td></td>

							</tr>
							<tr>
								<td>08:00</td>
								<td></td>
								<td class="memo-pad"><a href=""></a></td>
								<td></td>

							</tr>
							<tr>
								<td>09:00</td>
								<td></td>
								<td class="memo-pad"><a href=""></a></td>
								<td></td>

							</tr>
							<tr>
								<td>10:00</td>
								<td></td>
								<td class="memo-pad"><a href=""></a></td>
								<td></td>

							</tr>
							<tr>
								<td>11:00</td>
								<td></td>
								<td class="memo-pad"><a href=""></a></td>
								<td></td>

							</tr>
							<tr>
								<td>[AM]12:00</td>
								<td></td>
								<td class="memo-pad"><a href=""></a></td>
								<td></td>

							</tr>
							<tr>
								<td>1:00</td>
								<td></td>
								<td class="memo-pad"><a href=""></a></td>
								<td></td>

							</tr>
							<tr>
								<td>2:00</td>
								<td></td>
								<td class="memo-pad"><a href=""></a></td>
								<td></td>

							</tr>
							<tr>
								<td>3:00</td>
								<td></td>
								<td class="memo-pad"><a href=""></a></td>
								<td></td>

							</tr>
							<tr>
								<td>4:00</td>
								<td></td>
								<td class="memo-pad"><a href=""></a></td>
								<td></td>

							</tr>
							<tr>
								<td>5:00</td>
								<td></td>
								<td class="memo-pad"><a href=""></a></td>
								<td></td>

							</tr>
						</tbody>
					</table>

				</div>





				<div id="weather">
					<nav>
						<h1>지역 날씨 및 여행경보</h1>

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
						<div class="box7">몰디브 비상사태 선포 관련 신변안전 유의 안내 ○ 몰디브 정부는 몰디브의
							국가 안보와 공공 안전을 위해 2.5(월)부터 향후 15일동안 국가 비상사태를 선포한다고 발표했습니다. ※ 비상사태
							선포로 사전영장 없이 수색, 압수, 체포, 구금이 가능하고 공항에서 수하물 검색이 강화 ○ 이와 관련, 몰디브에
							거주하거나 체류 예정인 우리 국민들께서는 수도 말레섬으로 방문을 자제해 주시고, 불가피하게 방문해야 할 경우에는
							정치적 언행, 현지인들의 데모 및 집회 장소 방문 등을 삼가하여 주시기 바랍니다.</div>
					</nav>
				</div>

			



			</div>
		</div>
	</div>

	<div class="modal">
		<div id="memoscreen">
			<ul>
				<li>06:00</li>
				<li><input type="text" name="" value=""
					placeholder="메모 제목이 무엇이죠? :)" maxlength="100" /></li>
				<li><textarea name="" value=""
						placeholder="여행지에 대해 간단한 메모를 해주세요! :)" maxlength="300" wrap="hard"></textarea></li>
				</ul>
				<div class="verysad">
					<select class="select-place heiwh">
							<option value="서버로 넘길 값">명소</option>
							<option value="서버로 넘길 값">맛집</option>
							<option value="서버로 넘길 값">숙소</option>
							<option value="서버로 넘길 값">교통</option>
							<option value="서버로 넘길 값">쇼핑</option>
							<option value="서버로 넘길 값">기타</option>
					</select>
					<input class="heiwh" type="text" name="" value=""
						placeholder="예산사용 목적은 무엇이죠? :)" maxlength="50"
						style="width: 260px;" />
					<select class="select-money heiwh" style="width: 90px;">
							<option value="서버로 넘길 값">원(KRW)</option>
							<option value="서버로 넘길 값">달러(USD)</option>
							<option value="서버로 넘길 값">위안(CNY)</option>
							<option value="서버로 넘길 값">유로(EUR)</option>
							<option value="서버로 넘길 값">엔(JPY)</option>
					</select>
					<input class ="input-cost" type="text" name="" value=""
						placeholder="금액 입력칸 :)" maxlength="10" style="width: 100px;" /></li>
					<div class="cost-plus heiwh">+</div>
				</div>
			


			<div class ="check">저장</div>
			<div class ="close">취소</div>



		</div>
	</div>
	<div class="modal-friend">
		<<div></div>
		
	</div>
</body>
</html>