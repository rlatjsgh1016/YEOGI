package com.yeogi.jspweb.controller.main.member.mypage.friends;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
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

import com.yeogi.jspweb.dao.FriendDao;
import com.yeogi.jspweb.dao.MemberDao;
import com.yeogi.jspweb.dao.jdbc.JdbcFriendDao;
import com.yeogi.jspweb.dao.jdbc.JdbcMemberDao;
import com.yeogi.jspweb.entity.Friend;
import com.yeogi.jspweb.entity.Member;

@WebServlet("/main/member/mypage/friends/friends")
public class FriendsController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getSession().getAttribute("id")==null)
		{
			response.sendRedirect("../../../login?");
		}
		else {
			String id = (String) request.getSession().getAttribute("id");
			
			Member member = new Member();
			MemberDao memberDao = new JdbcMemberDao();
			
			
			try {
				member = memberDao.getId(id);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			request.setAttribute("member", member);
			
			
			FriendDao friendDao = new JdbcFriendDao(); 
			
			List<Friend> list = null;
			List<Friend> list2 = null;

			list= friendDao.getList2(id);
			list2 =friendDao.getList(id);
			
			
			System.out.println(id);
			//System.out.println(list.get(0).getMyId());
	
			request.setAttribute("list",list);
			request.setAttribute("list2",list2);
			
			
			
			ApplicationContext applicationContext = ServletUtil
					.getApplicationContext(request.getSession().getServletContext());
			TilesContainer container = TilesAccess.getContainer(applicationContext);
			ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
			container.render("main.member.mypage.friends.friends", servletRequest);
		}
	
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String btn = null;

		String btn_ = request.getParameter("btn");
		String temp = request.getParameter("id");
		
		
		if(btn_ != null && !btn_.equals(""))
			btn = btn_;
		
		Member mem = new Member();
		MemberDao member = new JdbcMemberDao();

		
		Friend fri = new Friend();
		FriendDao friend = new JdbcFriendDao();
		
		switch(btn) {
		
		case "검색":
			//System.out.println(temp);
			
			PrintWriter outt = response.getWriter(); 

			try {
				mem = member.getId(temp);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if( mem != null)	
			{

	/* 			outt.println("<script type=\'text/javascript\'>"); 
				outt.println("alert('해당 회원이 있습니다.');"); 
				outt.println("location.href ='friends.jsp';");
				outt.println("</script>"); 	
	 */			request.getSession().setAttribute("mem", mem);
				RequestDispatcher dispatcher = request.getRequestDispatcher("friends.jsp");
				dispatcher.forward(request, response); 
			}
			else{
				outt.println("<script type=\'text/javascript\'>"); 
				outt.println("alert('해당회원이 없습니다.');"); 
				outt.println("location.href ='friends.jsp';");
				outt.println("</script>"); 	
				
			}
					
			try {
				member.getId(temp);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//response.sendRedirect("join.jsp");
			break;
		case "친구신청":
			PrintWriter outtt = response.getWriter(); 
			outtt.println("<script type=\'text/javascript\'>"); 
			outtt.println("location.href ='friends.jsp';");
			outtt.println("</script>"); 	
			break;
		
		}
	}
	
	
}

