import java.util.*;

public class MyClass {
	private String name;
	private int hp = 100;
	private int att;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void setAtt(int att){
		this.att = att;
	}
	
	public int getAtt() {
		return att;
	}
	
	
	int Attack() {
		for(int i=0; i< 10; ++i) {
			int Att = (int)(Math.random()*10)+1;
			System.out.print(Att);
		}
		return Attack();
	}
	
	boolean Gard() {
	
		return false;
		
	}
	
}