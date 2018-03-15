<%@page import="com.newlecture.jspprj.dao.jdbc.JdbcAnswerisDao"%>
<%@page import="com.newlecture.jspprj.dao.AnswerisDao"%>
<%@page import="com.newlecture.jspprj.entity.Answeris"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <jsp:useBean id="answeris" class="com.newlecture.jspprj.entity.Answeris"> 
	<jsp:setProperty name="answer" property="title" name="title"/>
</jsp:useBean> --%> 
<%
	Answeris answeris = new Answeris(); //객체 만들어 준다
	answeris.setTitle(request.getParameter("title")); //타이틀 가져온다
	answeris.setWriterId("jmg");
	
	AnswerisDao answerisDao = new JdbcAnswerisDao(); //다오객체 만들어준다
	answerisDao.insert(answeris); //다오에서 인서트 한다
	
	response.sendRedirect("list.jsp");
	


	//out.print(answeris.getTitle());
%>