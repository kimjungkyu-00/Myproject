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
			
		}finally { // 클라이언트랑 접속이끊겼을떄처리
			
			try {
				if(serverSocket != null) {
					serverSocket.close();
				
				System.out.println("클라이언트 close");
				}
				
			}catch(Exception e) {
				
			}
		}
	}
}
