package com.yeogi.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yeogi.jspweb.dao.DayDao;
import com.yeogi.jspweb.entity.Day;

public class JdbcDayDao implements DayDao {

	@Override
	public List<Day> getList(){
		
		String sql = "SELECT * FROM DAY";
		
		List<Day> list = new ArrayList<>();
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			
			while(rs.next()) {
						
				Day day = new Day(rs.getInt("DAY"));
				list.add(day);
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
	public List<Day> getPrevList(int currDay) {

		String sql = "SELECT * FROM DAY WHERE DAY BETWEEN ? AND ?";
		
		List<Day> list = new ArrayList<>();
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setInt(1, currDay-1);
			st.setInt(2, currDay+1);
			
			ResultSet rs = st.executeQuery(sql);
			
			
			while(rs.next()) {
						
				Day day = new Day(rs.getInt("DAY"));
				list.add(day);
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
	public List<Day> getNextList(int currDay) {

		String sql = "SELECT * FROM DAY WHERE DAY BETWEEN ? AND ?";
		
		List<Day> list = new ArrayList<>();
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setInt(1, currDay+1);
			st.setInt(2, currDay+3);
			
			ResultSet rs = st.executeQuery(sql);
			
			
			while(rs.next()) {
						
				Day day = new Day(rs.getInt("DAY"));
				list.add(day);
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
	public List<Day> getList(int startDay) {

		String sql = "SELECT * FROM DAY WHERE DAY <= ?";
		
		List<Day> list = new ArrayList<>();
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setInt(1, startDay);
			
			ResultSet rs = st.executeQuery(sql);
			
			
			while(rs.next()) {
						
				Day day = new Day(rs.getInt("DAY"));
				list.add(day);
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
