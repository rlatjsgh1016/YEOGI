<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath}" />

	<div id = "visual">
		<div class="root-container">
			<a class="btn btn-plan" href="${ctx }/main/member/plan/newplan/newplan"">계획하기</a>
			<a class="btn btn-log"  href="${ctx }/main/member/story/write/select">기록하기</a>	
		</div>
	</div>
	