package com.yeogi.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yeogi.jspweb.dao.TPlanModAuthDao;
import com.yeogi.jspweb.entity.TPlanModAuth;
import com.yeogi.jspweb.entity.TourPlan;

public class JdbcTPlanModAuthDao implements TPlanModAuthDao {
	
	
	@Override
	public int insert(TPlanModAuth tourPlanModAuth) {
		String sql = "INSERT INTO T_PLAN_MOD_AUTH "
				+ "( ACCEPT_YN ) "
				+ "VALUES (?)";
		//String sql2 = "SELECT PWD = '122' FROM MEMBER";
		int result = 0;
		//드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			/*1은 물음표 인덱스?*/
			st.setString(1, tourPlanModAuth.getAcceptYN());
			
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

	/*@Override
	public int update(TPlanModAuth tourPlanModAuth) {
		// TODO Auto-generated method stub
		return 0;
	}*/

	@Override
	public int delete(String tPlanId, String friendId) {
		String sql = "DELETE T_PLAN_MOD_AUTH WHERE T_PLAN_ID=? AND FRIEND_ID=?";
		//String sql2 = "SELECT PWD = '122' FROM MEMBER";
		int result = 0;
		//드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			/*1은 물음표 인덱스?*/
			st.setString(1, tPlanId);
			st.setString(2, friendId);
			
			/*result에는 삭제, 업데이트 된 개수 나옴*/	
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
	public TPlanModAuth get(String tPlanId, String friendId) {
		String sql = "SELECT * FROM T_PLAN_MOD_AUTH WHERE T_PLAN_ID=? AND FRIEND_ID=?";
		//String sql2 = "SELECT PWD = '122' FROM MEMBER";
		TPlanModAuth tPlanModAuth = null;
		//드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			/*1은 물음표 인덱스?*/
			st.setString(1, tPlanId);
			st.setString(2, friendId);
			
			if(rs.next()){
				tPlanModAuth = new TPlanModAuth(
							rs.getString("T_PLAN_ID"),
							rs.getString("FRIEND_ID"),
							rs.getString("ACCEPT_YN"),
							rs.getDate("REG_DATE")
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
		return tPlanModAuth;
	}

	@Override
	public List<TPlanModAuth> getList(String tPlanId) {
		String sql = "SELECT * FROM T_PLAN_MOD_AUTH ORDER BY REG_DATE";
		//String sql2 = "SELECT PWD = '122' FROM MEMBER";
		List<TPlanModAuth> list = new ArrayList<>();
		//드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			
			TPlanModAuth tPlanModAuth = null;
			while(rs.next()){
				tPlanModAuth = new TPlanModAuth(
							rs.getString("T_PLAN_ID"),
							rs.getString("FRIEND_ID"),
							rs.getString("ACCEPT_YN"),
							rs.getDate("REG_DATE")
						);
				
				list.add(tPlanModAuth);
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
