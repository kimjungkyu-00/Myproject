/*
 * 1:1 server

 * 
 * server����Ű���� �Է¹��� ����Ÿ�� client���� ����
 * 
 * pg ��� ����
 * client �����Ѵ�
 * server ---- ���� �޽��� -----> client
 * server <------client msg -------- client
 * server -----------server msg -------->client
 * ����޽��� ("quit")������ ���� --��ҹ��� ���� ���� �ʴ´�.
 */

import java.net.*;
import java.io.*;
import java.util.*;

public class Client {

	public static void main(String[] args) {
		Socket socket = null;
		BufferedReader input = null;
		BufferedWriter output = null;
		int port = 5000;
		Scanner scan = new Scanner(System.in);
		try {
					
		//1. ������ ���� ������ �����Ѵ�.
		String host = "localhost";
		socket = new Socket(host,port);
		System.out.println("wellcome IP Server");
		//2. ������ ���
		//2.1 ����� ���� input/outputStream ����
		input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		while(true) {
		//2.2(2.4) server ---- ���Ӹ޽��� ----> client
		String readMsg = scan.nextLine();
		System.out.println("readMsg : "+readMsg);
		
		//2.5 �Է¹��� ����Ÿ�� quit�̸� ����

		//2.3 server <------client msg -------- client
		//2.3.1 Ű����� ����Ÿ �Է¹ޱ�
		String sendMsg = scan.nextLine();
		System.out.println("sendMsg : "+sendMsg);
		
		//2.3.2 �Է¹��� ����Ÿ �����ϱ�
		output.write(sendMsg+"\n");
		output.flush();
		//2.3.3 ������ �޽����� quit�̸� ����
		if(sendMsg.equalsIgnoreCase("quit")) {
			break;
		}
		
	}
		
		//3 ���� ����
		socket.close();
		System.out.println("bye");
		}catch(IOException e) {
			e.getMessage();
		}finally {
			try {
				socket.close();
			}catch(IOException e) {
				e.getStackTrace();
			}
		}
	}

}
