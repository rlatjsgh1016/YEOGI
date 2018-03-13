package com.yeogi.jspweb.controller.main.member.story.write;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

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

import com.google.gson.Gson;
import com.yeogi.jspweb.dao.TLogPostDao;
import com.yeogi.jspweb.dao.TLogPostSpdDao;
import com.yeogi.jspweb.dao.TagDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTLogPostDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTLogPostSpdDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTagDao;
import com.yeogi.jspweb.entity.TLogPost;
import com.yeogi.jspweb.entity.TLogPostSpd;
import com.yeogi.jspweb.entity.TLogPostSpdView;
import com.yeogi.jspweb.entity.TLogPostView;
import com.yeogi.jspweb.entity.Tag;
import com.yeogi.jspweb.entity.TagView;

@WebServlet("/main/member/story/write/addPost")
@MultipartConfig(
		fileSizeThreshold = 1024*1024,
		maxFileSize = 1024*1024*100,	//	100메가
		maxRequestSize = 1024*1024*100*5	//	100메가
		)
public class AddPostController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
				
		// T_LOG_POST INSERT DATA
		String postContent = request.getParameter("post-memo");
		String tourLogId = request.getParameter("tour-log-id");
		String postLocId = request.getParameter("loc-id");
		String postVehicle = request.getParameter("vehicle");
		int currDay = Integer.parseInt(request.getParameter("curr-day"));
		
		// SPD, TAG 공통 INSERT DATA (L_LOG_POST INSERT 리턴값 적용)
		String insertedPostId = null;
		
		// T_LOG_POST_SPD INSERT DATA
		String postSpdType = request.getParameter("spd-type");
		String postSpdContent = request.getParameter("spd-content");
		String postSpdUnit = request.getParameter("spd-unit");
		String postSpdAmount_ = request.getParameter("spd-amount");
		
		// TAG INSERT DATA
		String postTag = request.getParameter("tag");
		
		// 포스트 crud DAO 준비
		TLogPostDao tLogPostDao = new JdbcTLogPostDao();
		TLogPostSpdDao tLogPostSpdDao = new JdbcTLogPostSpdDao();
		TagDao tagDao = new JdbcTagDao();
		
		//출력용 DATA 생성 & 전송
		Gson gson = new Gson();
		PrintWriter out = response.getWriter();
		
		TLogPost tlp = new TLogPost(postContent, tourLogId, postLocId, postVehicle, currDay);
		insertedPostId = tLogPostDao.insert(tlp);
		
		if(postSpdType != null && postSpdContent != null && postSpdUnit != null && postSpdAmount_ != null) {
			
			int postSpdAmount = Integer.parseInt(postSpdAmount_);
			TLogPostSpd tlps = new TLogPostSpd(postSpdType, postSpdContent, postSpdUnit, postSpdAmount, insertedPostId);
			tLogPostSpdDao.insert(tlps);
		}
		
		if(postTag != null && !postTag.equals("")) {
			
			//문자열 파싱
			String[] postTags = postTag.split(",");
			for(int i=0; i<postTags.length; i++) {
				if(!postTags[i].trim().equals("")) {
					Tag tag = new Tag(postTags[i], insertedPostId);
					tagDao.insert(tag);
				}
			}
		}
		
		List<TLogPostView> tlpv = tLogPostDao.getList(tourLogId);
		String json1 = gson.toJson(tlpv);
		
		List<TLogPostSpdView> tlpsv = tLogPostSpdDao.getList(tourLogId);
		String json2 = gson.toJson(tlpsv);
		
		List<TagView> tag = tagDao.getList(tourLogId);
		String json3 = gson.toJson(tag);
		
		List<TLogPostSpdView> tlpsv2 = tLogPostSpdDao.getSum(tourLogId);
		String json4 = gson.toJson(tlpsv2);

		out.println("{\"post\":"+json1+",\"spd\":"+json2+",\"tag\":"+json3+",\"sum\":"+json4+"}");
		//out.println("{\"post\":["+json1+"],\"spd\":["+json2+"],\"tag\":["+json3+"],\"sum\":["+json4+"]}");
	}
}
