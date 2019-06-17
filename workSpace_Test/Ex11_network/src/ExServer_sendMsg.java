/*
 * server ----- msg ----->client
 */

import java.net.*;
import java.io.*;

public class ExServer_sendMsg {

	public static void main(String[] args) {
		ServerSocket serverSocket = null; // ������ ���� 
		Socket clientSocket		  = null; // client�� ����
		BufferedWriter output	  = null; 
		int port = 5000;
		
		//1. ���� ������ �����
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("server "+port+"ok");
			
			// ����:Ŭ���̾�Ʈ (1:1)
			//������ �������� �ʰ� ��� client ó������
			while(true) {
				
				//2 Ŭ���̾�Ʈ ������ ��ٸ�
				clientSocket = serverSocket.accept();
				System.out.println("client ���� ����");
				
				//3. server---- msg ----->client
				//3.1 ����Ÿ�� ������ ���� outputStream ����
				OutputStreamWriter out = 
						new OutputStreamWriter(clientSocket.getOutputStream());
				output = new BufferedWriter(out);
				
				
				//3.2 ����Ÿ�� ����
				output.write("server hello");
				output.flush();
				
				//4. client ����
				clientSocket.close();
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
