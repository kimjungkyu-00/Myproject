import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExMain {

	public static void main(String[] args) {
		//1. jdbc ����̹� ����(�ε�)
		try {
						
	
		//4. ������ ������ ����
		ResultSet rt = st.executeQuery("SELECT * FROM MEMBER");
		System.out.println("query1 ������:");
		//5.����� ������ ���
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
		//6. ���� statement �ڿ�����
		rt.close();
		//7.����̹� (conect)�ڿ�����
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
