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
		String sql = "SELECT * FROM Commu_post ORDER BY REG_DATE DESC";
		
		List<Commu_Post> list = new ArrayList<>();
		
		try {
			// ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
						
			while(rs.next()) {
				TourLog tourLog = new TourLog(
						rs.getString("ID"),
						rs.getString("TITLE"),
						rs.getString("MEMO"),
						rs.getString("SUB_TITLE"),
						rs.getString("COVER_IMG"),
						rs.getString("LOCK_YN"),
						rs.getDate("REG_DATE"),
						rs.getInt("PERIOD"),
						rs.getDate("START_DATE"),
						rs.getInt("COMPANION"),
						rs.getString("MID"),
						rs.getDate("LAST_MOD_DATE"),
						rs.getInt("HIT"),
						rs.getString("T_THEME"),
						rs.getDate("END_DATE")						
						);
				list.add(Commu);
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
		return 0;
	}

	@Override
	public int update(Commu_Post cp) {
		// TODO Auto-generated method stub
		return 0;
	}

}
