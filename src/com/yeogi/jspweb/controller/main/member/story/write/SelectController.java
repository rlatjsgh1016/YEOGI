package com.yeogi.jspweb.controller.main.member.story.write;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yeogi.jspweb.dao.DayDao;
import com.yeogi.jspweb.dao.MemberDao;
import com.yeogi.jspweb.dao.NationDao;
import com.yeogi.jspweb.dao.jdbc.JdbcDayDao;
import com.yeogi.jspweb.dao.jdbc.JdbcMemberDao;
import com.yeogi.jspweb.dao.jdbc.JdbcNationDao;
import com.yeogi.jspweb.entity.Day;
import com.yeogi.jspweb.entity.Member;
import com.yeogi.jspweb.entity.Nation;

@WebServlet("/main/member/story/write/select")
public class SelectController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DayDao dayDao = new JdbcDayDao();
		List<Day> dayList = dayDao.getList();
		
		NationDao nationDao = new JdbcNationDao();
		List<Nation> nationList = nationDao.getList();
		
		MemberDao memberDao = new JdbcMemberDao();
		Member member;
		
		try {
			member = memberDao.get("dskim");
			
			HttpSession session = request.getSession();
			session.setAttribute("mid", member);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(dayList != null)
			request.setAttribute("dayList", dayList);
		
		if(nationList != null)
			request.setAttribute("nationList", nationList);
		
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/main/member/story/write/select.jsp");
		dispatcher.forward(request, response);
	}
}