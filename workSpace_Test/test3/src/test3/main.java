package test3;

import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int num1, num2 ,num3 , num4;
		boolean t=true;
		Random r=new Random(9);
		int com1=r.nextInt(9);
		int com2=r.nextInt(9);
		int com3=r.nextInt(9);
		
		
		
		while(com1 == com2) {
			com2 = r.nextInt(9);
		}
		while((com1 == com3)|| (com2==com3)) {
			com3 = r.nextInt(9);
		}
		while(t) {

		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		
		System.out.println("=============유저 : 숫자 3번 입력");
		System.out.println("=========유저 번호 : "+num1+","+num2+","+num3);
		
		System.out.println("컴퓨터 숫자는 : "+com1+","+com2+","+com3);
		
		if(num1==com1) {
			System.out.println("num1 = 스트라이크");
		}else if((num1 ==com2) || (num1 == com3)) {
			System.out.println("num1 = 볼");
		}
		else if(num1 != com1){
			System.out.println("num 1 =out");
		}else {	}
		
		if(num2==com2) {
			System.out.println("num 2 = 스트라이크");
		}else if((num2 ==com1) || (num2 == com3)) {
			System.out.println("num 2 = 볼");
		}
		else if(num2 != com2){
			System.out.println("num 2 =out");
		}else {	}
		
		if(num3==com3) {
			System.out.println("num3 = 스트라이크");
		}else if((num3 ==com2) || (num3 == com1)) {
			System.out.println("num3 = 볼");
		}
		else if(num3 != com3){
			System.out.println("num 3 =out");
		}else {	}
		
		if((num1==com1) && (num2==com2) && (num3==com3)) {
			System.out.println("3스트라이크");
			break;
		}
		
		}
		
		
		
		
	}

}
