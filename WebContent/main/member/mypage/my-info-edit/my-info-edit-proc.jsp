<%@page import="com.yeogi.jspweb.dao.jdbc.JdbcMemberDao"%>
<%@page import="com.yeogi.jspweb.dao.MemberDao"%>
<%@page import="com.yeogi.jspweb.entity.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%


	String btn = null;

	String btn_ = request.getParameter("btn");
	String temp = request.getParameter("id");
	
	
	if(btn_ != null && !btn_.equals(""))
		btn = btn_;
	
	Member mem = new Member();
	MemberDao member = new JdbcMemberDao();

	
	switch(btn) {
	
	case "탈퇴하기":
		member.delete(temp);
		
		response.sendRedirect("join.jsp");
		break;
		
	case "중복확인" : 
		String id =  request.getParameter("id");

		String message = "아이디가 중복됩니다.";
		mem = member.get(id);
		if( mem != null)	
		{
			System.out.println(message);
		}
		response.sendRedirect("join.jsp");
		break;
		
	case "수정하기" :
		break;
	}

	

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>