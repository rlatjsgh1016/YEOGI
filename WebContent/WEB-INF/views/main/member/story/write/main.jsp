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
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath}" />
<script src="${ctx}/js/story-write-main.js"></script>
<script type="text/javascript" src="http://js.nicedit.com/nicEdit-latest.js"></script> <script type="text/javascript">
//<![CDATA[
        bkLib.onDomLoaded(function() { nicEditors.allTextAreas() });
  //]]>
  </script>

<!-- <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAMXDDT7xUpHdm3onxXFqsP5lF3rKOaZRk&libraries=places">
window.addEventListener("load", function(){
	var map;
	var service;
	var infowindow;
	var googleButton = document.getElementById("btn-google");
	var locationSearch = document.getElementById("search-location");
	
	googleButton.onclick = function() {
	  var pyrmont = new google.maps.LatLng(-33.8665433,151.1956316);
	
	  map = new google.maps.Map(document.getElementById("map"), {
	      center: pyrmont,
	      zoom: 15
	    });
	
	  var request = {
	    location: pyrmont,
	    radius: "500",
	    query: "레스토랑"
	  };
	
	  service = new google.maps.places.PlacesService(map);
	  service.textSearch(request, callback);
	}
	
	function callback(results, status) {
	  if (status == google.maps.places.PlacesServiceStatus.OK) {
	    for (var i = 0; i < results.length; i++) {
	      var place = results[i];
	      createMarker(results[i]);
	    }
	  }
	}
}
</script> -->
	<form id="form-main" method="post" enctype="multipart/form-data">
		<div id="visual">
			<h1 class="hidden">타이틀 입력 필드</h1>
				<div class="root-container">
					<input id="tour-log-id" type="hidden" name="tour-log-id" value="${tourLog.id}">
					<input id="mid" type="hidden" name="mid" value="${tourLog.mid}">
					<input id="title" type="text" maxlength="40" placeholder="여행 타이틀을 작성하세요 :)" value="${tourLog.title}">
					<input id="btn-cover" type="submit" name="btn-main" value="커버교체">
					<input type="hidden" name="cover-img" value="${tourLog.coverImg}">
					<input id="attached-file" type="file" name="attached-file" class="hidden">
				</div>
		</div>
		<main>
			<div class="root-container">
				<section class="left-main">
					<div class="btn-container">
						<div class="first-line-btn">
							<c:if test="${tourLog.lockYN == 'Y'}">
							<p id="lock">현재상태<br>비공개</p>
							</c:if>
							<c:if test="${tourLog.lockYN == 'N'}">
							<p id="unlock">현재상태<br>공개</p>
							</c:if>
						</div>
						<div class="second-line-btn">
							<div>
								<c:if test="${tourLog.lockYN == 'Y'}">
								<input class="btn-main-submit" type="submit" name="btn-main" value="공개 전환">
								</c:if>
								<c:if test="${tourLog.lockYN == 'N'}">
								<input class="btn-main-submit" type="submit" name="btn-main" value="비공개 전환">
								</c:if>
								<input id="lock-yn" type="hidden" name="lock-yn" value="${tourLog.lockYN}">
								<input id="btn-companion" class="btn-main-submit" type="submit" name="btn-main" value="동행자 추가">
							</div>
							<div>
								<input id="btn-save" class="btn-main-submit" type="submit" name="btn-main" value="저장">
								<input class="btn-main-submit" type="reset" name="btn-main" value="취소">
							</div>
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
						<button class="left-arrow" type="button"><img alt="좌측화살표" src="${ctx}/images/left-arrow.png"></button>
						<ul class="ul-day-btn">
						<c:if test="${tourLog.period == 1}">
							<li><button type="button" name="btn-day" value="1">DAY1</button></li>
							<li><span>없음</span></li>
							<li><span>없음</span></li>
						</c:if>
						<c:if test="${tourLog.period == 2}">
							<li><button type="button" name="btn-day" value="1">DAY1</button></li>
							<li><button type="button" name="btn-day" value="2">DAY2</button></li>
							<li><span>없음</span></li>
						</c:if>
						<c:if test="${tourLog.period > 2}">
						<c:forEach var="i" begin="0" end="2">
							<c:if test="${firstDay+i <= tourLog.period}">
							<li><button type="button" name="btn-day" value="${firstDay+i}">DAY${firstDay+i}</button></li>
							</c:if>
						</c:forEach>
						</c:if>
						</ul>
						<button class="right-arrow" type="button"><img alt="우측화살표" src="${ctx}/images/right-arrow.png"></button>
					</div>
					<div class="place-container">
						<c:forEach var="pl" items="${postList}">
						<c:if test="${firstDay == pl.day}">
						<div class="card-frame">
							<div class="image-frame">
								<img alt="장소이미지" src="${pl.img}">
							</div>
							<div class="place-frame">
								<p>${pl.name}</p>
							</div>
							<div class="place-btn-container">
								<button class="btn-place-delete" type="button" ><img alt="삭제" src="${ctx}/images/delete.png"></button>
								<button class="btn-place-edit" type="button" ><img alt="편집" src="${ctx}/images/write.png"></button>
								<input type="hidden" name="post-id" value="${pl.id}">
							</div>
						</div>
						</c:if>
						</c:forEach>
						<div class="place-add">
							<div class="large-loca"></div>
							<button class="btn btn-focus btn-place-add" type="button">장소추가</button>
						</div>
					</div>
				</section>
				<section class="right-main">
	       			<div class="form-container">
	        			<input id="sub-title" class="form-control" type="text" name="sub-title" placeholder="어떤 여행인지 간단히 설명해 주세요 :)" maxlength="300">
	       				<textarea id="memo" class="form-control" name="memo" placeholder="당신의 여행 스토리를 남겨보세요!" maxlength="10000"></textarea>
	       				<div class="tour-log-info">
	           				<div class="tour-log-info-bottom">
	            					<div class="days">
		               					<h6>여행시작일 </h6>
		               					<input id="start-date" type="date" name="start-date" value="${tourLog.startDate}" style="height: 34px; margin-left:5px; cursor: pointer;background-color: white;" required="required">
	            					</div>
	            					<div class="days">
	              						<h6>일</h6>
	              						<select id="period" name="period" style="width:50px; height: 38px;" required="required">	              						     						
	              						<c:forEach var="dl" items="${dayList}">
	              							<option <c:if test="${tourLog.period == dl.day}" >selected="selected"</c:if> value="${dl.day}">
	              								${dl.day}
	              							</option>
	              						</c:forEach>
	              						</select>
	            					</div>
	            					<div class="people">
		               					<h6>명</h6>
		               					<input type="number" id="companion" name="companion" value="${tourLog.companion}" min="1" style="width:50px; height: 32px;" required="required">
	            					</div>
	           				</div>
	           				<div class="nations">
	            					<h6>여행도시</h6>
	         						<select id="select-nation" name="select-nation" style="width:70px; height: 38px;" required="required">
	         							<c:forEach var="nl" items="${nationList}">
	         								<option <c:if test="${tourLog.nation == nl.nation}" >selected="selected"</c:if> value="${nl.nation}">${nl.nation}</option>
	         							</c:forEach>
	         						</select>
	             			</div>
	    					<div id="themes">
	             				<h6>여행테마</h6>
	             				<input type="hidden" name="themes" value="${tourLog.tTheme}">
	             				<button type="button" <c:if test="${tourLog.tTheme == '나홀로 여행'}">class = "selected"</c:if> >나홀로 여행</button>
	             				<button type="button" <c:if test="${tourLog.tTheme == '친구와 함께'}">class = "selected"</c:if> >친구와 함께</button>
	             				<button type="button" <c:if test="${tourLog.tTheme == '가족과 함께'}">class = "selected"</c:if> >가족과 함께</button>
	             				<button type="button" <c:if test="${tourLog.tTheme == '단체 여행'}">class = "selected"</c:if> >단체 여행</button>
	             				<button type="button" <c:if test="${tourLog.tTheme == '패키지 여행'}">class = "selected"</c:if> >패키지 여행</button>
	             				<button type="button" <c:if test="${tourLog.tTheme == '커플 여행'}">class = "selected"</c:if> >커플 여행</button>
	           				</div>
	       				</div>
	   				</div>
					<div class="view-container">
						<c:forEach var="pl" items="${postList}">
						<div class="view-frame-box">
							<p>${pl.name}</p>
							<div class="view-frame">
								<div>${pl.content}</div>
								<div class="view-info">
									<ul>
										<li class="loc-list">${pl.name}</li>
										<c:if test="${!empty spdList}">
										<c:forEach var="spd" items="${spdList}">
										<c:if test="${pl.id == spd.tLogPostId}">
										<li class="spd-list">
											<span>${spd.type}</span>
											<span>${spd.content}</span>
											<span>${spd.unit}</span>
											<span>${spd.amount}</span>
										</li>
										</c:if>
										</c:forEach>
										</c:if>
										<c:if test="${!empty tagList}">
										<li class="tag-list">
										<c:forEach var="tag" items="${tagList}">
										<c:if test="${pl.id == tag.tLogPostId}">
										#${tag.content}
										</c:if>
										</c:forEach>
										</li>
										</c:if>
									</ul>
								</div>
							</div>
						</div>
						</c:forEach>
					</div>
					<div id="detail-post-modal">
						<div class="detail-post-box">
							<div class="detail-title-box">포스트작성</div>
							<div class="detail-form-box">
								<textarea id="post-memo" class="detail-textarea" name="post-memo" rows="15" required="required"></textarea>
								<div class="post-list post-spot">
									<input id="loc-id" type="hidden" name="loc-id" value="2018030700001" required="required"> <!-- api받아와서 입력 -->
									<input id="loc-name" type="text" name="loc-name" value="경복궁" placeholder="장소를 등록해주세요 :)" required="required">	<!-- api받아와서 입력 -->
									<label for="vehicle" >이동수단</label>
									<select id="vehicle" name="vehicle">
										<option value="">선택</option>
										<option value="비행기">비행기</option>
										<option value="기차">기차</option>
										<option value="지하철">지하철</option>	
										<option value="버스">버스</option>
										<option value="도보">도보</option>
										<option value="택시">택시</option>
										<option value="배">배</option>
										<option value="자가용">자가용</option>
									</select>
								</div>
								<div class="post-list post-expense" >
									<select id="spd-type" name="spd-type" required="required" >
										<option value="">지출유형 선택</option>
										<option value="명소">명소</option>
										<option value="맛집">맛집</option>
										<option value="숙소">숙소</option>
										<option value="교통">교통</option>
										<option value="쇼핑">쇼핑</option>
										<option value="기타">기타</option>
									</select>
									<input id="spd-content" type="text" name="spd-content" placeholder="(예)에펠탑 입장료" required="required" >
									<select id="spd-unit" name="spd-unit" required="required" >
										<option value="">화폐단위 선택</option>
										<option value="KRW">KRW(한국)</option>
									</select>
									<input id="spd-amount" type="number" name="spd-amount" placeholder="지출금액 입력" required="required" >
									<button class="btn btn-sm" type="button">추가</button>
									<button class="btn btn-sm" type="button">삭제</button>
								</div>
								<div class="post-list post-tag">
									<input id="tag" type="text" name="tag" pattern="^(*,*)+$" placeholder="태그입력 (예)한국,식당,맛집">
								</div>
								<div class="post-add-button">
									<input id="btn-post" class="btn btn-focus" type="submit" name="btn-post" value="저장">
									<input class="btn btn-default btn-detail-post-box-close" type="reset" value="취소">
								</div>
							</div>
						</div>
					</div>
				</section>
			</div>
		</main>
	</form>