
public class Student {
	String id;
	String name;
	String dept;
	
	Student(String id,String name, String dept){
		this.id=id; this.name=name; this.dept=dept;
	}
	public Student() {}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
