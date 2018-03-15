<%@page import="com.newlecture.jspprj.entity.Answeris"%>
<%@page import="com.newlecture.jspprj.dao.jdbc.JdbcAnswerisDao"%>
<%@page import="java.util.List"%>
<%@page import="com.newlecture.jspprj.entity.AnswerisView"%>
<%@page import="com.newlecture.jspprj.dao.AnswerisDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 내가 만든 for -->
<%@ taglib prefix="my" uri="http://www.newlecture.com/jsp/tags/control" %>
<!-- 남이 만든 for -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<main class="main" ng-controller="notice-controller">
<h2 class="main title">내 오류노트</h2>

<div class="breadcrumb">
	<h3 class="hidden">경로</h3>
	<ul>
		<li>home</li>
		<li>커뮤니티</li>
		<li>오류노트</li>
	</ul>
</div>

<div class="search-form margin-top first align-right">
	<h3 class="hidden">고객문의 검색폼</h3>
	<form class="table-form">
		<fieldset>

			<legend class="hidden">고개문의 검색 필드</legend>
			<label class="hidden">검색분류</label> <select name="f">
				<option value="title">제목</option>
				<option value="errorCode">에러코드</option>
				<option value="errorMessage">에러메시지</option>
			</select> <label class="">검색어</label> <input type="text" name="q" value="" />
			<input class="btn btn-search" type="submit" value="검색" />
		</fieldset>
	</form>
</div>

<div class="notice margin-top">
	<h3 class="hidden">고객문의 목록</h3>
	<table class="table">
		<thead>
			<tr>
				<th class="expand">제목</th>
				<th class="w100">언어</th>
				<th class="w100">플랫폼</th>
				<th class="w100">작성일</th>
			</tr>
		</thead>
		
		<tbody>


			<c:forEach var="ai" items="${list}">
				<%-- <%for(AnswerisView a : list){ //for each문%> --%>
				<tr>
					<td class="text-align-left text-indent text-ellipsis"><a
						href="detail?id=${ai.id}">${ai.title}</a></td>
					<td>${ai.language} <%-- ${list[0].language}  --%> <%-- <%=((List<Answeris>)request.getAttribute("list")).get(0).getLanguage() %> 잘 사용안된다 --%>
					</td>
					<%-- <%=a.getLanguage() %> --%>
					<td class="text-ellipsis">${ai.platform}</td>
					<td></td>
				</tr>
			</c:forEach>


			<%-- <%} %> --%>
			<%-- <%if(list.size()==0){%> --%>
			<tr>
				<td colspan="4">작성된 글이 없습니다.</td>
			</tr>
			<%-- <%} %> --%>


		</tbody>
		
	</table>
</div>

<div class="indexer margin-top align-right">
	<h3 class="hidden">현재 페이지</h3>
	<div>
		<span class="text-orange text-strong">${param.p == null ? 1 : param.p}
		</span> / ${lastPage} pages
	</div>
</div>

<div class="margin-top text-align-right">
	<a href="reg" class="btn-text btn-default">글쓰기</a>
</div>

<div class="margin-top align-center pager">

	<div>

		<c:if test="${startNum != 1}">
			<a class="btn btn-prev" href="?p=${startNum-1}">이전</a>
		</c:if>
		<c:if test="${startNum == 1}">
			<span class="btn btn-prev">이전</span>
		</c:if>

	</div>
	
	<ul class="-list- center">


		<c:forEach var="i" begin="0" end="4">
			<!-- //i는 이용할 수 있는 객체가 됨 5번 반복 -->
			<c:if test="${startNum+i <= lastPage}">
				<li><a href="?p=${startNum+i}&t=&q=">${startNum+i}</a></li>
			</c:if>
		</c:forEach>

	</ul>
	<div>

		<c:if test="${startNum+5 <=  lastPage}">
			<a class="btn btn-next" href="?p=${startNum+5}">다음</a>
		</c:if>

		<c:if test="${startNum+5 > lastPage}">
			<span class="btn btn-next">다음</span>
		</c:if>

	</div>

</div>
</main>