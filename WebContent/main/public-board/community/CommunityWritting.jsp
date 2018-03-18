<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- main 시작------------------------------------------------------------------------------------------------------------- --> 
	<main>
		<div class ="allmain clear">
			<div class ="leftmain">
				<table border = "5">
					<h1>메인메뉴</h1>
					<div>
						<tr>
							<td class ="sidemenu">
								<a>
									<a href="reg" class="btn btn-text default-btn">월간BEST</a>	
								</a>
							</td>
						</tr>
						<tr>
							<td class ="sidemenu">
								<a>
									<a href="reg" class="btn btn-text default-btn">공지게시판</a>	
								</a>
							</td>
						</tr>
						<tr>
							<td class ="sidemenu">
								<a>
									<a href="reg" class="btn btn-text default-btn">질문게시판</a>	
								</a>
							</td>
						</tr>
						<tr>
							<td class ="sidemenu">
								<a>
									<a href="reg" class="btn btn-text default-btn">정보게시판</a>	
								</a>
							</td>
						</tr>
						<tr>
							<td class ="sidemenu">
								<a>
									<a href="reg" class="btn btn-text default-btn">동행게시판</a>	
								</a>
							</td>
						</tr>
						<tr>
							<td class ="sidemenu">
								<a>
									<a href="reg" class="btn btn-text default-btn">잡담게시판</a>	
								</a>
							</td>
						</tr>
					</div>	
				</table>
			</div>

			<div class ="rightmain">
			<p class="p1">
			<div>
				<form class="form-control" action="">
					<fieldset>
					<legend>포스트 작성</legend>
					<label class="reg" for="class">분류</label>
					<select id="class">
						<option>공지</option>
						<option>질문</option>
						<option>정보</option>
						<option>동행</option>
						<option>잡담</option>
					</select>
					<input type="text" class="input1" name="title">
					<textarea rows="10" cols="" class="text-area"></textarea>
					<div class ="clear"></div>
					<input class="btn btn-image btn-search" type="submit" value="사진추가">
					<input class="btn btn-image btn-search" type="submit" value="등록">
					</fieldset>
				</form>
			</div>
			</div>
			<div class ="rightmain clear">
		</div>
	</main>
