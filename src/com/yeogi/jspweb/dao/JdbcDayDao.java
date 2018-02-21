package com.yeogi.jspweb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yeogi.jspweb.entity.Day;

public class JdbcDayDao implements DayDao {

	@Override
	public List<Day> getList(){
		
		String sql = "select * from day";
		try {
			// 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);	//	쿼리실행(select) / 업데이트실행(반환되는 값이 없는 쿼리는 이걸로실행(update,delete,insert)
			
			int iDay;
			
			List<Day> list = new ArrayList<>();
			
			while(rs.next()) {
				
				iDay = rs.getInt("day");
								
				Day day = new Day(iDay);
				list.add(day);
			}
			
			rs.close();
			st.close();
			con.close();
			
			return list;
		}
	    
	    catch (ClassNotFoundException e) {
	       // TODO Auto-generated catch block
	       e.printStackTrace();
	    } 
	    
	    catch (SQLException e) {
	       // TODO Auto-generated catch block
	       e.printStackTrace();
	    }
	    
	    return null;
	}

	@Override
	public int delete(String id) {

		String sql = "delete from day where id=?";
		try {
			// 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			PreparedStatement sst = con.prepareStatement(sql);
			sst.setString(1, id);
			sst.executeUpdate();
			
			sst.close();
			con.close();
			
			return 1;
		}
	    
	    catch (ClassNotFoundException e) {
	       // TODO Auto-generated catch block
	       e.printStackTrace();
	    } 
	    
	    catch (SQLException e) {
	       // TODO Auto-generated catch block
	       e.printStackTrace();
	    }

		return 0;
	}

}
