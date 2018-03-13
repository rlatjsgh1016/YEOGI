package com.yeogi.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yeogi.jspweb.dao.TLogLocDao;
import com.yeogi.jspweb.entity.TLogLoc;
import com.yeogi.jspweb.entity.Tag;
import com.yeogi.jspweb.entity.TourLog;

public class JdbcTLogLocDao implements TLogLocDao {

	@Override
	public List<TLogLoc> getList(TourLog tourLog) {
		
		String sql = "SELECT * FROM T_LOG_LOC";

		List<TLogLoc> list = new ArrayList<>();

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1, tourLog.getId());
			
			ResultSet rs = st.executeQuery();

			while (rs.next()) {

				TLogLoc tlogloc = new TLogLoc(
						
						rs.getString("LOC_ID"),
						rs.getString("ID"),
						rs.getString("T_LOG_ID"),
						rs.getDate("REG_DATE"));
				
				list.add(tlogloc);
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
		return list;
	}

	@Override
	public int insert(TLogLoc tll) {
		
		String sql = "INSERT INTO T_LOG_LOC(LOC_ID, ID, T_LOG_ID) VALUES(?,?,?)";

		int result = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);

			st.setString(1, tll.getLocId());
			st.setString(2, tll.getId());
			st.setString(3, tll.gettLogId());

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
	public int update(TLogLoc tll) {

		String sql = "UPDATE T_LOG_LOC SET LOC_ID = ?, T_LOC_ID = ? WHERE ID = ?";

		int result = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);

			st.setString(1, tll.getLocId());
			st.setString(2, tll.gettLogId());
			st.setString(3, tll.getId());

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
		
		String sql = "DELETE T_LOG_LOC WHERE ID = ?";

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
