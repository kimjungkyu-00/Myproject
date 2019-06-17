package project7;

import java.util.Scanner;

public class main {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] arr= new String[9][4];
		int num=1;
		
		for(int i=0;i<arr.length;++i) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = Integer.toString(num++);
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int num1 =sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				if(arr[i][j].equals(num) ) {
					arr[i][j] = "x";
				}
			}
			System.out.println();
		}

	}
}