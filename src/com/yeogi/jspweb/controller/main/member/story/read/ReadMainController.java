package com.yeogi.jspweb.controller.main.member.story.read;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tiles.TilesContainer;
import org.apache.tiles.access.TilesAccess;
import org.apache.tiles.request.ApplicationContext;
import org.apache.tiles.request.servlet.ServletRequest;
import org.apache.tiles.request.servlet.ServletUtil;

import com.yeogi.jspweb.dao.DayDao;
import com.yeogi.jspweb.dao.MemberDao;
import com.yeogi.jspweb.dao.TLogCmtDao;
import com.yeogi.jspweb.dao.TLogNationDao;
import com.yeogi.jspweb.dao.TLogPostDao;
import com.yeogi.jspweb.dao.TLogPostSpdDao;
import com.yeogi.jspweb.dao.TourLogDao;
import com.yeogi.jspweb.dao.jdbc.JdbcDayDao;
import com.yeogi.jspweb.dao.jdbc.JdbcMemberDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTLogCmtDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTLogNationDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTLogPostDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTLogPostSpdDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTourLogDao;
import com.yeogi.jspweb.entity.Day;
import com.yeogi.jspweb.entity.Member;
import com.yeogi.jspweb.entity.TLogCmt;
import com.yeogi.jspweb.entity.TLogCmtView;
import com.yeogi.jspweb.entity.TLogNation;
import com.yeogi.jspweb.entity.TLogPostSpdView;
import com.yeogi.jspweb.entity.TLogPostView;
import com.yeogi.jspweb.entity.TourLog;
import com.yeogi.jspweb.entity.TourLogView;

@WebServlet("/main/member/story/read/main")
public class ReadMainController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html; charset=UTF-8");
	    request.setCharacterEncoding("UTF-8");
		
		String id = null;
		String postid = null;
		String mid = null;
		int index = 1;
		
		String id_ = request.getParameter("id");
		if(id_!=null && !id_.equals(""))
	    	id = id_;
		
		String mId_ = request.getParameter("mid");
		if(mId_!=null && !mId_.equals(""))
			mid = mId_;
		
		String postid_ = request.getParameter("postid");
		if(postid_!=null && !postid_.equals(""))
			postid = postid_;
		

		String tourLogId = null;
		
		String tourLogId_ = request.getParameter("tourLogId");
		if(tourLogId_!=null && !id_.equals(""))
			tourLogId = tourLogId_;
		
		TourLogDao tourLogDao = new JdbcTourLogDao();
		TourLogView tourLog = tourLogDao.get(id);
		
		TLogNationDao tLogNationDao = new JdbcTLogNationDao();
		TLogNation tLogNation = tLogNationDao.get(id);
		
		TLogPostDao tLogPostDao = new JdbcTLogPostDao();
		List<TLogPostView> tlpList =  tLogPostDao.getList(id);
		TLogPostView tLogPostView = tLogPostDao.get(postid);
		int tLogCount = tLogPostDao.getLocCount(id);
		int maxDay = tLogPostDao.getMaxDay(id);
		
		TLogPostSpdDao tLogPostSpdDao = new JdbcTLogPostSpdDao();
		TLogPostSpdView tLosPostSpdView = tLogPostSpdDao.get(postid);
		
		int day = 0;
		
		
		List<TLogPostView> locListDay =  tLogPostDao.getLocListByDay(id, day);			
		
		DayDao dayDao = new JdbcDayDao();
		List<Day> dayList = dayDao.getList();
		
		MemberDao memberDao = new JdbcMemberDao();
		Member member;
		try {
			member = memberDao.getId(mid);
			request.setAttribute("mid", member);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		TLogCmtDao tLogCmtDao = new JdbcTLogCmtDao();
		List<TLogCmtView> list = tLogCmtDao.getList(id);
		
		request.setAttribute("tlpList", tlpList);
		request.setAttribute("tLogPostView", tLogPostView);
		request.setAttribute("tLosPostSpdView", tLosPostSpdView);
		request.setAttribute("locListDay", locListDay);
		request.setAttribute("maxDay", maxDay);
		request.setAttribute("dayList", dayList);
		request.setAttribute("list", list);
		request.setAttribute("tourLog", tourLog);
		request.setAttribute("tLogNation", tLogNation);
		request.setAttribute("tLogCount", tLogCount);
		
		request.getContextPath();
		
		ApplicationContext applicationContext = ServletUtil
				.getApplicationContext(request.getSession().getServletContext());
		TilesContainer container = TilesAccess.getContainer(applicationContext);
		ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
		container.render("main.member.story.read.main", servletRequest);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		TLogCmt tlc = new TLogCmt();
		tlc.setContent(request.getParameter("content"));
		tlc.setmId("sgkim");
		tlc.settLogId("2018031200005");
		
		
		//request.getAttribute("day");
		TLogCmtDao tLogCmtDao = new JdbcTLogCmtDao();
		tLogCmtDao.insert(tlc);
		/*int day= dao.getmaxDay(id);
		
		for()*/
			
			
	
		response.sendRedirect("main");
		

		
	}

}
