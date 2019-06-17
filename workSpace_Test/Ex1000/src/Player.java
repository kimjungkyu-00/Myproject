import java.util.Scanner;

public class Player {
	private String name;
	private Scanner scanner =new Scanner(System.in);
	
	Player(String name){
		this.name=name;
	}
	
	public int turn() {
		System.out.println("1.가위 2.바위 3.보");
		int input = scanner.nextInt();
		return input;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
