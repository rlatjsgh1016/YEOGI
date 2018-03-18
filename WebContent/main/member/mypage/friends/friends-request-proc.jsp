<%@page import="java.io.PrintWriter"%>
<%@page import="com.yeogi.jspweb.dao.FriendDao"%>
<%@page import="com.yeogi.jspweb.dao.jdbc.JdbcFriendDao"%>
<%@page import="com.yeogi.jspweb.entity.Friend"%>
<%@page import="com.yeogi.jspweb.dao.jdbc.JdbcMemberDao"%>
<%@page import="com.yeogi.jspweb.dao.MemberDao"%>
<%@page import="com.yeogi.jspweb.entity.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<% 
	FriendDao friend = new JdbcFriendDao();
	Friend fri = new Friend();
	
	String id= (String) request.getSession().getAttribute("id");
	Member m = ((Member)request.getSession().getAttribute("mem"));
	String fid = m.getId();
	
	
	fri.setAcceptYN("N");
	fri.setFriendId(fid);
	fri.setMyId(id);

	friend.insert(fri);
	
	PrintWriter outt = response.getWriter();
	
	outt.println("<script type=\'text/javascript\'>"); 
	outt.println("alert('친구신청을 완료하였습니다');"); 
	outt.println("opener.location.reload();");
	outt.println("window.close();");
	
	outt.println("</script>"); 	
	//response.sendRedirect("friends");

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
