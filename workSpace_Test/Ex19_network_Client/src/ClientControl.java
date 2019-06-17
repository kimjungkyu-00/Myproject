
import java.io.*;
import java.net.*;

public class ClientControl extends Thread{

	private Socket clientSocket;
	private BufferedReader input;
	private BufferedWriter output;
	private InetSocketAddress addr;
	
	public ClientControl(Socket socket) throws IOException{
		if( socket != null) {
			clientSocket= socket;
			input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()) );
			output = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
			
			addr= (InetSocketAddress)(clientSocket.getRemoteSocketAddress());
			
		
		
		}
	}
	//데이타 통신

	//데이타 받기
	// 1바이트 이상 데이타 받을때까지 기다린다.
	
	//데이타 보내기

	// 무한반복으로 실행안됨.

	
	
	
	
	
	
	
}
