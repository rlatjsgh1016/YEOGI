<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <c:set var="ctx" value="${pageContext.request.servletContext.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<HEAD>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../../../../CSS/plan-schdule.css" type=text/css
	rel="stylesheet" />
<script src="../../../../js/plan-side-function.js">


</script>
</HEAD>
<body>
	<header id = "header">
			<div class="root-container">
			<a href= "${ctx }/main/main"><h1 id="logo"><img src ="${ctx}/resources/logo.png" height="65px" alt ="여기" /> </h1></a>
	
			<section>
				<h1 class="hidden">헤더</h1>
				
				<nav class="hor-menu main-menu first-pad-none">
					<h1>메인메뉴</h1>
					<ul>

						<li><a href="${ctx }/main/member/plan/newplan/newplan"">계획하기</a></li>
						<li><a href="${ctx }/main/member/story/write/select">기록하기</a></li>
						<li><a href="${ctx }/main/public-board/travel-log/log-main/log-main">여행기</a></li>

						<li><a href="${ctx }/main/public-board/community/communitymain">커뮤니티</a></li>
					</ul>
				</nav>

				<nav class ="hor-menu member-menu first-pad-none" style ="margin-bottom:15px">
					<h1>회원 메뉴</h1>
					<ul>
					<c:if test="${empty sessionScope.id }">
						<li><a href= "${ctx}/main/login">로그인</a></li>
					</c:if> 
					<c:if test="${not empty sessionScope.id }">
						<li><a href= "${ctx}/main/logout">로그아웃</a></li>
					</c:if> 
						<li><a href= "${ctx}/main/join">회원가입</a></li>
						<li><a href ="${ctx}/main/member/mypage/mypage" class ="btn btn-mypage">마이페이지</a></li>
					</ul>
				</nav>	
				
			</section> 
			
		</div>
		
	</header>
	
	<form id="form-select" action="main" method="post">
		<input id="mid" type="hidden" name="mid" value="${sessionScope.mid.id }">

	<div id="fullscreen">
		<div id="menu-plate">
			<div id="tab">
				<nav>
					<h1>선택옵션</h1>
					<a href="${ctx}/main/member/plan/searchplan/search-detail"><div class="search">Search</div></a> <a href=""><div class="basket">Basket</div></a> <a href="${ctx}/main/member/plan/cost/cost"><div class="cost">Cost</div></a> <a href="${ctx}/main/member/plan/schedule/schedule"><div class="calendar">Calendar</div></a><a href="#" id="add-friend"></a>
				</nav>
			</div>

			<div id="trip-name">

				<h1>여행이름정하기</h1>

				<div id="name">여행이름</div>
				<div id="period">여행기간</div>


			</div>

        
        
			<div id="cost-option">
			<div id="printer">
			</div>
				<div class="total-day">
							<div class="b1"><b>DAY 1</b></div>
							
						<c:forEach var="tppsv" items="${tppsv}">
							<div class="b2">
							    <div class ="when">${tppsv.tourDateTime}</div>
								<div class = "where"> ${tppsv.memoTitle} </div>
								<div class = "count-place"></div>
								<div class = "picture"><img src="../../../../images/jeju.png"/></div>
								<div class = "write"><img src="../../../../images/memo-pad.png" height="25px" align="left" margine="100px;"  alt="메모" />${tppsv.memoContent}</div>
							</div>	
						</c:forEach>
				</div>
			</div>



		<a href=""><div id="save-trip">
				<b>Save</b>
			</div></a>
	</div>

		<div id="main">

			<div id="map">
					
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
								
								<td width="100px">06:00</td>
								<td width="300px"></td>
								
								<td class="memo-pad" width="100px"><a class="btn-memo" href="#"></a></td>
								<td width="300px"></td>

							</tr>
						</thead>

						<tbody>
							<tr>
								<td width="100px">07:00</td>
								<td width="300px"></td>
								
								<td class="memo-pad" width="100px"><a class="btn-memo" href="#"></a></td>
								<td width="300px"></td>


							</tr>
							<tr>
								<td width="100px">08:00</td>
								<td width="300px"></td>
								
								<td class="memo-pad" width="100px"><a class="btn-memo" href="#"></a></td>
								<td width="300px"></td>

							</tr>
							<tr>
								<td width="100px">09:00</td>
								<td width="300px"></td>
								
								<td class="memo-pad" width="100px"><a class="btn-memo" href="#"></a></td>
								<td width="300px"></td>

							</tr>
							<tr>
								<td width="100px">10:00</td>
								<td width="300px"></td>
								
								<td class="memo-pad" width="100px"><a class="btn-memo" href="#"></a></td>
								<td width="300px"></td>

							</tr>
							<tr>
								<td width="100px">11:00</td>
								<td width="300px"></td>
								
								<td class="memo-pad" width="100px"><a class="btn-memo" href="#"></a></td>
								<td width="300px"></td>

							</tr>
							<tr>
								<td width="100px">12:00</td>
								<td width="300px"></td>
								
								<td class="memo-pad" width="100px"><a class="btn-memo" href="#"></a></td>
								<td width="300px"></td>

							</tr>
							<tr>
								<td width="100px">13:00</td>
								<td width="300px"></td>
								
								<td class="memo-pad" width="100px"><a class="btn-memo" href="#"></a></td>
								<td width="300px"></td>

							</tr>
							<tr>
								<td width="100px">14:00</td>
								<td width="300px"></td>
								
								<td class="memo-pad" width="100px"><a class="btn-memo" href="#"></a></td>
								<td width="300px"></td>

							</tr>
							<tr>
								<td width="100px">15:00</td>
								<td width="300px"></td>
								
								<td class="memo-pad" width="100px"><a class="btn-memo" href="#"></a></td>
								<td width="300px"></td>

							</tr>
							<tr>
								<td width="100px">16:00</td>
								<td width="300px"></td>
								
								<td class="memo-pad" width="100px"><a class="btn-memo" href="#"></a></td>
								<td width="300px"></td>

							</tr>
							<tr>
								<td width="100px">17:00</td>
								<td width="300px"></td>
								
								<td class="memo-pad" width="100px"><a class="btn-memo" href="#"></a></td>
								<td width="300px"></td>

							</tr>
							<tr>
								<td width="100px">18:00</td>
								<td width="300px"></td>
								
								<td class="memo-pad" width="100px"><a class="btn-memo" href="#"></a></td>
								<td width="300px"></td>

							</tr>
							<tr>
								<td width="100px">19:00</td>
								<td width="300px"></td>
								
								<td class="memo-pad" width="100px"><a class="btn-memo" href="#"></a></td>
								<td width="300px"></td>

							</tr>
							<tr>
								<td width="100px">20:00</td>
								<td width="300px"></td>
								
								<td class="memo-pad" width="100px"><a class="btn-memo" href="#"></a></td>
								<td width="300px"></td>

							</tr>
							<tr>
								<td width="100px">21:00</td>
								<td width="300px"></td>
								
								<td class="memo-pad" width="100px"><a class="btn-memo" href="#"></a></td>
								<td width="300px"></td>

							</tr>
							<tr>
								<td width="100px">22:00</td>
								<td width="300px"></td>
								
								<td class="memo-pad" width="100px"><a class="btn-memo" href="#"></a></td>
								<td width="300px"></td>

							</tr>
							<tr>
								<td width="100px">23:00</td>
								<td width="300px"></td>
								
								<td class="memo-pad" width="100px"><a class="btn-memo" href="#"></a></td>
								<td width="300px"></td>

							</tr>
							<tr>
								<td width="100px">24:00</td>
								<td width="300px"></td>
								
								<td class="memo-pad" width="100px"><a class="btn-memo" href="#"></a></td>
								<td width="300px"></td>

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

			

	<%-- <input id="tour-plan-id" type="hidden" name="tour-plan-id" value="${tp[0].id}">
	<input id="tour-plan-loc-id" type="hidden" name="tour-plan-loc-id" value="${tpl[0].id}"> --%> 


			</div>
		</div>
	</div>
	

