<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- visual 시작------------------------------------------------------------------------------------------------------------- --> 
<visual>
	<form class="form-control">
			<fieldset>
				<legend class="c1">검색창</legend>
				
				<label class="reg" for="class">분류</label>
					<select id="class">
						<option>월간BEST</option>
						<option>공지</option>
						<option>질문</option>
						<option>정보</option>
						<option>동행</option>
						<option>잡담</option>
					</select>
				<input type="text"/>
				<input class="btn btn-image btn-search" type="submit" value="검색" />
			</fieldset>
		</form>
</visual>
</body>
</html>