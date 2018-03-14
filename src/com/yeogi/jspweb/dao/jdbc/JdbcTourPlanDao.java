package com.yeogi.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yeogi.jspweb.dao.TourPlanDao;
import com.yeogi.jspweb.entity.TourPlan;

public class JdbcTourPlanDao implements TourPlanDao {
	
	@Override
	public int insert(TourPlan tourPlan) {
		String sql = "INSERT INTO TOUR_PLAN (" + 
				"    ID," + 
				"    TITLE," + 
				"    START_DATE," + 
				"    END_DATE," + 
				"    COMPANION," + 
				"    MID," +
				"    PERIOD," +
				"    T_THEME" + 
				") VALUES ((SELECT NVL(MAX(TO_NUMBER(ID)),TO_CHAR(SYSDATE,'YYYYMMDD')||'00000')+1 ID FROM tour_plan WHERE SUBSTR(ID,1,8) = TO_CHAR(SYSDATE, 'YYYYMMDD')),?,?,?,?,?,?,?)";
		//String sql2 = "SELECT PWD = '122' FROM MEMBER";
		int result = 0;
		
		//드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			/*1은 물음표 개수?*/
			st.setString(1, tourPlan.getTitle());
			st.setDate(2, tourPlan.getStartDate());
			st.setDate(3, tourPlan.getEndDate());
			st.setInt(4, tourPlan.getCompanion());
			st.setString(5, tourPlan.getmId());
			st.setInt(6, tourPlan.getPeriod());
			st.setString(7, tourPlan.gettTheme());
				
			result = st.executeUpdate();
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int update(TourPlan tourPlan) {
		String sql = "UPDATE TOUR_PLAN SET" + 
				"    TITLE=?," + 
				"    START_DATE=?," + 
				"    END_DATE=?," + 
				"    COMPANION=?," + 
				"    T_THEME=?," + 
				"	WHERE ID=?";
		//String sql2 = "SELECT PWD = '122' FROM MEMBER";
		int result = 0;
		
		//드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			/*1은 물음표 개수?*/
			st.setString(1, tourPlan.getId());
			st.setString(2, tourPlan.gettTheme());
			st.setInt(3, tourPlan.getCompanion());
			st.setInt(4, tourPlan.getPeriod());
			st.setDate(5, tourPlan.getStartDate());
			st.setString(6, tourPlan.getTitle());
			st.setDate(7, tourPlan.getEndDate());
			
			result = st.executeUpdate();
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int delete(String id) {
		String sql = "DELETE TOUR_PLAN WHERE ID=?";
		//String sql2 = "SELECT PWD = '122' FROM MEMBER";
		int result = 0;
		
		//드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			/*1은 물음표 개수?*/
			st.setString(1, id);
			
			result = st.executeUpdate();
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public TourPlan get(String id) {
		String sql = "SELECT * FROM TOUR_PLAN WHERE ID=?";
		//String sql2 = "SELECT PWD = '122' FROM MEMBER";
		TourPlan tourPlan = null;
		//드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			/*1은 물음표 개수?*/
			st.setString(1, id);
			
			ResultSet rs = st.executeQuery();

			if(rs.next()){
				tourPlan = new TourPlan(
							rs.getString("ID"),
							rs.getString("TITLE"),
							rs.getDate("START_DATE"),
							rs.getDate("END_DATE"),
							rs.getInt("COMPANION"),
							rs.getInt("PERIOD"),
							rs.getDate("REG_DATE"),
							rs.getString("LAST_MOD_DATE"),
							rs.getString("MID"),
							rs.getString("T_THEME")
						);
			}

			rs.close();
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tourPlan;
	}

	@Override
	public List<TourPlan> getList() {
		String sql = "SELECT * FROM TOUR_PLAN ORDER BY REG_DATE";
		//String sql2 = "SELECT PWD = '122' FROM MEMBER";
		List<TourPlan> list = new ArrayList<>();
		//드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			
			TourPlan tourPlan = null;
			while(rs.next()){
					tourPlan = new TourPlan(
							rs.getString("ID"),
							rs.getString("TITLE"),
							rs.getDate("START_DATE"),
							rs.getDate("END_DATE"),
							rs.getInt("COMPANION"),
							rs.getInt("PERIOD"),
							rs.getDate("REG_DATE"),
							rs.getString("LAST_MOD_DATE"),
							rs.getString("MID"),
							rs.getString("T_THEME")
						);
				
				list.add(tourPlan);
			}
			
			rs.close();
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
