import java.io.*;
import java.net.*;

public class MyServer extends Thread {
	
	private ServerSocket serverSocket;
	
	public MyServer(int port) throws IOException{
		//1.공개용 소켓을 만든다
		serverSocket= new ServerSocket(port);
		System.out.println("server hi"+serverSocket.getInetAddress()
							+ ": " + port + "start");
	}
	
	public void run() {
		Socket clientSocket = null;
		
		
		try {
			
			while(true) {
				//2.클라이언트 접속을 기다림 
				//2.1 클라이언트 접속시에 클라이언트용 소켓을  리턴한다.
				clientSocket = serverSocket.accept();
				
				//2.2 클라이언트 정보 출력
				System.out.println("client["+clientSocket.getRemoteSocketAddress()+"] connect");
				
				//thread 생성 --- client 통신용
				MyServerClient client = new MyServerClient(clientSocket);
				client.start();
			
			}
			//5.서버종료
			//serverSocket.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
