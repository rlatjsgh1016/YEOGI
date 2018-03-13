<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath}" />
	
	
	<aside id="aside">
					<h1 class="hidden">여행기</h1>
					<nav class="ver-menu">
						<h1 = class ="back-import" >여행기 메뉴</h1>
						<ul>
							<li><a href="${ctx}/main/public-board/travel-log/log-main/log-main" >여행기메인</a></li> <!-- class="clicked" -->
							<li><a href="${ctx}/main/public-board/travel-log/log-plan/log-plan">계획보기</a></li>
							<li><a href="${ctx}/main/public-board/travel-log/log-story/log-story">기록보기</a></li>
						</ul>
					</nav>

			</aside>
	