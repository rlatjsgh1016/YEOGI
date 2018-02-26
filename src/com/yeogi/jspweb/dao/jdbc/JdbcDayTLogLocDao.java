package com.yeogi.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yeogi.jspweb.dao.DayTLogLocDao;
import com.yeogi.jspweb.entity.Day;
import com.yeogi.jspweb.entity.DayTLogLoc;

public class JdbcDayTLogLocDao implements DayTLogLocDao {

	@Override
	public List<DayTLogLoc> getList(Day day) {

		String sql = "SELECT * FROM DAY_T_LOG_LOC WHERE DAY = ?";

		List<DayTLogLoc> list = new ArrayList<>();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setInt(1, day.getDay());

			ResultSet rs = st.executeQuery();
			
			while (rs.next()) {
				
				DayTLogLoc daytlogloc = new DayTLogLoc(
						rs.getString("id"), 
						rs.getInt("day"), 
						rs.getString("t_Log_Loc_Id")
						);
				
				list.add(daytlogloc);
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

	@Override
	public int insert(DayTLogLoc dtll) {
		
		String sql = "INSERT INTO DAY_T_LOG_LOC VALUES(?,?,?)";
		
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1, dtll.getId());
			st.setInt(2, dtll.getDay());
			st.setString(3, dtll.gettLogLocId());
			
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
	public int update(DayTLogLoc dtll) {
		String sql = "UPDATE DAY_T_LOG_LOC SET DAY = ?, T_LOG_LOC_ID = ? WHERE ID = ?";
		
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setInt(1, dtll.getDay());
			st.setString(2, dtll.gettLogLocId());
			st.setString(3, dtll.getId());
			
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
		String sql = "DELETE DAY_T_LOG_LOC WHERE ID = ?";
		
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

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

}
