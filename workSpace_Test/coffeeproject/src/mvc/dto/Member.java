package mvc.dto;

public class Member {
	String name;
	String tel;
	
	public Member() {}
	public Member(String name,String tel) {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}
