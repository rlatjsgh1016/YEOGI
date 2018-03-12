package com.yeogi.jspweb.controller.main.member.plan.schedule;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yeogi.jspweb.dao.TPlanPostDao;
import com.yeogi.jspweb.dao.TPlanPostSpdDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTPlanPostDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTPlanPostSpdDao;
import com.yeogi.jspweb.entity.TPlanPost;
import com.yeogi.jspweb.entity.TPlanPostSpd;
import com.yeogi.jspweb.entity.TPlanPostSpdView;

@WebServlet("/main/member/plan/schedule/schedule")
public class ScheduleController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		TPlanPostSpdDao tPlanPostSpdDao = new JdbcTPlanPostSpdDao();
		List<TPlanPostSpdView> tppsv = tPlanPostSpdDao.getList();
		
		request.setAttribute("tppsv", tppsv);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/main/member/plan/schedule/schedule.jsp");
		
		dispatcher.forward(request, response);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html; charset=UTF-8");
	    request.setCharacterEncoding("UTF-8");
	    
	    TPlanPostSpd tplanpostspd = new TPlanPostSpd();
	    
	    tplanpostspd.setId("2018031200011");
	    tplanpostspd.setTPlanId("2018031200011");
	    tplanpostspd.setTPlanLocId("2018031200011");
	    tplanpostspd.setAmount(request.getParameter("input-cost"));
	    tplanpostspd.setContent(request.getParameter("content"));
	    tplanpostspd.setType("명소");
	    tplanpostspd.setUnit("달러");
	    
	    TPlanPostSpdDao tPlanPostSpdDao = new JdbcTPlanPostSpdDao();
	    tPlanPostSpdDao.insert(tplanpostspd);
	    
	    
	    TPlanPost tplanpost = new TPlanPost();
	    
	    tplanpost.setMemoTitle(request.getParameter("memo-title"));
	    tplanpost.setMemoContent(request.getParameter("memo-content"));
	    tplanpost.setTourDateTime("23:00");
	    tplanpost.setTPlanId("2018031200011");
	    tplanpost.setTPlanLocId("201803120011");
	    
	    TPlanPostDao tPlanPostDao = new JdbcTPlanPostDao();
	    tPlanPostDao.insert(tplanpost);
	    
	    
	    response.sendRedirect("/WEB-INF/views/main/member/plan/schedule/schedule.jsp");
	}
}















