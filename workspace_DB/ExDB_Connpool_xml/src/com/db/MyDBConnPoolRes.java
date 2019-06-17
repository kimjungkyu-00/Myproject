package com.db;

import java.sql.*;
import java.sql.SQLException;
import java.sql.Timestamp;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MyDBConnPoolRes {
	
	String JDBC_ENV ="java:comp/env";
	String JDBC_NAME = "jdbc/mydb";
	
	final static String TABLE_MEMBER="member";
	public interface TableComm{
		final static String CREATE = "CREATE TABLE";
		final static String INSERT = "INSERT INTO ";
		final static String DELETE = "DELETE ";
		final static String UPDATE = "UPDATE ";
		final static String SELECT = "SELECT ";
	}
	
	public interface TableCol_Member{
		final static String ID="id";
		final static String NAME="name";
		final static String PASSWD="passwd";
		final static String REG_DATA="reg_date";
	}
	
	Connection conn = null;
	
	public MyDBConnPoolRes() {
		init();
	}
   
	private void init() {
		Context initCtx;
		try {
			initCtx = new InitialContext();		
			Context envCtx =(Context)initCtx.lookup(JDBC_ENV);
			DataSource datasource = (DataSource)envCtx.lookup(JDBC_NAME);
			conn = datasource.getConnection();		
		} catch (NamingException | SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	
	
	public void insertMember() {
		
		PreparedStatement pstmt=null;
		
		try {
			//db 바로 sql문 수행 하지 않도록 설정
			conn.setAutoCommit(false);
			
			String sql = TableComm.INSERT +TABLE_MEMBER +"values(?,?,?,?)";
		
			pstmt = conn.prepareStatement(sql);		
			pstmt.setString(1,"youid123");
			pstmt.setString(2,"1234");
			pstmt.setString(3,"BTS");
			pstmt.setTimestamp(4,new Timestamp(System.currentTimeMillis()));
			
			int ret = pstmt.executeUpdate();
			System.out.println("insert 결과 : "+ret);
			//db에 sql 수행(db반영)
			conn.commit();
			//db에 자동 db반영 설정
			conn.setAutoCommit(true);
			
		} catch (SQLException e) {
			System.out.println("insert : "+e.getMessage());
			e.printStackTrace();
			//db수행 문제시에 이전 상태로 돌림
			try {conn.rollback();} catch (SQLException e1) {	e1.printStackTrace();}
		}finally {
			if( null != pstmt ) {
				try {	pstmt.close();} catch (SQLException e) {e.printStackTrace();}
			}
		}
		
	}
}
