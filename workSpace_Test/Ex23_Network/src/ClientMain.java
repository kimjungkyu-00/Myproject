import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain extends Thread{
	String ip;
	int port;
	Socket socket;
	InputStream input;
	OutputStream output;
	
		
		public ClientMain(String ip,int port) {
			if(null != ip) {
				this.ip=ip;
				this.port=port;
			}
		}
		
		public void run() {
			Socket socket = null;
			InputStream input = null;
			OutputStream output = null;
			
			//1. ������ �����
			//�����Ѵ�
			String serverIP = "localhost";
			int port = 6001;
			socket = new Socket(serverIP,port);
			
			//2. ����Ÿ ���
			//2.1 ����Ÿ ����
			//outputStream ����
			output = socket.getOutputStream();
			//������ �޽�
			String sendMsg = "�ȳ� ����"+i;
			//byte��Ʈ���� ����ϱ� ������ byte �迭�� ����
			byte[] byteBuf = sendMsg.getBytes("UTF-8");
			//������ ����Ÿ ������
			output.write(byteBuf);
			output.flush();
			System.out.println("["+serverIP+"] send ok");
			
			//2.2 ����Ÿ �ޱ�
			//InputStream ����
			input = socket.getInputStream();
			
			byte[] recvByteBuf = new byte[1024];
			int recvByte=0;
			//����Ÿ �ޱ�
			recvByte = input.read(recvByteBuf);
			//���� ����Ÿ ���� (byte �迭 -> string)
			String recvMsg=
					new String(recvByteBuf,0,recvByte,"UTF-8");
			//��������Ÿ ���
			System.out.println(recvByte + "byte: "+recvMsg);
			
			//3. ������ �ݴ´�
			output.close(); // outputStream �ݱ�
			socket.close();
			
			
			
		
		}
		
	}

}
