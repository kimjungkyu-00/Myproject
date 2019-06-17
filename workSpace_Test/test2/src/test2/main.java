package test2;

import java.util.Random;
import java.util.Scanner;

public class main {
	public static void num1() {
		for(int i=1;i<=6;i++) {			 
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
				System.out.println();
		}
	}
	
	public static void num2() {
		for(int i=1;i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
				}System.out.println();
				
			}
		
	}
	
	public static void num3() {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=1;j--) {
				if(i>=j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
	}
		
	
	public static void num4() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 9; j++) {
				if(j+i<=3) {
				System.out.print(" ");
				}else if(j-i<5){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void num5() {
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=4;j++) {
				if((j+i<=1)||(j-i>=3)) {
				System.out.print(" ");
				}
				else if((j+i>=7) || (i-j>=3)) {
					System.out.print(" ");
				}

				else {
					System.out.print("*");
				}
			}System.out.println();
		}
	}
//		
	
	public static void kawi() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<9;j++) {
				if((i==j)||(j+i==8)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
	}
	public static void bawi() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<8;j++) {
				if((j==0) || (i==0)) {
				System.out.print("*");
				}else if((i>=4) || (j==7)){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
		}
	}
	
	public static void bo() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<9;j++) {
				
				if((i==j)||(j+i==8)) {
					System.out.print("*");
				}else if(j==4) {
					System.out.print("*");
				}else if((i==1) &&(j==2)) {
					System.out.print("*");
				}else if((i==0) &&(j==2)) {
					System.out.print("*");
				}else if((i==1) &&(j==6)) {
					System.out.print("*");
				}else if((i==0) &&(j==6)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		
//		bo();
//		Scanner sc= new Scanner(System.in);
////		int x=sc.nextInt();
//		
//		
//	     int[][] arr = new int[5][5];
//	      
//	      int a = 0;
//	      for(int i=0; i< arr.length; i++) {
//	         for(int j=0; j<arr[i].length; j++) {
//	            arr[i][j] = ++a;
//	            if(i%2==0) {
////	            	if(i)
//	            }
//	            System.out.print(arr[i][j]);
//	         }System.out.println();
//	      }
//      
//	      
//	      
		
		Scanner sc=new Scanner(System.in);
		boolean t= true;
		Random r = new Random(3);
		
		while(t) {
		int num2 = r.nextInt(3);
		int num = sc.nextInt();
		System.out.println("===========유저 : ");
			if(num==0) {
				kawi();
			}else if(num==1) {
				bawi();
			}else if(num==2) {
				bo();
			}else {
				System.out.println("종료");
				break;
			}
			System.out.println();
			System.out.println("==============컴퓨터 : ");
			if(num2==0) {
				kawi();
			}else if(num2==1) {
				bawi();
			}else if(num2==2) {
				bo();
			}
			
			if(num == num2 ) {
				System.out.println("무승부");
			}else if(num == 0 && num2 == 2) {
				System.out.println("이겼습니다");
			}else if(num == 0 && num2 == 1) {
				System.out.println("졌습니다");
			}else if(num == 1 && num2 == 0) {
				System.out.println("이겼습니다");
			}else if(num == 1 && num2 == 2) {
				System.out.println("졌습니다");
			}else if(num == 2 && num2 == 0) {
				System.out.println("졌습니다");
			}else if(num == 2 && num2 == 1) {
				System.out.println("이겼습니다");
			}
		}
		
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<9;j++) {
//				
//				if((i==j)||(j+i==8)) {
//					System.out.print("*");
//				}else if(j==4) {
//					System.out.print("*");
//				}else if((i==1) &&(j==2)) {
//					System.out.print("*");
//				}else if((i==0) &&(j==2)) {
//					System.out.print("*");
//				}else if((i==1) &&(j==6)) {
//					System.out.print("*");
//				}else if((i==0) &&(j==6)) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}System.out.println();
//		}
		
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("첫 숫자입력");
//		int x = sc.nextInt();
//		
//		for(int i=0; i<x;i++) {
//			for(int j=0; j<i;j++) {
//				
//				System.out.print("*");
//			}System.out.println("");
//		}
		
//		for(int i=1;i<6;++i) {
//			for(int j=4;j>=0;--j) {
//				if(j>=i) {
//				System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//			}System.out.println();
//		}
//	}
//}

		
//		while(true) {
//		for(int i=0;i<x;i++) {
//			for(int j=0;j<=i;j++) {
//					System.out.print("*");
//
//			}System.out.println();
//		}
//		break;
//
//	}
		
		
//		for(int i=0;i<x;i++) {
//			for(int j=0;j<y;j++) {
//				System.out.print("*");
//			}System.out.println();
//		}
		
		
		
		
		
		
//		바위
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<8;j++) {
//				if((j==0) || (i==0)) {
//				System.out.print("*");
//				}else if((i>=4) || (j==7)){
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}System.out.println();
//		}
		
		
		
		
		
		
		
//		가위
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<9;j++) {
//				if((i==j)||(j+i==8)) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}System.out.println();
//		}
		
		
//		boolean t = true;
//		Scanner sc= new Scanner(System.in);
//		System.out.println("1~5 입력하시오");
//		
//		while(t) {
//		int n= sc.nextInt();
//		
//		if(n==1) {
//			num1();
//		}else if(n==2) {
//			num2();
//		}else if(n==3) {
//			num3();
//		}else if(n==4) {
//			num4();
//		}else if(n==5) {
//			num5();
//		}else {
//			System.out.println("종료");
//			break;
//		}
//		
//		}
		
		
		
		
		
//		 1
//		  for(int i=1;i<=6;i++) {
//		 
//			for(int j=1;j<=5;j++) {
//				System.out.print("*");
//
//			}				System.out.println();
//		}
//	}
//	}

//		2.
//		for(int i=1;i<=5;i++) {
//			for(int j=0;j<i;j++) {
//				System.out.print("*");
//				}System.out.println();
//				
//			}
//		}
//	}

//		3.
//		for(int i=1;i<=5;i++) {
//			for(int j=5;j>=1;j--) {
//				if(i>=j) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}System.out.println();
//		}
//	}
//}

//		4.
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 9; j++) {
//				if(j+i<=3) {
//				System.out.print(" ");
//				}else if(j-i<5){
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//	}
//}
		
//		5.
//		for(int i=0;i<=4;i++) {
//			for(int j=0;j<=4;j++) {
//				if((j+i<=1)||(j-i>=3)) {
//				System.out.print(" ");
//				}
//				else if((j+i>=7) || (i-j>=3)) {
//					System.out.print(" ");
//				}
//
//				else {
//					System.out.print("*");
//				}
//			}System.out.println();
//		}
//	}
//}
	}
}
