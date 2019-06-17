package com.db;

import java.sql.*;

import javax.naming.*;
import javax.sql.DataSource;

public class MyDBConnPoolRes {

	Connection conn = null;
	
	public MyDBConnPoolRes() {
		init();
	}
	private void init() {
		Context initCtx;
		try {
			initCtx = new InitialContext();
		
		Context envCtx =(Context)initCtx.lookup("java:comp/env");
		DataSource datasource = (DataSource)envCtx.lookup("jdbc/mydb");

			conn = datasource.getConnection();

	} catch (NamingException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
		
	}
	public void insertMember() {
			String sql = "insert into member values(?,?,?,?)";
			PreparedStatement pstmt=null;
			try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "myid1217");
			pstmt.setString(2, "1234");
			pstmt.setString(3, "BTS");
			pstmt.setTimestamp(4,new Timestamp(System.currentTimeMillis()));
		} catch (SQLException e) {
			System.out.println("insert : "+e.getMessage());
			e.printStackTrace();
		}finally {
			if(null != pstmt) {
				try {
					pstmt.close();} catch (SQLException e) {e.printStackTrace();	}
			}
		}
}
}

