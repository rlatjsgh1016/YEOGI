package com.yeogi.jspweb.controller.main.member.story.write;

import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

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

import com.google.gson.Gson;
import com.yeogi.jspweb.dao.DayDao;
import com.yeogi.jspweb.dao.NationDao;
import com.yeogi.jspweb.dao.TLogNationDao;
import com.yeogi.jspweb.dao.TLogPostDao;
import com.yeogi.jspweb.dao.TLogPostSpdDao;
import com.yeogi.jspweb.dao.TagDao;
import com.yeogi.jspweb.dao.TourLogDao;
import com.yeogi.jspweb.dao.jdbc.JdbcDayDao;
import com.yeogi.jspweb.dao.jdbc.JdbcNationDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTLogNationDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTLogPostDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTLogPostSpdDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTagDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTourLogDao;
import com.yeogi.jspweb.entity.Day;
import com.yeogi.jspweb.entity.Nation;
import com.yeogi.jspweb.entity.TLogNation;
import com.yeogi.jspweb.entity.TLogPost;
import com.yeogi.jspweb.entity.TLogPostSpd;
import com.yeogi.jspweb.entity.Tag;
import com.yeogi.jspweb.entity.TourLog;

@WebServlet("/main/member/story/write/main")
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
		
		TLogNationDao tLogNationDao = new JdbcTLogNationDao();
			    
	    TourLogDao tourLogDao = new JdbcTourLogDao();
		TourLog tl = tourLogDao.get(id);
		
		TLogNation tln = tLogNationDao.getList(tl).get(0);
	    
		int firstDay = d;
		
		request.setAttribute("firstDay", firstDay);
		request.setAttribute("tourLog", tl);
		request.setAttribute("dayList", dayList);
		request.setAttribute("nationList", nationList);
		request.setAttribute("tLogNation", tln);
	    
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
	    
	    int d = 1;
	    String d_ = request.getParameter("d");
	    
	    if(d_!=null && !d_.equals(""))
	    	d = Integer.parseInt(d_);
	    
		String btn = "";
		String btnSub = "";
		String btnNew = request.getParameter("btn-new");
		String btnPlanLoad = request.getParameter("btn-plan-load");
		String btnMain = request.getParameter("btn-main");
		String btnEdit = request.getParameter("btn-edit");
		String btnPost = request.getParameter("btn-post");
		
		if(btnNew != null && !btnNew.equals(""))
			btn = btnNew;
		else if(btnPlanLoad != null && !btnPlanLoad.equals(""))
			btn = btnPlanLoad;
		else if(btnEdit != null && !btnEdit.equals(""))
			btn = btnEdit;
		else if(btnMain != null && !btnMain.equals(""))
			btn = btnMain;
		
		if(btnPost != null && !btnPost.equals(""))
			btnSub = btnPost;
		
		switch(btn){
			case "작성하기":
			{
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
				
				int firstDay = d;
				
				request.setAttribute("firstDay", firstDay);
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
			}
				break;
			case "불러오기":
				break;
				
			case "공개 전환":
				{
					
			    String id = null;
			    			    
			    String id_ = request.getParameter("tour-log-id");
			    if(id_!=null && !id_.equals(""))
			    	id = id_;
			    
			    DayDao dayDao = new JdbcDayDao();
				List<Day> dayList = dayDao.getList();
				
				NationDao nationDao = new JdbcNationDao();
				List<Nation> nationList = nationDao.getList();
				
				TLogNationDao tLogNationDao = new JdbcTLogNationDao();
					    
			    TourLogDao tourLogDao = new JdbcTourLogDao();
				TourLog tl = tourLogDao.get(id);

				Calendar cal = Calendar.getInstance();
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				String sysDate = formatter.format(cal.getTime());
				Timestamp lastModDate = Timestamp.valueOf(sysDate);
				
				tl = new TourLog(
						tl.getId(),
						tl.getTitle(),
						tl.getMemo(),
						tl.getSubTitle(),
						tl.getCoverImg(),
						"N",
						tl.getRegDate(),
						tl.getPeriod(),
						tl.getStartDate(),
						tl.getCompanion(),
						tl.getMid(),
						lastModDate,
						tl.getHit(),
						tl.gettTheme(),
						tl.getEndDate()
						);
				
				tourLogDao.update(tl);
				
				TLogNation tln = tLogNationDao.getList(tl).get(0);
			    
				int firstDay = d;
				
				
				request.setAttribute("firstDay", firstDay);
				request.setAttribute("tourLog", tl);
				request.setAttribute("dayList", dayList);
				request.setAttribute("nationList", nationList);
				request.setAttribute("tLogNation", tln);
			    
			    ApplicationContext applicationContext = ServletUtil
						.getApplicationContext(request.getSession().getServletContext());
				TilesContainer container = TilesAccess.getContainer(applicationContext);
				ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
				container.render("main.member.story.write.main", servletRequest);
			}
				break;
			case "비공개 전환":
			{
				
		    String id = null;
		    			    
		    String id_ = request.getParameter("tour-log-id");
		    if(id_!=null && !id_.equals(""))
		    	id = id_;
		    
		    DayDao dayDao = new JdbcDayDao();
			List<Day> dayList = dayDao.getList();
			
			NationDao nationDao = new JdbcNationDao();
			List<Nation> nationList = nationDao.getList();
			
			TLogNationDao tLogNationDao = new JdbcTLogNationDao();
				    
		    TourLogDao tourLogDao = new JdbcTourLogDao();
			TourLog tl = tourLogDao.get(id);

			Calendar cal = Calendar.getInstance();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			String sysDate = formatter.format(cal.getTime());
			Timestamp lastModDate = Timestamp.valueOf(sysDate);
			
			tl = new TourLog(
					tl.getId(),
					tl.getTitle(),
					tl.getMemo(),
					tl.getSubTitle(),
					tl.getCoverImg(),
					"Y",
					tl.getRegDate(),
					tl.getPeriod(),
					tl.getStartDate(),
					tl.getCompanion(),
					tl.getMid(),
					lastModDate,
					tl.getHit(),
					tl.gettTheme(),
					tl.getEndDate()
					);
			
			tourLogDao.update(tl);
			
			TLogNation tln = tLogNationDao.getList(tl).get(0);
		    
			int firstDay = d;
			
			
			request.setAttribute("firstDay", firstDay);
			request.setAttribute("tourLog", tl);
			request.setAttribute("dayList", dayList);
			request.setAttribute("nationList", nationList);
			request.setAttribute("tLogNation", tln);
		    
		    ApplicationContext applicationContext = ServletUtil
					.getApplicationContext(request.getSession().getServletContext());
			TilesContainer container = TilesAccess.getContainer(applicationContext);
			ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
			container.render("main.member.story.write.main", servletRequest);
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
		
		switch(btnSub) {
		case "저장":{
			// 포스트 가져오기
			String tourLogId = request.getParameter("tour-log-id");
			String postContent = request.getParameter("post-memo");
			String postLocId = request.getParameter("loc-id");
			String postVehicle = request.getParameter("vehicle");
			String postSpdType = request.getParameter("spd-type");
			String postSpdContent = request.getParameter("spd-content");
			String postSpdUnit = request.getParameter("spd-unit");
			String postSpdAmount_ = request.getParameter("spd-amount");
			String postTag = request.getParameter("tag");
			
			
			// 포스트 crud DAO 준비
			TLogPostDao tLogPostDao = new JdbcTLogPostDao();
			TLogPostSpdDao tLogPostSpdDao = new JdbcTLogPostSpdDao();
			TagDao tagDao = new JdbcTagDao();
			
			
			// 엔티티 객체 생성 & 쿼리실행
			TLogPost tlp = new TLogPost(postContent, tourLogId ,postLocId, postVehicle);
			String isInsert = tLogPostDao.insert(tlp);
			TLogPostSpd tlps = null;
			int postSpdAmount = 0; 
			if(postSpdAmount_ != null && !postSpdAmount_.equals("")) {
				postSpdAmount = Integer.parseInt(postSpdAmount_);
				tlps = new TLogPostSpd(postSpdType, postSpdContent, postSpdUnit, postSpdAmount, isInsert);
				tLogPostSpdDao.insert(tlps);
			}
			else {
				tlps = new TLogPostSpd(postSpdType, postSpdContent, postSpdUnit, postSpdAmount, isInsert);
				tLogPostSpdDao.insertNonAmount(tlps);
			}
			
			if(postTag != null && !postTag.equals("")) {

				//문자열 파싱
				String[] postTags = postTag.split(",");
				for(int i=0; i<postTags.length; i++) {
					if(!postTags[i].trim().equals("")) {
						Tag tag = new Tag(postTags[i], isInsert);
						tagDao.insert(tag);
					}
				}
			}
			ApplicationContext applicationContext = ServletUtil
					.getApplicationContext(request.getSession().getServletContext());
			TilesContainer container = TilesAccess.getContainer(applicationContext);
			ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
			container.render("main.member.story.write.main", servletRequest);
			
		}
			break;
		default:
			break;
		}
	}
}
