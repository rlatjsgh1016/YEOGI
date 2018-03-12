package com.yeogi.jspweb.controller.main.member.plan.wishbox;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yeogi.jspweb.dao.TPlanPostDao;
import com.yeogi.jspweb.dao.TourPlanDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTPlanPostDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTourLogDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTourPlanDao;
import com.yeogi.jspweb.entity.TPlanPost;
import com.yeogi.jspweb.entity.TourPlan;

@WebServlet("/main/member/plan/wishbox/wishbox-national")
public class WishboxnationalController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String tPlanId = request.getParameter("tPlanId");
		
		TourPlanDao tourPlanDao = new JdbcTourPlanDao();
		TourPlan tourPlan = tourPlanDao.get("1");
		
		request.setAttribute("tourPlan", tourPlan);
		RequestDispatcher dispatcher 
			= request.getRequestDispatcher("/WEB-INF/views/main/member/plan/wishbox/wishbox-national.jsp");
		dispatcher.forward(request, response);
			
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		//System.out.println(request.getParameter("theme"));
		
		
		/*response.sendRedirect("../search-plan/search-plan.jsp");*/
	}
}
