<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id = "body">
		<div class="root-container" > <!-- 따옴표 안에 clear-fix --> 
			
			<!-- main 시작-------------------------------------------------------------------------------------------------------------- --> 
		
				<section id ="main">

				<form method ="post">
						<div class="title">
							LOG-IN 
						</div>
						
						<div class="login">
	
							<fieldset >
							
							<div id = "footer_logo">		
								<div id = "footer_bar">
								</div>
							</div>
							
							<legend class="hidden">검색필드</legend>
								<label>아이디&nbsp;&nbsp;&nbsp;</label>
								<input type ="text" name="id"/> 
								<br>
								<label>비밀번호&nbsp; </label>
								<input type ="password" name="pwd"/> 
								<br><br>
								<input class="btn btn-important" type ="submit" value ="로그인"/>							
								<a href= "join.jsp"><input class="btn btn-important" type ="button" value ="회원가입"/></a>
								<input class="btn btn-cancel" type ="button" value ="로그인 정보 찾기"/>
							</fieldset>
							
						</div>
					
				</section>
				
	 		</form> 

		</div>
		
	</div>