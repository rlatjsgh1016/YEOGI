<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- set에 ctx란 이름으로 경로를 박아두기 -->
<c:set var="ctx" value ="${pageContext.request.servletContext.contextPath }" />

<aside class="aside">
				<h1>MY PAGE</h1>
				
				<nav class="menu text-menu first margin-top">
					<h1>온라인 강의실</h1>
					<ul>
						<li><a class="" href="${ctx}/student/index">수강생 홈</a></li>						
						<li><a class="" href="${ctx}/student/course/taking">내 강의장</a></li>
						<li><a class="" href="${ctx}/student/course/taked">과거 수강정보</a></li>																
					</ul>
				</nav>
				
				<nav class="menu text-menu">
					<h1>커뮤니티</h1>
					<ul>
						
						
						<li><a  class="current" href="${ctx}/student/community/answeris/list">내 오류노트</a></li>
																														
					</ul>
				</nav>
				
				<nav class="menu text-menu">
					<h1>고객센터</h1>
					<ul>
						
						<li><a class="active" href="${ctx}/student/helpdesk/question">1:1 수강문의 및 답변확인</a></li>
						<li><a class="active" href="${ctx}/student/test03/edit">개인정보수정</a></li>
						<li><a class="active" href="${ctx}/student/test03/pwd">비밀번호 재설정</a></li>
						<li><a class="active" href="${ctx}/student/test03/del">탈퇴하기</a></li>																		
					</ul>	
				</nav>
				
				<nav class="menu text-menu">
					<h1>결제정보</h1>
					<ul>
						<li><a href="${ctx}/student/payment/ordered">주문정보</a></li>
						<li><a href="${ctx}/student/payment/coupon">쿠폰함</a></li>
						<li><a href="${ctx}/student/payment/point">포인트</a></li>
					</ul>
				</nav>
				
				


				


	<nav class="menu">
		<h1>협력업체</h1>
		<ul>
			<li><a target="_blank" href="http://www.notepubs.com"><img src="${ctx}/images/notepubs.png" alt="노트펍스" /></a></li>
			<li><a target="_blank" href="http://www.namoolab.com"><img src="${ctx}/images/namoolab.png" alt="나무랩연구소" /></a></li>
			<li><a target="_blank" href="http://www.hanbit.co.kr/"><img src="${ctx}/images/hanbit.png" alt="한빛미디어" /></a></li>
			<li><a target="_blank" href="http://acornacademy.co.kr/"><img src="${ctx}/images/acorn.png" alt="에이콘아카데미" /></a></li>
			<li><a target="_blank" href="http://www.sist.co.kr"><img src="${ctx}/images/sist.png" alt="쌍용교육센터" /></a></li>
			
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