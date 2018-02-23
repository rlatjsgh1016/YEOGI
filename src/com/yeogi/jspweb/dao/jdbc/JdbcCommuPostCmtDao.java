package com.yeogi.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yeogi.jspweb.dao.Commu_Post_CmtDao;
import com.yeogi.jspweb.entity.Commu_Post;
import com.yeogi.jspweb.entity.Commu_Post_Cmt;
import com.yeogi.jspweb.entity.Commu_Post_Img;
import com.yeogi.jspweb.entity.TPlanPost;

public class JdbcCommuPostCmtDao implements Commu_Post_CmtDao {
	
	
	
	public List<Commu_Post_Cmt> getList() {
		
		String sql = "SELECT * FROM Commu_Post_Cmt ORDER BY REG_DATE DESC";
		List<Commu_Post_Cmt> list = new ArrayList<>();
		
	
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
						
			while(rs.next()) {
				Commu_Post_Cmt commu_post_Cmt = new Commu_Post_Cmt(
						rs.getString("Content")
						);
						
				list.add(commu_post_Cmt);
			}			
		
			
			rs.close();
			st.close();
			con.close();
		}
	    
	    catch (ClassNotFoundException e) {

	       e.printStackTrace();
	    } 
	    
	    catch (SQLException e) {
	       // TODO Auto-generated catch block
	       e.printStackTrace();
	    }
			return list;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Commu_Post_Cmt cpc) {
		// TODO Auto-generated method stub
			String sql ="INSERT INTO commu_post_cmt (" + 
					"    reg_date," + 
					"    content," + 
					"    commu_post_id," + 
					"    mid," + 
					"    id," +
	 				"    pid" +
					") VALUES(?,?,?,?,?,?)";
			
			int result=0;
			return result;
			

	}

	@Override
	public int update(Commu_Post_Cmt cpc) {
		// TODO Auto-generated method stub
		return 0;
	
	}
	}

