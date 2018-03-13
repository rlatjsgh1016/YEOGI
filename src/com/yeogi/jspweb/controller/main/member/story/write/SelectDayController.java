package com.yeogi.jspweb.controller.main.member.story.write;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.yeogi.jspweb.dao.TLogPostDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTLogPostDao;
import com.yeogi.jspweb.entity.TLogPostView;

@WebServlet("/main/member/story/write/selectDay")
@MultipartConfig(
		fileSizeThreshold = 1024*1024,
		maxFileSize = 1024*1024*100,	//	100메가
		maxRequestSize = 1024*1024*100*5	//	100메가
		)
public class SelectDayController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String id = null;
	    
	    String id_ = request.getParameter("tour-log-id");
	    if(id_!=null && !id_.equals(""))
	    	id = id_;
	    
		TLogPostDao tlpDao = new JdbcTLogPostDao();
		List<TLogPostView> tlpvList = tlpDao.getList(id);
	    
		request.setAttribute("postList", tlpvList);
		
		Gson gson = new Gson();
		String json = gson.toJson(tlpvList);
		
		PrintWriter out = response.getWriter();
		
		out.println(json);
	}
}
