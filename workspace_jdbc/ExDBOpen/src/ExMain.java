import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExMain {

	public static void main(String[] args) {
		try {
			// 1 jdbc driver�� �ν��Ͻ� �����ϱ�
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();		
			// 2 my sql�� �����ϱ�
			//-> cmd���� mysql - uroot -p
			//use mydb;
				Connection conn = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC",
						"root", "1234");
				System.out.println("db���� ����");
				
				// 3 ������ �����ϴ� Ŭ���� ����
				Statement statement = conn.createStatement();
			
				// 4 ������ ������ ����
				ResultSet resultset = statement.executeQuery("select * from pet");
				System.out.println("query1 ������ : ");
				// 5 ���� ����� �ִ� ��쿡 ȭ�鿡 ���
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
				// 6 ��� ����� ���ҽ� ����
				resultset.close();
				
//				statement.executeUpdate("delete from pet");
//				System.out.println("update query2 ����");
				
		
				// 7 ����� ���ҽ� ����
				conn.close();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("driver loading ���� : "+e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("db���� ���� : "+e.getMessage());
			e.printStackTrace();
		}		
	}	
}