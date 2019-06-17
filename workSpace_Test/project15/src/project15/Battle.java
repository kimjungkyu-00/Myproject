package project15;

import java.util.Random;

public class Battle extends Unit {

	public void Knight(Unit[] hp) {
		Random r = new Random();
		boolean b = true;
		while (b) {
			for (int i = 0; i < hp.length; i++) {

				int att = r.nextInt(100);
				int h = hp[i].getHp();
				hp[i].setHp(att - h);

				if (hp[i].getHp() < 0) {
					System.out.println(hp[i]);
				} else {
					System.out.println("0완료");
					b = false;
				}
			}
		}
	}
}
