import java.util.*;
import java.io.IOException;

class Monkey {
	String color = "";
	int banana = 0;
	
	void printmsg() {
		System.out.printf("%s �����̴� �ٳ�����  %s���ϴ�",color, banana == 1 ? "��":"��");
	}
}


public class Mafia {

	public static void main(String[] args) throws IOException {
		Monkey[] m = new Monkey[6];
		for (int i = 0; i<6;i++) m[i] = new Monkey();
		
		final int Nmonkey = 6;
		int tagger = 9;
		int mafia = 9;
		int suspector = 9;
		boolean flg = true;
		
		Scanner scanner = new Scanner(System.in);

		m[0].color = "Red";
		m[1].color = "White";
		m[2].color = "Black";
		m[3].color = "Yellow";
		m[4].color = "Blue";
		m[5].color = "Gray";		
		
		tagger = (int)(Math.random()*Nmonkey);
		System.out.printf("For debug: ������%d�Դϴ�.\n",tagger);
		do {
			mafia = (int)(Math.random()*Nmonkey);			
		} while (tagger == mafia);
		if(mafia>=0 && mafia <6) m[mafia].banana = 1;
		while(flg) {
			System.out.printf("For debug: �ٳ�����%d�� �������ϴ�.\n",mafia);
			System.out.println("�ٳ����� ������ �ִ� �������� ���� �����ϼ���.>");
			if (tagger != 0) System.out.println("0. Red");
			if (tagger != 1) System.out.println("1. White");
			if (tagger != 2) System.out.println("2. Black");
			if (tagger != 3) System.out.println("3. Yellow");
			if (tagger != 4) System.out.println("4. Blue");
			if (tagger != 5) System.out.println("5. Gray");
			
			suspector = scanner.nextInt();
			if(tagger == suspector) { System.out.println("������ �����߽��ϴ�. �ٽ� �����ϼ���"); continue; }
			
			m[suspector].printmsg();
			if (mafia == suspector) flg = false;
		}
	}
}
