package mvc.dto;

public class User {

	
	String name;
	String phone;
	String addr;
	String pay;
	
	public User() {}
	
	public User(String name, String phone, String addr, String pay) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
		this.pay = pay;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPay() {
		return pay;
	}
	public void setPay(String pay) {
		this.pay = pay;
	}
	
}
