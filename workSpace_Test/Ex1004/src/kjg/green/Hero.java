package kjg.green;

public class Hero {
	private String name;
	private int hp=100;
	
	Hero(String name){
		this.name=name;
	}

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
	
	void punch(Hero energy) {
		energy.hp -=10;
		System.out.printf("[%s]의 펀치\n",this.name);
		System.out.printf("\t %s : %d/100\n", energy.name , energy.hp);
	}
	
	//격투
	static void battle(Hero junggyu, Hero com){
		//두 영웅 모두 체력이 남아있다면 , 계속 싸움을 진행
		while(junggyu.hp > 0 && com.hp > 0) {
			// 1/2 확률로 공격/수비 결정
			
			Hero attacker, defender;
			
			if(Math.random() <0.5) { //0.0000... ~0.9999 ... 실수반환
				attacker = junggyu;
				defender = com;
			}else {
				attacker = com;
				defender = junggyu;
			}
			
			// 대상 공격
			attacker.punch(defender);			
		}
	}	
}