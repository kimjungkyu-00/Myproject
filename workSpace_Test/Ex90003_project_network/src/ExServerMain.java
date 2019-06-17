import java.io.IOException;

public class ExServerMain {
	public static void main(String[] args) {
		try {
			ExServerSocket server = new ExServerSocket(6000);
			server.start();
			
		} catch (IOException e) {e.printStackTrace();}
	}
}
