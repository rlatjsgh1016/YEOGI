package com.yeogi.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yeogi.jspweb.dao.TLogCmtDao;
import com.yeogi.jspweb.entity.TLogCmt;
import com.yeogi.jspweb.entity.TLogCmtView;
import com.yeogi.jspweb.entity.TourLogView;


public class JdbcTLogCmtDao implements TLogCmtDao {

	@Override
	public List<TLogCmtView> getList(String tourLogId) {
		String sql = "SELECT * FROM T_LOG_CMT_VIEW WHERE T_LOG_ID = ?";

		List<TLogCmtView> list = new ArrayList<>();

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1, tourLogId);
			
			ResultSet rs = st.executeQuery();

			while (rs.next()) {

				TLogCmtView tLogCmt = new TLogCmtView(		
						
						rs.getString("ID"),
						rs.getString("T_LOG_ID"),
						rs.getString("M_ID"),
						rs.getString("P_ID"),
						rs.getDate("REG_DATE"),
						rs.getString("CONTENT"),
						rs.getString("LOCK_YN"),
						rs.getInt("COUNT"));
				
				list.add(tLogCmt);
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
	public int insert(TLogCmt tlc) {

		String sql = "INSERT INTO T_LOG_CMT(ID,T_LOG_ID,MID,PID,REG_DATE,CONTENT,LOCK_YN) VALUES((SELECT NVL(MAX(TO_NUMBER(ID)),TO_CHAR(SYSDATE,'YYYYMMDD')||'00000')+1 ID FROM T_LOG_CMT WHERE SUBSTR(ID,1,8) = TO_CHAR(SYSDATE, 'YYYYMMDD')),?,?,?,?,?,?)";

		int result = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);

			//st.setString(1, tlc.getId());
			st.setString(1, tlc.gettLogId());
			st.setString(2, tlc.getmId());
			st.setString(3, tlc.getpId());
			st.setDate(4, tlc.getRegDate());
			st.setString(5, tlc.getContent());
			st.setString(6, tlc.getLockYN());
   
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
	public int update(TLogCmt tlc) {
		String sql = "UPDATE T_LOG_CMT SET T_LOG_ID=?,M_ID=?,P_ID=?,REG_DATE=?,CONTENT=?,LOCK_YN=? WHERE ID=?";
		
		int result = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);

			st.setString(1, tlc.gettLogId());
			st.setString(2, tlc.getmId());
			st.setString(3, tlc.getpId());
			st.setDate(4, tlc.getRegDate());
			st.setString(5, tlc.getContent());
			st.setString(6, tlc.getLockYN());
			st.setString(7, tlc.getId());

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
		String sql = "DELETE FROM T_LOG_CMT WHERE ID=?";
		
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
		}
	    
	    catch (ClassNotFoundException e) {
	       // TODO Auto-generated catch block
	       e.printStackTrace();
	    } 
	    
	    catch (SQLException e) {
	       // TODO Auto-generated catch block
	       e.printStackTrace();
	    }
		return result;
	}

	@Override
	public TLogCmtView get(String id) {
		
		String sql = "SELECT * FROM T_LOG_CMT_VIEW WHERE ID=?";
		
		TLogCmtView tLogCmt = null;
		
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1, id);
			
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				tLogCmt = new TLogCmtView(
						rs.getString("ID"),
						rs.getString("T_LOG_ID"),
						rs.getString("M_ID"),
						rs.getString("P_ID"),
						rs.getDate("REG_DATE"),
						rs.getString("CONTENT"),
						rs.getString("LOCK_YN"),
						rs.getInt("COUNT"));
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
		return tLogCmt;

	}

	@Override
	public int updateLock(TLogCmt tlc) {
		
		String sql = "UPDATE T_LOG_CMT SET LOCK_YN=? WHERE ID=?";
		
		int result = 0;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1, tlc.getLockYN());
			st.setString(2, tlc.getId());
			
			result = st.executeUpdate();
			
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
		return result;
		
	}


}
