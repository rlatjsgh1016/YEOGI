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

import com.yeogi.jspweb.dao.LocDao;
import com.yeogi.jspweb.dao.TPlanPostDao;
import com.yeogi.jspweb.dao.TourPlanDao;
import com.yeogi.jspweb.dao.jdbc.JdbcLocDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTPlanPostDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTourLogDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTourPlanDao;
import com.yeogi.jspweb.entity.Loc;
import com.yeogi.jspweb.entity.TPlanPost;
import com.yeogi.jspweb.entity.TourPlan;
@MultipartConfig(
	      fileSizeThreshold = 1024*1024,
	      maxFileSize = 1024*1024*100,   //   100메가
	      maxRequestSize = 1024*1024*100*5   //   100메가
	      )
@WebServlet("/main/member/plan/searchplan/search-plan")
public class SearchplanController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		TourPlanDao tourPlanDao = new JdbcTourPlanDao();
/*		TourPlan tourPlan = tourPlanDao.get("1");
			
		request.setAttribute("tourPlan", tourPlan);*/
		RequestDispatcher dispatcher 
			= request.getRequestDispatcher("/WEB-INF/views/main/member/plan/searchplan/search-plan.jsp");
		dispatcher.forward(request, response);
			
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		//System.out.println(request.getParameter("theme"));
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		//String id = tempId.substring(0,13);
		String name = request.getParameter("name");
		String nation = request.getParameter("nation");
		String address = request.getParameter("address");
		
		String type = "음식점";
		String img = "https://maps.googleapis.com/maps/api/place/photo?maxwidth=400&photoreference=CmRaAAAA2jOnuD_oO6bVGCplmaTxWCSSNGNwGf_zAuBCTC84QNMxaqWv2rAinzJCkrqRkdofiz3MYH2i_nicskL0VxEXe2MkrPEi8y3JYd-stPLI_sT0lwAhdB4Xv5U_o5lx4rOGEhCS6X_xDQjwM_RWiMXb6SaAGhQd31kmhdAf58e5bp_IAijKmpr4Jg&key=AIzaSyAfcHbvgPNc6lfCcsU7NaG1xc2qO6heLFU";
		String detail = "여기가 어떤 곳인지 알려드리지요";
		
		Loc loc = new Loc();
		loc.setId(id);
		loc.setName(name);
		loc.setNation(nation);
		loc.setImg(img);
		loc.setAddress(address);
		loc.setDetail(detail);
		loc.setType(type);
		
		LocDao locDao = new JdbcLocDao();
		locDao.insert(loc);
		
		
		/*response.sendRedirect("../search-plan/search-plan.jsp");*/
	}
}