<form method="post">
	<div class="modal">
		<div id="memoscreen">
			<ul>
				<li><input type="hidden" name="time" value="06:00" />06:00</li>
				<li><input id="memo-title" type="text" name="memo-title" 
					placeholder="메모 제목이 무엇이죠? :)" maxlength="50" required/></li>
				<li><textarea name="memo-content" 
						placeholder="여행지에 대해 간단한 메모를 해주세요! :)" maxlength="300" wrap="hard"></textarea></li>
			</ul>
			<div class="verysad">
				<select name="type" class="select-place heiwh">
					<option value="명소">명소</option>
					<option value="맛집">맛집</option>
					<option value="숙소">숙소</option>
					<option value="교통">교통</option>
					<option value="쇼핑">쇼핑</option>
					<option value="기타">기타</option>
				</select> 
				<input class="heiwh" type="text" name="memo-cost-spd"
					placeholder="예산사용 목적은 무엇이죠? :)" maxlength="50"
					style="width: 260px;" /> 
				<select name="unit" class="select-money heiwh"
					style="width: 90px;">
					<option value="KRW">원(KRW)</option>
					<option value="USD">달러(USD)</option>
					<option value="CNY">위안(CNY)</option>
					<option value="EUR">유로(EUR)</option>
					<option value="JPY">엔(JPY)</option>
				</select> 
				<input class="input-cost" type="text" name="input-cost"
					placeholder="금액 입력칸 :)" maxlength="10" style="width: 100px;" />
			</div>
				<span class="cost-minus"><b>━</b></span>
				<span class="cost-plus"><b>┼</b></span>
			<div class=addedFormDiv></div><BR>


			<div class="mok">
				<input type="submit" class="check" value="저장" />
				<div class="close">취소</div>
			</div>


		</div>
	</div>
</form>

<form method="post">
	<div class="modal">
		<div id="memoscreen">
			<ul>
				<li><input type="hidden" name="time" value="07:00" />07:00</li>
				<li><input id="memo-title" type="text" name="memo-title" 
					placeholder="메모 제목이 무엇이죠? :)" maxlength="50" required/></li>
				<li><textarea name="memo-content" 
						placeholder="여행지에 대해 간단한 메모를 해주세요! :)" maxlength="300" wrap="hard"></textarea></li>
			</ul>
			<div class="verysad">
				<select name="type" class="select-place heiwh">
					<option value="명소">명소</option>
					<option value="맛집">맛집</option>
					<option value="숙소">숙소</option>
					<option value="교통">교통</option>
					<option value="쇼핑">쇼핑</option>
					<option value="기타">기타</option>
				</select> 
				<input class="heiwh" type="text" name="memo-cost-spd"
					placeholder="예산사용 목적은 무엇이죠? :)" maxlength="50"
					style="width: 260px;" /> 
				<select name="unit" class="select-money heiwh"
					style="width: 90px;">
					<option value="KRW">원(KRW)</option>
					<option value="USD">달러(USD)</option>
					<option value="CNY">위안(CNY)</option>
					<option value="EUR">유로(EUR)</option>
					<option value="JPY">엔(JPY)</option>
				</select> 
				<input class="input-cost" type="text" name="input-cost"
					placeholder="금액 입력칸 :)" maxlength="10" style="width: 100px;" />
			</div>
				<span class="cost-minus"><b>━</b></span>
				<span class="cost-plus"><b>┼</b></span>
			<div class=addedFormDiv></div><BR>


			<div class="mok">
				<input type="submit" class="check" value="저장" />
				<div class="close">취소</div>
			</div>


		</div>
	</div>
