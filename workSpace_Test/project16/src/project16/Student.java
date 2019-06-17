package project16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student extends Teacher{
	
	private String name;
	public Student() {
		super();
	}
	
	public void start() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("당신의 이름을 쓰세요.");
		
		boolean b = true;
		while(b)
		try {
			name = in.readLine();
			
			if(name.equals(getName())) {
				System.out.println("맞습니다.");
			}else {
				System.out.println("아닙니다.");
				
			}
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
}
