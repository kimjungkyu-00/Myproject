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
			
			//1. 소켓을 만든다
			//접속한다
			String serverIP = "localhost";
			int port = 6001;
			socket = new Socket(serverIP,port);
			
			//2. 데이타 통신
			//2.1 데이타 전송
			//outputStream 생성
			output = socket.getOutputStream();
			//전송할 메시
			String sendMsg = "안녕 서버"+i;
			//byte스트림을 사용하기 때문에 byte 배열로 변경
			byte[] byteBuf = sendMsg.getBytes("UTF-8");
			//서버에 데이타 보내기
			output.write(byteBuf);
			output.flush();
			System.out.println("["+serverIP+"] send ok");
			
			//2.2 데이타 받기
			//InputStream 생성
			input = socket.getInputStream();
			
			byte[] recvByteBuf = new byte[1024];
			int recvByte=0;
			//데이타 받기
			recvByte = input.read(recvByteBuf);
			//받은 데이타 변경 (byte 배열 -> string)
			String recvMsg=
					new String(recvByteBuf,0,recvByte,"UTF-8");
			//받은데이타 출력
			System.out.println(recvByte + "byte: "+recvMsg);
			
			//3. 소켓을 닫는다
			output.close(); // outputStream 닫기
			socket.close();
			
			
			
		
		}
		
	}

}