</form>

<form method="post">
	<div class="modal">
		<div id="memoscreen">
			<ul>
				<li><input type="hidden" name="time" value="08:00" />08:00</li>
				<li><input id="memo-title" type="text" name="memo-title" 
					placeholder="메모 제목이 무엇이죠? :)" maxlength="50" required/></li>
				<li><textarea name="memo-content" 
						placeholder="여행지에 대해 간단한 메모를 해주세요! :)" maxlength="300" wrap="hard"></textarea></li>
			</ul>
			<div class="verysad">
				<select name="type" class="select-place heiwh">
					<option value="명소">명소</option>
					<option value="맛집">맛집</option>
					<option value="숙소">숙소</option>
					<option value="교통">교통</option>
					<option value="쇼핑">쇼핑</option>
					<option value="기타">기타</option>
				</select> 
				<input class="heiwh" type="text" name="memo-cost-spd"
					placeholder="예산사용 목적은 무엇이죠? :)" maxlength="50"
					style="width: 260px;" /> 
				<select name="unit" class="select-money heiwh"
					style="width: 90px;">
					<option value="KRW">원(KRW)</option>
					<option value="USD">달러(USD)</option>
					<option value="CNY">위안(CNY)</option>
					<option value="EUR">유로(EUR)</option>
					<option value="JPY">엔(JPY)</option>
				</select> 
				<input class="input-cost" type="text" name="input-cost"
					placeholder="금액 입력칸 :)" maxlength="10" style="width: 100px;" />
			</div>
				<span class="cost-minus"><b>━</b></span>
				<span class="cost-plus"><b>┼</b></span>
			<div class=addedFormDiv></div><BR>


			<div class="mok">
				<input type="submit" class="check" value="저장" />
				<div class="close">취소</div>
			</div>


		</div>
	</div>
</form>

<form method="post">
	<div class="modal">
		<div id="memoscreen">
			<ul>
				<li><input type="hidden" name="time" value="09:00" />09:00</li>
				<li><input id="memo-title" type="text" name="memo-title" 
					placeholder="메모 제목이 무엇이죠? :)" maxlength="50" required/></li>
				<li><textarea name="memo-content" 
						placeholder="여행지에 대해 간단한 메모를 해주세요! :)" maxlength="300" wrap="hard"></textarea></li>
			</ul>
			<div class="verysad">
				<select name="type" class="select-place heiwh">
					<option value="명소">명소</option>
					<option value="맛집">맛집</option>
					<option value="숙소">숙소</option>
					<option value="교통">교통</option>
					<option value="쇼핑">쇼핑</option>
					<option value="기타">기타</option>
				</select> 
				<input class="heiwh" type="text" name="memo-cost-spd"
					placeholder="예산사용 목적은 무엇이죠? :)" maxlength="50"
					style="width: 260px;" /> 
				<select name="unit" class="select-money heiwh"
					style="width: 90px;">
					<option value="KRW">원(KRW)</option>
					<option value="USD">달러(USD)</option>
					<option value="CNY">위안(CNY)</option>
					<option value="EUR">유로(EUR)</option>
					<option value="JPY">엔(JPY)</option>
				</select> 
				<input class="input-cost" type="text" name="input-cost"
					placeholder="금액 입력칸 :)" maxlength="10" style="width: 100px;" />
			</div>
				<span class="cost-minus"><b>━</b></span>
				<span class="cost-plus"><b>┼</b></span>
			<div class=addedFormDiv></div><BR>


			<div class="mok">
				<input type="submit" class="check" value="저장" />
				<div class="close">취소</div>
			</div>


		</div>
	</div>
</form>

<form method="post">
	<div class="modal">
		<div id="memoscreen">
			<ul>
				<li><input type="hidden" name="time" value="10:00" />10:00</li>
				<li><input id="memo-title" type="text" name="memo-title" 
					placeholder="메모 제목이 무엇이죠? :)" maxlength="50" required/></li>
				<li><textarea name="memo-content" 
						placeholder="여행지에 대해 간단한 메모를 해주세요! :)" maxlength="300" wrap="hard"></textarea></li>
			</ul>
			<div class="verysad">
				<select name="type" class="select-place heiwh">
					<option value="명소">명소</option>
					<option value="맛집">맛집</option>
					<option value="숙소">숙소</option>
					<option value="교통">교통</option>
					<option value="쇼핑">쇼핑</option>
					<option value="기타">기타</option>
				</select> 
				<input class="heiwh" type="text" name="memo-cost-spd"
					placeholder="예산사용 목적은 무엇이죠? :)" maxlength="50"
					style="width: 260px;" /> 
				<select name="unit" class="select-money heiwh"
					style="width: 90px;">
					<option value="KRW">원(KRW)</option>
					<option value="USD">달러(USD)</option>
					<option value="CNY">위안(CNY)</option>
					<option value="EUR">유로(EUR)</option>
					<option value="JPY">엔(JPY)</option>
				</select> 
				<input class="input-cost" type="text" name="input-cost"
					placeholder="금액 입력칸 :)" maxlength="10" style="width: 100px;" />
			</div>
				<span class="cost-minus"><b>━</b></span>
				<span class="cost-plus"><b>┼</b></span>
			<div class=addedFormDiv></div><BR>


			<div class="mok">
				<input type="submit" class="check" value="저장" />
				<div class="close">취소</div>
			</div>


		</div>
	</div>
