<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath}" />
<header id = "header">
			<div class="root-container">
			<a href= "${ctx }/main/main"><h1 id="logo"><img src ="${ctx}/resources/logo.png" height="65px" alt ="여기" /> </h1></a>
	
			<section>
				<h1 class="hidden">헤더</h1>
				
				<nav class="hor-menu main-menu first-pad-none">
					<h1>메인메뉴</h1>
					<ul>

						<li><a href="${ctx }/main/member/plan/newplan/newplan">계획하기</a></li>
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
						<li><a href= "${ctx}/main/login">로그아웃</a></li>
					</c:if> 
						<li><a href= "${ctx}/main/join">회원가입</a></li>
						<li><a href ="${ctx}/main/member/mypage/mypage" class ="btn btn-mypage">마이페이지</a></li>
					</ul>
				</nav>	
				
			</section> 
			
		</div>
		
	</header>