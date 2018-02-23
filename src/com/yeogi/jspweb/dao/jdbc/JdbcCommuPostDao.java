package com.yeogi.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yeogi.jspweb.dao.Commu_PostDao;
import com.yeogi.jspweb.entity.Commu_Post;
import com.yeogi.jspweb.entity.TourLog;

public class JdbcCommuPostDao implements Commu_PostDao {

	@Override
	public List<Commu_Post> getList() {

		String sql = "SELECT * FROM Commu_Post ORDER BY REG_DATE DESC";
		
		List<Commu_Post> list = new ArrayList<>();
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
						
			while(rs.next()) {
				Commu_Post commu_post = new Commu_Post(
						rs.getString("title"),
						rs.getString("content"),
						rs.getString("hit"),
						rs.getString("post_Type"),
						rs.getString("commu_Post")
						);
				list.add(commu_post);
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
	public int insert(Commu_Post cp) {
		// TODO Auto-generated method stub
		String sql ="INSERT INTO commu_post (" + 
				"    id," + 
				"    title," + 
				"    reg_date," + 
				"    content," + 
				"    hit," +
 				"    mid," +
 				"    post_type" +
				") VALUES (?,?,?,?,?,?,?)"; 
		
		int result=0;
		return result;	
	}
		
	@Override
	public int update(Commu_Post cp) {
		// TODO Auto-generated method stub
		return 0;
	}

}
