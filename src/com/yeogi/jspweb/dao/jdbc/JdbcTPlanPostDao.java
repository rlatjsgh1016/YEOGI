package com.yeogi.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yeogi.jspweb.dao.TPlanPostDao;
import com.yeogi.jspweb.entity.TPlanLoc;
import com.yeogi.jspweb.entity.TPlanPost;

public class JdbcTPlanPostDao implements TPlanPostDao {

	@Override
	public int insert(TPlanPost tplanpost) {
		String sql ="INSERT INTO t_plan_post (" + 
				"    tour_date_time," + 
				"    memo_title," + 
				"    memo_content," + 
				"    t_plan_id," + 
				"    t_plan_loc_id" + 
				") VALUES (?,?,?,?,?)"; 
		
		int result=0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi","cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql); 
			
			st.setString(1, tplanpost.getTourDateTime());
			st.setString(2, tplanpost.getMemoTitle());
			st.setString(3, tplanpost.getMemoContent());
			st.setString(4, tplanpost.getTPlanId());
			st.setString(5, tplanpost.getTPlanLocId());
			
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
	public int update(TPlanPost tplanpost) {
		
		String sql ="UPDATE t_plan_post SET" + 
							"    tour_date_time=?," + 
							"    memo_title=?," + 
							"    memo_content=?," + 
							" WHERE T_PLAN_ID=? AND T_PLAN_LOC_ID=? "; 
		
		int result=0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi","cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql); 
			
			st.setString(1, tplanpost.getTourDateTime());
			st.setString(2, tplanpost.getMemoTitle());
			st.setString(3, tplanpost.getMemoContent());
			st.setString(4, tplanpost.getTPlanId());
			st.setString(5, tplanpost.getTPlanLocId());
			
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

	@Override //딜리트 어케하지???????????????????????????????????????
	public int delete(String id) {
		String sql ="DELETE t_plan_post WHERE T_PLAN_ID=? AND T_PLAN_LOC_ID=? "; 
		
		int result=0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi","cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql); 
			
			st.setString(1, id);
			st.setString(2, id);
			
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
	public List<TPlanPost> getList() {
		String sql ="SELECT * FROM T_PLAN_POST ORDER BY TOUR_DATE_TIME ASC"; 

		List<TPlanPost> list = new ArrayList<>();
			
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			
			Connection con = DriverManager.getConnection(url, "c##yeogi","cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql); 
			
			//st.setString(1, id); 
			ResultSet rs = st.executeQuery(); 
			
			TPlanPost tplanpost = null;
			
			while(rs.next()) {
				tplanpost = new TPlanPost(
							rs.getString("T_PLAN_ID"),
							rs.getString("T_PLAN_LOC_ID"),
							rs.getString("TOUR_DATE_TIME"),
							rs.getString("MEMO_TITLE"),
							rs.getString("MEMO_CONTENT")
						);
				list.add(tplanpost);
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
	public TPlanPost get(String id) {
		String sql ="SELECT * FROM T_PLAN_POST WHERE ID=?"; 
		TPlanPost tplanpost = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			
			Connection con = DriverManager.getConnection(url, "c##yeogi","cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql); 
			
			st.setString(1, id);
			ResultSet rs = st.executeQuery(); 
			
			
			if(rs.next()) {
				tplanpost = new TPlanPost(
							rs.getString("T_PLAN_ID"),
							rs.getString("T_PLAN_LOC_ID"),
							rs.getString("TOUR_DATE_TIME"),
							rs.getString("MEMO_TITLE"),
							rs.getString("MEMO_CONTENT")
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
		return tplanpost;
	}

}
