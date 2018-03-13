package com.yeogi.jspweb.controller.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

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


@WebServlet("/main/login")
public class LoginController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ApplicationContext applicationContext = ServletUtil
				.getApplicationContext(request.getSession().getServletContext());
		TilesContainer container = TilesAccess.getContainer(applicationContext);
		ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
		container.render("main.login", servletRequest);
	
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String id= request.getParameter("id");
		String pwd= request.getParameter("pwd");
		
		MemberDao memberDao = new JdbcMemberDao();
		
		Member member = null;
		
		try {
			member = memberDao.getId(id);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(member == null) {
			out.println("<script>alert('아이디와 비밀번호를 확인해주세요'); location.href='login'; </script>" );
			//response.sendRedirect("login?error=1");
		}
		else if(!member.getPwd().equals(pwd)){
			out.println("<script>alert('아이디와 비밀번호를 확인해주세요'); location.href='login'; </script>" );
		}
		else {
			//인증이 성공한 경우
			/*
			 * HttpSession session = request.getSession();
			 * session.setAttribute("id",id_);
			 * 밑에 꺼랑 둘이 같은거 
			 */
			request.getSession().setAttribute("id", id);
			
			
			String returnUrl = request.getParameter("returnurl");
			if(returnUrl != null)
				response.sendRedirect(returnUrl);
			
			else {
		
			response.sendRedirect("main");
			}
		}
			
	}
}
