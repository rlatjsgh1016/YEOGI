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
import com.yeogi.jspweb.dao.TLogPostSpdDao;
import com.yeogi.jspweb.dao.TagDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTLogPostDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTLogPostSpdDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTagDao;
import com.yeogi.jspweb.entity.TLogPostSpdView;
import com.yeogi.jspweb.entity.TLogPostView;
import com.yeogi.jspweb.entity.TagView;

@WebServlet("/main/member/story/write/deletePost")
@MultipartConfig(
		fileSizeThreshold = 1024*1024,
		maxFileSize = 1024*1024*100,	//	100메가
		maxRequestSize = 1024*1024*100*5	//	100메가
		)
public class DeletePostController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String postId = request.getParameter("post-id");
		String tourLogId = request.getParameter("tour-log-id");
		
		Gson gson = new Gson();
		PrintWriter out = response.getWriter();
		
		if(postId != null && !postId.equals("")) {
			TLogPostDao tlpDao = new JdbcTLogPostDao();
			tlpDao.delete(postId);
		}
		
		// 포스트 crud DAO 준비
		TLogPostDao tLogPostDao = new JdbcTLogPostDao();
		TLogPostSpdDao tLogPostSpdDao = new JdbcTLogPostSpdDao();
		TagDao tagDao = new JdbcTagDao();
		
		List<TLogPostView> tlpv = tLogPostDao.getList(tourLogId);
		String json1 = gson.toJson(tlpv);
		
		List<TLogPostSpdView> tlpsv = tLogPostSpdDao.getList(tourLogId);
		String json2 = gson.toJson(tlpsv);
		
		List<TagView> tag = tagDao.getList(tourLogId);
		String json3 = gson.toJson(tag);
		
		List<TLogPostSpdView> tlpsv2 = tLogPostSpdDao.getSum(tourLogId);
		String json4 = gson.toJson(tlpsv2);

		out.print("{\"post\":"+json1+",\"spd\":"+json2+",\"tag\":"+json3+",\"sum\":"+json4+"}");
		
		
	}
}
