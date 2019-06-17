package test1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result=1;
		int x = 2;
		int a =sc.nextInt();
		int b =sc.nextInt();
		
		for(int i=0;i<a;i++) {
			if(a%x ==0 && b%x==0) {
				result = result*x;
				a= a/x;
				b= b/x;
			}else {
				x++;
			}
		}
		System.out.println("최대공약수 :"+result);
		System.out.println("최소공배수 :"+result*a*b);
		
	}

}
