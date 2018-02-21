package com.yeogi.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.yeogi.jspweb.dao.TPlanPostSpdDao;
import com.yeogi.jspweb.entity.TPlanPost;
import com.yeogi.jspweb.entity.TPlanPostSpd;

public class JdbcTPlanPostSpdDao implements TPlanPostSpdDao {

	@Override
	public int insert(TPlanPostSpd tplanpostspd) {
		String sql ="SELECT * FROM T_PLAN_POST_SPD";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi","cclassyeogi");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			//결과집합 가져오기
			String Id;
			String TPlanLocId;
			String TPlanId;
			String Type;
			String Content;
			String Unit;
			String Amount;
			
			while(rs.next()==true) {
				Id = rs.getString("ID");
				TPlanLocId = rs.getString("T_PLAN_LOC_ID");
				TPlanId = rs.getString("T_PLAN_ID");
				Type = rs.getString("TYPE");
				Content = rs.getString("CONTENT");
				Unit = rs.getString("UNIT");
				Amount = rs.getString("AMOUNT");
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
	public int update(TPlanPostSpd tplanpostspd) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<TPlanPostSpd> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TPlanPostSpd get(String id) {
String sql ="SELECT * FROM T_PLAN_POST_SPD WHERE ID=?"; 

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi","cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql); 
			st.setString(1, id);
			
			ResultSet rs = st.executeQuery();
			

			TPlanPostSpd tplanpostspd = null;
			
			
			if(rs.next()) {
				tplanpostspd = new TPlanPostSpd(
							rs.getString("ID"),
							rs.getString("T_PLAN_LOC_ID"),
							rs.getString("T_PLAN_ID"),
							rs.getString("TYPE"),
							rs.getString("CONTENT"),
							rs.getString("UNIT"),
							rs.getString("AMOUNT")
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