</form>

<form method="post">
	<div class="modal">
		<div id="memoscreen">
			<ul>
				<li><input type="hidden" name="time" value="11:00" />11:00</li>
				<li><input id="memo-title" type="text" name="memo-title" 
					placeholder="메모 제목이 무엇이죠? :)" maxlength="50" required/></li>
				<li><textarea name="memo-content" 
						placeholder="여행지에 대해 간단한 메모를 해주세요! :)" maxlength="300" wrap="hard"></textarea></li>
			</ul>
			<div class="verysad">
				<select name="type" class="select-place heiwh">
					<option value="명소">명소</option>
					<option value="맛집">맛집</option>
					<option value="숙소">숙소</option>
					<option value="교통">교통</option>
					<option value="쇼핑">쇼핑</option>
					<option value="기타">기타</option>
				</select> 
				<input class="heiwh" type="text" name="memo-cost-spd"
					placeholder="예산사용 목적은 무엇이죠? :)" maxlength="50"
					style="width: 260px;" /> 
				<select name="unit" class="select-money heiwh"
					style="width: 90px;">
					<option value="KRW">원(KRW)</option>
					<option value="USD">달러(USD)</option>
					<option value="CNY">위안(CNY)</option>
					<option value="EUR">유로(EUR)</option>
					<option value="JPY">엔(JPY)</option>
				</select> 
				<input class="input-cost" type="text" name="input-cost"
					placeholder="금액 입력칸 :)" maxlength="10" style="width: 100px;" />
			</div>
				<span class="cost-minus"><b>━</b></span>
				<span class="cost-plus"><b>┼</b></span>
			<div class=addedFormDiv></div><BR>


			<div class="mok">
				<input type="submit" class="check" value="저장" />
				<div class="close">취소</div>
			</div>


		</div>
	</div>
</form>

<form method="post">
	<div class="modal">
		<div id="memoscreen">
			<ul>
				<li><input type="hidden" name="time" value="12:00" />12:00</li>
				<li><input id="memo-title" type="text" name="memo-title" 
					placeholder="메모 제목이 무엇이죠? :)" maxlength="50" required/></li>
				<li><textarea name="memo-content" 
						placeholder="여행지에 대해 간단한 메모를 해주세요! :)" maxlength="300" wrap="hard"></textarea></li>
			</ul>
			<div class="verysad">
				<select name="type" class="select-place heiwh">
					<option value="명소">명소</option>
					<option value="맛집">맛집</option>
					<option value="숙소">숙소</option>
					<option value="교통">교통</option>
					<option value="쇼핑">쇼핑</option>
					<option value="기타">기타</option>
				</select> 
				<input class="heiwh" type="text" name="memo-cost-spd"
					placeholder="예산사용 목적은 무엇이죠? :)" maxlength="50"
					style="width: 260px;" /> 
				<select name="unit" class="select-money heiwh"
					style="width: 90px;">
					<option value="KRW">원(KRW)</option>
					<option value="USD">달러(USD)</option>
					<option value="CNY">위안(CNY)</option>
					<option value="EUR">유로(EUR)</option>
					<option value="JPY">엔(JPY)</option>
				</select> 
				<input class="input-cost" type="text" name="input-cost"
					placeholder="금액 입력칸 :)" maxlength="10" style="width: 100px;" />
			</div>
				<span class="cost-minus"><b>━</b></span>
				<span class="cost-plus"><b>┼</b></span>
			<div class=addedFormDiv></div><BR>


			<div class="mok">
				<input type="submit" class="check" value="저장" />
				<div class="close">취소</div>
			</div>


		</div>
	</div>
</form>

<form method="post">
	<div class="modal">
		<div id="memoscreen">
			<ul>
				<li><input type="hidden" name="time" value="13:00" />13:00</li>
				<li><input id="memo-title" type="text" name="memo-title" 
					placeholder="메모 제목이 무엇이죠? :)" maxlength="50" required/></li>
				<li><textarea name="memo-content" 
						placeholder="여행지에 대해 간단한 메모를 해주세요! :)" maxlength="300" wrap="hard"></textarea></li>
			</ul>
			<div class="verysad">
				<select name="type" class="select-place heiwh">
					<option value="명소">명소</option>
					<option value="맛집">맛집</option>
					<option value="숙소">숙소</option>
					<option value="교통">교통</option>
					<option value="쇼핑">쇼핑</option>
					<option value="기타">기타</option>
				</select> 
				<input class="heiwh" type="text" name="memo-cost-spd"
					placeholder="예산사용 목적은 무엇이죠? :)" maxlength="50"
					style="width: 260px;" /> 
				<select name="unit" class="select-money heiwh"
					style="width: 90px;">
					<option value="KRW">원(KRW)</option>
					<option value="USD">달러(USD)</option>
					<option value="CNY">위안(CNY)</option>
					<option value="EUR">유로(EUR)</option>
					<option value="JPY">엔(JPY)</option>
				</select> 
				<input class="input-cost" type="text" name="input-cost"
					placeholder="금액 입력칸 :)" maxlength="10" style="width: 100px;" />
			</div>
				<span class="cost-minus"><b>━</b></span>
				<span class="cost-plus"><b>┼</b></span>
			<div class=addedFormDiv></div><BR>


			<div class="mok">
				<input type="submit" class="check" value="저장" />
				<div class="close">취소</div>
			</div>


		</div>
	</div>
