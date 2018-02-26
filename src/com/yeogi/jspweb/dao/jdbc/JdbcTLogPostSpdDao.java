package com.yeogi.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yeogi.jspweb.dao.TLogPostSpdDao;
import com.yeogi.jspweb.entity.TLogPostImg;
import com.yeogi.jspweb.entity.TLogPostSpd;

public class JdbcTLogPostSpdDao implements TLogPostSpdDao {

	@Override
	public List<TLogPostSpd> getList(String tLogPostId) {
		
		String sql = "SELECT * FROM T_LOG_POST_SPD WHERE T_LOG_POST_ID = ?";

		List<TLogPostSpd> list = new ArrayList<>();

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1, tLogPostId);
			
			ResultSet rs = st.executeQuery();

			while (rs.next()) {

				TLogPostSpd tlogpostspd = new TLogPostSpd(		
						
						rs.getString("TYPE"),
						rs.getString("CONTENT"),
						rs.getString("UNIT"),
						rs.getInt("AMOUNT"),
						rs.getString("ID"),
						rs.getString("T_LOG_POST_ID"));
				
				list.add(tlogpostspd);
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
	public int insert(TLogPostSpd tlps) {
		
		String sql = "INSERT INTO T_LOG_POST_SPD VALUES(?,?,?,?,?,?)";

		int result = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);

			st.setString(1, tlps.getType());
			st.setString(2, tlps.getContent());
			st.setString(3, tlps.getUnit());
			st.setInt(4, tlps.getAmount());
			st.setString(5, tlps.getId());
			st.setString(6, tlps.gettLogPostId());
			
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
	public int update(TLogPostSpd tlps) {
		
		String sql = "UPDATE T_LOG_POST_SPD SET TYPE = ?, CONTENT = ?, UNIT = ?, AMOUNT = ? WHERE ID = ?";

		int result = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);

			st.setString(1, tlps.getType());
			st.setString(2, tlps.getContent());
			st.setString(3, tlps.getUnit());
			st.setInt(4, tlps.getAmount());
			st.setString(5, tlps.gettLogPostId());
			st.setString(6, tlps.getId());
			
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
		
		String sql = "DELETE T_LOG_POST_SPD WHERE ID = ?";

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
