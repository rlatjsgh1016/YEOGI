<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath}" />

	<header>
		<div class="root-container">
			<a id="logo" href="${ctx}/main"><img alt="로고" src="${ctx}/images/logo.png" height="60px;"></a>
			<nav>
				<h1 class="hidden">메인메뉴</h1>
				<ul class="menu-hor menu-main">
					<li><a href="${ctx}/main/member/plan/newplan/new-plan.html">계획하기</a></li>
					<li><a class="text-focus" href="${ctx}/main/member/story/write/select">기록하기</a></li>
					<li><a href="${ctx}/main/public-board/travel-log/log-main/log-main.html">여행기</a></li>
					<li><a href="${ctx}/main/public-board/community/writing.html">커뮤니티</a></li>
				</ul>
				<h1 class="hidden">로그인메뉴</h1>
				<ul class="menu-hor menu-login">
					<li><a href="${ctx}/main/log-in.html">로그인</a></li>
					<li><a href="${ctx}/main/join.jsp">회원가입</a></li>
				</ul>
			</nav>
		</div>
	</header>