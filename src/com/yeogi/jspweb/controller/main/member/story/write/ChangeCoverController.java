package com.yeogi.jspweb.controller.main.member.story.write;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.google.gson.Gson;
import com.yeogi.jspweb.dao.TourLogDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTourLogDao;
import com.yeogi.jspweb.entity.TourLog;

@WebServlet("/main/member/story/write/changeCover")
@MultipartConfig(
		fileSizeThreshold = 1024*1024,
		maxFileSize = 1024*1024*100,	//	100메가
		maxRequestSize = 1024*1024*100*5	//	100메가
		)
public class ChangeCoverController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String pathUrl = "/main/member/story/coverImg";

		String pathSystem = request.getServletContext().getRealPath(pathUrl);

		File file = new File(pathSystem);

		if (!file.exists())
			file.mkdirs();

		Part part = request.getPart("attached-file");
		InputStream is = part.getInputStream();
		String fileName = part.getSubmittedFileName();
				
		byte[] buf = new byte[1024];
		FileOutputStream fos = new FileOutputStream(pathSystem + File.separator + fileName);
						
		int size = 0;
		
		while((size = is.read(buf, 0, 1024)) != -1)
			fos.write(buf, 0, size);
		
		is.close();
		fos.close();
		
		String tourLogId = request.getParameter("tour-log-id");
		
		TourLogDao tlDao = new JdbcTourLogDao();
		TourLog tl = new TourLog();
		tl.setCoverImg(fileName);
		tl.setId(tourLogId);
		
		tlDao.updateCover(tl);
		
		Gson gson = new Gson();
		String json = gson.toJson(tl);
		
		PrintWriter out = response.getWriter();
		
		out.println(json);
	}
}
