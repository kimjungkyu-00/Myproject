/*
 * 1:1 server

 * 
 * server에서키보드 입력받은 데이타를 client에게 전송
 * 
 * pg 통신 순서
 * client 접속한다
 * server ---- 접속 메시지 -----> client
 * server <------client msg -------- client
 * server -----------server msg -------->client
 * 종료메시지 ("quit")받으면 종료 --대소문자 구분 하지 않는다.
 */
import java.net.*;
import java.io.*;
import java.util.*;



public class ExServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket clientSocket = null;
		BufferedReader input = null;
		BufferedWriter output = null;
		//1. 공개용 소켓 만들기 (ServerSocket 생성)
		
		
		//2. client 접속을 기다림 , client접속이 되면 client접속이 되면 client용 Socket을 만든다
		
		
		//3. server <------- msg ----------> client 통신
				//3.0 통신 위한 Input/OutputStream
		
		//3.1 데이타 보내기 server <----msg ----- client
		
		
		//3.2데이타 받기 server <<------msg -----client
		
		//3.2 종료문자를 받으면 종료한다
		
		//3.3. 키보드를 통하여 데이타 전송
		//3.3.1 키보드로 입력받기
		
		//3.3.2 데이타 전송(server -----> client)

		//3.4 종료 메시지 입력인지 확인
		
		//4. client 접속 종료
		
		//5. server 종료
		

	}

}
