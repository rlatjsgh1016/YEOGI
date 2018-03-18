package com.yeogi.jspweb.controller.main.member.plan.schedule;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yeogi.jspweb.dao.TPlanLocDao;
import com.yeogi.jspweb.dao.TPlanPostDao;
import com.yeogi.jspweb.dao.TPlanPostSpdDao;
import com.yeogi.jspweb.dao.TourPlanDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTPlanLocDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTPlanPostDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTPlanPostSpdDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTourPlanDao;
import com.yeogi.jspweb.entity.TPlanLoc;
import com.yeogi.jspweb.entity.TPlanPost;
import com.yeogi.jspweb.entity.TPlanPostSpd;
import com.yeogi.jspweb.entity.TPlanPostSpdView;
import com.yeogi.jspweb.entity.TourPlan;

@WebServlet("/main/member/plan/schedule/schedule")
public class ScheduleController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		TPlanPostSpdDao tPlanPostSpdDao = new JdbcTPlanPostSpdDao();
		List<TPlanPostSpdView> tppsv = tPlanPostSpdDao.getList();
		
		request.setAttribute("tppsv", tppsv);
		
		
		
		
		String tourDateTime=request.getParameter("time");
		String tPlanId=request.getParameter("tour-plan-id");
		String tPlanLocId=request.getParameter("tour-plan-loc-id");
		
		TPlanPostDao tPlanPostDao = new JdbcTPlanPostDao();
		TPlanPost tPlanPost = tPlanPostDao.get(tourDateTime,tPlanId,tPlanLocId);
		
		request.setAttribute("tPlanPost", tPlanPost);
		
		
		
		TourPlanDao tPlanDao = new JdbcTourPlanDao();
		List<TourPlan> tp = tPlanDao.getList();
		
		request.setAttribute("tp", tp);
		
		
		TPlanLocDao tPlanLocDao = new JdbcTPlanLocDao();
		List<TPlanLoc> tpl = tPlanLocDao.getList();
		
		request.setAttribute("tpl", tpl);
		
		/*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ메모ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*/
		//String tourDateTime = request.getParameter("07:00");
		//TPlanPostDao tPlanPostDao = new JdbcTPlanPostDao().get(tourDateTime, tPlanId, tPlanLocId);
		
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/main/member/plan/schedule/schedule.jsp");
		dispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html; charset=UTF-8");
	    request.setCharacterEncoding("UTF-8");
	    
	    TPlanPostSpd tplanpostspd = new TPlanPostSpd();
	    
	    tplanpostspd.setTPlanId("2018031300001");
	    tplanpostspd.setTPlanLocId("2018031200001");
	    tplanpostspd.setAmount(request.getParameter("input-cost"));
	    tplanpostspd.setContent(request.getParameter("memo-cost-spd"));
	    tplanpostspd.setType(request.getParameter("type"));
	    tplanpostspd.setUnit(request.getParameter("unit"));
	    
	    TPlanPostSpdDao tPlanPostSpdDao = new JdbcTPlanPostSpdDao();
	    tPlanPostSpdDao.insert(tplanpostspd);
	    
	    
	    
	    
	    TPlanPost tplanpost = new TPlanPost();
	    
	    tplanpost.setMemoTitle(request.getParameter("memo-title"));
	    tplanpost.setMemoContent(request.getParameter("memo-content"));
	    tplanpost.setTourDateTime(request.getParameter("time"));
	    tplanpost.setTPlanId("2018031300001");
	    tplanpost.setTPlanLocId("2018031200001");
	    
	    TPlanPostDao tPlanPostDao = new JdbcTPlanPostDao();
	    tPlanPostDao.insert(tplanpost);
	    
	    
	    response.sendRedirect("schedule");
	}
}















