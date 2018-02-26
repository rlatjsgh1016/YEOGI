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

	/*스크랩하면 사용자가 직접 입력하는게 없는데 어떻게 해야하나*/
	@Override
	public int insert(MTPlanScrap memTourPlanScrap) {
		String sql = "?";
		//String sql2 = "SELECT PWD = '122' FROM MEMBER";
		int result = 0;
		//드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);			
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
	
	/*사용자가 update할 수 없으니까?*/
	/*@Override
	public int update(MTPlanScrap memTourPlanScrap) {
		// TODO Auto-generated method stub
		return 0;
	}*/

	@Override
	public int delete(String mId, String tPlanId) {
		String sql = "DELETE M_T_PLAN_SCRAP WHERE MID=? AND T_PLAN_ID =?";
		//String sql2 = "SELECT PWD = '122' FROM MEMBER";
		int result = 0;
		//드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);			
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
	public MTPlanScrap get(String mId, String tPlanId) {
		String sql = "SELECT * FROM M_T_PLAN_SCRAP WHERE MID=? AND T_PLAN_ID =?";
		//String sql2 = "SELECT PWD = '122' FROM MEMBER";
		MTPlanScrap mTPlanScrap = null;
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
		return mTPlanScrap;
	}

	@Override
	public List<MTPlanScrap> getList(String mId) {
		String sql = "SELECT * FROM M_T_PLAN_SCRAP ORDER BY SCRAP_DATE";
		//String sql2 = "SELECT PWD = '122' FROM MEMBER";
		List<MTPlanScrap> list = new ArrayList<>();
		//드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			
			
			MTPlanScrap mTPlanScrap = null;
			while(rs.next()){
				mTPlanScrap = new MTPlanScrap(
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
		return list;
	}

}
