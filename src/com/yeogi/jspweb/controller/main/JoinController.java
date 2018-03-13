package com.yeogi.jspweb.controller.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tiles.TilesContainer;
import org.apache.tiles.access.TilesAccess;
import org.apache.tiles.request.ApplicationContext;
import org.apache.tiles.request.servlet.ServletRequest;
import org.apache.tiles.request.servlet.ServletUtil;

import com.yeogi.jspweb.dao.MemberDao;
import com.yeogi.jspweb.dao.TPlanPostDao;
import com.yeogi.jspweb.dao.jdbc.JdbcMemberDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTPlanPostDao;
import com.yeogi.jspweb.entity.Member;
import com.yeogi.jspweb.entity.TPlanPost;
@WebServlet("/main/join")
public class JoinController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getSession().getAttribute("id") != null)
	      {
	         response.sendRedirect("already-join");
	      }
		else {
			ApplicationContext applicationContext = ServletUtil
					.getApplicationContext(request.getSession().getServletContext());
			TilesContainer container = TilesAccess.getContainer(applicationContext);
			ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
			container.render("main.join", servletRequest);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String btn = null;

		String btn_ = request.getParameter("btn");
		String temp = request.getParameter("id");
		
		
		if(btn_ != null && !btn_.equals(""))
			btn = btn_;
		
		Member mem = new Member();
		MemberDao member = new JdbcMemberDao();

		
		switch(btn) {
		
		case "회원가입":
			
			PrintWriter out = response.getWriter(); 
			
			mem.setId(request.getParameter("id"));
			mem.setName(request.getParameter("name"));
			mem.setEmail(request.getParameter("email"));
			mem.setPwd(request.getParameter("pwd"));
			mem.setPhone(request.getParameter("phone"));
			
			String dateStr = request.getParameter("birth");  
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

			Date date = java.sql.Date.valueOf(dateStr);
			
			mem.setBirthday(date);
			mem.setAdminYN("N");
			
			//System.out.printf("%s, %s, %s, %s, %s, %s", mem.getId(), mem.getName(), mem.getEmail(), mem.getPhone(), mem.getPwd(), mem.getAdminYn());	
			
			try {
				member.insert(mem);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			response.sendRedirect("main/join-celeb");
			break;
			
		case "ID 중복확인" : 
			String id =  request.getParameter("idinput");

			
			PrintWriter outt = response.getWriter(); 
			String message = "아이디가 중복됩니다.";

			try {
				mem = member.getId(id);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if( mem != null)	
			{

				outt.println("<script type=\'text/javascript\'>"); 
				outt.println("alert('아이디가 중복됩니다');"); 
				outt.println("location.href ='id-check-form.jsp';");
				outt.println("</script>"); 	
			}
			else{
				outt.println("<script type=\'text/javascript\'>"); 
				outt.println("alert('사용가능한 아이디입니다.');"); 
				outt.println("location.href ='id-check-form.jsp';");
				outt.println("</script>"); 	
				
			}
			break;
			
		case "별명 중복확인" : 
			PrintWriter outtt = response.getWriter(); 
			String name =  request.getParameter("nameinput");

			message = "별명이 중복됩니다.";

			try {
				mem = member.getName(name);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
			
		case "메일 중복확인" :
			PrintWriter outttt = response.getWriter(); 
			String mail =  request.getParameter("mailinput");
			
			message = "이메일이 중복됩니다.";

			try {
				mem = member.getMail(mail);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
		}


	}
}
