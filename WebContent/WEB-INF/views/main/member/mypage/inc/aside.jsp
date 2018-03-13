<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath}" />
	
	<aside id="aside">
					<h1 class="hidden">여행기</h1>
					
					<nav class="my-info">
						<div class="small-pro-pic"> <img src="${ctx }/resources/unknown-person.png" width="150px" /></div>
						<div class="follower">친구추가</div>
						<div class="my-info-write">
							<div class="small-loca"></div>내 계획 수: 3개<br>
							<div class="small-loca"></div>내 기록 수: 5개<br>
							<div class="small-loca"></div>게시글 수 : 2개
							
						</div>
					</nav>
					
					
					<nav class="ver-menu">
						<h1 = class ="back-import" >마이페이지</h1>
						<ul>
							<li><a href="${ctx }/main/member/mypage/mymap/mymap">내 지도</a></li>
							<li><a href="${ctx }/main/member/mypage/myplan/myplan">내 계획</a></li>
							<li><a href="${ctx }/main/member/mypage/mystory/mystory">내 기록</a></li>
							<li><a href="${ctx }/main/member/mypage/friends/friends">내 친구</a></li>
							<li><a href="${ctx }/main/member/mypage/scrap/scrap-main">스크랩</a></li>
							<li><a href="${ctx }/main/member/mypage/my-info-edit/my-info-edit">개인정보수정</a></li>
						</ul>
					</nav>

			</aside>