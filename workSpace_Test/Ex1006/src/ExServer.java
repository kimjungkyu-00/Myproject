/*
 * 
 */
import java.net.*;
import java.io.*;
public class ExServer {

	public static void main(String[] args) {
		//서버 만들기
		ServerSocket serverSocket=null; //서버용 소켓
		Socket clientSocket=null; //클라이언트용 소켓
		BufferedReader input =null; //클라이언트에 데이터 받기 위한 스트림
		int port = 5001; // 서버 포트
		
		try {
			//1. serverSocket 만들기 (자신이 서버인경우 ip 지정 필요없음)
			 serverSocket = new ServerSocket(port);
			
			//2. client 접속을 기다린다.
			// 접속이 되면 client용 socket을 만든다
			 clientSocket = serverSocket.accept();
			System.out.println("client 접속");
			
			//2. server <------ msg ------- client
			//2.1데이타를 받기 위한 inputStream 생성
			InputStreamReader in =new InputStreamReader( clientSocket.getInputStream()) ;
			 input = new BufferedReader(in);
			
			//2.2 client 에서 데이타 받기
			String recvMsg = input.readLine();
			
			//2.3 받은 데이타 확인
			System.out.println("client msg" +recvMsg);
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			//3 client 소켓을 받는다
			try{
				clientSocket.close();
			
			System.out.println("client 종료");
			
			//4 서버종료
			serverSocket.close();
			System.out.println("server 종료");
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
