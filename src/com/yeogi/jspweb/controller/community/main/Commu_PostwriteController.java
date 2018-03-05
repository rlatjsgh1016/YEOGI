package com.yeogi.jspweb.controller.community.main;
import java.io.IOException;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yeogi.jspweb.dao.Commu_PostDao;
import com.yeogi.jspweb.dao.Commu_Post_ImgDao;
import com.yeogi.jspweb.dao.jdbc.JdbcCommuPostDao;
import com.yeogi.jspweb.dao.jdbc.JdbcCommuPostImgDao;
import com.yeogi.jspweb.entity.Commu_Post;
import com.yeogi.jspweb.entity.Commu_Post_Img;


@WebServlet("/WebContent/main/public-board/communitywritting")
public class Commu_PostwriteController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(request, response);
		
		String id =request.getParameter("img");
		
		
		Commu_Post_ImgDao commu_post_imgDao = new JdbcCommuPostImgDao();
		List<Commu_Post_Img> commu_post_img =  commu_post_imgDao.getList();
		
		request.setAttribute("Commu_Post_Img", commu_post_img);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/");
	
		dispatcher.forward(request,response);
		
		
	}

	

	
	
}
