package project21;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		int n=1;
		int LCM;
		//첫번째 입력값
		int val1 = sc.nextInt();
		//두번째 입력값
		int val2 = sc.nextInt();
		int temp1=val1;
		int temp2=val2;
		
		if(val1 < val2) {
			val1= temp2;
			val2 = temp1;
		}
		while(n>0) {
			n=val1%val2;
			val1=val2;
			val2=n;
			System.out.println(val2);	
		}
		
	    LCM = temp1* temp2/val1;
        System.out.println("최대공약수 : "+ val1);
        System.out.println("최소공배수 : "+ LCM);
	}
}
