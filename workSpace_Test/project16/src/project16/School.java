package project16;

import java.util.Set;

public class School {
	private String name="김정규";
	private int age=50;

	
	public School() {
		System.out.println(this.name +" "+this.age);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
