package my.dto;


public class Member {
	String id;
	String passwd;
	String name;
	String address;
	String tel;
	public Member() {}
	public Member(String name,String passwd, String address, String tel) {
		this.name=name;
		this.passwd=passwd;
		this.tel=tel;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	

}
