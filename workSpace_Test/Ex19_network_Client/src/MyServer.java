import java.io.*;
import java.net.*;


public class MyServer extends Thread{

	private ServerSocket serverSocket;
	int port;
	
	public MyServer(int port) {
		this.port=port;
	}

	@Override
	public void run() {
		Socket clientSocket=null;
		
		//1. ServerSocket ����
		try {
			serverSocket = new ServerSocket();
		while(true) {
			//2.client ��ٸ� ���ӽ� client�� socket ����
			clientSocket = serverSocket.accept();
			if(clientSocket == null) {
				System.out.println("clientSocket == null");
				continue;
			}
		//client���� ��� �ϵ��� thread����(thread�� ���Ͽ� 1:n��� ����)
		  //3. client�� ���				
		 //4. client ��� ����
			
			
		
		//5. server ����
		//serverSocket.close();
		
		
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}



}