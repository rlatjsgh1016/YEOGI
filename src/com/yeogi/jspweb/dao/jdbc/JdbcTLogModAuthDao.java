package com.yeogi.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yeogi.jspweb.dao.TLogModAuthDao;
import com.yeogi.jspweb.entity.TLogLoc;
import com.yeogi.jspweb.entity.TLogModAuth;
import com.yeogi.jspweb.entity.TourLog;

public class JdbcTLogModAuthDao implements TLogModAuthDao {

	@Override
	public List<TLogModAuth> getList(TourLog tourLog) {
		
		String sql = "SELECT * FROM T_LOG_MOD_AUTH WHERE T_LOG_ID = ?";

		List<TLogModAuth> list = new ArrayList<>();

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1, tourLog.getId());
			
			ResultSet rs = st.executeQuery();

			while (rs.next()) {

				TLogModAuth logmodauth = new TLogModAuth(		
						
						rs.getString("ACCEPT_YN"),
						rs.getString("T_LOG_ID"),
						rs.getString("FRIEND_ID"),
						rs.getDate("REG_DATE"));
				
				list.add(logmodauth);
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
	public int insert(TLogModAuth tlma) {
		
		String sql = "INSERT INTO T_LOG_MOD_AUTH(ACCEPT_YN, T_LOG_ID, FRIEND_ID) VALUES(?,?,?)";

		int result = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);

			st.setString(1, tlma.getAcceptYN());
			st.setString(2, tlma.gettLogId());
			st.setString(3, tlma.getFriendId());
	
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
	public int update(TLogModAuth tlma) {
		
		String sql = "UPDATE T_LOG_MOD_AUTH SET ACCEPT_YN = ?, FRIEND_ID = ? WHERE T_LOG_ID = ? ";

		int result = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);

			st.setString(1, tlma.getAcceptYN());
			st.setString(2, tlma.getFriendId());
			st.setString(3, tlma.gettLogId());
	
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
		
		String sql = "DELETEL T_LOG_MOD_AUTH WHERE T_LOG_ID = ?";

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
