<%@page import="com.newlecture.jspprj.entity.AnswerisView"%>
<%@page import="com.newlecture.jspprj.dao.AnswerisDao"%>
<%@page import="com.newlecture.jspprj.dao.jdbc.JdbcAnswerisDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%

	String id = request.getParameter("id");

	AnswerisDao answerisDao = new JdbcAnswerisDao();
	AnswerisView answeris = answerisDao.get(id);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- <meta name="viewport" content="width=device-width,initial-scale=1"> -->
<title></title>

<link href="../../css/layout.css" type="text/css" rel="stylesheet" />
</head>
<body>
	<!-- header 부분 -->
	




<header id="header">
	<div>
		<img class="hamburger-button"
			src="../../../images/ic_menu_black_24dp_1x.png" />
	</div>
	<div class="content-container">
		<!-- ---------------------------<header>--------------------------------------- -->

		<h1 id="logo">
			<a href="/index"> 
				<img src="../../../images/logo.png" alt="뉴렉처 온라인" />
				
			</a>
		</h1>

		<section>
			<h1 class="hidden">헤더</h1>

			<nav id="main-menu">
				<h1>메인메뉴</h1>
				<ul>
					<li><a href="/guide">학습가이드</a></li>
					
					<li><a href="/course">강좌선택</a></li>
					<li><a href="../../../answeris/index.jsp">AnswerIs</a></li>					
				</ul>
			</nav>

			<div class="sub-menu">
								
				<section id="search-form">
					<h1>강좌검색 폼</h1>
					<form>
						<fieldset>
							<legend>과정검색필드</legend>
							<label>과정검색</label> <input type="text" value="" /><input
								type="submit" value="검색" />
						</fieldset>
					</form>
				</section>
				
				<nav id="acount-menu">
					<h1 class="hidden">회원메뉴</h1>
					<ul>
						<li><a href="/index">HOME</a></li>
						
						
						
							<li>
								<form action="/logout" method="post">
									<input type="hidden" name="" value="" />
									<input type="submit" value="로그아웃" style="border:none;background: none;vertical-align: middle;font-size: 10px;color:#979797;font-weight: bold;" />
									
								</form>								
							</li>
						

						

						<li><a href="/member/agree">회원가입</a></li>
					</ul>
				</nav>

				<nav id="member-menu" class="linear-layout">
					<h1 class="hidden">고객메뉴</h1>
					<ul class="linear-layout">
						<li><a href="/member/home"><img
								src="../../../images/txt-mypage.png" alt="마이페이지" /></a></li>
						<li><a href="/customer/notice"><img
								src="../../../images/txt-customer.png" alt="고객센터" /></a></li>
					</ul>
				</nav>

			</div>
		</section>

	</div>
	<div class="search-button">
		<img src="../../../images/ic_search_black_24dp_1x.png" />
	</div>
	<div class="more-vert-button">
		<img src="../../../images/ic_more_vert_black_24dp_1x.png" />
	</div>
