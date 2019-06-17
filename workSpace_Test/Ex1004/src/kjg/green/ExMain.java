package kjg.green;

public class ExMain {

	public static void main(String[] args){
		//2개의 객체 생성
		Hero junggyu = new Hero("김정규"); // name : 김정규
		Hero com = new Hero("컴퓨터");  // name : 컴퓨터
		
		Hero.battle(junggyu , com);
		
	}

}
