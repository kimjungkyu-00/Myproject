package project8;

public class Fish {

	int x;
	int y;

	public boolean Check(int a, int b) {
		if((a == x) && (b == y)) {
			System.out.println("좌표가 맞습니다");
			return false;
		}
		return true;
	}

}
