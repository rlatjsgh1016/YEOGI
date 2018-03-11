package com.yeogi.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yeogi.jspweb.dao.TLogPostDao;
import com.yeogi.jspweb.entity.TLogPost;
import com.yeogi.jspweb.entity.TLogPostView;
import com.yeogi.jspweb.entity.TourLog;

public class JdbcTLogPostDao implements TLogPostDao {

	@Override
	public List<TLogPostView> getList(String id) {
		
		String sql = "SELECT * FROM T_LOG_POST_VIEW WHERE T_LOG_ID = ?";

		List<TLogPostView> list = new ArrayList<>();

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1, id);
			
			ResultSet rs = st.executeQuery();

			while (rs.next()) {

				TLogPostView tlogpost = new TLogPostView(	
						
						rs.getString("POST_CONTENT"),
						rs.getString("T_LOG_ID"),
						rs.getString("T_LOG_LOC_ID"),
						rs.getString("TRANS"),
						rs.getString("T_LOG_POST_ID"),
						rs.getString("LOC_ID"),
						rs.getInt("ORDER"),
						rs.getInt("DAY"),
						rs.getString("NAME"),
						rs.getString("IMG")
						
						);
				
				list.add(tlogpost);
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
	public String insert(TLogPost tlp) {
		
		String sql = "INSERT INTO T_LOG_POST VALUES("
				+ "?,"
				+ "?,"
				+ "?,"
				+ "?,"
				+ "(SELECT NVL(MAX(TO_NUMBER(ID)),TO_CHAR(SYSDATE,'YYYYMMDD')||'00000')+1 ID FROM T_LOG_POST WHERE SUBSTR(ID,1,8) = TO_CHAR(SYSDATE, 'YYYYMMDD'))"
				+ ")";

		String sql2 = "SELECT MAX(TO_NUMBER(ID)) ID FROM T_LOG_POST WHERE SUBSTR(ID,1,8) = TO_CHAR(SYSDATE, 'YYYYMMDD')";
		
		String result = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);

			st.setString(1, tlp.getContent());
			st.setString(2, tlp.gettLogId());
			st.setString(3, tlp.gettLogLocId());
			st.setString(4, tlp.getTrans());
	
			st.executeUpdate();
			
			st = con.prepareStatement(sql2);

			ResultSet rs = st.executeQuery();

			if(rs.next()) {
				result = rs.getString("ID");
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

		return result;
	}

	@Override
	public int update(TLogPost tlp) {

		String sql = "UPDATE T_LOG_POST SET CONTENT = ?, T_LOG_ID = ?, T_LOG_LOC_ID = ?, TRANS = ? WHERE ID = ? ";

		int result = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);

			st.setString(1, tlp.getContent());
			st.setString(2, tlp.gettLogId());
			st.setString(3, tlp.gettLogLocId());
			st.setString(4, tlp.getTrans());
			st.setString(5, tlp.getId());
	
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
		String sql = "DELETE T_LOG_POST WHERE ID = ? ";

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
