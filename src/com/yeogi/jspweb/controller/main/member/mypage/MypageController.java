package com.yeogi.jspweb.controller.main.member.mypage;

import java.io.IOException;
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

@WebServlet("/main/member/mypage/mypage")
public class MypageController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		
		
		if(request.getSession().getAttribute("id")==null)
		{
			response.sendRedirect("../../login?returnurl=../main/member/mypage/mypage");
		}
		
		else {
			
			String id = (String) request.getSession().getAttribute("id");
			
			Member member = new Member();
			MemberDao memberDao = new JdbcMemberDao();
			
			try {
				member = memberDao.getId(id);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			request.setAttribute("member", member);
			
			ApplicationContext applicationContext = ServletUtil
					.getApplicationContext(request.getSession().getServletContext());
			TilesContainer container = TilesAccess.getContainer(applicationContext);
			ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
			container.render("main.member.mypage.mypage", servletRequest);
		}
	}
	
}
