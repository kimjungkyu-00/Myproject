import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDB {
	final static String DRIVER = "com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
	String dbId="root";
	String dbPw="1234";
	Connection conn;
	Statement statement;
	
	public MyDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	public void connect() throws SQLException {
		conn= DriverManager.getConnection(url,dbId,dbPw);
		statement = conn.createStatement();
		
	}
	
	public int insertMember(Member member) {
		int ret=-1;
		//3. 쿼리 전송을위한 statement 생성
		statement =conn.createStatement();
		
		String query ="INSERT INTO MEMBER(name,id,passwd)"
						+"values('"+member.getName()+"','"+member.getId()+"','"+member.getPasswd();

		//5.수행된 쿼리문 출력

		//6. 쿼리 statement 자원해제

		//7.드라이버 (conect)자원해제
	}
	
	
	
}
