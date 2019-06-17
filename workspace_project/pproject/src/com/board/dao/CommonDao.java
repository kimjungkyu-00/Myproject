package com.board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CommonDao {
	//공통적으로 쓰일 접속에 관련된 정보 변수들을 상수로 선언합니다.
	private final String driver= "com.mysql.cj.jdbc.Driver";
	private final String url="jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC"
			+"&useUnicode=true"+"&characterEncoding=utf-8";
	private final String id="root";
	private final String pw="1234";
	//접속에 필요한 변수를 선언합니다.
	private Connection con= null;
	private Statement stmt=null;
	
	//db접속정보를 가지고 , 접속우헤 SQL문을 사용하기 위해 필요한 statment객체를 반환하는 openConnection 매소드를 구현합니다.
	
	public Statement openConenction() {
		try {
			Class.forName(driver);
				con=DriverManager.getConnection(url,id,pw);
				stmt=con.createStatement();
			} catch (Exception e) {
				System.out.println("MySQL Database Connection Something Prolem.");
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		return stmt;
	}
	
	//접속을 종료하기위한 closeConnection메소드를 구현합니다.
	public void closeConnection() {
		try {
			if(!con.isClosed()) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
