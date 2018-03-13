package com.yeogi.jspweb.controller.main.member.mypage.myinfoedit;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

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
import com.yeogi.jspweb.dao.jdbc.JdbcMemberDao;
import com.yeogi.jspweb.entity.Member;

@WebServlet("/main/member/mypage/my-info-edit/my-info-edit")
public class MyInfoEditController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		Member member = new Member();
		MemberDao mem = new JdbcMemberDao();
		
		try {
			member = mem.getId("sist1218");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("member", member);
		
/*		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/main/member/mypage/my-info-edit/my-info-edit.jsp");
		
		dispatcher.forward(request, response);
		*/

		// TODO Auto-generated method stub
		ApplicationContext applicationContext = ServletUtil
				.getApplicationContext(request.getSession().getServletContext());
		TilesContainer container = TilesAccess.getContainer(applicationContext);
		ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
		container.render("main.member.mypage.my-info-edit.my-info-edit", servletRequest);
	
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
		
		case "회원탈퇴":
			member.delete(temp);
			
			response.sendRedirect("join.jsp");
			break;
			
		case "메일 중복확인" : 
			String mail =  request.getParameter("mailinput");

			
			PrintWriter outt = response.getWriter(); 

			try {
				mem = member.getMail(mail);
			} catch (ClassNotFoundException | SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
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

			try {
				mem = member.getName(name);
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
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
			
			try {
				member.update(mem);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			response.sendRedirect("my-info-edit.jsp");
			
			break;
		}
	}
	
	
}
