package project9;

import java.util.Random;

public class main {

	public static void main(String[] args) {
		Player[] p = new Player[4];
		Random r = new Random();
		Race ra = new Race();

		p[0] = new Player("한국", 1);
		p[1] = new Player("중국", 2);
		p[2] = new Player("미국", 3);
		p[3] = new Player("러시아", 4);

		ra.run(p);

	}
}