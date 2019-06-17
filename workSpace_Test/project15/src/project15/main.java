package project15;

public class main {
	public static void main(String[] args) {
		Unit[] u = new Unit[1];
		Battle c = new Battle();
		u[0] = new Unit("기사",3000,100);
//		u[1] = new Unit("악당",2000);
		
		
		c.Knight(u);
	}
}
