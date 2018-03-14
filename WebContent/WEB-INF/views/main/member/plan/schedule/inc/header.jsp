<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath}" />    

	<header id="header">
		<div class="root-container">
			<a href="../../../main.html"><div id="logo">
					<img src="${ctx}/resources/logo.png" height="65px" alt="여기" />
				</div></a>
			<section>
				<h1>헤더</h1>
				<nav class="hor-menu main-menu first-pad-none">
					<h1>메인메뉴</h1>
					<ul>
						<li><a href="${ctx}/main/member/plan/newplan/new-plan.html">계획하기</a></li>
						<li><a href="${ctx}/main/member/story/write/select">기록하기</a></li>
						<li><a href="${ctx}/main/public-board/travel-log/log-main/log-main.html">여행기</a></li>
						<li><a href="${ctx}/main/public-board/community/writing.html">커뮤니티</a></li>
					</ul>
				</nav>

				<nav class="hor-menu member-menu first-pad-none"
					style="margin-bottom: 15px">
					<h1>회원 메뉴</h1>
					<ul>
						<li><a href="${ctx}/main/log-in.html">로그인</a></li>
						<li><a href="../../../join.html">회원가입</a></li>
						<li><a href="../../mypage/mypage.html" class="btn btn-mypage">마이페이지</a></li>
					</ul>
				</nav>
			</section>
		</div>
	</header>