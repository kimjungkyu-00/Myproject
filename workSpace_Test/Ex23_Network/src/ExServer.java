
import java.io.*;
import java.net.*;

public class ExServer {

	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = null;
		Socket socket = null;
		InputStream input = null;
		OutputStream output = null;
		
		
		//1.소켓생성
		int port= 6001;
		serverSocket = new ServerSocket(port);
		System.out.println("server start ["+port+"]");
		
		boolean run = true;
		while(run) {
			//2. 클라이언트 접속 ㅈ기다림
			// 클라이언트 접속되면 소캣 생성
			Socket clientSocket = serverSocket.accept();
			InetSocketAddress clientAddr = (InetSocketAddress)
					clientSocket.getRemoteSocketAddress();
			System.out.println("client ["+clientAddr.getAddress()+
					"] connect");
			
			//2. 통신 (클라이언트 별로 thread생성하여 동작)
			ServerClientControl client
					=new ServerClientControl(clientSocket);
			client.start();
					
			
			//4. 서버 소켓 닫기
			serverSocket.close();
			
	}

	}
}

