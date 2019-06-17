import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		ArrayList<Student> list= new ArrayList<Student>();
		
		ExDB exdb = new ExDB();
		exdb.connect();
		list = exdb.getStudentlist();
		
		for(int i=0; i<list.size(); ++i) {
			Student st = list.get(i);
			System.out.println(st.getName());
		}
		exdb.close();
	}
}