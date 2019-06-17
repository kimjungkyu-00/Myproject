
import java.io.*;
import java.net.*;

public class ClientMain extends Thread{
	Socket clientSocket ;
	InputStream input;
	OutputStream output;
	InetSocketAddress clientAddr;
	String msg =null ;
	
	public ClientMain(Socket socket) throws IOException {
		if( null != socket ) {
			this.clientSocket = socket;
			input  = socket.getInputStream();
			output = socket.getOutputStream();
			clientAddr = (InetSocketAddress)
					socket.getRemoteSocketAddress();
		}
	}
	
	
	@Override 
	public void run() {		
		
		try {			
			//2.1 데이타 받기
			//= this.recv();	
			Thread recvThread = new Thread(()->  {
				try {
					msg = recv();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			recvThread.start();
			
			//2.2 데이타 보내기
			Thread sendThread = new Thread(()-> {
				try {
					send(msg);
				} catch (IOException e) {e.printStackTrace();
				}	
			});
			sendThread.start();
						
			
			//3. 소켓 닫기
			try {
				//두개의 thread가 종료할때까지 기다림
				recvThread.join(); 
				sendThread.join();
				clientSocket.close();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public synchronized void send(String recvMsg) throws IOException {
		if( msg == null ) {
			try {
				wait();
			} catch (InterruptedException e) {e.printStackTrace();
			}
		}
		
		//데이타 보내기
		byte[] sendByteBuf = msg.getBytes("UTF-8");		
		output.write(sendByteBuf);
		output.flush();
		System.out.println("["+clientAddr.getAddress()
		                         +"]send ---ok");
		msg = null;
		notify();
	
	}	
	
	public synchronized String recv() throws IOException {
		int readByte = 0;
		byte[] byteBuf = new byte[1024]  ;
		String recvMsg =null;
		//inputstream 받기(생성)
		//데이타 받기(byte배열에 데이타 저장)
		readByte = input.read(byteBuf);
		//데이타를 받아오지 못한경우 다시한번 받음
		while( readByte < 0) {
			System.out.println("wait.");
			readByte = input.read(byteBuf);
		}
		//byte배열을 String변환
		recvMsg = new String(byteBuf,0,readByte,"UTF-8");
		//받은 데이타 출력
		System.out.println(readByte+"byte : "+recvMsg);
		
		if( msg != null ) {
			try {
				wait();
			} catch (InterruptedException e) {e.printStackTrace();
			}
		}
		msg = recvMsg; 
		notify();
		
		return recvMsg;
	}
	

}
