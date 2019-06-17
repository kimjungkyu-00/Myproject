
public class Computer extends Player{
	int num;
	
	public Computer(String name) {
		super(name);
	}
	
	public int turn() {
		int newNum;
		do {
			newNum= (int)Math.random()*3;
		}while( num != newNum);
		
		num= newNum;
		
		return num;
	}
}
