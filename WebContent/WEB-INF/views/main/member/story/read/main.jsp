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
			<a>${tourLog.title}</a>
		</div>
		<div class="tit title-desc">
			<span>${tLogNation.nation} /</span> 
			<span>${tourLog.period}박${tourLog.period+1}일  /</span> 
			<span>${tourLog.startDate} /</span> 
			<span>${tourLog.endDate} /</span> 
				<span>작성일 : </span> 
				<span>${tourLog.regDate} /</span> 
				<span>최종 수정일  :</span> 
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
					<a href="${ctx}/main/member/mypage/mypage?id=${tourLog.mid}">${tourLog.mid}</a>
				</div>
				<div class="user-info">
					<a href="${ctx}/main/member/mypage/mystory/mystory">계획</a> 
					<a href="${ctx}/main/member/mypage/mystory/mystory" class="post-count">(0)</a> 
					<a href="${ctx}/main/member/mypage/myplan/myplan">기록</a>
					<a href="${ctx}/main/member/mypage/myplan/myplan" class="post-count">(${tourLogCount})</a> 
					<a>커뮤니티</a> <a class="post-count">(0)</a>
				</div>
				<%-- <div class="scrap-box">
					<img id="btn-scrap" alt="스크랩이미지" src="${ctx}/images/scrap.png">
					<span>스크랩</span>
				</div> --%>
			</div>
			<div class="summary-box">
				<ul>
					<li><a class="summary-btn trv-theme" data-toggle="modal"
						data-target="#myModal"> <span class="summary-list">여행테마</span>
							<span class="summary-info">${tourLog.tTheme}</span></a></li>
					<li><a type="button" id="btn-total-spot"
						class="summary-btn trv-spot"> <span class="summary-list">
						총 방문명소</span> <span class="summary-info">${tLogCount}</span></a></li>
					<li><a type="button" id="btn-total-expense"
						class="summary-btn trv-budget"> <span class="summary-list">지출내역</span>
							<span class="summary-info">KRW 
							<c:set var="test1" value="0"/>
							<c:forEach var="test2" items="${spdSum}">
							<c:set var="test1" value="${test1+test2.sum}"/>
							</c:forEach>
							<c:out value="${test1}"/></span></a></li>
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
				<span>${tourLog.subTitle}</span>
			</div>
			<div class="story-intro">
				<span>${tourLog.memo}</span>
			</div>
		</div>
		
	
		<%-- <c:forEach var="index" begin="1" end="60"> --%>
			<c:forEach var="tlpl" items="${tlpList}">
				<%-- <c:if test="${index == tlpl.day}"> --%>
						
					<div class="day-spot-box">
						<div class="day">
							<strong>DAY <span>${tlpl.day}</span>
							</strong>
						</div>
						
						<%-- <div class="spot-couse">
							<div class="couse-start">
								<span class="couse-spot">${tlpl.name}</span>
							</div>
							<!-- <div class="couse-left">
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
							<div class="couse-end">
									<span class="couse-spot">응 도쿄야</span>
								</div>
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
							</div> -->
						</div> --%>
					</div>
					<div class="spot-box">
						<div class="spot-bar"></div>
						<div class="spot">
							<span class="spot-name">${tlpl.name}</span>
						</div>
					</div>
					<div class="spot-post-box">
						<span class="spot-post-content">${tlpl.content}</span>
						<%-- <div class="spot-img">
							<img id="post-img" alt="여기" src="${tlpl.img}">
						</div> --%>
							<div class="post-info-box">
								<div class="post-info post-spot">
									<span class="post-info-start">${tlpl.name}</span>
								</div>
						<c:forEach var="spd" items="${tlpsvList}">
							<c:if test="${tlpl.id == spd.tLogPostId}">
								<div class="post-info post-expense">
									<span class="post-info-start expense-type">${spd.type}</span><span
										class="post-info-list">${spd.spdContent}</span><span class="post-info-list">KRW</span>
										<span class="post-info-list">${spd.amount}</span>
								</div>
							</c:if>
						</c:forEach>
						<c:forEach var="tag" items="${tagList}">
							<%-- <c:if test="${tlpl.tLogPostId == tag.tagContent}"> --%>
							<c:if test="${!empty tagList && tlpl.id == tag.tLogPostId}">
							
								<div class="post-info post-tag">
									<span class="post-info-start">${tag.tagContent}</span>
								</div>
							</c:if>
						</c:forEach>
				
							</div>
					</div>
				<%-- </c:if> --%>
			</c:forEach>
	<%-- 	</c:forEach> --%>
	

		<div id="total-spot-box" class="modal">
			<div class="modal-content">
				<div class="day-total-title">
					방문명소<span class="close">&times;</span>
				</div>
			
				<div class="total-box">
					<c:forEach var="day" begin="1" end="${maxDay}" step="1">
						<div class="day-total-box">
								<div class="day-spot-title">			
									<span>DAY ${day}</span>
									<span>${tLogNation.nation}</span>
								</div>
							<c:forEach var="ta" items="${tlpList}">	
							<c:if test="${ta.day == day}">
								<div class="day-spot-list">
									<p>${ta.name}</p>
								</div>
							</c:if>
							</c:forEach>
						</div>
					</c:forEach>
				</div>
		
			</div>
		</div>

		<div id="total-expense-box" class="modal">
			<div class="modal-content">
				<div class="day-total-title">
					지출내역<span class="close">&times;</span>
				</div>
				<div class="total-box">
				
						<c:forEach var="spd" items="${spdSum}">
							<table class="expense-list">
								<tr>
									<td>${spd.type}</td>
									<td class="expense">KRW ${spd.sum}</td>
								</tr>
			
		
							</table>
						</c:forEach>

				</div>
			</div>
		</div>

		<div class="st-comment-box">

			<div class="comment-cnt-box">
				<a class="comment" type="button">댓글</a><a type="button">0</a>
			</div>
		</div>
		<div id="un-lock" class="st-comment-write-box" style=" visibility: hidden;">
			<%-- <c:if test="${sessionScope.sessionId != null }"> --%>
			<%-- <input type="hidden" id="comment_board" name="comment_board" value="${tourLog.id}">
			<input type="hidden" id="comment_id" name="comment_id" value="${sessionScope.sessionId}"> --%>
				<form id="comment-write-form" method="post">
					<div class="comment-write-box">
							<img class="comment-writer-img" alt="" src="${ctx}/images/user36.png">
							<textarea name="content" class="form-control new-comment" placeholder="댓글을 남겨주세요."></textarea>
							<input type = "submit" class="comment-reg" value="등록"> 
							<a type="button" class="unlock"></a>
					</div>
				</form>
			<%-- </c:if> --%>
			
			<%-- <c:if test="${requestScope.commentList != null}"> --%>
				<%-- <c:forEach var="comment" items="$requestScope.commentList}"> --%>
					
					<c:forEach var="cl" items="${list}">
					<div class="comment-list-box">
						<div class="comment-list">
							<img class="comment-writer-img" alt="" src="${ctx}/images/user36.png">
							<div class="comment-contents-box">
								<div class="comment-writer-box">
									<div class="id-date">
										<a class="comment-writer-id">${cl.mId}</a> <a class="comment-writer-date">2018-03-08</a>
									</div>
									<%-- <c:if test="${tLogCmt.mId == sessionScope.sessionId}"> --%>
										<a href="" class="comment-button">삭제</a>			
										<a href="" class="comment-button">수정</a>
								<%-- 	</c:if> --%>
									<input class="reply-button" type="submit" value="" />
								</div>
								<div class="comment-content">${cl.content}</div>
							</div>
						</div>
					</div>
				</c:forEach>
				<%-- </c:forEach> --%>
			<%-- </c:if> --%>
		</div>
		</main>
	</div>
<<<<<<< HEAD
	<!------------footer 시작-------------------------------------------------------->
	<footer id="footer">
=======

</div>
<!-- <script>
	window.addEventListener("load",function(){
		var form = document.getElementById("comment-write-form");
		var board = form.
	
	});
</script> -->
<!------------footer 시작-------------------------------------------------------->
	<!-- <footer id="footer">
>>>>>>> refs/remotes/origin/master
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