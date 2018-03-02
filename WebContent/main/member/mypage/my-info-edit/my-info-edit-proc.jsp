<%@page import="java.sql.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="com.yeogi.jspweb.dao.jdbc.JdbcMemberDao"%>
<%@page import="com.yeogi.jspweb.dao.MemberDao"%>
<%@page import="com.yeogi.jspweb.entity.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
<script type="text/javascript">
function ret(){
	window.location="id-check-form.jsp";
}
</script>


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
		
		PrintWriter outtttt = response.getWriter(); 
		member.delete(temp);
		outtttt.println("<script type=\'text/javascript\'>"); 
		outtttt.println("alert('탈퇴가 정상적으로 처리되었습니다');"); 
		outtttt.println("location.href ='../../../main.html';");
		outtttt.println("</script>");
		break;
		
	case "메일 중복확인" : 
		PrintWriter outttt = response.getWriter(); 
		String mail =  request.getParameter("mailinput");
		

		mem = member.getMail(mail);
		if( mem != null)	
		{

			outttt.println("<script type=\'text/javascript\'>"); 
			outttt.println("alert('이메일이 중복됩니다');"); 
			outttt.println("location.href ='mail-check-form.jsp';");
			outttt.println("</script>"); 

			
		}
		else{
			outttt.println("<script type=\'text/javascript\'>"); 
			outttt.println("alert('사용가능한 이메일입니다.');"); 
			outttt.println("location.href ='mail-check-form.jsp';");
			outttt.println("</script>"); 	
			
		}
		
		break;
	case "별명 중복확인" : 
		PrintWriter outtt = response.getWriter(); 
		String name =  request.getParameter("nameinput");


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
		
	case "정보수정" :
		
		
		Member upMem = new Member();	
		PrintWriter outt = response.getWriter(); 
		
		upMem.setId("sist1218");
		upMem.setName(request.getParameter("name"));
		upMem.setEmail(request.getParameter("mail"));
		//System.out.println(request.getParameter("newPwd"));
		upMem.setPwd(request.getParameter("newPwd"));
		upMem.setPhone(request.getParameter("phone"));
		
		String dateStr = request.getParameter("birth");  
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

		Date date = java.sql.Date.valueOf(dateStr);
		
		
		upMem.setBirthday(date);
		upMem.setAdminYN("N");
		
		//System.out.printf("%s, %s, %s, %s, %s, %s", mem.getId(), mem.getName(), mem.getEmail(), mem.getPhone(), mem.getPwd(), mem.getAdminYn());	
		
		member.update(upMem);
		
		outt.println("<script type=\'text/javascript\'>"); 
		outt.println("alert('회원정보가 정상적으로 처리되었습니다.');"); 
		outt.println("location.href ='my-info-edit.jsp';");
		outt.println("</script>"); 	
		
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