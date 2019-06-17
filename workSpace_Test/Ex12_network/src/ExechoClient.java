

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
			// 1.������ ����� ������ �����Ѵ�
			socket = new Socket("localhost",port);
			System.out.println("server ���� port "+port);
			
			//2. server <------msg -----> client
			//2.1 server <------ msg ----->client
			//2.1.1 ����Ÿ ������ ���� outputStream ����
			OutputStreamWriter out = new OutputStreamWriter(socket.getOutputStream());
			output = new BufferedWriter(out);
			
			//2.1.2 ����Ÿ �����ϱ�
			output.write("server hi\n");
			output.flush();
			System.out.println("data ����");
			
			//2.2 server ---- msg ---> client
			//2.2.1 ����Ÿ �ޱ� ���ؼ� InputStream����
			InputStreamReader in = new InputStreamReader(socket.getInputStream());
			input = new BufferedReader(in);
			
			//2.2.2 ����Ÿ �ޱ�
			String servMsg = input.readLine();
			System.out.println("server msg : "+servMsg);
			
			//3.3 ���� �ݱ�
			socket.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
