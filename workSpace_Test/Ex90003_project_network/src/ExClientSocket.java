import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ExClientSocket extends Thread {
	String ip;
	int port;
	Socket socket;
	InputStream input;
	OutputStream output;
	
	public ExClientSocket(String ip, int port) {
		if( null != ip) {
			this.ip = ip;
			this.port = port;
		}
	}

	
	public void run() {
			//1.소켓을 만든다
			//접속한다		
			try {
				socket = new Socket(this.ip,this.port);
				
				//outputStream 생성
				output = socket.getOutputStream();
				//InputStream 생성
				input = socket.getInputStream();
				
				
				//2.데이타 통신
				//2.1 데이타 전송				
				//this.send();	
				Thread sendThread = new Thread(()->  {
					try {
						send();
					} catch (IOException e) {e.printStackTrace();
					}
				});
				sendThread.start();
				
				//this.recv();
				Thread recvThread = new Thread( ()-> {
					try {
						recv();
					} catch (IOException e) {e.printStackTrace();
					}
				});
				recvThread.start();
						
				
				//3.소켓을 닫는다
				try {
					sendThread.join();
					recvThread.join();
					output.close();//outputStream 닫기
					socket.close();
					System.out.println("client quit~~");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
	}
	
	void recv() throws IOException {
		//2.2 데이타 받기
		byte[] recvByteBuf = new byte[1024];
		int recvByte = 0;
		//데이타 받기
		recvByte =input.read(recvByteBuf);
		if( recvByte < 0) {
			recvByte =input.read(recvByteBuf);
		}
		if( recvByte > 0) {
			//받은데이타 변경(byte 배열 -> string )
			String recvMsg = 
					new String(recvByteBuf,0,recvByte,"UTF-8");
			if( null != recvMsg) {
				//받은데이타 출력
				System.out.println(recvByte +"byte : "+recvMsg);
			}
		}else {
			System.out.println("recvByte "+recvByte);
		}
	}
	
	void send() throws IOException {
		//전송할 메시지
		String sendMsg = "Hi Fish";
		//byte스트림을 사용하기 때문에 byte 배열로 변경
		byte[] byteBuf = sendMsg.getBytes("UTF-8");
		
		if( byteBuf != null ) {
			//서버에 데이타 보내기
			output.write(byteBuf);
			output.flush();
			System.out.println(" ["+this.ip+"] send ok");
		}else {
			System.err.println("byteBuf == null");
		}
			
		System.out.println("bye~");
	}

}