</form>

<form method="post">
	<div class="modal">
		<div id="memoscreen">
			<ul>
				<li><input type="hidden" name="time" value="14:00" />14:00</li>
				<li><input id="memo-title" type="text" name="memo-title" 
					placeholder="메모 제목이 무엇이죠? :)" maxlength="50" required/></li>
				<li><textarea name="memo-content" 
						placeholder="여행지에 대해 간단한 메모를 해주세요! :)" maxlength="300" wrap="hard"></textarea></li>
			</ul>
			<div class="verysad">
				<select name="type" class="select-place heiwh">
					<option value="명소">명소</option>
					<option value="맛집">맛집</option>
					<option value="숙소">숙소</option>
					<option value="교통">교통</option>
					<option value="쇼핑">쇼핑</option>
					<option value="기타">기타</option>
				</select> 
				<input class="heiwh" type="text" name="memo-cost-spd"
					placeholder="예산사용 목적은 무엇이죠? :)" maxlength="50"
					style="width: 260px;" /> 
				<select name="unit" class="select-money heiwh"
					style="width: 90px;">
					<option value="KRW">원(KRW)</option>
					<option value="USD">달러(USD)</option>
					<option value="CNY">위안(CNY)</option>
					<option value="EUR">유로(EUR)</option>
					<option value="JPY">엔(JPY)</option>
				</select> 
				<input class="input-cost" type="text" name="input-cost"
					placeholder="금액 입력칸 :)" maxlength="10" style="width: 100px;" />
			</div>
				<span class="cost-minus"><b>━</b></span>
				<span class="cost-plus"><b>┼</b></span>
			<div class=addedFormDiv></div><BR>


			<div class="mok">
				<input type="submit" class="check" value="저장" />
				<div class="close">취소</div>
			</div>


		</div>
	</div>
</form>

<form method="post">
	<div class="modal">
		<div id="memoscreen">
			<ul>
				<li><input type="hidden" name="time" value="15:00" />15:00</li>
				<li><input id="memo-title" type="text" name="memo-title" 
					placeholder="메모 제목이 무엇이죠? :)" maxlength="50" required/></li>
				<li><textarea name="memo-content" 
						placeholder="여행지에 대해 간단한 메모를 해주세요! :)" maxlength="300" wrap="hard"></textarea></li>
			</ul>
			<div class="verysad">
				<select name="type" class="select-place heiwh">
					<option value="명소">명소</option>
					<option value="맛집">맛집</option>
					<option value="숙소">숙소</option>
					<option value="교통">교통</option>
					<option value="쇼핑">쇼핑</option>
					<option value="기타">기타</option>
				</select> 
				<input class="heiwh" type="text" name="memo-cost-spd"
					placeholder="예산사용 목적은 무엇이죠? :)" maxlength="50"
					style="width: 260px;" /> 
				<select name="unit" class="select-money heiwh"
					style="width: 90px;">
					<option value="KRW">원(KRW)</option>
					<option value="USD">달러(USD)</option>
					<option value="CNY">위안(CNY)</option>
					<option value="EUR">유로(EUR)</option>
					<option value="JPY">엔(JPY)</option>
				</select> 
				<input class="input-cost" type="text" name="input-cost"
					placeholder="금액 입력칸 :)" maxlength="10" style="width: 100px;" />
			</div>
				<span class="cost-minus"><b>━</b></span>
				<span class="cost-plus"><b>┼</b></span>
			<div class=addedFormDiv></div><BR>


			<div class="mok">
				<input type="submit" class="check" value="저장" />
				<div class="close">취소</div>
			</div>


		</div>
	</div>
</form>

<form method="post">
	<div class="modal">
		<div id="memoscreen">
			<ul>
				<li><input type="hidden" name="time" value="16:00" />16:00</li>
				<li><input id="memo-title" type="text" name="memo-title" 
					placeholder="메모 제목이 무엇이죠? :)" maxlength="50" required/></li>
				<li><textarea name="memo-content" 
						placeholder="여행지에 대해 간단한 메모를 해주세요! :)" maxlength="300" wrap="hard"></textarea></li>
			</ul>
			<div class="verysad">
				<select name="type" class="select-place heiwh">
					<option value="명소">명소</option>
					<option value="맛집">맛집</option>
					<option value="숙소">숙소</option>
					<option value="교통">교통</option>
					<option value="쇼핑">쇼핑</option>
					<option value="기타">기타</option>
				</select> 
				<input class="heiwh" type="text" name="memo-cost-spd"
					placeholder="예산사용 목적은 무엇이죠? :)" maxlength="50"
					style="width: 260px;" /> 
				<select name="unit" class="select-money heiwh"
					style="width: 90px;">
					<option value="KRW">원(KRW)</option>
					<option value="USD">달러(USD)</option>
					<option value="CNY">위안(CNY)</option>
					<option value="EUR">유로(EUR)</option>
					<option value="JPY">엔(JPY)</option>
				</select> 
				<input class="input-cost" type="text" name="input-cost"
					placeholder="금액 입력칸 :)" maxlength="10" style="width: 100px;" />
			</div>
				<span class="cost-minus"><b>━</b></span>
				<span class="cost-plus"><b>┼</b></span>
			<div class=addedFormDiv></div><BR>


			<div class="mok">
				<input type="submit" class="check" value="저장" />
				<div class="close">취소</div>
			</div>


		</div>
	</div>
