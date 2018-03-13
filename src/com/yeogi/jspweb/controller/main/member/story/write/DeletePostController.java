package com.yeogi.jspweb.controller.main.member.story.write;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yeogi.jspweb.dao.TLogPostDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTLogPostDao;

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
		
		PrintWriter out = response.getWriter();
		
		if(postId != null && !postId.equals("")) {
			TLogPostDao tlpDao = new JdbcTLogPostDao();
			int result = tlpDao.delete(postId);
			
			out.println(result);
		}
	}
}
