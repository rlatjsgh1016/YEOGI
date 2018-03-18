<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href = "../../../../CSS/new-plan.css"  type="text/css" rel="stylesheet"/>
</head>
<body>
<div id="newForm">
		<form method="post">
				<h1>새 일정</h1>

			<div id="travelName">
				<input type="text" name="title" laceholder="여행제목" />
			</div>

			<div id="date">
				<p>
					<input type="date" name="start-date" placeholder="출발일" />
				</p>
				<p id="right-date">
					<input type="date" name="end-date" placeholder="귀국일" />
				</p>
			</div>

			<div id="with">
				<p>
					<select name="theme">
							<option>나홀로 여행</option>
							<option>친구와 함께</option>
							<option>가족과 함께</option>
							<option>단체 여행</option>
							<option>패키지 여행</option>
							<option>커플 여행</option>
							
					</select>
				</p>

				<p id="right-select">
					<select name="companion">
							<option>1</option>
							<option>2</option>
							<option>3</option>
							<option>4</option>
							<option>5</option>
							<option>6+</option>
					</select>
				</p>
			</div>

			<input type="submit" id="newbutton" value="등록">
			<!-- <a href="../searchplan/search-plan.html"></a> -->

		</form>
	</div>
</body>
</html>