</form>

<form method="post">
	<div class="modal">
		<div id="memoscreen">
			<ul>
				<li><input type="hidden" name="time" value="17:00" />17:00</li>
				<li><input id="memo-title" type="text" name="memo-title" 
					placeholder="메모 제목이 무엇이죠? :)" maxlength="50" required/></li>
				<li><textarea name="memo-content" 
						placeholder="여행지에 대해 간단한 메모를 해주세요! :)" maxlength="300" wrap="hard"></textarea></li>
			</ul>
			<div class="verysad">
				<select name="type" class="select-place heiwh">
					<option value="명소">명소</option>
					<option value="맛집">맛집</option>
					<option value="숙소">숙소</option>
					<option value="교통">교통</option>
					<option value="쇼핑">쇼핑</option>
					<option value="기타">기타</option>
				</select> 
				<input class="heiwh" type="text" name="memo-cost-spd"
					placeholder="예산사용 목적은 무엇이죠? :)" maxlength="50"
					style="width: 260px;" /> 
				<select name="unit" class="select-money heiwh"
					style="width: 90px;">
					<option value="KRW">원(KRW)</option>
					<option value="USD">달러(USD)</option>
					<option value="CNY">위안(CNY)</option>
					<option value="EUR">유로(EUR)</option>
					<option value="JPY">엔(JPY)</option>
				</select> 
				<input class="input-cost" type="text" name="input-cost"
					placeholder="금액 입력칸 :)" maxlength="10" style="width: 100px;" />
			</div>
				<span class="cost-minus"><b>━</b></span>
				<span class="cost-plus"><b>┼</b></span>
			<div class=addedFormDiv></div><BR>


			<div class="mok">
				<input type="submit" class="check" value="저장" />
				<div class="close">취소</div>
			</div>


		</div>
	</div>
</form>

<form method="post">
	<div class="modal">
		<div id="memoscreen">
			<ul>
				<li><input type="hidden" name="time" value="18:00" />18:00</li>
				<li><input id="memo-title" type="text" name="memo-title" 
					placeholder="메모 제목이 무엇이죠? :)" maxlength="50" required/></li>
				<li><textarea name="memo-content" 
						placeholder="여행지에 대해 간단한 메모를 해주세요! :)" maxlength="300" wrap="hard"></textarea></li>
			</ul>
			<div class="verysad">
				<select name="type" class="select-place heiwh">
					<option value="명소">명소</option>
					<option value="맛집">맛집</option>
					<option value="숙소">숙소</option>
					<option value="교통">교통</option>
					<option value="쇼핑">쇼핑</option>
					<option value="기타">기타</option>
				</select> 
				<input class="heiwh" type="text" name="memo-cost-spd"
					placeholder="예산사용 목적은 무엇이죠? :)" maxlength="50"
					style="width: 260px;" /> 
				<select name="unit" class="select-money heiwh"
					style="width: 90px;">
					<option value="KRW">원(KRW)</option>
					<option value="USD">달러(USD)</option>
					<option value="CNY">위안(CNY)</option>
					<option value="EUR">유로(EUR)</option>
					<option value="JPY">엔(JPY)</option>
				</select> 
				<input class="input-cost" type="text" name="input-cost"
					placeholder="금액 입력칸 :)" maxlength="10" style="width: 100px;" />
			</div>
				<span class="cost-minus"><b>━</b></span>
				<span class="cost-plus"><b>┼</b></span>
			<div class=addedFormDiv></div><BR>


			<div class="mok">
				<input type="submit" class="check" value="저장" />
				<div class="close">취소</div>
			</div>


		</div>
	</div>
</form>

<form method="post">
	<div class="modal">
		<div id="memoscreen">
			<ul>
				<li><input type="hidden" name="time" value="19:00" />19:00</li>
				<li><input id="memo-title" type="text" name="memo-title" 
					placeholder="메모 제목이 무엇이죠? :)" maxlength="50" required/></li>
				<li><textarea name="memo-content" 
						placeholder="여행지에 대해 간단한 메모를 해주세요! :)" maxlength="300" wrap="hard"></textarea></li>
			</ul>
			<div class="verysad">
				<select name="type" class="select-place heiwh">
					<option value="명소">명소</option>
					<option value="맛집">맛집</option>
					<option value="숙소">숙소</option>
					<option value="교통">교통</option>
					<option value="쇼핑">쇼핑</option>
					<option value="기타">기타</option>
				</select> 
				<input class="heiwh" type="text" name="memo-cost-spd"
					placeholder="예산사용 목적은 무엇이죠? :)" maxlength="50"
					style="width: 260px;" /> 
				<select name="unit" class="select-money heiwh"
					style="width: 90px;">
					<option value="KRW">원(KRW)</option>
					<option value="USD">달러(USD)</option>
					<option value="CNY">위안(CNY)</option>
					<option value="EUR">유로(EUR)</option>
					<option value="JPY">엔(JPY)</option>
				</select> 
				<input class="input-cost" type="text" name="input-cost"
					placeholder="금액 입력칸 :)" maxlength="10" style="width: 100px;" />
			</div>
				<span class="cost-minus"><b>━</b></span>
				<span class="cost-plus"><b>┼</b></span>
			<div class=addedFormDiv></div><BR>


			<div class="mok">
				<input type="submit" class="check" value="저장" />
				<div class="close">취소</div>
			</div>


		</div>
	</div>
</form>

