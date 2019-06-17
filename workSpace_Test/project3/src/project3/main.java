package project3;

import java.util.Scanner;

public class main {

	public static void check(int a){
		if(a > 97){
			System.out.println("A+");
		}else if (a > 94) {
			System.out.println("A");
		}else if (a > 92) {
			System.out.println("A-");
		}else if (a > 89){
			System.out.println("B+");
		}else if(a > 86) {
			System.out.println("B");
		}else if (a > 82) {
			System.out.println("B-");
		}else if(a > 79){
			System.out.println("C+");
		}else if (a > 76) {
			System.out.println("C");
		}else if(a>72) {
			System.out.println("C-");
		}else {
			System.out.println("F");
		}
	}
	
	public static void main(String[] args) {
		int num;
		int num2;
		int num3;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("컴퓨터 : ");
		num= scanner.nextInt();
		
		System.out.print("영어 : ");
		num2= scanner.nextInt();
		
		System.out.print("수학 : ");
		num3= scanner.nextInt();
		
		System.out.println();
		
		check(num);
		check(num2);
		check(num3);
		int sum = num+num2+num3;
		int ave= sum/3;
		
		System.out.println("평균 :"+(ave));
		
	}

}
