import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExMain {

	public static void main(String[] args) {
		try {
			// 1 jdbc driver를 인스턴스 생성하기
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();		
			// 2 my sql에 연결하기
			//-> cmd에서 mysql - uroot -p
			//use mydb;
				Connection conn = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC",
						"root", "1234");
				System.out.println("db연결 성공");
				
				// 3 쿼리문 전송하는 클래스 생성
				Statement statement = conn.createStatement();
			
				// 4 실행할 쿼리문 전송
				ResultSet resultset = statement.executeQuery("select * from pet");
				System.out.println("query1 수행결과 : ");
				// 5 쿼리 결과가 있는 경우에 화면에 출력
				System.out.print("name ");
				System.out.print("owner");
				System.out.print("species");
				System.out.print("sex");
				while(resultset.next() ) {
					String resultName = resultset.getString("name");
					System.out.print("name : "+resultName);
					System.out.print(resultset.getString("owner"));
					System.out.print(resultset.getString("species"));
					System.out.print(resultset.getString("sex"));
					System.out.println();

				}
				// 6 결과 출력후 리소스 해제
				resultset.close();
				
//				statement.executeUpdate("delete from pet");
//				System.out.println("update query2 수행");
				
		
				// 7 사용후 리소스 해제
				conn.close();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("driver loading 오류 : "+e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("db연결 오류 : "+e.getMessage());
			e.printStackTrace();
		}		
	}	
}