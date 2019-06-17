package project38;

import java.util.Scanner;

public class main {
	public static int add(int x, int y ) {
		return x+y;
	}

	public static int mul(int x, int y) {
		
		return x*y;
	}

	public static int div(int x, int y) {
		
		return x/y;
	}

	public static int min(int x, int y) {
	
		return x-y;
	}

	public static void main(String[] args) {
		int x;
		int y;
		String v;

		Scanner sc = new Scanner(System.in);

		v = sc.next();
		char e=v.charAt(1);
		x=v.charAt(0)-48;
		y=v.charAt(2)-48;
		
		
		if(e=='+') {
			System.out.println(add(x, y));
		}if(e=='*') {
			System.out.println(mul(x, y));
		}if(e=='/') {
			System.out.println(div(x, y));
		}if(e=='-') {
			System.out.println(min(x, y));
		}
	}
}

/*
 * int x; int y; Scanner sc= new Scanner(System.in); x = sc.nextInt(); y =
 * sc.nextInt(); if(x>y) { System.out.println(x*y); } if(x<y) {
 * System.out.println(x+y); }
 */
