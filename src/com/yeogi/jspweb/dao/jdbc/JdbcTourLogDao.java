package com.yeogi.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yeogi.jspweb.dao.TourLogDao;
import com.yeogi.jspweb.entity.TourLog;
import com.yeogi.jspweb.entity.TourLogView;

public class JdbcTourLogDao implements TourLogDao {
	
	@Override
	public List<TourLogView> getList() {
		
		String sql = "SELECT * FROM TOUR_LOG_VIEW ORDER BY REG_DATE DESC";
		
		List<TourLogView> list = new ArrayList<>();
		
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
						
			while(rs.next()) {
				TourLogView tourLog = new TourLogView(
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
						rs.getTimestamp("LAST_MOD_DATE"),
						rs.getInt("HIT"),
						rs.getString("T_THEME"),
						rs.getDate("END_DATE"),
						rs.getString("NAION")
						);
				list.add(tourLog);
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
	public TourLogView get(String id) {

		String sql = "SELECT * FROM TOUR_LOG_VIEW WHERE ID=?";
		
		TourLogView tourLog = null;
		
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1, id);
			
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				tourLog = new TourLogView(
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
						rs.getTimestamp("LAST_MOD_DATE"),
						rs.getInt("HIT"),
						rs.getString("T_THEME"),
						rs.getDate("END_DATE"),
						rs.getString("NATION")
						);
			}
			
			rs.close();
			st.close();
			con.close();
		}
	    
	    catch (ClassNotFoundException e) {
	       // TODO Auto-generated catch block
	       e.printStackTrace();
	    } 
	    
	    catch (SQLException e) {
	       // TODO Auto-generated catch block
	       e.printStackTrace();
	    }
		return tourLog;
	}

	@Override
	public String insert(TourLog tl) {
		
		String sql = "INSERT INTO TOUR_LOG("
				+ "ID,"
				+ "TITLE,"
				+ "LOCK_YN,"
				+ "PERIOD,"
				+ "START_DATE,"
				+ "COMPANION,"
				+ "MID,"
				+ "T_THEME,"
				+ "END_DATE"
				+ ")"
				+ "VALUES ("
				+ "(SELECT NVL(MAX(TO_NUMBER(ID)),TO_CHAR(SYSDATE,'YYYYMMDD')||'00000')+1 ID FROM TOUR_LOG WHERE SUBSTR(ID,1,8) = TO_CHAR(SYSDATE, 'YYYYMMDD')),"
				+ "?,?,?,?,?,?,?,?)";
		
		String sql2 = "SELECT MAX(TO_NUMBER(ID)) ID FROM TOUR_LOG WHERE SUBSTR(ID,1,8) = TO_CHAR(SYSDATE, 'YYYYMMDD')";
		
		String result = null;
		
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1, tl.getTitle());
			st.setString(2, tl.getLockYN());
			st.setInt(3, tl.getPeriod());
			st.setDate(4, tl.getStartDate());
			st.setInt(5, tl.getCompanion());
			st.setString(6, tl.getMid());
			st.setString(7, tl.gettTheme());
			st.setDate(8, tl.getEndDate());
			
			st.executeUpdate();
			
			st = con.prepareStatement(sql2);
			
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				result = rs.getString("ID");
			}
			
			rs.close();
			st.close();
			con.close();
		}
	    
	    catch (ClassNotFoundException e) {
	       // TODO Auto-generated catch block
	       e.printStackTrace();
	    } 
	    
	    catch (SQLException e) {
	       // TODO Auto-generated catch block
	       e.printStackTrace();
	    }
		return result;
		
	}

	@Override
	public int update(TourLog tl) {

		String sql = "UPDATE TOUR_LOG SET " +
				"TITLE=?, " + 
				"MEMO=?, " + 
				"SUB_TITLE=?, " + 
				"COVER_IMG=?, " + 
				"LOCK_YN=?, " + 
				"PERIOD=?, " + 
				"START_DATE=?, " + 
				"COMPANION=?, " +
				"LAST_MOD_DATE=?, " + 
				"HIT=?, " + 
				"T_THEME=?, " + 
				"END_DATE=? " +
				"WHERE ID=?";
		
		int result = 0;
		
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1, tl.getTitle());
			st.setString(2, tl.getMemo());
			st.setString(3, tl.getSubTitle());
			st.setString(4, tl.getCoverImg());
			st.setString(5, tl.getLockYN());
			st.setInt(6, tl.getPeriod());
			st.setDate(7, tl.getStartDate());
			st.setInt(8, tl.getCompanion());
			st.setTimestamp(9, tl.getLastModDate());
			st.setInt(10, tl.getHit());
			st.setString(11, tl.gettTheme());
			st.setDate(12, tl.getEndDate());
			st.setString(13, tl.getId());
			
			result = st.executeUpdate();
						
			st.close();
			con.close();
		}
	    
	    catch (ClassNotFoundException e) {
	       // TODO Auto-generated catch block
	       e.printStackTrace();
	    } 
	    
	    catch (SQLException e) {
	       // TODO Auto-generated catch block
	       e.printStackTrace();
	    }
		return result;
		
	}

	@Override
	public int updateLock(TourLog tl) {

		String sql = "UPDATE TOUR_LOG SET LOCK_YN=? WHERE ID=?";
		
		int result = 0;
		
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1, tl.getLockYN());
			st.setString(2, tl.getId());
			
			result = st.executeUpdate();
						
			st.close();
			con.close();
		}
	    
	    catch (ClassNotFoundException e) {
	       // TODO Auto-generated catch block
	       e.printStackTrace();
	    } 
	    
	    catch (SQLException e) {
	       // TODO Auto-generated catch block
	       e.printStackTrace();
	    }
		return result;
		
	}
	
	@Override
	public int updateCover(TourLog tl) {

		String sql = "UPDATE TOUR_LOG SET "
				+ "COVER_IMG=? "
				+ "WHERE ID=?";
		
		int result = 0;
		
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1, tl.getCoverImg());
			st.setString(2, tl.getId());
			
			result = st.executeUpdate();
						
			st.close();
			con.close();
		}
	    
	    catch (ClassNotFoundException e) {
	       // TODO Auto-generated catch block
	       e.printStackTrace();
	    } 
	    
	    catch (SQLException e) {
	       // TODO Auto-generated catch block
	       e.printStackTrace();
	    }
		return result;
		
	}
	
	@Override
	public int delete(String id) {

		String sql = "DELETE FROM TOUR_LOG WHERE ID=?";
		
		int result = 0;
		
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1, id);
			
			result = st.executeUpdate();
						
			st.close();
			con.close();
		}
	    
	    catch (ClassNotFoundException e) {
	       // TODO Auto-generated catch block
	       e.printStackTrace();
	    } 
	    
	    catch (SQLException e) {
	       // TODO Auto-generated catch block
	       e.printStackTrace();
	    }
		return result;
	}

}
