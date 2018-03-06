package com.yeogi.jspweb.controller.main.member.story.write;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.servlet.RequestDispatcher;
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
	    
		String btn = "";
		String btnNew = request.getParameter("btn-new");
		String btnPlanLoad = request.getParameter("btn-plan-load");
		String btnEdit = request.getParameter("btn-edit");
		
		if(btnNew != null && !btnNew.equals(""))
			btn = btnNew;
		else if(btnPlanLoad != null && !btnPlanLoad.equals(""))
			btn = btnPlanLoad;
		else if(btnEdit != null && !btnEdit.equals(""))
			btn = btnEdit;
		
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
				
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				
				String mid = request.getParameter("mid");
				String title = request.getParameter("select-title");
				String nation = request.getParameter("select-nation");
				Date startDate = Date.valueOf(request.getParameter("select-start-date"));
				
				
				int period = Integer.parseInt(request.getParameter("select-period"));
				int companion = Integer.parseInt(request.getParameter("select-companion"));
				String theme = request.getParameter("select-theme");
				
				List<Day> tLogDayList = dayDao.getList(period);

				Calendar cal = Calendar.getInstance();
				cal.setTime(startDate);
				cal.add(Calendar.DATE, period);
				String dateOff = formatter.format(cal.getTime());
				
				Date endDate = Date.valueOf(dateOff);
				
				tl = new TourLog(title,null,null,null,"Y",period,startDate,companion,mid,null,theme,endDate);
				
				String isInsert = tourLogDao.insert(tl);
				tl = tourLogDao.get(isInsert);
				
				tln = new TLogNation(tl.getId(), nation);
				tLogNationDao.insert(tln);
				
				int firstDay = 1;
				int lastDay = period;
				
				request.setAttribute("tourLog", tl);
				request.setAttribute("dayList", dayList);
				request.setAttribute("nationList", nationList);
				request.setAttribute("tLogNation", tln);
				
				/*RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/main/member/story/write/main.jsp");
				dispatcher.forward(request, response);*/
				
				ApplicationContext applicationContext = ServletUtil
						.getApplicationContext(request.getSession().getServletContext());
				TilesContainer container = TilesAccess.getContainer(applicationContext);
				ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
				container.render("main.member.story.write.main", servletRequest);
				
				break;
			
			case "불러오기":
				break;
				
			case "수정하기":
				break;
			
			case "취소":
				response.sendRedirect("select");
				break;
				
			default:
				break;
		}
	}
}
