package com.yeogi.jspweb.controller.main.member.story.read;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tiles.TilesContainer;
import org.apache.tiles.access.TilesAccess;
import org.apache.tiles.request.ApplicationContext;
import org.apache.tiles.request.servlet.ServletRequest;
import org.apache.tiles.request.servlet.ServletUtil;

import com.yeogi.jspweb.dao.TourLogDao;
import com.yeogi.jspweb.dao.jdbc.JdbcTourLogDao;
import com.yeogi.jspweb.entity.TourLog;

@WebServlet("/main/member/story/read/main")
public class ReadMainController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*String id = request.getParameter("id");
		TourLogDao tourLogDao = new JdbcTourLogDao();
		TourLog tourLog = tourLogDao.get(id);
		*/
		ApplicationContext applicationContext = ServletUtil
				.getApplicationContext(request.getSession().getServletContext());
		TilesContainer container = TilesAccess.getContainer(applicationContext);
		ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
		container.render("main.member.story.read.main", servletRequest);
	}

}
