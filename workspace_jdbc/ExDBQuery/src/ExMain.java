import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExMain {

	public static void main(String[] args) {

		//1.java my sql driver를 생성
			try {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			
		
		//2. 로드한 driver로 mysql 접속
		Connection conn= null;
	
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC",
					"root", "1234");
		
		System.out.println("db연결 성공");

		
		//3. 쿼리를 보낼 statement 객체 생성
		Statement statement=null;
			
		statement = conn.createStatement();
				//4. 쿼리 전송
			
		//애완동물이 강아지만 출력 (pet name,owner,species,sex)
		ResultSet resulset =
				statement.executeQuery("select * from pet");
		//5. 쿼리 결과 출력
		while(resulset.next()) {
			System.out.println(" "+resulset.getString("name"));
			System.out.println("\t"+resulset.getString("owner"));
			System.out.println("\t"+resulset.getString("species"));
			System.out.println("\t"+resulset.getString("sex"));
			System.out.println();
		}
		//6. 쿼리 statement 자원해제
		statement.close();
		//7. drvier 자원해제
		conn.close();
		
		 } catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}


