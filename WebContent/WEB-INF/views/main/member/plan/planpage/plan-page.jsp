<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<link href = "../../../../CSS/plan-page.css"  type="text/css" rel="stylesheet"/>
</head>
<body>
	<header id="header">
		<div class="root-container">
			<h1 id="logo">
				<a href="../../../main.html"><img src="../../../../images/logo.png" height="65px" alt="여기" /></a>
			</h1>
			<nav class ="hor-menu main-menu first-pad-none">
				<ul>
					<li><a href="../searchplan/search-plan.html">계획하기</a></li>
					<li><a href="../../story/write/main.jsp">기록하기</a></li>
					<li><a href="../../../public-board/travel-log/log-main/log-main.html">여행기</a></li>
					<li><a href="">커뮤니티</a></li>
				</ul>
			</nav>
				
			<nav class ="hor-menu member-menu first-pad-none">
				<ul>
					<li><a href="../../../log-in.html">로그인</a></li>
					<li><a href="">회원가입</a></li>
					<li><a href="">마이페이지</a></li>
				</ul>
			</nav>
		</div>
	</header>
	
	<div id="visual">
			<div id="title-img">
				<img id="img" alt="img" src="../../../../images/japan2.png">
			</div>
			<div class="root-container">
				<div class="title-box">
					
					<div class="title-name"><a>title</a></div>
	
					<div class="title-info">
						<span>나라</span> 
						<span>몇박며칠</span>
						<span>2018-01-05</span>
						<span>2018-01-09</span>
						<span>작성일 : </span>
						<span>2018-01-15</span>
						<span>최종 수정일 : </span>
						<span>2018-01-25</span>
					</div>
	
					<div class="title-hit">
						<span>조회수</span> <span>125</span>
						<span>스크랩</span> <span>180</span>
						<span>댓글</span> <span>10</span>
					</div>
				</div>
			</div>
	</div>
	
	<div id="body">
		<div class="root-container">
		<!-- aside시작부분 -->
			<aside id="aside">
				<div class="user-box">
					<div class="user-imgbox">
						<img id="user-img" alt="사진" src="../../../../images/dog2.png">
					</div>
					<div class="user-name">글쓴이</div>
					<div class="user-collection">
						<span>계획</span> <span class="post-count">(3)</span>
						<span>기록</span> <span class="post-count">(5)</span>
						<span>커뮤니티</span> <span class="post-count">(10)</span>
					</div>
					<div class="user-scrap">
						<img id="btn-scrap" alt="스크랩이미지"
							src="../../../../images/scrap.png"> <span>스크랩</span>
					</div>
				
				</div>
				
				<div class="summary-box">
					<ul>
						<li><a class="summary-btn theme-img" href="">
						<span class="summary-list">여행테마</span> <span class="summary-info">혼자여행</span>
						</a></li>
						
						<li><a class="summary-btn totalplace-img" href="">
						<span class="summary-list">총 방문명소</span> <span class="summary-info">20</span>
						</a></li>
						
						<li><a class="summary-btn pay-img" href="">
						<span class="summary-list">지출내역</span> <span class="summary-info">$111111</span>
						</a></li>
					</ul>
				</div>
			</aside>
			
			<div id="main">				 				 	
				<!-- 지도 -->
					<div id="map" style="height:500px">
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
					</div>
					<div id="main-plan">
					<div class="plan-table">
						<div class="table-info">
							<p class="table-date">2018-01-05</p>
							<p class="table-day">DAY1</p>
							<div class="table-btn">
								<a class="table-leftbtn"></a>
								<a class="table-rightbtn"></a>
							</div>
							<div class="customizing">
								커스텀마이징
							</div>
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
									
									<tr>
										<td class="table-time">14:00</td>
										<td class="table-spot">집</td>
										<td class="memo-pad"></td>		
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div> 
		</div>
			
	</div>
</body>
</html>