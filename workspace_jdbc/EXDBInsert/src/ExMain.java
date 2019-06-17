import java.util.ArrayList;

public class ExMain {

	public static void main(String[] args) {
		
		MyDB mydb = new MyDB();
		
		mydb.connect();
		
		//mydb.insertStudent("15741", "김정규", "백수과");
		
		//mydb.deleteStudent("밍밍밍");
		mydb.serchName("이기자");
		ArrayList<Student> list = mydb.serchName("홍길동");
		if(list !=null) {
			System.out.println("main-- search count : "+list.size());
			for(int i=0; i<list.size();++i) {
				Student tmp = list.get(i);
				System.out.print(""+tmp.getId());
				System.out.print("\t"+tmp.getName());
				System.out.println("\t"+tmp.getDept());
			}
		}
		System.out.println("student list ===============");
		ArrayList<Student> stlist = mydb.getStudentList();
		if(stlist != null) {
			for(int i=0; i<stlist.size();++i) {
				Student tmp = stlist.get(i);
				System.out.print(""+tmp.getId());
				System.out.print("\t"+tmp.getName());
				System.out.println("\t"+tmp.getDept());
			}
		}
		
		mydb.editStudent("161211","박보검");
		
		mydb.close();
	}
}