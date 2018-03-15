<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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
		
		<form method="post" enctype="multipart/form-data">
		<div class="margin-top first">
				<h3 class="hidden">오류 내용</h3>
				<table class="table">
					<tbody>
						<tr>
							<th>제목</th>
							<td class="text-align-left text-indent text-strong text-orange" colspan="3">
								<input name="title" type="text" required/>
							</td>
						</tr>
						<tr>
							<th>사용한 언어</th>
							<td colspan="3" class="text-align-left text-indent">
								<input type="text" placeholder="언어:버전,언어:버전,...(버전을 모를 경우 0.) 예)&nbsp;java:8,sql:0,javascript:es5,..." name="language"  pattern="^(\w+:[\w.\d]*,*)+$"/>			
							</td>
						</tr>
						<tr>
							<th>사용한 플랫폼</th>
							<td colspan="3" class="text-align-left text-indent">
								<input type="text" placeholder="플랫폼:버전,플랫폼:버전,... 예) java:8,servlet:3.0,jsp:2.3,spring:4.0,..." name="platform" pattern="^(\w+:[\w.\d]*,*)+$" />			
							</td>
						</tr>
						<tr>
							<th>사용한 실행환경</th>
							<td colspan="3" class="text-align-left text-indent">
								<input type="text" placeholder="런타임:버전,런타임:버전,... 예) tomcat:8,..." name="runtime" pattern="^(\w+:[\w.\d]*,*)+$"/>		
							</td>							
						</tr>										
						<tr>
							<th>오류 코드</th>
							<td class="text-align-left text-indent text-strong text-orange" colspan="3">
								<input name="error-code" type="text" />
							</td>
						</tr>
						<tr>
							<th>오류 메시지</th>
							<td class="text-align-left text-indent text-strong text-orange" colspan="3">
								<input name="error-msg" type="text" />
							</td>
						</tr>	
						
						<!-- 파일첨부하기 -->
						<tr>
							<th>첨부파일</th>
							<td class="text-align-left text-indent text-strong text-orange" colspan="3">
								<input name="attached" type="file" />
							</td>
						</tr>
						
						
												
						<tr>
							<th colspan="4">오류 상황</th>
						</tr>
						<tr>
							<td colspan="4" class="text-align-left" style="padding:10px 0px 10px 10px;">
								<textarea name="situation" style="min-height: 200px;vertical-align: middle;"></textarea>
							</td>
						</tr>
						<tr>
							<th colspan="4">시도해본 내용</th>
						</tr>
						<tr>
							<td class="text-align-left" colspan="4" style="padding:10px 0px 10px 10px;">
								<textarea name="triedToFix" style="min-height: 200px;vertical-align: middle;"></textarea>
							</td>
						</tr>
						<tr>
							<th colspan="4">알아낸 오류 원인</th>
						</tr>
						<tr>
							<td class="text-align-left" colspan="4" style="padding:10px 0px 10px 10px;">
								<textarea name="reason" style="min-height: 200px;vertical-align: middle;"></textarea>
							</td>
						</tr>
						
						<tr>
							<th colspan="4">해결방법</th>
						</tr>
						<tr>
							<td class="text-align-left" colspan="4" style="padding:10px 0px 10px 10px;">
								<textarea name="how-to-fix" style="min-height: 200px;vertical-align: middle;"></textarea>
							</td>
						</tr>
						
					</tbody>
				</table>
			</div>
			
			<div class="margin-top text-align-center">
				<input type="submit" class="btn-text btn-default" value="문의글 등록하기" />
				<a class="btn-text btn-cancel" href="list.jsp">취소</a>
			</div>
			</form>
						
	</main>