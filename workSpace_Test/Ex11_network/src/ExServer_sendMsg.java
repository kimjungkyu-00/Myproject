/*
 * server ----- msg ----->client
 */

import java.net.*;
import java.io.*;

public class ExServer_sendMsg {

	public static void main(String[] args) {
		ServerSocket serverSocket = null; // 서버용 소켓 
		Socket clientSocket		  = null; // client용 소켓
		BufferedWriter output	  = null; 
		int port = 5000;
		
		//1. 서버 소켓을 만든다
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("server "+port+"ok");
			
			// 서버:클라이언트 (1:1)
			//서버는 종료하지 않고 계속 client 처리해줌
			while(true) {
				
				//2 클라이언트 접속을 기다림
				clientSocket = serverSocket.accept();
				System.out.println("client 접속 성공");
				
				//3. server---- msg ----->client
				//3.1 데이타를 보내기 위한 outputStream 생성
				OutputStreamWriter out = 
						new OutputStreamWriter(clientSocket.getOutputStream());
				output = new BufferedWriter(out);
				
				
				//3.2 데이타를 전송
				output.write("server hello");
				output.flush();
				
				//4. client 종료
				clientSocket.close();
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
