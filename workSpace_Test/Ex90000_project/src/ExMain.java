
public class ExMain {
	
	public static void main(String[] args) {
		ExServer server=new ExServer(6000);
		
		server.start();
		System.out.println("Hi Server");
		try {
			server.join();
		} catch (Exception e) {			
			e.printStackTrace();
		}
		System.out.println("server stop");

	
	
	
	
	}
	
}
