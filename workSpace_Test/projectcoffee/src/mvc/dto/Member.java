package mvc.dto;

public class Member {
	String name;
	String tel;
	String email;
	int pw;
	int pwCheck;
	
	
	public Member() {}
	public Member(String name,String tel,String email,int pw,int pwCheck) {}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	public int getPwCheck() {
		return pwCheck;
	}
	public void setPwCheck(int pwCheck) {
		this.pwCheck = pwCheck;
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
