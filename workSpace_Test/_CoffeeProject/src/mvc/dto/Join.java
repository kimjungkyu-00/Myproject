package mvc.dto;

public class Join {
	String id;
	int pw;
	int pw2;
	int tel;
	String email;
	String name;
	public Join() {	}
	public Join(String id, String email,String name,int pw,int pw2,int tel) {}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	public int getPw2() {
		return pw2;
	}
	public void setPw2(int pw2) {
		this.pw2 = pw2;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
