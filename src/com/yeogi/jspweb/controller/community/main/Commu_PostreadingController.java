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
import com.yeogi.jspweb.dao.Commu_Post_CmtDao;
import com.yeogi.jspweb.dao.jdbc.JdbcCommuPostCmtDao;
import com.yeogi.jspweb.dao.jdbc.JdbcCommuPostDao;
import com.yeogi.jspweb.entity.Commu_Post;
import com.yeogi.jspweb.entity.Commu_Post_Cmt;


@WebServlet("/WebContent/main/public-board/communityreading1")
public class Commu_PostreadingController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(request, response);
		
		String id =request.getParameter("commu_id");
		
		
		Commu_Post_CmtDao commu_post_cmtDao = new JdbcCommuPostCmtDao();
		List<Commu_Post_Cmt> commu_post_cmt =  commu_post_cmtDao.getList();
		
		request.setAttribute("Commu_Post_Cmt", commu_post_cmt);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("");
	
		dispatcher.forward(request,response);
		
		
	}

	

	
	
}
