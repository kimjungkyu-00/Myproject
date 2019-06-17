package project8;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Fish fish=new Fish();
		Fisherman fimen = new Fisherman();
		Scanner sc = new Scanner(System.in);
		Random r= new Random();
		int number= r.nextInt(20);
		int number2=r.nextInt(20);

		int close=5;

		System.out.println("물고기 좌표를 입력하세요");
		fish.x = number;
		fish.y = number2;
		System.out.println("물고기 자표 : "+number+" , "+number2);
		
		
		System.out.println("낚시꾼 좌표를 입력하세요");
		fimen.setControlx(sc.nextInt());
		fimen.setControly(sc.nextInt());

		while(true) {
		if((fish.x<=20 && fish.x>=0) && (fish.y<=20 && fish.y>=0)) {
			System.out.println("게임 시작합니다.");
		}else {
			System.out.println("좌표 잘못입력");
			break;
		}
		
		System.out.println("움직이세요");

	
			System.out.print("숫자를 입력해주세요 :");

			int move =sc.nextInt();

			if(move == 1)
				fimen.xUp();
			else if(move == 2)
				fimen.xDown();
			else if(move == 3)
				fimen.yUp();
			else if(move == 4)
				fimen.yDown();
			else if(close == 5) {
				System.out.println("종료하였습니다.");
				break;
			}

			boolean check =fish.Check(fimen.getControlx(), fimen.getControly());

			if(!check)
				break;

		}		
	}
}

