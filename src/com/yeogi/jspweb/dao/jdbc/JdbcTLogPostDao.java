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

public class JdbcTLogPostDao implements TLogPostDao {

	@Override
	public List<TLogPostView> getList(String id) {
		
		String sql = "SELECT * FROM T_LOG_POST_VIEW WHERE T_LOG_ID = ? ORDER BY DAY";

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
						rs.getString("LOC_ID"),
						rs.getString("TRANS"),
						rs.getString("T_LOG_POST_ID"),
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
				+ "(SELECT NVL(MAX(TO_NUMBER(ID)),TO_CHAR(SYSDATE,'YYYYMMDD')||'00000')+1 ID FROM T_LOG_POST WHERE SUBSTR(ID,1,8) = TO_CHAR(SYSDATE, 'YYYYMMDD')),"
				+ "?)";

		String sql2 = "SELECT MAX(TO_NUMBER(ID)) ID FROM T_LOG_POST WHERE SUBSTR(ID,1,8) = TO_CHAR(SYSDATE, 'YYYYMMDD')";
		
		String result = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);

			st.setString(1, tlp.getContent());
			st.setString(2, tlp.gettLogId());
			st.setString(3, tlp.getLocId());
			st.setString(4, tlp.getTrans());
			st.setInt(5, tlp.getDay());
	
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

		String sql = "UPDATE T_LOG_POST SET CONTENT = ?, T_LOG_ID = ?, LOC_ID = ?, TRANS = ?, DAY = ? WHERE ID = ?";

		int result = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);

			st.setString(1, tlp.getContent());
			st.setString(2, tlp.gettLogId());
			st.setString(3, tlp.getLocId());
			st.setString(4, tlp.getTrans());
			st.setInt(5, tlp.getDay());
			st.setString(6, tlp.getId());
	
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

	@Override
	public TLogPostView get(String tLogPostId) {
		String sql = "SELECT * FROM T_LOG_POST_VIEW WHERE T_LOG_POST_ID = ? ORDER BY T_LOG_POST_ID";

		TLogPostView tLogPostView = null;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1, tLogPostId);
			
			ResultSet rs = st.executeQuery();

			while (rs.next()) {

				tLogPostView = new TLogPostView(	
						
						rs.getString("POST_CONTENT"),
						rs.getString("T_LOG_ID"),
						rs.getString("LOC_ID"),
						rs.getString("TRANS"),
						rs.getString("T_LOG_POST_ID"),
						rs.getInt("DAY"),
						rs.getString("NAME"),
						rs.getString("IMG")
						
						);
				
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
		return tLogPostView;
	}


	@Override
	public int getLocCount(String tLogId) {
		String sql = "SELECT COUNT(NAME) COUNT FROM T_LOG_POST_VIEW WHERE T_LOG_ID = ?";

		int locCount = 0;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1, tLogId);
			
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				locCount = rs.getInt("count");
				//System.out.printf("id: %s, name: %s\n",id,name);
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
		return locCount;
	}
	
	
	public List<TLogPostView> getLocListByDay(String id,int day) {
		
		String sql = "select * from t_log_post_view WHERE T_LOG_ID=? AND DAY =?;";

		
		List<TLogPostView> locList = new ArrayList<>();

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1, id);
			st.setInt(2, day);
			
			ResultSet rs = st.executeQuery();

			while (rs.next()) {

				TLogPostView tlogpost = new TLogPostView(	
						
						rs.getString("NAME"),
						rs.getString("POST_CONTENT"),
						rs.getString("IMG")						
						);
				
				locList.add(tlogpost);
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
		return locList;
	}

	public int getMaxDay(String id){
		String sql = "select max(day) maxDay from t_log_post WHERE T_LOG_ID=?";
		
		int maxDay = 0;
		
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1, id);
			
			ResultSet rs = st.executeQuery();

			if(rs.next()) {
				maxDay = rs.getInt("maxDay");
				//System.out.printf("id: %s, name: %s\n",id,name);
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
		return maxDay;
	}



}
