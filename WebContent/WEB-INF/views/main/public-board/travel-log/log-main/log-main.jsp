<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath}" />
	
<section id ="main">

				<section>
						<section class = "title">
							계획보기<a class="btn btn-more" href="${ctx}/main/public-board/travel-log/log-plan/log-plan">더보기</a>
						</section>
						
						<section class = "travel-cont">

							<div class = "travel-plan map">
							<a href="/Yeogi/main/member/plan/schedule/schedule">
								<div class = "travel-info">
									<div class="travel-name">내 첫 유럽여행!</div>
									<div class= "loca"><div class="small-loca"></div>스페인, 프랑스, 영국</div>
									<div class ="date"><div class="small-cal"></div>1개월간</div>
								</div>
								</a>
							</div>
						
							<div class = "travel-plan  map">
								<div class = "travel-info">
									<div class="travel-name">프랑스 맛집 투어!</div>
									<div class= "loca"><div class="small-loca"></div>파리, 이탈리아</div>
									<div class ="date"><div class="small-cal"></div>4개월간</div>
								</div>
							</div>
							
							<div class = "travel-plan map">
								<div class = "travel-info">
									<div class="travel-name">동화 마을에서 힐링!</div>
									<div class= "loca"><div class="small-loca"></div>오스트리아</div>
									<div class ="date"><div class="small-cal"></div>1개월간</div>
								</div>
							</div>
			
							<div class = "travel-plan map">
								<div class = "travel-info">
									<div class="travel-name">디스니 성을 찾아서</div>
									<div class= "loca"><div class="small-loca"></div>독일, 프랑스, 체코, 헝가리</div>
									<div class ="date"><div class="small-cal"></div>2개월간</div>
								</div>
							</div>
							
						</section>
						
						
						<div class="line"></div>
						
						<section class = "title">
							기록보기<a class="btn btn-more" href="${ctx}/main/public-board/travel-log/log-story/log-story">더보기</a>
						</section>
						
						<section class = "travel-cont">
						
							<div class = "travel-log barcel">
							<a href="/Yeogi/main/member/story/read/main?id=2018031500001">
								<div class = "travel-info">
									<div class="travel-name">내 첫 유럽여행!</div>
									<div class= "loca"><div class="small-loca"></div>바르셀로나, 스페인</div>
									<div class ="date"><div class="small-cal"></div>2017.02 ~ 2017. 02 (1개월간)</div>
								</div>
							</a>
							</div>
				
							<div class = "travel-log  paris">
								<div class = "travel-info">
									<div class="travel-name">프랑스 맛집 투어!</div>
									<div class= "loca"><div class="small-loca"></div>파리, 프랑스</div>
									<div class ="date"><div class="small-cal"></div>2016.08 ~ 2016. 12 (4개월간)</div>
								</div>
							</div>
							
						</section>
						
						<section class = "travel-cont">
			
							<div class = "travel-log statt">
								<div class = "travel-info">
									<div class="travel-name">동화 마을에서 즐기는 힐링!</div>
									<div class= "loca"><div class="small-loca"></div>할슈타트, 오스트리아</div>
									<div class ="date"><div class="small-cal"></div>2017.03 ~ 2017. 05 (3개월간)</div>
								</div>
							</div>
			
							<div class = "travel-log german">
								<div class = "travel-info">
									<div class="travel-name">디스니 성의 원조를 찾아서</div>
									<div class= "loca"><div class="small-loca"></div>뮌헨, 독일</div>
									<div class ="date"><div class="small-cal"></div>2017.03 ~ 2017. 04 (2개월간)</div>
								</div>
							</div>
							
						</section>
					
				</section>
				
	 		</section> 