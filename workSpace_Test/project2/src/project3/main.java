package project3;

import java.util.Scanner;





public class main {
	
	public static void main(String[] args) {	
		
		int[] com = new int[3];
		int[] user = new int[3];

		Scanner scanner=new Scanner(System.in);
		boolean[] alreadey=new boolean[10];
		int st;
		int ball;
		
		
		for(int i=0;i<3;i++) {
		 int ran = (int)(Math.random() * 9 + 1);
	        System.out.print(ran);
		}
		
		
	}

}
