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

public class JdbcTourLogDao implements TourLogDao {
	
	@Override
	public List<TourLog> getList() {
		
		String sql = "SELECT * FROM TOUR_LOG ORDER BY REG_DATE DESC";
		
		List<TourLog> list = new ArrayList<>();
		
		try {
			// 드라이버 로드
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
	public TourLog get(String id) {

		String sql = "SELECT * FROM TOUR_LOG WHERE ID=?";
		
		TourLog tourLog = null;
		
		try {
			// 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				tourLog = new TourLog(
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
	public int insert(TourLog tl) {
		
		String sql = "INSERT INTO tour_log (" + 
					"    title," + 
					"    memo," + 
					"    lock_yn," + 
					"    t_theme," + 
					"    id," + 
					"    start_date," + 
					"    companion," + 
					"    mid," + 
					"    cover_img," + 
					"    period," + 
					"    sub_title," + 
					"    end_date" + 
					")" + 
					"VALUES ("
					+ "?,"
					+ "?,"
					+ "?,"
					+ "?,"
					+ "SELECT NVL(MAX(TO_NUMBER(ID)),TO_CHAR(SYSDATE,'YYYYMMDD')||'00000')+1 ID FROM TOUR_LOG WHERE SUBSTR(ID,1,8) = TO_CHAR(SYSDATE, 'YYYYMMDD'),"
					+ "?,"
					+ "?,"
					+ "?,"
					+ "?,"
					+ "?,"
					+ "?,"
					+ "?"
					+ ")";
		
		int result = 0;
		
		try {
			// 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1, tl.getTitle());
			st.setString(2, tl.getMemo());
			st.setString(3, tl.getLockYN());
			st.setString(4, tl.gettTheme());
			st.setString(5, tl.getId());
			st.setDate(6, tl.getStartDate());
			st.setInt(7, tl.getCompanion());
			st.setString(8, tl.getMid());
			st.setString(9, tl.getCoverImg());
			st.setInt(10, tl.getPeriod());
			st.setString(11, tl.getSubTitle());
			st.setDate(12, tl.getEndDate());
			
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
	public int update(TourLog tl) {

		String sql = 
				
				TITLE
				MEMO
				SUB_TITLE
				COVER_IMG
				LOCK_YN
				PERIOD
				START_DATE
				COMPANION
				LAST_MOD_DATE
				HIT
				T_THEME
				END_DATE
				ID
		
				SELECT NVL(MAX(TO_NUMBER(ID)),0)+1 ID FROM TOUR_LOG WHERE TO_CHAR(REG_DATE,'YYYYMMDD') = TO_CHAR(SYSDATE, 'YYYYMMDD')
		int result = 0;
		
		try {
			// 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1, tl.getTitle());
			st.setString(2, tl.getMemo());
			st.setString(3, tl.getLockYN());
			st.setString(4, tl.gettTheme());
			st.setString(5, tl.getId());
			st.setDate(6, tl.getStartDate());
			st.setInt(7, tl.getCompanion());
			st.setString(8, tl.getMid());
			st.setString(9, tl.getCoverImg());
			st.setInt(10, tl.getPeriod());
			st.setString(11, tl.getSubTitle());
			st.setDate(12, tl.getEndDate());
			
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
		// TODO Auto-generated method stub
		return 0;
	}

}
