package project9;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Race {

	public void run(Player[] run) {
		Random ra = new Random();
		boolean bun = true;
		while (bun) {
			for (int i = 0; i < run.length; i++) {

				int race = ra.nextInt(10);

				int a = run[i].getGgo();
				run[i].setGgo(a + race);
				System.out.println(run[i] + " 입니다.");

				if (run[i].getGgo() >= 100) {
					System.out.println(run[i] + "님 승리하였습니다.");
					bun = false;
					break;
				}
				if(race == 0 ) {
					System.out.println(run[i]+"돌발!");
				}
			}
		}
	}
}
