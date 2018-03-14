package com.yeogi.jspweb.controller.main.member.story.write;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.yeogi.jspweb.dao.TLogNationDao;
import com.yeogi.jspweb.dao.TLogPostDao;
import com.yeogi.jspweb.dao.TLogPostSpdDao;
import com.yeogi.jspweb.dao.TagDao;
import com.yeogi.jspweb.dao.TourLogDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTLogNationDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTLogPostDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTLogPostSpdDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTagDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTourLogDao;
import com.yeogi.jspweb.entity.TLogNation;
import com.yeogi.jspweb.entity.TLogPostSpdView;
import com.yeogi.jspweb.entity.TLogPostView;
import com.yeogi.jspweb.entity.TagView;
import com.yeogi.jspweb.entity.TourLog;

@WebServlet("/main/member/story/write/saveLog")
@MultipartConfig(
		fileSizeThreshold = 1024*1024,
		maxFileSize = 1024*1024*100,	//	100메가
		maxRequestSize = 1024*1024*100*5	//	100메가
		)
public class SaveLogController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		TourLogDao tourLogDao = new JdbcTourLogDao();
		TourLog tl = null;
		
		TLogNationDao tLogNationDao = new JdbcTLogNationDao();
		TLogNation tln = null;
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String id = request.getParameter("tour-log-id");
		String title = request.getParameter("title");
		String memo = request.getParameter("memo");
		String subTitle = request.getParameter("sub-title");
		String coverImg = request.getParameter("cover-img");
		String lockYN = request.getParameter("lock-yn");
		int period = Integer.parseInt(request.getParameter("period"));
		Date startDate = Date.valueOf(request.getParameter("start-date"));
		int companion = Integer.parseInt(request.getParameter("companion"));
		
		Calendar cal2 = Calendar.getInstance();
		String modDate = formatter2.format(cal2.getTime());
		Timestamp lastModDate = Timestamp.valueOf(modDate);
		
		int hit = Integer.parseInt(request.getParameter("hit"));
		
		String theme = request.getParameter("themes");
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(startDate);
		cal.add(Calendar.DATE, period-1);
		String dateOff = formatter.format(cal.getTime());
		Date endDate = Date.valueOf(dateOff);
		
		tl = new TourLog(id, title, memo, subTitle, coverImg, lockYN, period, startDate, companion, lastModDate, hit, theme, endDate);
		int isLogUpdate = tourLogDao.update(tl);
		
		String nation = request.getParameter("select-nation");
		
		tln = new TLogNation();
		tln.setNation(nation);
		tln.settLogId(id);
		int isNationUpdate = tLogNationDao.update(tln);
										
		if(isLogUpdate+isNationUpdate < 2) {
			out.print("<script>alert('저장에 실패하였습니다.');history.back();</script>");
		}
		else {
			response.sendRedirect("../read/main?id="+id);
		}
		
	}
}
