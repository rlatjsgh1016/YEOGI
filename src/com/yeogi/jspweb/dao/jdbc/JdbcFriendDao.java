package com.yeogi.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yeogi.jspweb.dao.FriendDao;
import com.yeogi.jspweb.entity.Friend;
import com.yeogi.jspweb.entity.Member;

public class JdbcFriendDao implements FriendDao {

	@Override
	public int insert(Friend friend) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
	 	Class.forName("oracle.jdbc.driver.OracleDriver");
        
	 	String sql = "INSERT INTO FRIEND(ID,MY_ID,ACCEPT_YN,FRIEND_ID) VALUES( SEQ_ID.NEXTVAL,?,?,?)";
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
		PreparedStatement st = con.prepareStatement(sql);
		
		System.out.println(friend.getMyId());
		System.out.println(friend.getAcceptYN());
		System.out.println(friend.getFriendId());
		
		
		st.setString(1, friend.getMyId());
	    st.setString(2, friend.getAcceptYN());
        st.setString(3, friend.getFriendId());
	       
		
		int result = st.executeUpdate();
		
		if(!con.isClosed())
			System.out.println("Connected");
		
		return result;
	}

	@Override
	public int update(Friend friend) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String sql = "UPDATE member" + 
				"    SET" + 
				"    ACCEPT_YN =?," +  
				"WHERE id =?;";
		Class.forName("oracle.jdbc.driver.OracleDriver");
        
	 	
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
		PreparedStatement st = con.prepareStatement(sql);
		
        st.setString(1, "Y");
        st.setString(2, friend.getId());
        
        	
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
               String sql = "DELETE FRIEND where id=?" ;

               
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
	public Friend get(String id) {
		// TODO Auto-generated method stub
		   String sql = "SELECT * FROM FRIEND WHERE ID=?";
		   Friend friend = null;
		      // 드라이버 로드
		      try {
		         Class.forName("oracle.jdbc.driver.OracleDriver");
		         
		         String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		         Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
		         PreparedStatement st = con.prepareStatement(sql);
		         ResultSet rs = st.executeQuery(sql);
		         
		         st.setString(1, id);
		         
		         if(rs.next()) {
					String myId = rs.getString("MY_ID");
		     		Date reqDate = rs.getDate("REQ_DATE");
		     		String acceptYn = rs.getString("ACCEPT_YN");
		     		String friendId = rs.getString("FRIEND_ID");
		            
		            
		            friend = new Friend(
		                  id,myId,reqDate,acceptYn,friendId         
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
		      
		      return friend;
	}

	@Override
	public List<Friend> getList() {
		// TODO Auto-generated method stub
		 
		   String sql = "SELECT * FROM FRIEND";
		   List<Friend> list = new ArrayList<>();
		      
		      // 드라이버 로드
		      try {
		         Class.forName("oracle.jdbc.driver.OracleDriver");
		         
		         String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		         Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
		         Statement st = con.createStatement();
		         ResultSet rs = st.executeQuery(sql);
		         
		         String id;
		     	 String myId;
		     	 Date reqDate;
		     	 String acceptYn;
		     	 String friendId;
		         
		      
		         
		         while(rs.next()) { 
		        	id = rs.getString("ID");
		     		myId = rs.getString("MY_ID");
		     		reqDate = rs.getDate("REQ_DATE");
		     		acceptYn = rs.getString("ACCEPT_YN");
		     		friendId = rs.getString("FRIEND_ID");
		            
		            
		            Friend friend = new Friend(
		                  id,myId,reqDate,acceptYn,friendId         
		                           );
		            list.add(friend);
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
	public List<Friend> getList(String mId) {
		// TODO Auto-generated method stub

		   String sql = "SELECT * FROM FRIEND WHERE MY_ID = ? AND ACCEPT_YN=?";
		   List<Friend> list = new ArrayList<>();
		      
		      // 드라이버 로드
		      try {
		         Class.forName("oracle.jdbc.driver.OracleDriver");
		         
		         String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		         Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
		         PreparedStatement st = con.prepareStatement(sql);
		         st.setString(1, mId);
			     st.setString(2, "N");
		         ResultSet rs = st.executeQuery();
		         
		         String id;
		     	 String myId;
		     	 Date reqDate;
		     	 String acceptYn;
		     	 String friendId;
		         
		      
		     	
			    
		         while(rs.next()) { 
		        	id = rs.getString("ID");
		     		myId = rs.getString("MY_ID");
		     		reqDate = rs.getDate("REQ_DATE");
		     		acceptYn = rs.getString("ACCEPT_YN");
		     		friendId = rs.getString("FRIEND_ID");
		            
		            
		            Friend friend = new Friend(
		                  id,myId,reqDate,acceptYn,friendId         
		                           );
		            list.add(friend);
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
	public List<Friend> getList2(String mId) {
		// TODO Auto-generated method stub

		   String sql = "SELECT * FROM FRIEND WHERE FRIEND_ID = ? AND ACCEPT_YN=?";
		   List<Friend> list = new ArrayList<>();
		      
		      // 드라이버 로드
		      try {
		         Class.forName("oracle.jdbc.driver.OracleDriver");
		         
		         String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		         Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
		         PreparedStatement st = con.prepareStatement(sql);
		         st.setString(1, mId);
			     st.setString(2, "N");
		         
		         ResultSet rs = st.executeQuery();
		         
		         String id;
		     	 String myId;
		     	 Date reqDate;
		     	 String acceptYn;
		     	 String friendId;
		         
		      
		     	
			   
			    
		         while(rs.next()) { 
		        	id = rs.getString("ID");
		     		myId = rs.getString("MY_ID");
		     		reqDate = rs.getDate("REQ_DATE");
		     		acceptYn = rs.getString("ACCEPT_YN");
		     		friendId = rs.getString("FRIEND_ID");
		            
		            
		            Friend friend = new Friend(
		                  id,myId,reqDate,acceptYn,friendId         
		                           );
		            list.add(friend);
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
	public int accept(String fid) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
        
	 	String sql = "UPDATE FRIEND SET ACCEPT_YN='Y' WHERE ID=?";
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
		PreparedStatement st = con.prepareStatement(sql);
		
		Friend friend = new Friend();
		
		System.out.println(friend.getMyId());
		System.out.println(friend.getAcceptYN());
		System.out.println(friend.getFriendId());
		
		
		st.setString(1, fid);
	   
		int result = st.executeUpdate();
		System.out.println(result);
		if(!con.isClosed())
			System.out.println("Connected");
		
		return result;
	}

}
