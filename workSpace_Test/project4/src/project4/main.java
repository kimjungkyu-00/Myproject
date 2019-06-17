package project4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
	String str = "";

	Scanner sc = new Scanner(System.in);

    for (;;) {
       System.out.println("계산 수식 : ");

       String cal = sc.nextLine();

       String[] op = cal.split("\\+|\\-|\\*|\\/");

       for (int i = 0; i < op.length; i++) {
          System.out.println(i + "번째" + op[i]);
       }

       Queue<String> operator = new LinkedList<String>();

       for (int i = 0; i < cal.length(); i++) {
          if (cal.charAt(i) == '+') {
             operator.add("+");
             continue;
          } else if (cal.charAt(i) == '-') {
             operator.add("-");
             continue;
          } else if (cal.charAt(i) == '*') {
             operator.add("*");
             continue;
          } else if (cal.charAt(i) == '/') {
             operator.add("/");
             continue;
          } else {
             continue;
          }
       }

       int sum = 0;
       int minus = 0;
       int result = 0;
       sum = Integer.parseInt(op[0]);

       for (int i = 1; i < op.length; i++) {
          try {
             String ch = operator.poll();
             if (ch == "+") {
                sum += Integer.parseInt(op[i]);
                continue;
             } else if (ch == "-") {
                minus += Integer.parseInt(op[i]);
                continue;
             } else if (ch == "*") {
                sum = (sum * Integer.parseInt(op[i]));
                continue;
             } else if (ch == "/") {
                minus /= Integer.parseInt(op[i]);
                continue;
             }
          } catch (NullPointerException e) {
             break;
          }
       }
       result = (sum - minus);
       System.out.println("결과 : " + result);

    	}
	}
}