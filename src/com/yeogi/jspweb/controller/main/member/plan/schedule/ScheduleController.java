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
import com.yeogi.jspweb.entity.TPlanPostSpdView;

@WebServlet("/main/member/plan/schedule/schedule")
public class ScheduleController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		/*String tPlanId = request.getParameter("tPlanId");
		
		TPlanPostDao tPlanPostDao = new JdbcTPlanPostDao();
		List<TPlanPost> pp = tPlanPostDao.getList();
		
		request.setAttribute("pp", pp);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/main/member/plan/schedule/schedule.jsp");
		
		dispatcher.forward(request, response);*/
		
		String id = request.getParameter("id");
		
		TPlanPostSpdDao tPlanPostSpdDao = new JdbcTPlanPostSpdDao();
		List<TPlanPostSpdView> list = tPlanPostSpdDao.getList();
		
	}
}
