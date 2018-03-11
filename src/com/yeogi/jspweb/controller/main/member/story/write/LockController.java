package com.yeogi.jspweb.controller.main.member.story.write;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.yeogi.jspweb.dao.TourLogDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTourLogDao;
import com.yeogi.jspweb.entity.TourLog;

@WebServlet("/main/member/story/write/lock")
@MultipartConfig(
		fileSizeThreshold = 1024*1024,
		maxFileSize = 1024*1024*100,	//	100메가
		maxRequestSize = 1024*1024*100*5	//	100메가
		)
public class LockController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String id = null;
		String isLock = null;
		int isUpdate = 0;
		TourLog tl = null;
	    
	    String id_ = request.getParameter("tour-log-id");
	    if(id_!=null && !id_.equals(""))
	    	id = id_;
	    
	    String isLock_ = request.getParameter("lock-yn");
	    if(isLock_!=null && !isLock_.equals(""))
	    	isLock = isLock_;
	    
	    if(isLock.equals("Y")) {
		    TourLogDao tourLogDao = new JdbcTourLogDao();
			tl = new TourLog();
			tl.setLockYN("N");
			tl.setId(id);
			
			isUpdate = tourLogDao.updateLock(tl);
	    }
	    else if(isLock.equals("N")) {
	    	TourLogDao tourLogDao = new JdbcTourLogDao();
			tl = new TourLog();
			tl.setLockYN("Y");
			tl.setId(id);
			
			isUpdate = tourLogDao.updateLock(tl);
	    }
	    
		if(isUpdate == 1) {
			PrintWriter out = response.getWriter();
			Gson gson = new Gson();
			String json = gson.toJson(tl);
			out.println(json);
		}
		else {
			PrintWriter out = response.getWriter();
			out.println("Update failed");
		}
	}
}
