package test4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean t = true;
		while (t) {
			int money = sc.nextInt();
			System.out.println("돈 " + money);

			int mo = (int) money / 50000;

			money = money - mo * 50000;
			int mo1 = money / 10000;

			money = money - mo1 * 10000;
			int mo2 = money / 5000;

			money = money - mo2 * 5000;
			int mo3 = money / 1000;

			money = money - mo3 * 1000;
			int mo4 = money / 500;

			money = money - mo4 * 500;
			int mo5 = money / 100;

			money = money - mo5 * 100;
			int mo6 = money / 50;

			money = money - mo6 * 50;
			int mo7 = money / 10;

				System.out.println("오만원권 : " + mo + "개");
				System.out.println("만원권 : " + mo1 + "개");	
				System.out.println("오천원권 : " + mo2 + "개");	
				System.out.println("천원권 : " + mo3 + "개");		
				System.out.println("오백원 : " + mo4 + "개");		
				System.out.println("백원 : " + mo5 + "개");			
				System.out.println("오십원 : " + mo6 + "개");			
				System.out.println("십원 : " + mo7 + "개");
			
		}
	}

}
