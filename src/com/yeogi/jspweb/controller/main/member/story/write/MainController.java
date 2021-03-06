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

import org.apache.tiles.TilesContainer;
import org.apache.tiles.access.TilesAccess;
import org.apache.tiles.request.ApplicationContext;
import org.apache.tiles.request.servlet.ServletRequest;
import org.apache.tiles.request.servlet.ServletUtil;

import com.yeogi.jspweb.dao.DayDao;
import com.yeogi.jspweb.dao.LocDao;
import com.yeogi.jspweb.dao.NationDao;
import com.yeogi.jspweb.dao.TLogNationDao;
import com.yeogi.jspweb.dao.TLogPostDao;
import com.yeogi.jspweb.dao.TLogPostSpdDao;
import com.yeogi.jspweb.dao.TagDao;
import com.yeogi.jspweb.dao.TourLogDao;
import com.yeogi.jspweb.dao.jdbc.JdbcDayDao;
import com.yeogi.jspweb.dao.jdbc.JdbcLocDao;
import com.yeogi.jspweb.dao.jdbc.JdbcNationDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTLogNationDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTLogPostDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTLogPostSpdDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTagDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTourLogDao;
import com.yeogi.jspweb.entity.Day;
import com.yeogi.jspweb.entity.Loc;
import com.yeogi.jspweb.entity.Nation;
import com.yeogi.jspweb.entity.TLogNation;
import com.yeogi.jspweb.entity.TLogPostSpdView;
import com.yeogi.jspweb.entity.TLogPostView;
import com.yeogi.jspweb.entity.TagView;
import com.yeogi.jspweb.entity.TourLog;
import com.yeogi.jspweb.entity.TourLogView;

@WebServlet("/main/member/story/write/main")
@MultipartConfig(
		fileSizeThreshold = 1024*1024,
		maxFileSize = 1024*1024*100,	//	100메가
		maxRequestSize = 1024*1024*100*5	//	100메가
		)
public class MainController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html; charset=UTF-8");
	    request.setCharacterEncoding("UTF-8");
	    
	    int d = 1;
	    String id = null;
	    
	    String d_ = request.getParameter("d");
	    if(d_!=null && !d_.equals(""))
	    	d = Integer.parseInt(d_);
	    
	    String id_ = request.getParameter("id");
	    if(id_!=null && !id_.equals(""))
	    	id = id_;
	    
	    DayDao dayDao = new JdbcDayDao();
		List<Day> dayList = dayDao.getList();
		
		NationDao nationDao = new JdbcNationDao();
		List<Nation> nationList = nationDao.getList();
		
		LocDao locDao = new JdbcLocDao();
		List<Loc> locList = locDao.getList();
			    
	    TourLogDao tourLogDao = new JdbcTourLogDao();
		TourLogView tl = tourLogDao.get(id);
		
		TLogPostDao tlpDao = new JdbcTLogPostDao();
		List<TLogPostView> tlpvList = tlpDao.getList(id);
		
		TLogPostSpdDao tlpsDao = new JdbcTLogPostSpdDao();
		List<TLogPostSpdView> tlpsList = tlpsDao.getList(id);
		List<TLogPostSpdView> sumList = tlpsDao.getSum(id);
		
		TagDao tagDao = new JdbcTagDao();
		List<TagView> tagList = tagDao.getList(id);
	    
		int firstDay = d;
		
		request.setAttribute("firstDay", firstDay);
		request.setAttribute("tourLog", tl);
		request.setAttribute("dayList", dayList);
		request.setAttribute("nationList", nationList);
		request.setAttribute("locList", locList);
		request.setAttribute("postList", tlpvList);
		request.setAttribute("spdList", tlpsList);
		request.setAttribute("tagList", tagList);
		request.setAttribute("postSum", sumList);
	    
	    ApplicationContext applicationContext = ServletUtil
				.getApplicationContext(request.getSession().getServletContext());
		TilesContainer container = TilesAccess.getContainer(applicationContext);
		ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
		container.render("main.member.story.write.main", servletRequest);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html; charset=UTF-8");
	    request.setCharacterEncoding("UTF-8");

	    PrintWriter out = response.getWriter();
	    
	    int d = 1;
	    String d_ = request.getParameter("d");
	    
	    if(d_!=null && !d_.equals(""))
	    	d = Integer.parseInt(d_);
	    
		String btn = "";
		String btnNew = request.getParameter("btn-new");
		String btnPlanLoad = request.getParameter("btn-plan-load");
		String btnMain = request.getParameter("btn-main");
		String btnEdit = request.getParameter("btn-edit");
		
		if(btnNew != null && !btnNew.equals(""))
			btn = btnNew;
		else if(btnPlanLoad != null && !btnPlanLoad.equals(""))
			btn = btnPlanLoad;
		else if(btnEdit != null && !btnEdit.equals(""))
			btn = btnEdit;
		else if(btnMain != null && !btnMain.equals(""))
			btn = btnMain;
		
		switch(btn){
			case "작성하기":
			{
				DayDao dayDao = new JdbcDayDao();
				List<Day> dayList = dayDao.getList();
				
				NationDao nationDao = new JdbcNationDao();
				List<Nation> nationList = nationDao.getList();
				
				LocDao locDao = new JdbcLocDao();
				List<Loc> locList = locDao.getList();
				
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
				

				Calendar cal = Calendar.getInstance();
				cal.setTime(startDate);
				cal.add(Calendar.DATE, period-1);
				String dateOff = formatter.format(cal.getTime());
				
				Date endDate = Date.valueOf(dateOff);
				
				tl = new TourLog(title,"Y",period,startDate,companion,mid,theme,endDate);
				
				String isInsert = tourLogDao.insert(tl);
				tln = new TLogNation(isInsert, nation);
				tLogNationDao.insert(tln);
				
				TourLogView tlv = tourLogDao.get(isInsert);
				
				int firstDay = d;
				
				request.setAttribute("firstDay", firstDay);
				request.setAttribute("tourLog", tlv);
				request.setAttribute("dayList", dayList);
				request.setAttribute("nationList", nationList);
				request.setAttribute("locList", locList);
				
				/*RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/main/member/story/write/main.jsp");
				dispatcher.forward(request, response);*/
				
				ApplicationContext applicationContext = ServletUtil
						.getApplicationContext(request.getSession().getServletContext());
				TilesContainer container = TilesAccess.getContainer(applicationContext);
				ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
				container.render("main.member.story.write.main", servletRequest);
			}
				break;
				
			case "저장":{
				
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
				
				tln = new TLogNation(id, nation);
				int isNationUpdate = tLogNationDao.update(tln);
												
				if(isLogUpdate+isNationUpdate < 2) {
					out.print("<script>alert('저장에 실패하였습니다.');history.back();</script>");
				}
				else {
					response.sendRedirect("../read/main?id="+id);
				}
			}
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
