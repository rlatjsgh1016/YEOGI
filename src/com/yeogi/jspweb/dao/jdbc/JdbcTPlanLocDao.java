package com.yeogi.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.yeogi.jspweb.dao.TPlanLocDao;
import com.yeogi.jspweb.entity.TPlanLoc;

public class JdbcTPlanLocDao implements TPlanLocDao {

	@Override
	public int insert(TPlanLocDao tplanlocdao) {
		
		String sql ="SELECT * FROM T_PLAN_LOC";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi","cclassyeogi");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			//결과집합 가져오기
			String Id;
			String MyLocId;
			String TPlanId;
			String LocId;
			String RegDate;
			
			while(rs.next()==true) {
				Id = rs.getString("ID");
				MyLocId = rs.getString("MY_LOC_ID");
				TPlanId = rs.getString("T_PLAN_ID");
				LocId = rs.getString("LOC_ID");
				RegDate = rs.getString("REG_DATE");
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
	public int update(TPlanLocDao tplanlocdao) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<TPlanLoc> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TPlanLoc get(String id) {
		String sql ="SELECT * FROM T_PLAN_LOC WHERE ID=?"; 
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi","cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql); 
			st.setString(1, id);
			
			ResultSet rs = st.executeQuery(); 

			TPlanLoc tplanloc = null;
			
			
			if(rs.next()) {
				tplanloc = new TPlanLoc(
							rs.getString("ID"),
							rs.getString("MY_LOC_ID"),
							rs.getString("T_PLAN_ID"),
							rs.getString("LOC_ID"),
							rs.getDate("REG_DATE")
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
