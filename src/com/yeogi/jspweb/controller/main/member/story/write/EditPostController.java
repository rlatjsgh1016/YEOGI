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

@WebServlet("/main/member/story/write/editPost")
@MultipartConfig(
		fileSizeThreshold = 1024*1024,
		maxFileSize = 1024*1024*100,	//	100메가
		maxRequestSize = 1024*1024*100*5	//	100메가
		)
public class EditPostController extends HttpServlet {
	

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String postId = request.getParameter("post-id");
		String spdId = request.getParameter("spd-id");
		String tagId = request.getParameter("tag-id");
		
		Gson gson = new Gson();
		PrintWriter out = response.getWriter();
		
		if(postId != null && !postId.equals("")) {
			TLogPostDao tlpDao = new JdbcTLogPostDao();
			TLogPostView tlpv = tlpDao.get(postId);
			String json = gson.toJson(tlpv);
			out.println(json);
		}
		else if(spdId != null && !spdId.equals("")) {
			TLogPostSpdDao tlpsDao = new JdbcTLogPostSpdDao();
			List<TLogPostSpdView> tlpsv = tlpsDao.getPostIdList(spdId);
			String json = gson.toJson(tlpsv);
			out.println(json);
		}
		else if(tagId != null && !tagId.equals("")) {
			TagDao tagDao = new JdbcTagDao();
			List<TagView> tag = tagDao.getPostIdList(tagId);
			String json = gson.toJson(tag);
			out.println(json);
		}
		
	}
}
