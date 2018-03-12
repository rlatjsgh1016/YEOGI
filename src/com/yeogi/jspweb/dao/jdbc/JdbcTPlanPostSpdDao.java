package com.yeogi.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yeogi.jspweb.dao.TPlanPostSpdDao;
import com.yeogi.jspweb.entity.TPlanPost;
import com.yeogi.jspweb.entity.TPlanPostSpd;
import com.yeogi.jspweb.entity.TPlanPostSpdView;

public class JdbcTPlanPostSpdDao implements TPlanPostSpdDao {

	@Override
	public int insert(TPlanPostSpd tplanpostspd) {
		/*String sql ="INSERT INTO t_plan_post_spd (" + 
						"    content," + 
						"    type," + 
						"    unit," + 
						"    t_plan_id," + 
						"    t_plan_loc_id," + 
						"    amount," + 
						"    id" + 
						") VALUES(?,?,?,?,?,?,?)";*/
		String sql = "insert into t_plan_post_spd(content, type, unit, t_plan_id, t_plan_loc_id, amount, id) values(?,?,?,?,?,?,?)";
		int result=0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi","cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			result = st.executeUpdate();
		
			st.setString(1, tplanpostspd.getContent());
			st.setString(2, tplanpostspd.getType());
			st.setString(3, tplanpostspd.getUnit());
			st.setString(4, tplanpostspd.getTPlanId());
			st.setString(5, tplanpostspd.getTPlanLocId());
			st.setString(6, tplanpostspd.getAmount());
			st.setString(7, tplanpostspd.getId());
			
		
			
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
	public int update(TPlanPostSpd tplanpostspd) {
		String sql = "UPDATE t_plan_post_spd SET" + 
							"    content=?," + 
							"    type=?," + 
							"    unit=?," + 
							"    amount=?," + 
							"    id=?," + 
							" WHERE ID=?"; 
		int result = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);


			st.setString(1, tplanpostspd.getContent());
			st.setString(2, tplanpostspd.getType());
			st.setString(3, tplanpostspd.getUnit());
			st.setString(4, tplanpostspd.getAmount());
			st.setString(5, tplanpostspd.getId());
			st.setString(6, tplanpostspd.getId());

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
		String sql = "UPDATE t_plan_post_spd WHERE id=?"; 
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
	public List<TPlanPostSpdView> getList() {
		String sql ="SELECT * FROM T_PLAN_POST_SPD_VIEW order by ID ASC"; 

		List<TPlanPostSpdView> list = new ArrayList<>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			
			Connection con = DriverManager.getConnection(url, "c##yeogi","cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql); 
			
			ResultSet rs = st.executeQuery();
			
			TPlanPostSpdView tplanpostspdview = null;
			
			
			while(rs.next()) {
				tplanpostspdview = new TPlanPostSpdView(
							rs.getString("ID"),
							rs.getString("T_PLAN_LOC_ID"),
							rs.getString("T_PLAN_ID"),
							rs.getString("TYPE"),
							rs.getString("CONTENT"),
							rs.getString("UNIT"),
							rs.getString("AMOUNT"), 
							rs.getString("TOUR_DATE_TIME"),
							rs.getString("MEMO_TITLE"), 
							rs.getString("MEMO_CONTENT")
							);
				list.add(tplanpostspdview);
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
	public TPlanPostSpd get(String id) {
		String sql ="SELECT * FROM T_PLAN_POST_SPD WHERE ID=?"; 
		TPlanPostSpd tplanpostspd = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			
			Connection con = DriverManager.getConnection(url, "c##yeogi","cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql); 
			
			st.setString(1, id);
			ResultSet rs = st.executeQuery();
			

			
			
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
		return tplanpostspd;
	}

	

}
