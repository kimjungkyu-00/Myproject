
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
	//����Ÿ ���

	//����Ÿ �ޱ�
	// 1����Ʈ �̻� ����Ÿ ���������� ��ٸ���.
	
	//����Ÿ ������

	// ���ѹݺ����� ����ȵ�.

	
	
	
	
	
	
	
}
