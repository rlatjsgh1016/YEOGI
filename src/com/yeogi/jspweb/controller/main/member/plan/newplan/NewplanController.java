package com.yeogi.jspweb.controller.main.member.plan.newplan;

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

@WebServlet("/main/member/plan/newplan/newplan")
public class NewplanController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		//String tPlanId = request.getParameter("tPlanId");
		
		TourPlanDao tourPlanDao = new JdbcTourPlanDao();		
		RequestDispatcher dispatcher 
			= request.getRequestDispatcher("/WEB-INF/views/main/member/plan/newplan/new-plan.jsp");
		dispatcher.forward(request, response);
		
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		//System.out.println(request.getParameter("theme"));
		
		TourPlan tourPlan = new TourPlan();
		tourPlan.setId("1");
		tourPlan.setmId("sist1218");
		tourPlan.setTitle(request.getParameter("title"));
		
		
		//date 형변환
		//여행시작일
		String startDateStr = request.getParameter("start-date");  
	    //SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	    Date startDate = java.sql.Date.valueOf(startDateStr);
	    tourPlan.setStartDate(startDate);
	    
	    //여행종료일
	    String endDateStr = request.getParameter("end-date");  
	    Date endDate = java.sql.Date.valueOf(endDateStr);
	    tourPlan.setEndDate(endDate);
	    
	    //날짜 변환
	    long diff = endDate.getTime() - startDate.getTime();
	    long diffDays = diff / (24 * 60 * 60 * 1000);
	    tourPlan.setPeriod((int)diffDays+1);
	    
		tourPlan.settTheme(request.getParameter("theme"));
		tourPlan.setCompanion(Integer.parseInt(request.getParameter("companion")));
		//Integer.parseInt(request.getParameter("companion"))
				
		TourPlanDao tourPlanDao = new JdbcTourPlanDao();
		tourPlanDao.insert(tourPlan);
		

		
		/*response.sendRedirect("../search-plan/search-plan.jsp");*/
	}
}
