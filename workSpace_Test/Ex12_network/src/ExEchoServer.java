/*
 * Echo Server
 * client가 보낸 메세지를 
 */
import java.net.*;
import java.io.*;

public class ExEchoServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket clientSocket = null;
		BufferedReader input = null;
		BufferedWriter output = null;
		int port = 5001;
		
		try {
			System.out.println("Echo server start");
			//1 서버 소켓을 만든다
			serverSocket = new ServerSocket(port);
			System.out.println("server" + port +"ok");
			
			while(true) {
			//2.client 접속을 기다림 client접속시 client 용 Socket 생성
			clientSocket = serverSocket.accept();
			System.out.println("client accept() ok ");
			
			//3. client <-----msg ------>server
			//3.1 client --------msg ------->server
			//3.1.1 inputStream생성
			InputStreamReader in =
					new InputStreamReader(clientSocket.getInputStream());
			input = new BufferedReader(in);
			
			//3.1.2 msg받기
			String recvMsg= input.readLine();
			System.out.println("client msg" +recvMsg);
			
			//3.2 client <----- msg ---- server
			//3.2.1 outputStream 생성
			OutputStreamWriter out =
					new OutputStreamWriter(clientSocket.getOutputStream());
			output = new BufferedWriter(out);
			
			//3.2.2  msg보내기
			output.write(recvMsg+"\n");
			output.flush();
			
			//4. client  접속 종료
			clientSocket.close();
			System.out.println("clientSocket close");
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				clientSocket.close();
				serverSocket.close();
			}catch(IOException e) { e.printStackTrace();
			}
		}
	}

}
