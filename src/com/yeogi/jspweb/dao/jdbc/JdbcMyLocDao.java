package com.yeogi.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.yeogi.jspweb.dao.MyLocDao;
import com.yeogi.jspweb.entity.Friend;
import com.yeogi.jspweb.entity.MyLoc;

public class JdbcMyLocDao implements MyLocDao{

	@Override
	public List<MyLoc> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(MyLoc mLoc) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
        
	 	String sql = "INSERT INTO FRIEND(ID,ADDRESS,NAME) VALUES(?,?,?,?,?)";
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, mLoc.getId());
		st.setString(2, mLoc.getAddr());
	    st.setString(3, mLoc.getName());
	       
		
		int result = st.executeUpdate(sql);
		
		if(!con.isClosed())
			System.out.println("Connected");
		
		return result;
	}

	@Override
	public int update(MyLoc mLoc) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String sql = "UPDATE member" + 
				"    SET" + 
				"    ADDRESS =?," +  
				"    NAME =?," +  
				"WHERE id =?;";
		Class.forName("oracle.jdbc.driver.OracleDriver");
        
	 	
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
		PreparedStatement st = con.prepareStatement(sql);
		

        st.setString(1, mLoc.getAddr());
        st.setString(2, mLoc.getName());
        st.setString(3, mLoc.getId());
        	
		int result = st.executeUpdate(sql);
		
		if(!con.isClosed())
			System.out.println("Connected");
		        

		return result;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		int result=0;
        
        try {
           Class.forName("oracle.jdbc.driver.OracleDriver");
        
           try {
              
              String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
              String sql = "DELETE MY_LOC where id=?" ;

              
              Connection con;
              
              con = DriverManager.getConnection(url,"c##sist","dclass");
              PreparedStatement st = con.prepareStatement(sql);
              
              st.setString(1, id);
              
              
              result = st.executeUpdate(sql);
              
              

              // 연결 확인
              if(!con.isClosed())
                 System.out.println("Connected");
       
              st.close();
              con.close();
              
           } catch (SQLException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
           }
           
        } catch (ClassNotFoundException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
        }
              
        return result;
	}

	@Override
	public MyLoc get(String id) {
		// TODO Auto-generated method stub
		 String sql = "SELECT * FROM MY_LOC WHERE ID=?";
		   MyLoc mLoc = null;
		      // 드라이버 로드
		      try {
		         Class.forName("oracle.jdbc.driver.OracleDriver");
		         
		         String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		         Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
		         PreparedStatement st = con.prepareStatement(sql);
		         ResultSet rs = st.executeQuery(sql);
		         
		         st.setString(1, id);
		         
		         if(rs.next()) {
					String myId = rs.getString("ID");
		     		String addr = rs.getString("ADDRESS");
		     		String name = rs.getString("NAME");		            
		            
		            mLoc = new MyLoc(
		                  id,addr, name         
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
		      
		      return mLoc;
	}

}
