
public class ExGameMain {

	public static void main(String[] args) {
		Fighter user = new Fighter("user");
		Fighter com = new Fighter("computer");
		int attackValue;
		int userHP = user.getHp();
		int comHP = com.getHp();
		
		while(userHP >=0 ||comHP >=0) {
			attackValue= user.attack();
		if(com.defense() ) {
			com.setHp(attackValue);
			System.out.println("com hp : "+com.getHp());
		}else {
			System.out.println("컴퓨터가 피했습니다.");
		}
		if(user.getHp() <=0 ) {
			System.out.println("컴퓨터가 이겼습니다.");
			break;
		}
		
		attackValue = com.attack();
		if(!user.defense() ) {
			user.setHp(attackValue);
			System.out.println("user hp :"+user.getHp());
		}else {
			System.out.println("user defend");
		}
		if(com.getHp() <= 0) {
			System.out.println("user win.");
			break;
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {e.printStackTrace();	}
		}
	}

}
