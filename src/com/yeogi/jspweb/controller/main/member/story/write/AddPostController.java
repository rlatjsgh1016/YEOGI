package com.yeogi.jspweb.controller.main.member.story.write;

import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

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
import com.yeogi.jspweb.entity.TLogPost;
import com.yeogi.jspweb.entity.TLogPostSpd;
import com.yeogi.jspweb.entity.TLogPostView;
import com.yeogi.jspweb.entity.Tag;

@WebServlet("/main/member/story/write/addPost")
public class AddPostController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
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
		
		
		Gson gson = new Gson();
		String json = gson.toJson(tLogPostDao.getList(isInsert));
		/*
		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		*/
		PrintWriter out = response.getWriter();
		
		out.println(json);
	}
}
