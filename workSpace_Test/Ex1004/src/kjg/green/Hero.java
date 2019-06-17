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
		System.out.printf("[%s]�� ��ġ\n",this.name);
		System.out.printf("\t %s : %d/100\n", energy.name , energy.hp);
	}
	
	//����
	static void battle(Hero junggyu, Hero com){
		//�� ���� ��� ü���� �����ִٸ� , ��� �ο��� ����
		while(junggyu.hp > 0 && com.hp > 0) {
			// 1/2 Ȯ���� ����/���� ����
			
			Hero attacker, defender;
			
			if(Math.random() <0.5) { //0.0000... ~0.9999 ... �Ǽ���ȯ
				attacker = junggyu;
				defender = com;
			}else {
				attacker = com;
				defender = junggyu;
			}
			
			// ��� ����
			attacker.punch(defender);			
		}
	}	
}