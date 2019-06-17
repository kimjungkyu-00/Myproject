package project1;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		final int Nomkey= 6;
		int tagger = 6;
		int mafia= 6;
		int suspector = 6;
		boolean flg= true;
		
		Monkey[] mk = new Monkey[6];
		for(int i =0; i<6 ; i++) mk[i] = new Monkey();
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=======겜시작========");
		mk[0].setColor("red");
		mk[1].setColor("white");
		mk[2].setColor("black");
		mk[3].setColor("yellow");
		mk[4].setColor("blue");
		mk[5].setColor("gray");
		
		tagger = (int)(Math.random()*Nomkey);
		System.out.println(" 마피아  : " +tagger);
		do {
		mafia = (int)(Math.random()*Nomkey);
		}while(tagger == mafia);
		if(mafia<=0 && mafia<6) mk[mafia].setBanana(1);
		while(flg) {
			System.out.printf("for debug : ",mafia);
			if(tagger != 0) System.out.println("0. Red");
			if(tagger != 1) System.out.println("1. White");
			if(tagger != 2) System.out.println("2. Black");
			if(tagger != 3) System.out.println("3. Yellow");
			if(tagger != 4) System.out.println("4. Blue");
			if(tagger != 5) System.out.println("5. Gray");
			
			suspector = scanner.nextInt();
			if(tagger == suspector) {System.out.println("빙고"); break;}
		
			if(tagger != suspector) {System.out.println("땡"); continue;}
			
			}
		}
	}

