package com.yeogi.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yeogi.jspweb.dao.Commu_Post_ImgDao;
import com.yeogi.jspweb.entity.Commu_Post;
import com.yeogi.jspweb.entity.Commu_Post_Img;

public class JdbcCommuPostImgDao implements Commu_Post_ImgDao {

	@Override
	public List<Commu_Post_Img> getList() {
    
		String sql = "SELECT * FROM Commu_Post_Img ORDER BY ID DESC";
		List<Commu_Post_Img> list = new ArrayList<>();
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
						
			while(rs.next()) {
				Commu_Post_Img commu_post_Img = new Commu_Post_Img(
						rs.getString("Img")
						);
						
				list.add(commu_post_Img);
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
	public int insert(Commu_Post_Img cpi) {
		// TODO Auto-generated method stub
		String sql ="INSERT INTO commu_post_img (" +  
				"    commu_post_id," + 
				"    id," +
 				"    img" +
				
				") VALUES (?,?,?,)"; 
		
		int result = 0;
		return result;

	}

	@Override
	public int update(Commu_Post_Img cpi) {
		// TODO Auto-generated method stub
		return 0;
	}
}

	