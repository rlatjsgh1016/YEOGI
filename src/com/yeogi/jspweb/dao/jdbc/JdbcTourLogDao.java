package com.yeogi.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yeogi.jspweb.dao.TourLogDao;
import com.yeogi.jspweb.entity.Day;
import com.yeogi.jspweb.entity.TourLog;

public class JdbcTourLogDao implements TourLogDao {

	@Override
	public TourLog get(String id) {

		String sql = "SELECT * FROM TOUR_LOG WHERE ID=?";
		try {
			// ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);	//	��������(select) / ������Ʈ����(��ȯ�Ǵ� ���� ���� ������ �̰ɷν���(update,delete,insert)
			
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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<TourLog> getList() {
		String sql = "SELECT * FROM TOUR_LOG";
		try {
			// ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);	//	��������(select) / ������Ʈ����(��ȯ�Ǵ� ���� ���� ������ �̰ɷν���(update,delete,insert)
						
			List<TourLog> list = new ArrayList<>();
			
			while(rs.next()) {
				TourLog tourLog = new TourLog(
						rs.getString(columnIndex)
						);
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

}
