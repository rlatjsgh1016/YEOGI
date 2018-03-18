package com.yeogi.jspweb.controller.main.member.plan.searchplan;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tiles.TilesContainer;
import org.apache.tiles.access.TilesAccess;
import org.apache.tiles.request.ApplicationContext;
import org.apache.tiles.request.servlet.ServletRequest;
import org.apache.tiles.request.servlet.ServletUtil;

import com.yeogi.jspweb.dao.LocDao;
import com.yeogi.jspweb.dao.TPlanLocDao;
import com.yeogi.jspweb.dao.TPlanPostDao;
import com.yeogi.jspweb.dao.TourPlanDao;
import com.yeogi.jspweb.dao.jdbc.JdbcLocDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTPlanLocDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTPlanPostDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTourLogDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTourPlanDao;
import com.yeogi.jspweb.entity.TPlanLoc;
import com.yeogi.jspweb.entity.TPlanPost;
import com.yeogi.jspweb.entity.TourPlan;
@MultipartConfig(
	      fileSizeThreshold = 1024*1024,
	      maxFileSize = 1024*1024*100,   //   100메가
	      maxRequestSize = 1024*1024*100*5   //   100메가
	      )
@WebServlet("/main/member/plan/searchplan/search-detail")
public class SearchdetailController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String tPlanId = request.getParameter("tPlanId");
		
		TourPlanDao tourPlanDao = new JdbcTourPlanDao();
		String latestId = tourPlanDao.getLatestId();
		//System.out.println(latestId);
		TourPlan tourPlan = tourPlanDao.get(latestId);
		
		request.setAttribute("tourPlan", tourPlan);
		
		
		RequestDispatcher dispatcher 
			= request.getRequestDispatcher("/WEB-INF/views/main/member/plan/searchplan/search-detail.jsp");
		dispatcher.forward(request, response);
		
		/*ApplicationContext applicationContext = ServletUtil
				.getApplicationContext(request.getSession().getServletContext());
		TilesContainer container = TilesAccess.getContainer(applicationContext);
		ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
		container.render("main.member.plan.searchplan", servletRequest);*/
			
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		//System.out.println(request.getParameter("theme"));
		
		TPlanLoc tPlanLoc = new TPlanLoc();
		TPlanPost tPlanPost = new TPlanPost();
		
		
		TourPlanDao tourPlanDao = new JdbcTourPlanDao();
		String tourPlanLatestId = tourPlanDao.getLatestId();
		
	
		
		//TourPlan tourPlan = tourPlanDao.get(tourPlanLatestId);
		
		//장소id
		String id = request.getParameter("id");
		tPlanLoc.setLocId(id);
		System.out.println(id);
		
		//tplanLoc -> 넣기
		tPlanLoc.setTPlanId(tourPlanLatestId);
		TPlanLocDao tPlanLocDao = new JdbcTPlanLocDao();
		tPlanLocDao.insert(tPlanLoc);
		
		TPlanLocDao tourPlanLocDao = new JdbcTPlanLocDao();
		String tourPlanLocLatestId = tourPlanLocDao.getLatestId();
		//tPlanPost -> 계획넣기
		tPlanPost.setTourDateTime(request.getParameter("time"));
		tPlanPost.setTPlanId(tourPlanLatestId);
		tPlanPost.setTPlanLocId(tourPlanLocLatestId);
		
		TPlanPostDao tPlanPostDao = new JdbcTPlanPostDao();
		tPlanPostDao.insert(tPlanPost);
		
		/*response.sendRedirect("../search-plan/search-plan.jsp");*/
	}
}
