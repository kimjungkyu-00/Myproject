
public class Game {
	private final String s[] = {"가위", "바위","보"};
	private Player[] player = new Player[2];	

	
	public void MyGame() {
		player[0] = new Player("홍길동");
		player[1] = new Computer("Computer");
	}
	
	void playGame() {
		while(true) {
		int person= player[0].turn();
		int com = player[1].turn();
		
		if(person == 3) {
			break ;
		}
		
		
		System.out.println("player : "+s[person]);
		System.out.println("player : "+s[com]);
		int result = person - com;
		
		switch(result) {
		case 0:
			System.out.println("비겼습니다.");
			break;
		case 1: case 2: case -1 : case -2:
			
		}
		//가위(0) 바위 (1) 보(2)
		//가위 < 보  0-2 = -2  가위
		//가위 < 바위 0-1 = -1 바위
		//바위 < 가위 1-0 = 1

		//가위 < 바위 0-1 = -1
		//바위 < 보 1-0 = 2
		//보 < 바위 2-1 = 1
		}
		System.out.println("게임을 종료합니다.");
	}
}
