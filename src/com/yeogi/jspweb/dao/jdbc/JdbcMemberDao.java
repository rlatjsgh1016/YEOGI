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

import com.yeogi.jspweb.dao.MemberDao;
import com.yeogi.jspweb.entity.Member;




public class JdbcMemberDao implements MemberDao  {
	
	 @Override
	 public int insert(Member member) throws ClassNotFoundException, SQLException {
		 
	 			
	 	Class.forName("oracle.jdbc.driver.OracleDriver");
		         
	 	String sql = "INSERT INTO MEMBER(ID,NAME,EMAIL,PWD,PHONE,BIRTHDAY,ADMIN_YN) VALUES(?, ? , ?, ?, ?, ?, ?)";
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
		PreparedStatement st = con.prepareStatement(sql);
		
		
		if(!con.isClosed())
			System.out.println("Connected");
		
		st.setString(1, member.getId());
		st.setString(2, member.getName());
	    st.setString(3, member.getEmail());
	    st.setString(4, member.getPwd());
        st.setString(5, member.getPhone());
        st.setDate(6, member.getBirthday());
        st.setString(7, member.getAdminYN());
		

        System.out.printf("%s, %s, %s, %s, %s, %s, %s", member.getId(), member.getName(), member.getEmail(), member.getPhone(), member.getBirthday(),member.getPwd(), member.getAdminYN());	
		int result = st.executeUpdate();
		
		
		
		return result;
	 	}

	@Override
	public int update(Member member)
			throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String sql = "UPDATE member" + 
				"    SET" + 
				"    name =?," + 
				"    email =?," + 
				"    pwd =?," + 
				"    phone =?," + 
				"    birthday =?" + 
				"WHERE id =?;";
		Class.forName("oracle.jdbc.driver.OracleDriver");
        
	 	
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
		PreparedStatement st = con.prepareStatement(sql);
		
        st.setString(1, member.getName());
        st.setString(2, member.getEmail());
        st.setString(3, member.getPwd());
        st.setString(4, member.getPhone());
        st.setDate(5, member.getBirthday());
        st.setString(6, member.getId());
        	
		int result = st.executeUpdate(sql);
		
		if(!con.isClosed())
			System.out.println("Connected");
		        
		
		return result;
	}

	@Override
	public int updateAdmin(String id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String sql = "UPDATE member" + 
				"    SET" + 
				"    ADMIN_YN ='Y'" + 
				"WHERE id =?;";
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
        
	 	
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
		PreparedStatement st = con.prepareStatement(sql);
		
        st.setString(1, id);
        	
		int result = st.executeUpdate(sql);
		
		if(!con.isClosed())
			System.out.println("Connected");
		
		return result;
	}

	@Override
	public Member get(String mid) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 
		   String sql = "SELECT * FROM MEMBER WHERE ID=?";
		   
		   Member mem= null;
		      // 드라이버 로드
		      try {
		         Class.forName("oracle.jdbc.driver.OracleDriver");
		         
		         String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		         Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
		         PreparedStatement st = con.prepareStatement(sql);
		         st.setString(1, mid);
		         
		         ResultSet rs = st.executeQuery();
		         
		         String id;
		 		 String name;
		 		 String email;
		 		 String pwd;
		 		 String phone;
		 		 Date birth;
		 		 String adminYn;
		         
		         
		         if(rs.next()) { 
		        	id = rs.getString("ID");
		     		name = rs.getString("NAME");
		     		email = rs.getString("EMAIL");
		     		pwd = rs.getString("PWD");
		     		phone = rs.getString("PHONE");
		     		birth = rs.getDate("BIRTHDAY");
		     		adminYn = rs.getString("ADMIN_YN");
		            
		            
		            mem = new Member(
		                   id,name,email,pwd,phone,birth,adminYn         
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
		      
		      return mem;
	}
	
	 public List<Member> getList() {
	      
		   String sql = "SELECT * FROM MEMBER";
		   List<Member> list = new ArrayList<>();
		      
		      // 드라이버 로드
		      try {
		         Class.forName("oracle.jdbc.driver.OracleDriver");
		         
		         String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		         Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
		         Statement st = con.createStatement();
		         ResultSet rs = st.executeQuery(sql);
		         
		         String id;
		 		 String name;
		 		 String email;
		 		 String pwd;
		 		 String phone;
		 		 Date birth;
		 		 String adminYn;
		         
		      
		         
		         while(rs.next()) { 
		        	id = rs.getString("ID");
		     		name = rs.getString("NAME");
		     		email = rs.getString("EMAIL");
		     		pwd = rs.getString("PWD");
		     		phone = rs.getString("PHONE");
		     		birth = rs.getDate("BIRTHDAY");
		     		adminYn = rs.getString("ADMIN_YN");
		            
		            
		            Member mem = new Member(
		                   id,name,email,pwd,phone,birth,adminYn         
		                           );
		            list.add(mem);
		         }
		         
		         rs.close();
		         st.close();
		         con.close();
		         
		         return list;
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
	public int delete(String id) {
		// TODO Auto-generated method stub
		
		int result=0;
         
         try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
         
            try {
               
               String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
               String sql = "DELETE MEMBER where id=?" ;

               
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
	public ResultSet check(String id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
        
	 	String sql = "SELECT * FROM MEMBER WHERE ID = ?";
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		Connection con = DriverManager.getConnection(url, "c##yeogi", "cclassyeogi");
		PreparedStatement st = con.prepareStatement(sql);
		
		if(!con.isClosed())
			System.out.println("Connected");
		
		st.setString(1, id);

		
        ResultSet rs = st.executeQuery(sql);
	
		
		return rs;
	}
	 

}