<form method="post">
	<div class="modal">
		<div id="memoscreen">
			<ul>
				<li><input type="hidden" name="time" value="20:00" />20:00</li>
				<li><input id="memo-title" type="text" name="memo-title" 
					placeholder="메모 제목이 무엇이죠? :)" maxlength="50" required/></li>
				<li><textarea name="memo-content" 
						placeholder="여행지에 대해 간단한 메모를 해주세요! :)" maxlength="300" wrap="hard"></textarea></li>
			</ul>
			<div class="verysad">
				<select name="type" class="select-place heiwh">
					<option value="명소">명소</option>
					<option value="맛집">맛집</option>
					<option value="숙소">숙소</option>
					<option value="교통">교통</option>
					<option value="쇼핑">쇼핑</option>
					<option value="기타">기타</option>
				</select> 
				<input class="heiwh" type="text" name="memo-cost-spd"
					placeholder="예산사용 목적은 무엇이죠? :)" maxlength="50"
					style="width: 260px;" /> 
				<select name="unit" class="select-money heiwh"
					style="width: 90px;">
					<option value="KRW">원(KRW)</option>
					<option value="USD">달러(USD)</option>
					<option value="CNY">위안(CNY)</option>
					<option value="EUR">유로(EUR)</option>
					<option value="JPY">엔(JPY)</option>
				</select> 
				<input class="input-cost" type="text" name="input-cost"
					placeholder="금액 입력칸 :)" maxlength="10" style="width: 100px;" />
			</div>
				<span class="cost-minus"><b>━</b></span>
				<span class="cost-plus"><b>┼</b></span>
			<div class=addedFormDiv></div><BR>


			<div class="mok">
				<input type="submit" class="check" value="저장" />
				<div class="close">취소</div>
			</div>


		</div>
	</div>
</form>

<form method="post">
	<div class="modal">
		<div id="memoscreen">
			<ul>
				<li><input type="hidden" name="time" value="21:00" />21:00</li>
				<li><input id="memo-title" type="text" name="memo-title" 
					placeholder="메모 제목이 무엇이죠? :)" maxlength="50" required/></li>
				<li><textarea name="memo-content" 
						placeholder="여행지에 대해 간단한 메모를 해주세요! :)" maxlength="300" wrap="hard"></textarea></li>
			</ul>
			<div class="verysad">
				<select name="type" class="select-place heiwh">
					<option value="명소">명소</option>
					<option value="맛집">맛집</option>
					<option value="숙소">숙소</option>
					<option value="교통">교통</option>
					<option value="쇼핑">쇼핑</option>
					<option value="기타">기타</option>
				</select> 
				<input class="heiwh" type="text" name="memo-cost-spd"
					placeholder="예산사용 목적은 무엇이죠? :)" maxlength="50"
					style="width: 260px;" /> 
				<select name="unit" class="select-money heiwh"
					style="width: 90px;">
					<option value="KRW">원(KRW)</option>
					<option value="USD">달러(USD)</option>
					<option value="CNY">위안(CNY)</option>
					<option value="EUR">유로(EUR)</option>
					<option value="JPY">엔(JPY)</option>
				</select> 
				<input class="input-cost" type="text" name="input-cost"
					placeholder="금액 입력칸 :)" maxlength="10" style="width: 100px;" />
			</div>
				<span class="cost-minus"><b>━</b></span>
				<span class="cost-plus"><b>┼</b></span>
			<div class=addedFormDiv></div><BR>


			<div class="mok">
				<input type="submit" class="check" value="저장" />
				<div class="close">취소</div>
			</div>


		</div>
	</div>
</form>

<form method="post">
	<div class="modal">
		<div id="memoscreen">
			<ul>
				<li><input type="hidden" name="time" value="22:00" />22:00</li>
				<li><input id="memo-title" type="text" name="memo-title" 
					placeholder="메모 제목이 무엇이죠? :)" maxlength="50" required/></li>
				<li><textarea name="memo-content" 
						placeholder="여행지에 대해 간단한 메모를 해주세요! :)" maxlength="300" wrap="hard"></textarea></li>
			</ul>
			<div class="verysad">
				<select name="type" class="select-place heiwh">
					<option value="명소">명소</option>
					<option value="맛집">맛집</option>
					<option value="숙소">숙소</option>
					<option value="교통">교통</option>
					<option value="쇼핑">쇼핑</option>
					<option value="기타">기타</option>
				</select> 
				<input class="heiwh" type="text" name="memo-cost-spd"
					placeholder="예산사용 목적은 무엇이죠? :)" maxlength="50"
					style="width: 260px;" /> 
				<select name="unit" class="select-money heiwh"
					style="width: 90px;">
					<option value="KRW">원(KRW)</option>
					<option value="USD">달러(USD)</option>
					<option value="CNY">위안(CNY)</option>
					<option value="EUR">유로(EUR)</option>
					<option value="JPY">엔(JPY)</option>
				</select> 
				<input class="input-cost" type="text" name="input-cost"
					placeholder="금액 입력칸 :)" maxlength="10" style="width: 100px;" />
			</div>
				<span class="cost-minus"><b>━</b></span>
				<span class="cost-plus"><b>┼</b></span>
			<div class=addedFormDiv></div><BR>


			<div class="mok">
				<input type="submit" class="check" value="저장" />
				<div class="close">취소</div>
			</div>


		</div>
	</div>
</form>

