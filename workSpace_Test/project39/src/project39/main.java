package project39;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = 2;
		int y;
		int sum;
		y = sc.nextInt();
		boolean t = true;

		
			for (int i = 1; i < 10; i++) {
				for (int j = 2; j < 10; j++) {
					if (y == 0) {

						sum = j * i;
						System.out.print(j + "x" + i + "=" + sum + "\t");
					}

				}
				System.out.println();
				if (y != 0) {
					sum = i * y;
					System.out.println(y + "x" + i + "=" + sum);
				}
			}
		}

	}


/*
 * int x; int y; Scanner sc= new Scanner(System.in); x = sc.nextInt(); y =
 * sc.nextInt(); if(x>y) { System.out.println(x*y); } if(x<y) {
 * System.out.println(x+y); }
 */
