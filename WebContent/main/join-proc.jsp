<%@page import="com.yeogi.jspweb.entity.Member"%>
<%@page import="com.yeogi.jspweb.dao.jdbc.JdbcMemberDao"%>
<%@page import="com.yeogi.jspweb.dao.MemberDao"%>
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
	
	case "회원가입":
		mem.setId(request.getParameter("id"));
		mem.setName(request.getParameter("name"));
		mem.setEmail(request.getParameter("email"));
		mem.setPwd(request.getParameter("pwd"));
		mem.setPhone(request.getParameter("phone"));
		mem.setBirth(request.getParameter("birth"));
		mem.setAdminYn("N");
		
		//System.out.printf("%s, %s, %s, %s, %s, %s", mem.getId(), mem.getName(), mem.getEmail(), mem.getPhone(), mem.getPwd(), mem.getAdminYn());	
		
		member.insert(mem);
		
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