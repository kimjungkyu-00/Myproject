import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExMain {

	public static void main(String[] args) {
		//1. jdbc 드라이버 생성(로드)
		try {
						
	
		//4. 실행할 쿼리문 전송
		ResultSet rt = st.executeQuery("SELECT * FROM MEMBER");
		System.out.println("query1 수행결과:");
		//5.수행된 쿼리문 출력
		System.out.println("name");
		System.out.println("id");
		System.out.println("passwd");
		while(rt.next()) {
			String rtName = rt.getString("name");
			System.out.print("name : "+rtName);
			System.out.print(rt.getString("id"));
			System.out.print(rt.getString("passwd"));
			System.out.println();

		
		}
		//6. 쿼리 statement 자원해제
		rt.close();
		//7.드라이버 (conect)자원해제
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
