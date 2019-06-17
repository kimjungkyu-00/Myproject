package project13;

public class User {
	String name;
	String num;
	String address;
	String email;
	
	public User() {}
	public User(String name,String num,String address,String email) {
		this.name=name;
		this.num=num;
		this.address=address;
		this.email=email;
	}
	
	
	@Override
	public String toString() {
		return name+","+num+","+address+","+email;
	}
	
	
}
