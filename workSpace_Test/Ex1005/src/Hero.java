
public class Hero extends Thread{
	 String name;
	 int hp=100;
	
	Hero(String name){
		this.name=name;
	}
	

	
	@Override
	public void run() {
		while(name.hp <0 )
		try {
			sleep(1000);
		} catch (InterruptedException e) {e.printStackTrace();
		}
	}
		
}
