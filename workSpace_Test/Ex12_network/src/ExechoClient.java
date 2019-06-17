

import java.net.*;
import java.io.*;

public class ExechoClient {

	public static void main(String[] args) {
		Socket socket = null;
		BufferedReader input = null;
		BufferedWriter output = null;
		
		System.out.println("echo client start");
		
		
		try {
			int port =5001;
			// 1.소켓을 만들고 서버에 접속한다
			socket = new Socket("localhost",port);
			System.out.println("server 접속 port "+port);
			
			//2. server <------msg -----> client
			//2.1 server <------ msg ----->client
			//2.1.1 데이타 전송을 위한 outputStream 생성
			OutputStreamWriter out = new OutputStreamWriter(socket.getOutputStream());
			output = new BufferedWriter(out);
			
			//2.1.2 데이타 전송하기
			output.write("server hi\n");
			output.flush();
			System.out.println("data 전송");
			
			//2.2 server ---- msg ---> client
			//2.2.1 데이타 받기 위해서 InputStream생성
			InputStreamReader in = new InputStreamReader(socket.getInputStream());
			input = new BufferedReader(in);
			
			//2.2.2 데이타 받기
			String servMsg = input.readLine();
			System.out.println("server msg : "+servMsg);
			
			//3.3 소켓 닫기
			socket.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
