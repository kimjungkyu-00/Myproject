
public class Game {
	private final String s[] = {"����", "����","��"};
	private Player[] player = new Player[2];	

	
	public void MyGame() {
		player[0] = new Player("ȫ�浿");
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
			System.out.println("�����ϴ�.");
			break;
		case 1: case 2: case -1 : case -2:
			
		}
		//����(0) ���� (1) ��(2)
		//���� < ��  0-2 = -2  ����
		//���� < ���� 0-1 = -1 ����
		//���� < ���� 1-0 = 1

		//���� < ���� 0-1 = -1
		//���� < �� 1-0 = 2
		//�� < ���� 2-1 = 1
		}
		System.out.println("������ �����մϴ�.");
	}
}
