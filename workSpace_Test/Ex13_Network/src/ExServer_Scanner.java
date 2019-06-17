/*
 * Server
 * 
 * client에서 quit메시지를 받으면 종료
 */
import java.net.*;
import java.io.*;


public class ExServer_Scanner {
	final static String endMsg = "quit";
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket clientSocket = null;
		BufferedReader input = null;
		BufferedWriter output = null;
		boolean run = true;
		try{
			//1. ServerSocket을 만든다(port)
			System.out.println("Server program");
			int port= 6000;
			serverSocket = new ServerSocket(port);
			System.out.println("Server"+port+"start");
			
			//2. client용 Socket을 생성(client 접속을 기다림 접속이 되면Socket생성)
			clientSocket = serverSocket.accept();
			//접속한 client 정보 출력
			InetSocketAddress socketAddr = 
					(InetSocketAddress)clientSocket.getRemoteSocketAddress();
			System.out.println("client connect : "+socketAddr);
			
			// 3.client 통신
			//client에서 quit 메시지를 받으면 종료
			//3.1통신을 위한 Input / OutputStream을 생성
			InputStreamReader in = new InputStreamReader(clientSocket.getInputStream());
			input = new BufferedReader(in);
			OutputStreamWriter out = new OutputStreamWriter(clientSocket.getOutputStream());
			output = new BufferedWriter(out);
			
			
			while(run) {
				//3.2 데이타 받기
				String recvMsg = input.readLine();
				System.out.println("chlient msh >>"+recvMsg);
				//3.2.1 client가 "quit보내면 종료				
				if(endMsg.equals(recvMsg)) {
					run = false;
					break;
				}
				
				//3.3 데이타 보내기
				output.write("server send :"+ recvMsg);
				output.flush();
				
			}
			
			//client 종료
			clientSocket.close();
			System.out.println("clientSocket close");
			//server 종료
			serverSocket.close();
			System.out.println("serverSocket close");
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			//client 종료
			try {
				clientSocket.close();
				//server 종료
				serverSocket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}	
	}
}
