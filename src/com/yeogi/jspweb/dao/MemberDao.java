package com.yeogi.jspweb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.yeogi.jspweb.entity.Member;
import com.yeogi.jspweb.dao.*;

import com.yeogi.jspweb.entity.Member;

public interface MemberDao {

	public int insert(Member member) throws ClassNotFoundException, SQLException;
	public int update(Member member) throws ClassNotFoundException, SQLException;
	public int updateAdmin(String id) throws ClassNotFoundException, SQLException;
	public int delete(String id);
	public ResultSet check(String id) throws ClassNotFoundException, SQLException;
	
	public List<Member> getList() throws ClassNotFoundException, SQLException;
	public Member getSearch(String id) throws ClassNotFoundException, SQLException;
	public Member getId(String id) throws ClassNotFoundException, SQLException;
	public Member getName(String name) throws ClassNotFoundException, SQLException;
	public Member getMail(String mail) throws ClassNotFoundException, SQLException;

}
