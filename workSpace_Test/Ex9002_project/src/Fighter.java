import java.util.Random;

/*
 * 격투기 게임 만들기
사용자와 컴퓨터(AI)와 게임

*** Main
객체생성 2개 사용자, 컴퓨터

한쪽이 체력이 없을때까지  반복
{
  두 캐릭터의 공격자 선정(random)
  대상을 공격
  sleep(1000)
}

**클래스 속성
 private 이름
 private 체력(100)
 
 생성자(name)
 
 int 공격(){
  공격하기 random()으로 1~10사이의 값을 공격
   return 공격값;
 }

 boolean 수비(){
  random으로 수비가 될수있음
  (짝수인경우 수비성공 , 홀수는 실패)   
   return 수비 성공유무
 }
 */
public class Fighter {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	private String name;
	private int hp=100;
	
	public Fighter(String name) {
		if(null != name)
			this.name=name;
	}
	
	int attack() {
		int attackValue ;
		Random rand = new Random();
		attackValue = rand.nextInt(10);
		System.out.println("..........attackvalue"+attackValue);
		return attackValue;
	}
	
	boolean defense() {
		int defend = ((int)Math.random()%1000);
		if(defend%7 == 0) {
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
