package com.yeogi.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yeogi.jspweb.dao.TLogPostSpdDao;
import com.yeogi.jspweb.entity.TLogPostSpd;
import com.yeogi.jspweb.entity.TLogPostSpdView;

public class JdbcTLogPostSpdDao implements TLogPostSpdDao {

	@Override
	public List<TLogPostSpdView> getList(String tLogId) {
		
		String sql = "SELECT * FROM T_LOG_POST_SPD_VIEW WHERE T_LOG_ID = ?";

		List<TLogPostSpdView> list = new ArrayList<>();

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1, tLogId);
			
			ResultSet rs = st.executeQuery();

			while (rs.next()) {

				TLogPostSpdView tlogpostspd = new TLogPostSpdView(	
						rs.getString("TYPE"),
						rs.getString("CONTENT"),
						rs.getString("UNIT"),
						rs.getInt("AMOUNT"),
						rs.getString("ID"),
						rs.getString("T_LOG_POST_ID"),
						rs.getString("T_LOG_ID")
						);
				
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
		
		String sql = "INSERT INTO T_LOG_POST_SPD "
				+ "VALUES("
				+ "?,"
				+ "?,"
				+ "?,"
				+ "?,"
				+ "(SELECT NVL(MAX(TO_NUMBER(ID)),TO_CHAR(SYSDATE,'YYYYMMDD')||'00000')+1 ID FROM T_LOG_POST_SPD WHERE SUBSTR(ID,1,8) = TO_CHAR(SYSDATE, 'YYYYMMDD')),"
				+ "?"
				+ ")";

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

	@Override
	public List<TLogPostSpdView> getSum(String tLogId) {

		String sql = "SELECT T_LOG_ID, TYPE, SUM(AMOUNT) SUM FROM T_LOG_POST_SPD_VIEW WHERE T_LOG_ID=? GROUP BY T_LOG_ID, TYPE";

		List<TLogPostSpdView> list = new ArrayList<>();

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1, tLogId);
			
			ResultSet rs = st.executeQuery();

			while (rs.next()) {

				TLogPostSpdView tLogPostSpd = new TLogPostSpdView(
						rs.getString("T_LOG_ID"),
						rs.getString("TYPE"),
						rs.getInt("SUM")
						);
				
				list.add(tLogPostSpd);
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

}
