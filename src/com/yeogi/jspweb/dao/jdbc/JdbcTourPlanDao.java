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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(TourPlan tourPlan) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TourPlan get(String id) {
		String sql = "SELECT * FROM TOUR_PLAN WHERE ID=?";
		//String sql2 = "SELECT PWD = '122' FROM MEMBER";
		
		//드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			/*1은 물음표 개수?*/
			st.setString(1, id);
			
			ResultSet rs = st.executeQuery();
			
			TourPlan tourPlan = null;

			if(rs.next()){
				tourPlan = new TourPlan(
							rs.getString("ID"),
							rs.getString("TITLE"),
							rs.getDate("START_DATE"),
							rs.getDate("END_DATE"),
							rs.getInt("COMPANION"),
							rs.getInt("PERIOD"),
							rs.getDate("REG_DATE"),
							rs.getString("MID"),
							rs.getString("LAST_MOD_DATE"),
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
		return null;
	}

	@Override
	public List<TourPlan> getList(String id) {
		String sql = "SELECT * FROM TOUR_PLAN";
		//String sql2 = "SELECT PWD = '122' FROM MEMBER";
		
		//드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			List<TourPlan> list = new ArrayList<>();
			
			while(rs.next()){
				TourPlan tourPlan = new TourPlan(
							rs.getString("ID"),
							rs.getString("TITLE"),
							rs.getDate("START_DATE"),
							rs.getDate("END_DATE"),
							rs.getInt("COMPANION"),
							rs.getInt("PERIOD"),
							rs.getDate("REG_DATE"),
							rs.getString("MID"),
							rs.getString("LAST_MOD_DATE"),
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
		return null;
	}

}
