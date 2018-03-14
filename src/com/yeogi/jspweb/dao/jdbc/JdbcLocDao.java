package com.yeogi.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yeogi.jspweb.dao.LocDao;
import com.yeogi.jspweb.entity.Loc;
import com.yeogi.jspweb.entity.Nation;

public class JdbcLocDao implements LocDao {

	@Override
	public List<Loc> getList() {

		String sql = "SELECT * FROM LOC";

		List<Loc> list = new ArrayList<>();

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {

				Loc loc = new Loc(
						rs.getString("ID"),
						rs.getString("NAME"),
						rs.getString("NATION"),
						rs.getString("IMG"),
						rs.getString("DETAIL"),
						rs.getString("ADDRESS"),
						rs.getString("TYPE")
						);
				
				list.add(loc);
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
	public int insert(Loc loc) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Loc loc) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}


}
