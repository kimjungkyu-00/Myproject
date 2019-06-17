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
		//1.server IP, port를 가지고 Socket을 만든후 server접속
		int port = 6000;
		String serverIP= "localhost";
		socket = new Socket(serverIP,port);
		System.out.println("server connet");
	
		//2.server 통신
		//2.1 input / outStrean 생성
		InputStreamReader in =new InputStreamReader(socket.getInputStream());
		OutputStreamWriter out = new OutputStreamWriter(socket.getOutputStream());
		
		
		
		while(true) {
		// 2.2 입력한 문자를 보낸다
		//2.2.1 문자르 입력받는다.
		System.out.println("input Msg");
		String sendMsg = scan.nextLine();
		
		//2.2.2 입력받은 문자를 서버에 보낸다
		output.write(sendMsg+"\n");
		output.flush();
		
		//2.3 quit 확인
		if(sendMsg.equals("quit")) {
			break;
		}
		//2.4 데이타 받기
		String recvMsg =input.readLine();
		System.out.println("[client]server msg : "+recvMsg);
	}
		//3.socket 종료
		socket.close();
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
	}
	}