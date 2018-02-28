<%@page import="com.yeogi.jspweb.entity.Nation"%>
<%@page import="com.yeogi.jspweb.dao.jdbc.JdbcNationDao"%>
<%@page import="com.yeogi.jspweb.dao.NationDao"%>
<%@page import="com.yeogi.jspweb.entity.Day"%>
<%@page import="java.util.List"%>
<%@page import="com.yeogi.jspweb.dao.jdbc.JdbcDayDao"%>
<%@page import="com.yeogi.jspweb.dao.DayDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>story main page</title>
<link type="text/css" href="../../../../CSS/story-write.css" rel="stylesheet">
<script src="../../../../js/story-write-select.js"></script>
</head>
<body>
	<header>
		<div class="root-container">
			<a id="logo" href="../../../main.html"><img alt="로고" src="../../../../images/logo.png" height="60px;"></a>
			<nav>
				<h1 class="hidden">메인메뉴</h1>
				<ul class="menu-hor menu-main">
					<li><a href="../../plan/newplan/new-plan.html">계획하기</a></li>
					<li><a class="text-focus" href="select">기록하기</a></li>
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
	<form id="form-select" action="main" method="post">
		<input id="mid" type="hidden" name="mid" value="${sessionScope.mid.id }">
		<div id="visual">
			<h1 class="hidden">visual</h1>
				<div class="root-container">
				
				</div>
		</div>
		<main class="select-main">
			<div class="root-containter">
				<div class="select-container write-default">
					<p class="pointer"> 당신의 여행을 기록하세요!</p>
					<fieldset class="select-field">
						<div>
							<input id="btn-select-new" class="btn btn-focus" type="button" name="btn-select" value="새기록 작성">
							<input id="btn-select-load" class="btn btn-default" type="button" name="btn-select" value="계획 가져오기">
						</div>
					</fieldset>
				</div>
				<div class="select-container write-new" style="visibility: hidden">
					<p class="pointer"> 새 여행기록을 작성해 보세요!</p>
					<fieldset class="select-field">
						<div>
							<label for="select-title">제목:&nbsp</label>
							<input id="select-title" type="text" name="select-title" maxlength="40" style="width:200px; height:28px;">
						</div>
						<div>
							<label for="select-nation">여행도시:&nbsp</label>
							<select id="select-nation"  name="select-nation" style="height: 28px;">
								<c:forEach var="nl" items="${nationList}">
        						<option>${nl.nation}</option>
        						</c:forEach>
							</select>
						</div>
						<div>
							<label for="select-start-date">여행시작일:&nbsp</label>
           					<input id="select-start-date" type="date" name="select-start-date" value="2018-02-01" style="height: 24px; margin-left:5px; cursor: pointer;background-color: white;">           					
       					</div>
       					<div>
							<label for="select-end-date">여행종료일:&nbsp</label>
           					<input id="select-end-date" type="date" name="select-end-date" value="2018-02-27" style="height: 24px; margin-left:5px; cursor: pointer;background-color: white;">
       					</div>
       					<div>
							<label for="select-period">여행기간:&nbsp</label>
    						<select id="select-period" name="select-period" style="height: 28px;">
        						<c:forEach var="dl" items="${dayList}">
        						<option>${dl.day}</option>
        						</c:forEach>
        					</select>
        				</div>
						<div>
							<label for="select-companion">여행인원:&nbsp</label>
              				<input type="number" id="select-companion" name="select-companion" min="1" style="width:50px; height: 22px;">
	            		</div>
	            		<div>
							<label for="select-theme">여행테마:&nbsp</label>
							<select id="select-theme"  name="select-theme" style="height: 28px;">
								<option>나홀로 여행</option>
								<option>친구와 함께</option>
								<option>가족과 함께</option>
								<option>단체여행</option>
								<option>패키지 여행</option>
								<option>커플</option>
							</select>
						</div>
						<div>
							<input class="btn btn-focus" type="submit" name="btn-new" value="작성하기">
							<input class="btn btn-default" type="submit" name="btn-new" value="취소">
						</div>
					</fieldset>
				</div>
				<div class="select-container write-plan-load" style="visibility: hidden">
					<p class="pointer"> 여행계획을 참조하여 여행기록을 작성해 보세요!</p>
					<fieldset class="select-field">
						<div>
							<input class="btn btn-focus" type="submit" name="btn-plan-load" value="불러오기">
							<input class="btn btn-default" type="submit" name="btn-plan-load" value="취소">
						</div>
					</fieldset>
				</div>
			</div>
		</main>
	</form>
	<!-- footer 시작------------------------------------------------------------------------------------------------------------ --> 
	
	<footer>
	
		<div class="root-container">
				
				<div id = "footer_logo">
				
					<div id = "footer_bar">
				
					</div>
					
				</div>
				회사정보
				서울특별시 마포구 월드컵북로 21 풍성빌딩 2, 3, 4층 쌍용강북교육센터 <br>
				Tel 02)000-0000 | Fax 02)000-0000<br>
				사업자번호 : 000-00-00000 | 제작 : 여행자들 | 개인정보처리관리책임자 : 김땡땡
				<br><br>
				Copyright (C) 2018 Travelers , ALL Right Reserved 


		</div>
		
	</footer>
</body>
</html>