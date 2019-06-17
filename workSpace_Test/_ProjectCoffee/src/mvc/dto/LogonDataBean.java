package mvc.dto;

import java.util.Date;

public class LogonDataBean {
	String id;
	String passwd;
	String name;
	Date reg_date;
	String address;
	String tel;
	
	public LogonDataBean() {}
	public LogonDataBean(String id,String passwd,String name, String address, String tel,Date reg_date) {
		this.id=id;
		this.passwd=passwd;
		this.name=name;
		this.reg_date=reg_date;
		this.address=address;
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
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
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
