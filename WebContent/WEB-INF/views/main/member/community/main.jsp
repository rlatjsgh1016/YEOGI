<%@page import="com.yeogi.jspweb.entity.Commu_Post_Cmt"%>
<%@page import="com.yeogi.jspweb.entity.Commu_Post"%>
<%@page import="com.yeogi.jspweb.entity.Commu_Post_Img"%>
<%@page import="com.yeogi.jspweb.dao.Commu_PostDao"%>
<%@page import="com.yeogi.jspweb.dao.Commu_Post_ImgDao"%>
<%@page import="com.yeogi.jspweb.dao.Commu_Post_CmtDao"%>
<%@page import="com.yeogi.jspweb.dao.jdbc.JdbcCommuPostImgDao"%>
<%@page import="com.yeogi.jspweb.dao.jdbc.JdbcCommuPostDao"%>
<%@page import="com.yeogi.jspweb.dao.jdbc.JdbcCommuPostCmtDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

c:set var="ctx" value="${pageContext.request.servletContext.contextPath}" />
<script src="${ctx}/js/community-write-main.js"></script>
<script type="text/javascript" src="http://js.nicedit.com/nicEdit-latest.js"></script> <script type="text/javascript">
//<![CDATA[
        bkLib.onDomLoaded(function() { nicEditors.allTextAreas() });
  //]]>
  </script>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>