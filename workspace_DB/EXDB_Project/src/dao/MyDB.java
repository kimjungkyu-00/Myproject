package dao;

import java.sql.*;
import java.util.*;

import dto.Member;

public class MyDB {
	final static String DRIVER="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC"
			+"&useUnicode=true"+"&characterEncoding=utf-8";
	String id="root";
	String pw="1234";
	
	Connection conn= null;
	
	public MyDB() {
		//1. jdbc 드라이버 생성(로드)
		try {
			Class.forName(DRIVER).newInstance();
		
		connect();
		}catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		
	}
	
	private void connect(){
		//2. 서버에 연결하기
		try {
			conn =DriverManager.getConnection(url,id,pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insertMember(Member mem)  {
		insertMember(mem.getId(),mem.getPw(),mem.getName(),mem.getTel());
	}
	
	public void insertMember(String id, String pw , String name , String tel) {
		PreparedStatement preStmt = null;
		String query="INSERT register values(?,?,?,?)";
		try {
			preStmt = conn.prepareStatement(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			preStmt.setString(1,id);
			preStmt.setString(2,pw);		
			preStmt.setString(3,name);		
			preStmt.setString(4,tel);		
			preStmt.executeUpdate();

		
			if(null != preStmt)
				preStmt.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		
	}
	
	public void editMemberedit(String id,String pw,String name,String tel) {

		//query전송
		String query="UPDATE REGISTER SET passwd=?,name=?,tel=? WHERE id=?";
		PreparedStatement preStmt;
		try {
			preStmt = conn.prepareStatement(query);
		
		preStmt.setString(4, id);
		preStmt.setString(1, pw);
		preStmt.setString(2, name);
		preStmt.setString(3, tel);
		preStmt.executeUpdate();
		} catch (SQLException e) {
			
			e.getMessage();
			e.printStackTrace();
		}
	}
	
	public ArrayList<Member> Memberlist() throws SQLException{
		ArrayList<Member> list = null;
		list = new ArrayList<Member>();
		
		//쿼리전송
		String query = "SELECT * FROM REGISTER";
		PreparedStatement prest = conn.prepareStatement(query);
		ResultSet resultS = prest.executeQuery();
		while(resultS.next()) {
			Member member = new Member();
			member.setId(resultS.getString("id"));
			member.setPw(resultS.getString("passwd"));
			member.setName(resultS.getString("name"));
			member.setTel(resultS.getString("tel"));
			list.add(member);
		}
		
		
		return list;
	}

	public boolean deleteMember(String id, String pw) throws SQLException {
		boolean queryRet =false;
		String query="DELETE FROM REGISTER WHERE id=? AND passwd=?";
		PreparedStatement preStmt=conn.prepareStatement(query);
		preStmt.setString(2, pw);
		preStmt.setString(1, id);
		int ret= preStmt.executeUpdate();
		if(ret == 1) {
			queryRet = true;
		}
		return queryRet;
	}
	
	public void close() throws SQLException {
		if(conn != null) conn.close();
	}
}
