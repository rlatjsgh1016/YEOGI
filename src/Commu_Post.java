import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yeogi.jspweb.dao.Commu_PostDao;
import com.yeogi.jspweb.dao.jdbc.JdbcCommuPostDao;



public class Commu_Post extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(request, response);
		
		String id =request.getParameter("id");
		
		Commu_PostDao commu_postDao = new JdbcCommuPostDao();
		Commu_Post commu_post = commu_postDao.getList();
		
		request.setAttribute("Commu_Post", commu_post);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("");
	
		dispatcher.forward(request,response);
	}

	

	
	
}
