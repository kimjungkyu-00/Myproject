package com.board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CommonDao {
	//���������� ���� ���ӿ� ���õ� ���� �������� ����� �����մϴ�.
	private final String driver= "com.mysql.cj.jdbc.Driver";
	private final String url="jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC"
			+"&useUnicode=true"+"&characterEncoding=utf-8";
	private final String id="root";
	private final String pw="1234";
	//���ӿ� �ʿ��� ������ �����մϴ�.
	private Connection con= null;
	private Statement stmt=null;
	
	//db���������� ������ , ���ӿ��� SQL���� ����ϱ� ���� �ʿ��� statment��ü�� ��ȯ�ϴ� openConnection �żҵ带 �����մϴ�.
	
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
	
	//������ �����ϱ����� closeConnection�޼ҵ带 �����մϴ�.
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
