package com.yeogi.jspweb.controller.main.member.plan.cost;

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

@WebServlet("/main/member/plan/cost/cost")
public class CostController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tPlanId = request.getParameter("tPlanId");
		
		TPlanPostDao tPlanPostDao = new JdbcTPlanPostDao();
		List<TPlanPost> pp = tPlanPostDao.getList();
		
		request.setAttribute("pp", pp);
		
		
		TPlanPostSpdDao tPlanPostSpdDao = new JdbcTPlanPostSpdDao();
		List<TPlanPostSpdView> tppsv = tPlanPostSpdDao.getList();
		
		request.setAttribute("tppsv", tppsv);
		
		
		
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/main/member/plan/cost/cost.jsp");
		
		dispatcher.forward(request, response);
		
	}
}
