import java.util.Random;

public class ExGame {

	public static void main(String[] args) {
		Fighter[] fighter = new Fighter[3];
		fighter[0] = new Fighter("ȫ�浿");
		fighter[1] = new Fighter("���μ�");
		fighter[2] = new Fighter("������");
		
		int attackValue;
		Random rand =new  Random();
		
		while(fighter[0].getHp() > 0||
		 		fighter[1].getHp() > 0 ||
		 		fighter[2].getHp() > 0 ){
		 	
			attackIndex = rand.nextInt(3);
			attackValue = fighter[attackIndex].attack();
			for(int i=0; i < fighter.length ;++i) {
				if(attackIndex != i) {
					if(!fighter[i].defense() ) {
						fighter[i].setHp(fighter[i].getHp());
					}else {
						System.out.println(" "+fighter[i].getName());
					}
				}
			}
		}
	}
}
