import java.io.*;
import java.net.*;

public class ServerClientControl extends Thread{
	Socket clientSocket;
	InputStream input;
	OutputStream output;
	InetSocketAddress clientAddr;
	String msg = null;
	
	public ServerClientControl(Socket socket) throws IOException {
		if(null !=socket ) {
			this.clientSocket=socket;
			input = socket.getInputStream();
			output = socket.getOutputStream();
			clientAddr = (InetSocketAddress)
					socket.getRemoteSocketAddress();
		}
	}
	
	@Override
	public void run() {
		//2.1 데이타 받기		
		try {
			//2.1 데이타 받기
	
			Thread recvThread = new Thread(()->  {
				try {
					msg = recv();
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
			//2.2데이타 보내기
			Thread sendThread = new Thread(() -> {
				try {
					this.send(msg);
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
			
			//3. 소켓닫기
			try {
				//두개의 thread가 종료될떄까지 기다리.ㅁ
				recvThread.join();
				sendThread.join();
				clientSocket.close();			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void send(String recvMsg)throws IOException{
		//데이타 보내기
		byte[] sendByteBuf = recvMsg.getBytes("UTF-8");
		output.write(sendByteBuf);
		output.flush();
		System.out.println("["+clientAddr.getAddress()
							+"]send ---ok");
	}
	
	public String recv() throws IOException{
		int readByte = 0;
		byte[] byteBuf = new byte[1024];
		String recvMsg=null;
		//inputstream 받기(생성)
		//데이타 받기(byte배열에 데이타 저장)
		readByte = input.read(byteBuf);
		//byte배열을 String변환
		recvMsg = new String(byteBuf,0,readByte,"UTF-8");
		//받은 데이타 출력
		System.out.println(readByte+"byte : "+recvMsg);
		return recvMsg;
	}
		
		
	
}


	
	

