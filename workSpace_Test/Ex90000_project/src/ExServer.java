import java.io.*;
import java.net.*;
import java.util.*;

public class ExServer extends Thread{

		Scanner scan=new Scanner(System.in);
		ServerSocket serverSocket = null;
		BufferedReader input = null;
		BufferedWriter output = null;
		int port=6000;
		public ExServer(int port) {
			this.port=port;
	}
		
	@Override
	public void run() {	
		Socket clientSocket = null;
		//1 ���� ������ �����
		System.out.println("start Server Hi");
		try {
			serverSocket =new ServerSocket(this.port);
			System.out.println("localhost"+port+"ok");
		//2.client ������ ��ٸ� client���ӽ� client �� Socket ����
			clientSocket = serverSocket.accept();
			input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			output = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
		//3. client <-----msg ------>server
			String recvMsg = input.readLine();
			System.out.println("recvMsg"+recvMsg);
		//3.1 client --------msg ------->server
			output.write(recvMsg+"\n");
			output.flush();		
		
		//4. client  ���� ����
			clientSocket.close();
			
		} catch (Exception e) {	e.printStackTrace();	}
		
		
	}
	}


