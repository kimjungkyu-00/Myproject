import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ExClient extends Thread {
	
	Socket clientSocket=null;
	Socket socket=null;
	BufferedReader input=null;
	BufferedWriter output= null;
	Scanner scan = new Scanner(System.in);
	
	public ExClient(Socket socket ) throws IOException{
	
		
		System.out.println("Hi~");
	
		
	
	try {
		//1.server IP, port�� ������ Socket�� ������ server����
		int port = 6000;
		String serverIP= "localhost";
		socket = new Socket(serverIP,port);
		System.out.println("server connet");
	
		//2.server ���
		//2.1 input / outStrean ����
		InputStreamReader in =new InputStreamReader(socket.getInputStream());
		OutputStreamWriter out = new OutputStreamWriter(socket.getOutputStream());
		
		
		
		while(true) {
		// 2.2 �Է��� ���ڸ� ������
		//2.2.1 ���ڸ� �Է¹޴´�.
		System.out.println("input Msg");
		String sendMsg = scan.nextLine();
		
		//2.2.2 �Է¹��� ���ڸ� ������ ������
		output.write(sendMsg+"\n");
		output.flush();
		
		//2.3 quit Ȯ��
		if(sendMsg.equals("quit")) {
			break;
		}
		//2.4 ����Ÿ �ޱ�
		String recvMsg =input.readLine();
		System.out.println("[client]server msg : "+recvMsg);
	}
		//3.socket ����
		socket.close();
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
	}
	}