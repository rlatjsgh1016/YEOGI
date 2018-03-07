<%@page import="com.yeogi.jspweb.dao.FriendDao"%>
<%@page import="com.yeogi.jspweb.dao.jdbc.JdbcFriendDao"%>
<%@page import="com.yeogi.jspweb.entity.Friend"%>
<%@page import="com.yeogi.jspweb.dao.jdbc.JdbcMemberDao"%>
<%@page import="com.yeogi.jspweb.dao.MemberDao"%>
<%@page import="com.yeogi.jspweb.entity.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<% 
	Member member = new Member();
	FriendDao friend = new JdbcFriendDao();
	Friend fri = new Friend();
	
	fri.setAcceptYN("N");
	fri.setFriendId("kimsh");
	fri.setId("");
	fri.setMyId("sist1218");

	
	friend.insert(fri);
	

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