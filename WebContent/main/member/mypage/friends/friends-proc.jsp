<%@page import="com.yeogi.jspweb.dao.FriendDao"%>
<%@page import="com.yeogi.jspweb.dao.jdbc.JdbcFriendDao"%>
<%@page import="com.yeogi.jspweb.entity.Friend"%>
<%@page import="java.io.PrintWriter"%>
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

	
	Friend fri = new Friend();
	FriendDao friend = new JdbcFriendDao();
	
	switch(btn) {
	
	case "검색":
		//System.out.println(temp);
		
		PrintWriter outt = response.getWriter(); 

		mem = member.getId(temp);
		
		if( mem != null)	
		{

			outt.println("<script type=\'text/javascript\'>"); 
			outt.println("alert('해당 회원이 있습니다.');"); 
			outt.println("location.href ='friends.jsp';");
			outt.println("</script>"); 	
			request.setAttribute("mem", mem);
			RequestDispatcher dispatcher = request.getRequestDispatcher("friends.jsp");
			dispatcher.forward(request, response);
		}
		else{
			outt.println("<script type=\'text/javascript\'>"); 
			outt.println("alert('해당회원이 없습니다.');"); 
			outt.println("location.href ='friends.jsp';");
			outt.println("</script>"); 	
			
		}
				
		member.getId(temp);
		//response.sendRedirect("join.jsp");
		break;
	case "친구신청":
		PrintWriter outtt = response.getWriter(); 
		outtt.println("<script type=\'text/javascript\'>"); 
		outtt.println("location.href ='friends.jsp';");
		outtt.println("</script>"); 	
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