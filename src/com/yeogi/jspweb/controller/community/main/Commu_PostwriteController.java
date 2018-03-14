package com.yeogi.jspweb.controller.community.main;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yeogi.jspweb.dao.Commu_Post_ImgDao;
import com.yeogi.jspweb.dao.jdbc.JdbcCommuPostImgDao;
import com.yeogi.jspweb.entity.Commu_Post_Img;


@WebServlet("/main/public-board/community/communitywritting")
public class Commu_PostwriteController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String id =request.getParameter("img");
		String id2 =request.getParameter("title");
		
		
		Commu_Post_ImgDao commu_post_imgDao = new JdbcCommuPostImgDao();
		List<Commu_Post_Img> commu_post_img =  commu_post_imgDao.getList();
		
		
		Commu_Post_Img spi = new Commu_Post_Img(id2);
		commu_post_imgDao.insert(cpi)
		
		request.setAttribute("Commu_Post_Img", commu_post_img);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/main/public-board/community/CommunityWritting.jsp");
	
		dispatcher.forward(request,response);
		
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		Commu_Post_ImgDao commu_post_imgDao = new JdbcCommuPostImgDao();
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/main/public-board/community/CommunityWritting.jsp");
		
		dispatcher.forward(request,response);
		
		
	}
		
	}

