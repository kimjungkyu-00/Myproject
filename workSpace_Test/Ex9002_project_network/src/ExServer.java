import java.io.*;
import java.net.*;

 class ExServer extends Thread {
	ServerSocket serverSocket;
	Socket socket;
	private DataInputStream reader;
	private DataOutputStream writer;
	
	
	void ExSerer(Socket socket){
		this.socket=socket;
	}
	
	public void run() {
		try {
		String msg = null;
			reader = new DataInputStream(socket.getInputStream());
			writer = new DataOutputStream(socket.getOutputStream());
		
		while(true) {
			if(msg.equals("OK")) {
				
				writer.writeInt(3);
				
				writer.flush();
			}
		}
		}catch(Exception e){
			
		}finally { // Ŭ���̾�Ʈ�� �����̲�������ó��
			
			try {
				if(serverSocket != null) {
					serverSocket.close();
				
				System.out.println("Ŭ���̾�Ʈ close");
				}
				
			}catch(Exception e) {
				
			}
		}
	}
}
