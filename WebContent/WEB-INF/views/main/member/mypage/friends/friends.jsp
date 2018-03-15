<%@page import="java.util.List"%>
<%@page import="com.yeogi.jspweb.entity.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
		<section id ="main">

				<section>
				<form action="friends-proc.jsp">
				<span class="title">친구 검색</span>
				
					<input name="id" class="title-box" type="text" maxlength="40" placeholder=" 사용자 아이디를 검색하세요"> <input type="submit" class="btn btn-cancel" name="btn" value="검색" style="height: 30px;">
				
					<% Member m = ((Member)request.getSession().getAttribute("mem")); 
						if(m != null){
					
					%>
						<div name="mem" style ="width: 295px; height: 30px; border:1px solid #BDBDBD; margin-left: 120px; padding-left:0px; padding-top:5px; padding-bottom:5px; border-radius:5px;">
							<img src="../../../../resources/unknown-person.png" width="21px" hspace="5px" style ="padding-top: 0px; padding-left:10px;"/>
						     ID ${mem.id}(${mem.name}) <input type="button" name="btn" class="btn btn-cancel" value ="친구신청" onclick="request()"/>
						</div>

					<% } %>
		
				</form>
						<section class = "title">
							요청한 친구요청
						</section>
						
						<section class = "travel-cont">
					
					<c:if test="${fn:length(list2) > 0 }">
						<c:forEach var="fri2" items="${list2}">
						
							<div class="friends-list">
								<img src="../../../../resources/unknown-person.png" width="150px" hspace="10px"/>
								<div class="friends-list-info">
									${fri2.friendId }<br>
									${fri2.reqDate }
								</div>
								<form class="friends-req">
									수락대기중
								</form>
							</div>
							
						</c:forEach>
					</c:if>					
					<c:if test="${fn:length(list2) == 0 }">
						<span style="padding-left: 50px; color: gray;">요청한 친구신청이 없습니다</span>
					</c:if>
					
						</section>
						
						<div class="line"></div>
						
						
						<section class = "title">
							요청받은 친구요청
						</section>
						
						<section class = "travel-cont">
					
					<c:if test="${fn:length(list) > 0 }">
						<c:forEach var="fri" items="${list}">
						
							<div class="friends-list">
								<img src="../../../../resources/unknown-person.png" width="150px" hspace="10px"/>
								<div class="friends-list-info">
									${fri.myId }<br>
									${fri.reqDate }
									
									<span class="hidden" name="fri" id ="fri" value="${fri.id }" >${fri.id }</span>
								</div>
							
								<form class="friends-req" action="friends-proc.jsp">
									친구요청 <span class="friends-answer" />수락</span> <span class="friends-answer" />거절</span>
								</form>
							</div>
							
						</c:forEach>
					</c:if>					
					<c:if test="${fn:length(list) == 0 }">
						<span style="padding-left: 50px; color: gray;">요청받은 친구신청이 없습니다</span>
					</c:if>
					
						</section>
						
						<div class="line"></div>
							
						
						
						
						
						<section class = "title">
							친구 목록
						</section>
						
						<section class = "travel-cont">
							<div class="friends-list">
								<img src="../../../../resources/unknown-person.png" width="150px" hspace="10px"/>
								<div class="friends-list-info">
									KIMSH<br>
									도리토스
								</div>
							</div>
							
							<div class="friends-list">
								<img src="../../../../resources/unknown-person.png" width="150px" hspace="10px"/>
								<div class="friends-list-info">
									KIMSH<br>
									도리토스
								</div>
							</div>
							
							<div class="friends-list">
								<img src="../../../../resources/unknown-person.png" width="150px" hspace="10px"/>
								<div class="friends-list-info">
									KIMSH<br>
									도리토스
								</div>
							</div>
							
							<div class="friends-list">
								<img src="../../../../resources/unknown-person.png" width="150px" hspace="10px"/>
								<div class="friends-list-info">
									KIMSH<br>
									도리토스
								</div>
							</div>
							
								<div class="friends-list">
								<img src="../../../../resources/unknown-person.png" width="150px" hspace="10px"/>
								<div class="friends-list-info">
									KIMSH<br>
									도리토스
								</div>
							</div>
						</section>
						
						<div class="line"></div>
						
						<section class = "travel-cont">
							<div class="friends-list">
								<img src="../../../../resources/unknown-person.png" width="150px" hspace="10px"/>
								<div class="friends-list-info">
									KIMSH<br>
									도리토스
								</div>
							</div>
							
							<div class="friends-list">
								<img src="../../../../resources/unknown-person.png" width="150px" hspace="10px"/>
								<div class="friends-list-info">
									KIMSH<br>
									도리토스
								</div>
							</div>
							
							<div class="friends-list">
								<img src="../../../../resources/unknown-person.png" width="150px" hspace="10px"/>
								<div class="friends-list-info">
									KIMSH<br>
									도리토스
								</div>
							</div>
							
							<div class="friends-list">
								<img src="../../../../resources/unknown-person.png" width="150px" hspace="10px"/>
								<div class="friends-list-info">
									KIMSH<br>
									도리토스
								</div>
							</div>
							
								<div class="friends-list">
								<img src="../../../../resources/unknown-person.png" width="150px" hspace="10px"/>
								<div class="friends-list-info">
									KIMSH<br>
									도리토스
								</div>
							</div>
						</section>
						
						<nav class="number-change hor-menu main-menu first-pad-none">
							<ul>
								<li><a href=""  class ="font-import">1</a></li>
								<li><a href="">2</a></li>
								<li><a href="">3</a></li>
								<li><a href="">4</a></li>
								<li><a href="">5</a></li>
							</ul>
						</nav>
						
					
				</section>
				
	 		</section> 
