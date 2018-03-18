<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
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
	
	case "회원탈퇴":
		member.delete(temp);
		
		response.sendRedirect("join.jsp");
		break;
		
	case "메일 중복확인" : 
		String mail =  request.getParameter("mailinput");

		
		PrintWriter outt = response.getWriter(); 

		mem = member.getMail(mail);
		if( mem != null)	
		{

			outt.println("<script type=\'text/javascript\'>"); 
			outt.println("alert('이메일이 중복됩니다');"); 
			outt.println("location.href ='mail-check-form.jsp';");
			outt.println("</script>"); 	
		}
		else{
			outt.println("<script type=\'text/javascript\'>"); 
			outt.println("alert('사용가능한 이메일입니다.');"); 
			outt.println("location.href ='mail-check-form.jsp';");
			outt.println("</script>"); 	
			
		}
		break;
		
	case "별명 중복확인" : 
		String name =  request.getParameter("nameinput");

		
		PrintWriter outtt = response.getWriter(); 

		mem = member.getName(name);
		if( mem != null)	
		{

			outtt.println("<script type=\'text/javascript\'>"); 
			outtt.println("alert('별명이 중복됩니다');"); 
			outtt.println("location.href ='name-check-form.jsp';");
			outtt.println("</script>"); 	
		}
		else{
			outtt.println("<script type=\'text/javascript\'>"); 
			outtt.println("alert('사용가능한 별명입니다.');"); 
			outtt.println("location.href ='name-check-form.jsp';");
			outtt.println("</script>"); 	
			
		}
		break;
		
	case "수정하기" :
		mem.setId("sist1218");
		mem.setName(request.getParameter("name"));
		mem.setEmail(request.getParameter("mail"));
		mem.setPwd(request.getParameter("newPwd"));
		mem.setPhone(request.getParameter("phone"));
		
		String dateStr = request.getParameter("birth");  
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

		Date date = java.sql.Date.valueOf(dateStr);
		
		mem.setBirthday(date);
		mem.setAdminYN("N");
		
		//System.out.printf("%s, %s, %s, %s, %s, %s", mem.getId(), mem.getName(), mem.getEmail(), mem.getPhone(), mem.getPwd(), mem.getAdminYn());	
		
		member.update(mem);
		
		response.sendRedirect("my-info-edit.jsp");
		
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