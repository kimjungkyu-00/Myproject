
import java.io.*;
import java.net.*;

public class ExServer {

	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = null;
		Socket socket = null;
		InputStream input = null;
		OutputStream output = null;
		
		
		//1.���ϻ���
		int port= 6001;
		serverSocket = new ServerSocket(port);
		System.out.println("server start ["+port+"]");
		
		boolean run = true;
		while(run) {
			//2. Ŭ���̾�Ʈ ���� ����ٸ�
			// Ŭ���̾�Ʈ ���ӵǸ� ��Ĺ ����
			Socket clientSocket = serverSocket.accept();
			InetSocketAddress clientAddr = (InetSocketAddress)
					clientSocket.getRemoteSocketAddress();
			System.out.println("client ["+clientAddr.getAddress()+
					"] connect");
			
			//2. ��� (Ŭ���̾�Ʈ ���� thread�����Ͽ� ����)
			ServerClientControl client
					=new ServerClientControl(clientSocket);
			client.start();
					
			
			//4. ���� ���� �ݱ�
			serverSocket.close();
			
	}

	}
}

