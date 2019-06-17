package dao;

import java.sql.*;
import java.util.ArrayList;

import dto.Member;

public class MyDB {
	final static String DRIVER="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC"
			+"&useUnicode=true"+"&characterEncoding=utf-8";
	String dbuser="root";
	String dbpw="1234";
	
	Connection conn=null;
	
	public MyDB() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		//1.driver 로드
		Class.forName(DRIVER).newInstance();
		connect();
	}
	private void connect() throws SQLException {
		//2. db연결 
		conn = DriverManager.getConnection(url,dbuser,dbpw);
	}
	
	public void insertMember(Member mem) throws SQLException {
		insertMember(mem.getId(),mem.getPasswd(),mem.getName());
	}
	
	public void insertMember(String id,String pw , String name ) throws SQLException {
		PreparedStatement preStmt = null;
		//query전송
		String query="INSERT INTO MEMBER VALUES(?,?,?,?)";
		preStmt= conn.prepareStatement(query);
		preStmt.setString(1,id);
		preStmt.setString(2,pw);
		preStmt.setString(3,name);
		preStmt.setTimestamp(4, new Timestamp(System.currentTimeMillis()));
		preStmt.executeUpdate();
		
		if(null != preStmt)
			preStmt.close();
	}
	
	public void editMemberPw(String id,String pw) throws SQLException {

		//query전송
		String query="UPDATE MEMBER SET passwd=? WHERE id=?";
		PreparedStatement preStmt =conn.prepareStatement(query);
		preStmt.setString(1, pw);
		preStmt.setString(2, id);
		preStmt.executeUpdate();
	}
	
	public boolean deleteMember(String id) throws SQLException{
		boolean queryRet=false;
		String query="DELETE FROM MEMBER WHERE id=?";
		PreparedStatement preStmt = conn.prepareStatement(query);
		preStmt.setString(1, id);
		int ret= preStmt.executeUpdate();
		if(ret == 1) {
			queryRet = true;
		}
		return queryRet;
	}
	
	public ArrayList<Member> getMemberList() throws SQLException{
		ArrayList<Member> list= null;
		list = new ArrayList<Member>();
		
		//쿼리전송
		String query = "SELECT * FROM MEMBER";
		PreparedStatement preStmt = conn.prepareStatement(query);
		ResultSet resultSet = preStmt.executeQuery();
		while(resultSet.next()) {
			Member member = new Member();
			member.setId(resultSet.getString("id"));
			member.setPasswd(resultSet.getString("passwd"));
			member.setName(resultSet.getString("name"));
			member.setDate(resultSet.getString("reg_date"));
			list.add(member);
		}
		//쿼리결과출력

		return list;
	}
	
	public void close() throws SQLException {
		if(conn != null) conn.close();
	}
}
