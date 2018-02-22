package com.yeogi.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yeogi.jspweb.dao.MTPlanScrapDao;
import com.yeogi.jspweb.entity.MTPlanScrap;
import com.yeogi.jspweb.entity.TourPlan;

public class JdbcMTPlanScrapDao implements MTPlanScrapDao {

	@Override
	public int insert(MTPlanScrapDao memTourPlanScrap) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(MTPlanScrapDao memTourPlanScrap) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String mId, String tPlanId) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public MTPlanScrapDao get(String mId, String tPlanId) {
		String sql = "SELECT * FROM M_T_PLAN_SCRAP WHERE MID=? AND T_PLAN_ID =?";
		//String sql2 = "SELECT PWD = '122' FROM MEMBER";
		
		//드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			/*1은 물음표 위치index 1부터?*/
			st.setString(1, mId);
			st.setString(2, tPlanId);
			
			ResultSet rs = st.executeQuery();
			
			MTPlanScrap mTPlanScrap = null;

			if(rs.next()){
				mTPlanScrap = new MTPlanScrap(
							rs.getString("MID"),
							rs.getString("T_PLAN_ID"),
							rs.getDate("SCRAP_DATE")
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
	public List<MTPlanScrapDao> getList(String mId) {
		String sql = "SELECT * FROM M_T_PLAN_SCRAP";
		//String sql2 = "SELECT PWD = '122' FROM MEMBER";
		
		//드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			List<MTPlanScrap> list = new ArrayList<>();

			while(rs.next()){
				MTPlanScrap mTPlanScrap = new MTPlanScrap(
							rs.getString("MID"),
							rs.getString("T_PLAN_ID"),
							rs.getDate("SCRAP_DATE")
						);
				
				list.add(mTPlanScrap);
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
