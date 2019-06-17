package project17;

import java.io.ObjectInputStream.GetField;

public class main {

	public static void main(String[] args) {
		Animal[] ani = new Animal[4];
		String temp;
		for (int i = 0; i < ani.length; i++) {
				ani[0] = new Animal("개", "뼈다귀");
				ani[1] = new Animal("닭", "모이");
				ani[2] = new Animal("돼지", "여물");
				ani[3] = new Animal("코뿔소", "풀");

				System.out.println(ani[i]);
			}
		System.out.println("=====변경");
		
		for(int i =ani.length-1; i> 0;i--) {
			temp = ani[i].food;
//			System.out.println("temp : " +temp);
			ani[i].food = ani[i-1].food;
//			System.out.println("temp 1 : "+ani[i].food);
			ani[i-1].food = temp;
//			System.out.println("temp 2: "+ani[i-1].food);
			
		}
		for(int i=0; i<ani.length;i++) {
			System.out.println(ani[i].name+","+ani[i].food);
		}
	}

}