<form method="post">
	<div class="modal">
		<div id="memoscreen">
			<ul>
				<li><input type="hidden" name="time" value="23:00" />23:00</li>
				<li><input id="memo-title" type="text" name="memo-title" 
					placeholder="메모 제목이 무엇이죠? :)" maxlength="50" required/></li>
				<li><textarea name="memo-content" 
						placeholder="여행지에 대해 간단한 메모를 해주세요! :)" maxlength="300" wrap="hard"></textarea></li>
			</ul>
			<div class="verysad">
				<select name="type" class="select-place heiwh">
					<option value="명소">명소</option>
					<option value="맛집">맛집</option>
					<option value="숙소">숙소</option>
					<option value="교통">교통</option>
					<option value="쇼핑">쇼핑</option>
					<option value="기타">기타</option>
				</select> 
				<input class="heiwh" type="text" name="memo-cost-spd"
					placeholder="예산사용 목적은 무엇이죠? :)" maxlength="50"
					style="width: 260px;" /> 
				<select name="unit" class="select-money heiwh"
					style="width: 90px;">
					<option value="KRW">원(KRW)</option>
					<option value="USD">달러(USD)</option>
					<option value="CNY">위안(CNY)</option>
					<option value="EUR">유로(EUR)</option>
					<option value="JPY">엔(JPY)</option>
				</select> 
				<input class="input-cost" type="text" name="input-cost"
					placeholder="금액 입력칸 :)" maxlength="10" style="width: 100px;" />
			</div>
				<span class="cost-minus"><b>━</b></span>
				<span class="cost-plus"><b>┼</b></span>
			<div class=addedFormDiv></div><BR>


			<div class="mok">
				<input type="submit" class="check" value="저장" />
				<div class="close">취소</div>
			</div>


		</div>
	</div>
</form>

<form method="post">
	<div class="modal">
		<div id="memoscreen">
			<ul>
				<li><input type="hidden" name="time" value="24:00" />24:00</li>
				<li><input id="memo-title" type="text" name="memo-title" 
					placeholder="메모 제목이 무엇이죠? :)" maxlength="50" required/></li>
				<li><textarea name="memo-content" 
						placeholder="여행지에 대해 간단한 메모를 해주세요! :)" maxlength="300" wrap="hard"></textarea></li>
			</ul>
			<div class="verysad">
				<select name="type" class="select-place heiwh">
					<option value="명소">명소</option>
					<option value="맛집">맛집</option>
					<option value="숙소">숙소</option>
					<option value="교통">교통</option>
					<option value="쇼핑">쇼핑</option>
					<option value="기타">기타</option>
				</select> 
				<input class="heiwh" type="text" name="memo-cost-spd"
					placeholder="예산사용 목적은 무엇이죠? :)" maxlength="50"
					style="width: 260px;" /> 
				<select name="unit" class="select-money heiwh"
					style="width: 90px;">
					<option value="KRW">원(KRW)</option>
					<option value="USD">달러(USD)</option>
					<option value="CNY">위안(CNY)</option>
					<option value="EUR">유로(EUR)</option>
					<option value="JPY">엔(JPY)</option>
				</select> 
				<input class="input-cost" type="text" name="input-cost"
					placeholder="금액 입력칸 :)" maxlength="10" style="width: 100px;" />
			</div>
				<span class="cost-minus"><b>━</b></span>
				<span class="cost-plus"><b>┼</b></span>
			<div class=addedFormDiv></div><BR>


			<div class="mok">
				<input type="submit" class="check" value="저장" />
				<div class="close">취소</div>
			</div>


		</div>
	</div>
</form>



		<form name="check-form" id="#" method="post">
			<div class="modal-friend">
				<div id="add-friend-screen">
					<div class="add-friend-title">
						<b>친구와 멋진 여행을 <span style="color: red">함께 계획 </span> 해보세요! :)
						</b>
					</div>
					<div class="">
						<div class="friend-list fbox">
							<div class="friend-list-inside">내 친구 전체 목록</div>
							<div class="inside">
								<p>
									<input type="checkbox" name="checked-friend" id="c1"
										value="김대신" /> <label for="c1">김대신</label>
								</p>
								<p>
									<input type="checkbox" name="checked-friend" id="c2"
										value="김수경" /> <label for="c2">김수경</label>
								</p>
								<p>
									<input type="checkbox" name="checked-friend" id="c3"
										value="김선호" /> <label for="c3">김선호</label>
								</p>
								<p>
									<input type="checkbox" name="checked-friend" id="c4"
										value="이자호" /> <label for="c4">장민규</label>
								</p>
								<p>
									<input type="checkbox" name="checked-friend" id="c5"
										value="박제욱" /> <label for="c5">이자호</label>
								</p>
								<p>
									<input type="checkbox" name="checked-friend" id="c6"
										value="박제욱" /> <label for="c5">박제욱</label>
								</p>
							</div>
							<div>
								<input class="addition-friend" type="button" value="추가하기" />
							</div>
						</div>
						<div class="friend-wait fbox">

							<div class="friend-list-inside">응답을 기다리는 친구</div>
							<div class="inside">
								<div style="margin: 15px;" class="wait-box"></div>



							</div>
						</div>
						<div class="friend-with fbox">
							<div class="friend-list-inside">계획을 공유중인 친구</div>
							<div class="inside"></div>
						</div>
					</div>
					<div class="last-box">
						<div class="confirm btn-default">요청</div>
						<div class="close1 btn-default">취소</div>
					</div>
				</div>
			</div>
		</form>




		<script>
      var map;
      function initMap() {
        map = new google.maps.Map(document.getElementById('map'), {
          center: {lat: -34.397, lng: 150.644},
          zoom: 8
        });
      }
    </script>
	<!-- <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCbdcRTYQHPv9vVwlE2dQMohUzxAGrf0gM&callback=initMap"
    async defer></script> -->
	</body>
	
</html>