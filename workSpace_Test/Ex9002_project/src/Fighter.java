import java.util.Random;

/*
 * ������ ���� �����
����ڿ� ��ǻ��(AI)�� ����

*** Main
��ü���� 2�� �����, ��ǻ��

������ ü���� ����������  �ݺ�
{
  �� ĳ������ ������ ����(random)
  ����� ����
  sleep(1000)
}

**Ŭ���� �Ӽ�
 private �̸�
 private ü��(100)
 
 ������(name)
 
 int ����(){
  �����ϱ� random()���� 1~10������ ���� ����
   return ���ݰ�;
 }

 boolean ����(){
  random���� ���� �ɼ�����
  (¦���ΰ�� ���񼺰� , Ȧ���� ����)   
   return ���� ��������
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
