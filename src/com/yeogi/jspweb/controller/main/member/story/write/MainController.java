package com.yeogi.jspweb.controller.main.member.story.write;

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

import com.yeogi.jspweb.dao.DayDao;
import com.yeogi.jspweb.dao.NationDao;
import com.yeogi.jspweb.dao.TLogNationDao;
import com.yeogi.jspweb.dao.TourLogDao;
import com.yeogi.jspweb.dao.jdbc.JdbcDayDao;
import com.yeogi.jspweb.dao.jdbc.JdbcNationDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTLogNationDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTourLogDao;
import com.yeogi.jspweb.entity.Day;
import com.yeogi.jspweb.entity.Nation;
import com.yeogi.jspweb.entity.TLogNation;
import com.yeogi.jspweb.entity.TourLog;

@WebServlet("/main/member/story/write/main")
public class MainController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html; charset=UTF-8");
	    request.setCharacterEncoding("UTF-8");
	    
		String btn = null;
		String btnNew = request.getParameter("btn-new");
		if(btnNew != null && !btnNew.equals(""))
			btn = btnNew;
		switch(btn){
			case "작성하기":
				
				DayDao dayDao = new JdbcDayDao();
				List<Day> dayList = dayDao.getList();
				
				NationDao nationDao = new JdbcNationDao();
				List<Nation> nationList = nationDao.getList();
				
				TourLogDao tourLogDao = new JdbcTourLogDao();
				TourLog tl = null;
				
				TLogNationDao tLogNationDao = new JdbcTLogNationDao();
				TLogNation tln = null;
				
				SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
				
				String mid = request.getParameter("mid");
				String title = request.getParameter("select-title");
				String nation = request.getParameter("select-nation");
				Date startDate = Date.valueOf(request.getParameter("select-start-date"));
				
				
				int period = Integer.parseInt(request.getParameter("select-period"));
				int companion = Integer.parseInt(request.getParameter("select-companion"));
				String theme = request.getParameter("select-theme");
				Date endDate = Date.valueOf(request.getParameter("select-end-date"));
				
				tl = new TourLog(title,null,null,null,null,period,startDate,companion,mid,theme,endDate);
				
				tourLogDao.insert(tl);
				
				TourLog tourLog = tourLogDao.getLast();
				
				
				request.setAttribute("tourLog", tourLog);
				request.setAttribute("dayList", dayList);
				request.setAttribute("nationList", nationList);
				
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/main/member/story/write/main.jsp");
				dispatcher.forward(request, response);
				break;
			
			case "취소":
				response.sendRedirect("select.jsp");
		}
	}
}
