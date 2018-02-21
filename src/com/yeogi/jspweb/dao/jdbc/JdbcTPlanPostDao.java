package com.yeogi.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.yeogi.jspweb.dao.TPlanPostDao;
import com.yeogi.jspweb.entity.TPlanLoc;
import com.yeogi.jspweb.entity.TPlanPost;

public class JdbcTPlanPostDao implements TPlanPostDao {

	@Override
	public int insert(TPlanPost tplanpost) {
		String sql ="SELECT * FROM T_PLAN_POST";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi","cclassyeogi");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			//결과집합 가져오기
			String TPlanId;
			String TPlanLocId;
			String TourDate;
			String MemoTitle;
			String MemoContent;
			
			while(rs.next()==true) {
				TPlanId = rs.getString("T_PLAN_ID");
				TPlanLocId = rs.getString("T_PLAN_LOC_ID");
				TourDate = rs.getString("TOUR_DATE_TIME");
				MemoTitle = rs.getString("MEMO_TITLE");
				MemoContent = rs.getString("MEMO_CONTENT");
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
		
		return 0;
	}

	@Override
	public int update(TPlanPost tplanpost) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<TPlanPost> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TPlanPost get(String id) {
		String sql ="SELECT * FROM T_PLAN_POST WHERE ID=?"; 
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi","cclassyeogi");
			//
			PreparedStatement st = con.prepareStatement(sql); 
			st.setString(1, id);
			
			ResultSet rs = st.executeQuery(); 
			

			TPlanPost tplanpost = null;
			
			
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
		return null;
	}

}
