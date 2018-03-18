package com.yeogi.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yeogi.jspweb.dao.TPlanLocDao;
import com.yeogi.jspweb.entity.TPlanLoc;

public class JdbcTPlanLocDao implements TPlanLocDao {

	@Override
	public int insert(TPlanLoc tplanloc) {
		String sql ="INSERT INTO t_plan_loc (" + 
							"    my_loc_id," + 
							"    reg_date," + 
							"    t_plan_id," + 
							"    id," + 
							"    loc_id" + 
							") VALUES (?,?,?,(SELECT NVL(MAX(TO_NUMBER(ID)),TO_CHAR(SYSDATE,'YYYYMMDD')||'00000')+1 ID FROM t_plan_loc WHERE SUBSTR(ID,1,8) = TO_CHAR(SYSDATE, 'YYYYMMDD')),?)"; 
		
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi","cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql); 
			
			st.setString(1, tplanloc.getMyLocId());
			st.setDate(2, tplanloc.getRegDate()); 
			st.setString(3, tplanloc.getTPlanId());
			st.setString(4, tplanloc.getLocId());
			
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
	public int update(TPlanLoc tplanloc) {
		String sql ="UPDATE TPlanLoc SET"+
				"	 my_loc_id=?," + 
				"    reg_date=?," + 
				"    t_plan_id=?," + 
				"    loc_id=?," + 
				"WHERE ID=?";

			int result = 0;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
				Connection con = DriverManager.getConnection(url, "c##sist","dclass");
				PreparedStatement st = con.prepareStatement(sql);
				
				st.setString(1, tplanloc.getMyLocId());
				st.setDate(2, tplanloc.getRegDate());
				st.setString(3, tplanloc.getTPlanId());
				st.setString(4, tplanloc.getLocId());
				st.setString(5, tplanloc.getId());
				
				
				
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
		String sql ="delete tplanloc where id=?";

			int result = 0;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
				Connection con = DriverManager.getConnection(url, "c##sist","dclass");
				PreparedStatement st = con.prepareStatement(sql);
				
				st.setString(1,id);
				
				
				
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
	public List<TPlanLoc> getList() {
		String sql ="SELECT * FROM T_Plan_Loc ORDER BY ID ASC"; 
		
		List<TPlanLoc> list = new ArrayList<>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi","cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql); 
			
			ResultSet rs = st.executeQuery(); 

			TPlanLoc tplanloc = null;
			
			
			while(rs.next()) {
				tplanloc = new TPlanLoc(
							rs.getString("ID"),
							rs.getString("MY_LOC_ID"),
							rs.getString("T_PLAN_ID"),
							rs.getString("LOC_ID"),
							rs.getDate("REG_DATE")
						);
				list.add(tplanloc);
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
	public TPlanLoc get(String id) {
		String sql ="SELECT * FROM T_PLAN_LOC WHERE ID=?"; 
		TPlanLoc tplanloc = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi","cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql); 
			st.setString(1, id);
			
			ResultSet rs = st.executeQuery(); 

			
			
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
		return tplanloc;
	}
	
	@Override
	public String getLatestId() {
		String sql2 = "SELECT MAX(TO_NUMBER(ID)) ID FROM T_PLAN_LOC WHERE SUBSTR(ID,1,8) = TO_CHAR(SYSDATE, 'YYYYMMDD')";
		String result = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi","cclassyeogi");
			PreparedStatement st; 
			
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

}
