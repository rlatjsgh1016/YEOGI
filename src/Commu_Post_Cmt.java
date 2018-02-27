import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yeogi.jspweb.dao.Commu_Post_CmtDao;
import com.yeogi.jspweb.dao.jdbc.JdbcCommuPostCmtDao;

public class Commu_Post_Cmt extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(request, response);

		String id =request.getParameter("id");
	
		Commu_Post_CmtDao commu_post_cmtDao = new JdbcCommuPostCmtDao();
		Commu_Post_Cmt commu_post_cmt = commu_post_cmtDao.getList();
		
		request.setAttribute("Commu_Post_Cmt", commu_post_cmt);
		
		RequestDispatcher dispatchers = request.getRequestDispatcher("");
		
		dispatchers.forward(request,response);
		}

	
}
	