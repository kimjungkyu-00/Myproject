import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

public class MyDB {
	final static String DRIVER = "com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
	String dbId="root";
	String dbPw="1234";
	Connection conn=null;
	Statement statement=null;
	
	public MyDB(){
		//1. driver 로드
		try {
			Class.forName(DRIVER).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Driver 연결 오류"+e.getMessage());
			e.printStackTrace();
		}
				
	}
	
	public void connect() {
		//2. mysql에 연결하기.

		 try {
			conn = DriverManager.getConnection(url, dbId, dbPw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void insertStudent(String id,String name,String dept) {
		
		try {
		
			//3.쿼리전송을 위한 Statement생성
			statement = conn.createStatement();
			
			//4. 쿼리 전송
			String query = "INSERT INTO STUDENT values('"+id+"','"+name+"','"+dept+"')";
			int ret = statement.executeUpdate(query);
			
			System.out.println("insert 결과 : "+ret);
	
		}catch (SQLException e) {
			System.out.println("db연결 오류"+e.getMessage());
			e.printStackTrace();
			}finally {
				//5. statement자원해제
				if(null != statement)
					try {
						statement.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
			}
		}
	public void deleteStudent(String name) {
		//1.드라이버 로드
		//2.mysql연결
		
		//3.쿼리전송
		//3.1 statement생성
		Statement statement;
		try {
			statement = conn.createStatement();
		
		//3.2 쿼리전송
		String query ="DELETE FROM STUDENT WHERE name='"+name+"'";
		int ret;

			ret = statement.executeUpdate(query);
		
		//4. 결과처리 (출력)
		System.out.println("del 결과 : "+ret);
		
	} catch (SQLException e) {
		e.printStackTrace();
	} 
}
	

	
	public ArrayList<Student> serchName(String name) {
		//드라이버 로드
		//db연결
		
		//3.쿼리전송
		//3.1쿼리전송을 위한 statment 생성
		Statement statement=null;
		//검색결과를 넘겨주기 위한 list 생성
		ArrayList<Student> searchlist = new ArrayList<Student>();
		try {
			statement = conn.createStatement();
		
		//3.2 쿼리전송
		String query="SELECT * FROM STUDENT WHERE NAME= '"+name+"'";
		ResultSet resultset = statement.executeQuery(query);
		
		//3.3 쿼리결과 출력
		while(resultset.next()) {
			//검색 결과 저장
			Student searchSt = new Student(resultset.getString("id"),
											resultset.getString("name"),
											resultset.getString("dept"));
			/*searchSt.setId(resultset.getString("id"));
			searchSt.setName(resultset.getString("name"));
			searchSt.setDept(resultset.getString("dept"));*/
			searchlist.add(searchSt);
			//검색결과 확인
			System.out.print(resultset.getString("id"));
			System.out.print("\t"+resultset.getString("name"));
			System.out.print("\t"+resultset.getString("dept"));
			System.out.println();
		}
		
		//db해제
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//3.4 쿼리 자원해제
			if(null != statement)
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return searchlist;

	}
	public ArrayList<Student> getStudentList(){
		ArrayList<Student> list= null;
		Statement statement = null;
		//쿼리전송
		try {
			statement = conn.createStatement();
		
		
		String query = "SELECT * FROM STUDENT";
		ResultSet resultSet =  statement.executeQuery(query);
		//쿼리결과 -list에 넣어주기
		list = new ArrayList<Student>();
		while(resultSet.next()) {
			Student newSt = new Student(resultSet.getString("id"),
										resultSet.getString("name"),
										resultSet.getString("dept"));
			list.add(newSt);
					
		}
	
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		//쿼리자원해제
		
		return list;
	}
	
	public void editStudent(String id, String editName) {
		//쿼리전송
		//쿼리전송을 위한 statement생성
		Statement statement = null;
		try {
			statement = conn.createStatement();
		
		//쿼리전송
		
		String query="update STUDENT set NAME='"+editName+"' where id='"+id+"'";
		int ret = statement.executeUpdate(query);
		//결과출력
		System.out.println("edit : 결과"+ret);
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//쿼리자원해제
			if(null != statement) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} 
		}
		
	}
	
	public void close() {
		//6.db연결 자원해제
		try {
			if(null != conn)
				conn.close();
	}catch(SQLException e) {
		e.printStackTrace();
	}
}
}
	

