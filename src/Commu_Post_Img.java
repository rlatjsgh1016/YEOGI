import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.If;

import com.yeogi.jspweb.dao.Commu_Post_ImgDao;
import com.yeogi.jspweb.dao.jdbc.JdbcCommuPostImgDao;

public class Commu_Post_Img extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(request, response);
		
		String id =request.getParameter("id");
		
		Commu_Post_ImgDao commu_post_imgDao = new JdbcCommuPostImgDao();
		Commu_Post_Img commu_post_img = commu_post_imgDao.getList();
		
		request.setAttribute("Commu_Post_Img", commu_post_img);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("");
		
		dispatcher.forward(request, response);
		
		if(request)
	}

	
	

	
	
}