</header>
<script src="js/header.js"></script>
	<!-- --------------------------- <visual> --------------------------------------- -->
	<!-- visual 부분 -->
	
	<div id="visual">
		<div class="content-container"></div>
	</div>
	<!-- --------------------------- <body> --------------------------------------- -->
	<div id="body">
		<div class="content-container clearfix">

			<!-- --------------------------- aside --------------------------------------- -->
			<!-- aside 부분 -->

			<aside class="aside">
				<h1>MY PAGE</h1>
				
				<nav class="menu text-menu first margin-top">
					<h1>온라인 강의실</h1>
					<ul>
						<li><a class="" href="/student/index">수강생 홈</a></li>						
						<li><a class="" href="/student/course/taking">내 강의장</a></li>
						<li><a class="" href="/student/course/taked">과거 수강정보</a></li>																
					</ul>
				</nav>
				
				<nav class="menu text-menu">
					<h1>커뮤니티</h1>
					<ul>
						
						
						<li><a  class="current" href="/student/community/answeris">내 오류노트</a></li>
																														
					</ul>
				</nav>
				
				<nav class="menu text-menu">
					<h1>고객센터</h1>
					<ul>
						
						<li><a class="active" href="/student/helpdesk/question">1:1 수강문의 및 답변확인</a></li>
						<li><a class="active" href="/student/test03/edit">개인정보수정</a></li>
						<li><a class="active" href="/student/test03/pwd">비밀번호 재설정</a></li>
						<li><a class="active" href="/student/test03/del">탈퇴하기</a></li>																		
					</ul>	
				</nav>
				
				<nav class="menu text-menu">
					<h1>결제정보</h1>
					<ul>
						<li><a href="/student/payment/ordered">주문정보</a></li>
						<li><a href="/student/payment/coupon">쿠폰함</a></li>
						<li><a href="/student/payment/point">포인트</a></li>
					</ul>
				</nav>
				
				


				


	<nav class="menu">
		<h1>협력업체</h1>
		<ul>
			<li><a target="_blank" href="http://www.notepubs.com"><img src="../../../images/notepubs.png" alt="노트펍스" /></a></li>
			<li><a target="_blank" href="http://www.namoolab.com"><img src="../../../images/namoolab.png" alt="나무랩연구소" /></a></li>
			<li><a target="_blank" href="http://www.hanbit.co.kr/"><img src="../../../images/hanbit.png" alt="한빛미디어" /></a></li>
			<li><a target="_blank" href="http://acornacademy.co.kr/"><img src="../../../images/acorn.png" alt="에이콘아카데미" /></a></li>
			<li><a target="_blank" href="http://www.sist.co.kr"><img src="../../../images/sist.png" alt="쌍용교육센터" /></a></li>
			
		</ul>
	</nav>
				

				<!-- <nav class="menu">
					<h1>협찬광고</h1>
					<ul>
		                <li style="width:181px;overflow:hidden;">                            
                                           
		                </li>  
                        <li style="width:181px;overflow:hidden;">                            
                                                 
		                </li>
                    </ul>					
				</nav> -->
			</aside>
			<!-- --------------------------- main --------------------------------------- -->
			
			<!-- content 부분 -->
			
	
	
	
	
	<main>
		<h2 class="main title">내 오류노트 등록</h2>
		
		<div class="breadcrumb">
			<h3 class="hidden">breadlet</h3>
			<ul>
				<li>home</li>
				<li>커뮤니티</li>
				<li>Answeris</li>
			</ul>
		</div>
				
		<div class="margin-top first">
				<h3 class="hidden">오류 내용</h3>
				<table class="table">
					<tbody>
						<tr>
							<th>제목</th>
							<td class="text-align-left text-indent text-strong text-orange" colspan="3">
								<%=answeris.getTitle() %>
							</td>
						</tr>
						<tr>
							<th>오류가 발생할 때 사용한 언어</th>
							<td colspan="3" class="text-align-left text-indent">
								<%=answeris.getLanguage() %>		
							</td>							
						</tr>
						<tr>
							<th>오류가 발생할 때 사용한 플랫폼</th>
							<td colspan="3" class="text-align-left text-indent">
								<%=answeris.getPlatform() %>	
							</td>							
						</tr>
						<tr>
							<th>오류가 발생할 때 사용한 실행환경</th>
							<td colspan="3" class="text-align-left text-indent">
								<%=answeris.getRuntime() %>8		
							</td>
						</tr>										
						<tr>
							<th>오류 코드</th>
							<td class="text-align-left text-indent text-strong text-orange" colspan="3">
								<%=answeris.getErrorCode() %>
							</td>
						</tr>
						<tr>
							<th>오류 메시지</th>
							<td class="text-align-left text-indent text-strong text-orange" colspan="3">
								<%=answeris.getErrorMessage()%>
							</td>
						</tr>	
												
						<tr>
							<th colspan="4">오류 상황 설명</th>
						</tr>
						<tr>
							<td colspan="4" class="text-align-left" style="padding:10px 0px 10px 10px;">
								<%=answeris.getSituation()%>
							</td>
						</tr>
						<tr>
							<th colspan="4">시도해본 내용</th>
						</tr>
						<tr>
							<td colspan="4" class="text-align-left" style="padding:10px 0px 10px 10px;">
								<%=answeris.getTriedToFix()%>
							</td>
						</tr>
						<tr>
							<th colspan="4">원인</th>
						</tr>
						<tr>
							<td class="text-align-left" colspan="4" style="padding:10px 0px 10px 10px;">
								<%=answeris.getReason() %>
							</td>
						</tr>
						
						<tr>
							<th colspan="4">해결방법</th>
						</tr>
						<tr>
							<td class="text-align-left" colspan="4" style="padding:10px 0px 10px 10px;">
								<%=answeris.getHowToFix()%>
							</td>
						</tr>
						
					</tbody>
				</table>
			</div>
			
			<div class="margin-top text-align-center">				
				<a class="btn-text btn-default" href="edit.jsp">수정</a>
				<a class="btn-text btn-cancel" href="list.jsp">취소</a>
			</div>
			
						
	</main>
	<script type="text/javascript" src="js/lib/web-editor/util.js"></script>
	<script type="text/javascript" src="js/lib/web-editor/multi-editor.js"></script>
	
	
			
		</div>
	</div>
	<!-- ------------------- <footer> --------------------------------------- -->
	


<footer id="footer">
	<div class="content-container">
		<h2 id="footer-logo"><img src="../../../images/logo-footer.png" alt="회사정보"></h2>

		<div id="company-info">
			<dl>
				<dt>주소:</dt>
				<dd>서울특별시 마포구 토정로35길 11, 인우빌딩 5층 266호</dd>			
				<dt>관리자메일:</dt>
				<dd>admin@newlecture.com</dd>
			</dl>
			<dl>
				<dt>사업자 등록번호:</dt>
				<dd>132-18-46763</dd>
				<dt>통신 판매업:</dt>
				<dd>신고제 2013-서울강동-0969 호</dd>
			</dl>
			<dl>
				<dt>상호:</dt>
				<dd>뉴렉처</dd>
				<dt>대표:</dt>
				<dd>박용우</dd>
				<dt>전화번호:</dt>
				<dd>070-4206-4084</dd>
			</dl>
			<div id="copyright" class="margin-top">Copyright ⓒ newlecture.com 2012-2014 All Right Reserved.
				Contact admin@newlecture.com for more information</div>
		</div>
	</div>
</footer>
</body>
</html>