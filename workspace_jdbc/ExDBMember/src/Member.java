
public class Member {
	String id;
	String name;
	String passwd;
	
	public Member() {	}
	public Member(String id,String name,String passwd) {
		this.id=id; this.name=name; this.passwd=passwd;
	}
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
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
}
