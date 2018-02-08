<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>detail page</title>
	<link type="text/css" href="../../../../CSS/story-write.css" rel="stylesheet">
</head>
	<body>
		<div class="detail-post-box">
			<div class="detail-title-box">
				<p>포스트작성</p>
			</div>
			<div class="detail-form-box">
				<form action="main.jsp">
					<fieldset>
						<textarea class="detail-textarea" name="review" rows="" cols=""></textarea>
						<div class="detail-position-box">
							<img alt="위치" src="">
							<input type="text" name="location" value="" placeholder="장소를 등록해주세요 :)">
							<label for="vehicle" >이동수단</label>
							<select id="vehicle" name="vehicle">
								<option>비행기</option>
								<option>기차</option>
								<option>지하철</option>	
								<option>버스</option>
								<option>도보</option>
								<option>택시</option>
								<option>배</option>
								<option>자가용</option>
								<option>기타</option>
							</select>
						</div>
						<div class="detail-spend">
							<img alt="화폐" src="">
							<select >
								<option>입장료</option>
								<option>숙박비</option>
								<option>식비</option>
								<option></option>
								<option></option>
								<option></option>
								<option></option>
								<option></option>
							</select>
							<input type="text">
							<select>
								<option>KRW(한국)</option>
								<option></option>
								<option></option>
								<option></option>
								<option></option>
								<option></option>
								<option></option>
								<option></option>
							</select>
							<input type="number">
							<button><img alt="행추가" src=""></button>
							<button><img alt="행삭제" src=""></button>
						</div>
						<div>
							<img alt="태그" src="">
							<input type="text">
						</div>
						<div>
							<button><img alt="사진추가" src=""></button>
							<button type="submit">저장</button>
						</div>
						<div id="map"></div>
					</fieldset>
				</form>
			</div>
		</div>
	</body>
</html>
