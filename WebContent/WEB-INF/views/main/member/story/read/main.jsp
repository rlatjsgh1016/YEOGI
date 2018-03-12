<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath}"></c:set>

<!-- <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>YEOGI</title>
<link href="../../../../CSS/story-read.css" type="text/css" rel="stylesheet" />
<style type="text/css">
</style>
</head>
<body> -->
	<!-- header id="header">
		<div class="root-container">
			<h1 id="logo">
				<img id="logo-img" alt="여기" src="../../../../images/logo.png">
				<a href=""></a>
			</h1>
			
			<section>
				<nav class="hor-menu main-menu">
					<h1>메인메뉴</h1>
					<ul>
						<li><a href="">계획하기</a></li>
						<li><a href="">기록하기</a></li>
						<li><a href="">여행기</a></li>
						<li><a href="">커뮤니티</a></li>
					</ul>
				</nav>
				
				<nav class="hor-menu member-menu">
					<h1>회원메뉴</h1>
					<ul>
						<li>로그인</li>
						<li>회원가입</li>
					</ul>
				</nav>				
			</section>
		</div>
	</header> -->
	<!------------title 시작--------------------------------------------------------->
<div id="title">
		<div id="title-box">
			<div id="title-img">
				<img id="img" alt="img" src="${ctx}/images/japan2.png">
			</div>
			<div class="tit title-name">
				<a>타이틀제목</a>
			</div>
			<div class="tit title-desc">
				<span>나라 /</span> 
				<span>몇박몇일 /</span> 
				<span>2018-01-05 /</span> 
				<span>2018-01-09 /</span>
				<span>작성일 : </span>
				<span>2018-01-15 /</span>
				<span>최종 수정일 :</span>
				<span>2018-01-25</span>
			</div>
			<div class="tit post-cnt">
				<ul>
					<li class="hit-cnt"><span>200</span></li>
					<li class="scrap-cnt"><span>150</span></li>
					<li class="comment-cnt"><span>5</span></li>
					
				</ul>
			</div>
		</div>

	</div>

	<div id="body">
		<div class="root-container">
			<!------------aside 시작-------------------------------------------------------->
			<aside id="aside">
				<div class="user-box">
					<div id="user-img-box">
						<img id="user-img" alt="사진" src="${ctx}/images/user128.png">
					</div>
					<div class="user-name">
						<span>글쓴이</span>
					</div>
					<div class="user-info">
						<span>계획</span> <span class="post-count">(3)</span> <span>기록</span>
						<span class="post-count">(2)</span> <span>커뮤니티</span> <span
							class="post-count">(5)</span>
					</div>
					<div class="scrap-box">
						<img id="btn-scrap" alt="스크랩이미지"
							src="${ctx}/images/scrap.png"> <span>스크랩</span>
					</div>
				</div>
				<div class="summary-box">
					<ul>
						<li><a class="summary-btn trv-theme" data-toggle="modal" data-target="#myModal"> <span
								class="summary-list">여행테마</span> <span class="summary-info">혼자여행</span></a>
						</li>
						<li><a type="button" id = "btn-total-spot" class="summary-btn trv-spot"> <span
								class="summary-list">총 방문명소</span> <span class="summary-info">20</span></a>
						</li>
						<li><a type="button" id = "btn-total-expense" class="summary-btn trv-budget"> <span
								class="summary-list">지출내역</span> <span class="summary-info">KRW
									600,000,000</span></a></li>
					</ul>

				</div>
			</aside>
			<!------------main 시작-------------------------------------------------------->
			<main id="main">
			<div class="side-bar">
				<ul>
					<li>TOP</li>
					<li>DAY1</li>
					<li>DAY2</li>
				</ul>
			</div>
			<div class="story-intro-box">
				<div class="story-strapline">
					<span>소제목</span>
				</div>
				<div class="story-intro">
					<span>여행 기록 짧은 소개</span>
				</div>
			</div>
			<div class="day-spot-box">
				<div class="day">
					<strong>DAY <span>1</span>
					</strong>
				</div>
				<div class="spot-couse">
					<div class="couse-start">
						<span class="couse-spot">도쿄 나리타 국제 공항</span>
					</div>
					<div class="couse-left">
						<span class="couse-spot">캡슐 & 사우나 오리엔탈</span>
					</div>
					<div class="couse-left">
						<span class="couse-spot">다이버 시티 도쿄 플라자</span>
					</div>
					<div class="couse-left">
						<span class="couse-spot">비너스 포트 (ヴィーナスフォート, Venus Fort)</span>
					</div>
					<div class="couse-left">
						<span class="couse-spot">규카츠 모토무라 신주쿠점 (牛かつ もと村 新宿店)</span>
					</div>
					<div class="couse-left">
						<span class="couse-spot">응 도쿄야</span>
					</div>
					<!-- <div class="couse-end">
						<span class="couse-spot">응 도쿄야</span>
					</div> -->
					<div class="couse-left-p">
						<span class="couse-spot">도교 어딘가</span>
					</div>
					<div class="couse-right-b">
						<span class="couse-spot">도교 어딘가</span>
					</div>
					<div class="couse-right">
						<span class="couse-spot">도교 어딘가</span>
					</div>
					<div class="couse-right">
						<span class="couse-spot">도교 어딘가</span>
					</div>
					<div class="couse-right">
						<span class="couse-spot">도교 어딘가</span>
					</div>
					<div class="couse-right">
						<span class="couse-spot">도교 어딘가</span>
					</div>
					<div class="couse-right">
						<span class="couse-spot">도교 어딘가</span>
					</div>
					<div class="couse-right-q">
						<span class="couse-spot">도교 어딘가</span>
					</div>
					<div class="couse-left-d">
						<span class="couse-spot">도교 어딘가</span>
					</div>
					<div class="couse-left">
						<span class="couse-spot">캡슐 & 사우나 오리엔탈</span>
					</div>
					<div class="couse-left">
						<span class="couse-spot">캡슐 & 사우나 오리엔탈</span>
					</div>
					<div class="couse-left">
						<span class="couse-spot">캡슐 & 사우나 오리엔탈</span>
					</div>
					<div class="couse-left">
						<span class="couse-spot">캡슐 & 사우나 오리엔탈</span>
					</div>
					<div class="couse-left">
						<span class="couse-spot">캡슐 & 사우나 오리엔탈</span>
					</div>
					<div class="couse-end">
						<span class="couse-spot">신주쿠 (新宿, Shinjuku)</span>
					</div>
				</div>
			</div>
			<div class="spot-box">
				<div class="spot-bar"></div>
				<div class="spot">
					<span class="spot-name">도쿄 나리타 국제 공항 (成田国際空港, Tokyo Narita
						International Airport)</span>
				</div>
			</div>
			<div class="spot-post-box">
				<span class="spot-post-content">미리 뽑아간 케이세이버스 티켓 예약 메일을 보여주고 티켓을 받았다.
					날짜만 예약하고 티켓을 찾을 때 시간을 지정한다. 우리는 가장 빠른 시간을 주길래 받았는데 버스 타는 곳을 찾느라 시간을
					많이 허비해서 제시간에는 타질 못했다. 버스 타는 곳을 물어보니 대충 알려줘서 찾아가는데 오래 걸렸고, 영어가 통하지
					않아서 길찾기가 어려웠다. 원래 타려고 했던 시간은 놓쳤지만 바로 그 다음 버스를 탈 수 있어서 다행이었다. 버스타는
					곳을 못 찾고 버스도 놓치고 하니 도착부터 너무 힘들었다. 그래도 드디어 도착했다.</span>
				<div class="spot-img">
					<img id="post-img" alt="여기"
						src="${ctx}/resources/main_img.png">
				</div>
				<div class="post-info-box">
						<div class="post-info post-spot"><span class="post-info-start">도쿄 나리타 국제 공항</span></div>
						<div class="post-info post-expense"><span class="post-info-start expense-type">교통</span><span class="post-info-list">버스교통비</span><span class="post-info-list">KRW</span><span class="post-info-list">190,000</span></div>
						<div class="post-info post-tag"><span class="post-info-start">공항</span></div>

				</div>
			</div>

			<div id="total-spot-box" class="modal">
				<div class="modal-content">
					<div class="day-total-title">방문명소<span class="close">&times;</span></div>			
					<div class="total-box">
						<div class="day-total-box">
								<div class="day-spot-title">
									<span>DAY 1</span><span>일본</span>
								</div>
							<div class="day-spot-list">
								<p>어딘가sferereferffㄴㄴㄹㄷㄹㄴㄹㄴㄷㄹㄷㄹㄴㄹㄷㄹ</p>
								<p>어딘가</p>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div id="total-expense-box" class="modal">
				<div class="modal-content">
					<div class="day-total-title">
						지출내역<span class="close">&times;</span>
					</div>
					<div class="total-box">

						<table class="expense-list">
							<tr>
								<td>명소</td>
								<td class="expense">KRW 190,000</td>
							</tr>
							<tr>
								<td>맛집</td>
								<td class="expense">KRW</td>
							</tr>
							<tr>
								<td>숙소</td>
								<td class="expense">KRW</td>
							</tr>
							<tr>
								<td>교통</td>
								<td class="expense">KRW</td>
							</tr>
							<tr>
								<td>쇼핑</td>
								<td class="expense">KRW</td>
							</tr>
							<tr>
								<td>기타</td>
								<td class="expense">KRW</td>
							</tr>

						</table>

					</div>
				</div>
			</div>

			<div class="st-comment-box">

				<div class="comment-cnt-box">
					<span class="comment">댓글</span><span>0</span>
				</div>
			</div>
			<div id="un-lock" class="st-comment-write-box">
				<div class="comment-write-box">
					<img id="comment-writer-img" alt=""
						src="${ctx}/images/user36.png">
					<textarea class="form-control new-comment" placeholder="댓글을 남겨주세요."></textarea>
					<div class="comment-reg">등록</div>
					<a type="button" class="unlock"></a>
				</div>
			<div class="comment-list-box">
				<div></div>
			</div>
			</div>
		</main>
		</div>
	
	</div>
	<!------------footer 시작-------------------------------------------------------->
	<footer id="footer">
		<div class="root-container">
			<div id="footer_logo">
			</div>
			<div id="footer_bar">
			</div>
			<div>			
			회사정보 서울특별시 마포구 월드컵북로 21 풍성빌딩 2, 3, 4층 쌍용강북교육센터 <br> 
			Tel 02)000-0000 | Fax 02)000-0000<br> 사업자번호 : 000-00-00000 | 제작 :
			여행자들 | 개인정보처리관리책임자 : 김땡땡 <br>
			<br> Copyright (C) 2018 Travelers , ALL Right Reserved
			</div>
		</div>
	</footer>	
</body>
</html>