import java.io.*;
import java.net.*;

public class MyUDPSend extends Thread{
	
	@Override
	public void run() {
		//1. UDP용 Socket 생성 (datagramSocket)
		try {
			DatagramSocket dataSocket = new DatagramSocket();
			//2. packet을 만들어서 데이타 전송
			for(int i =1; i<6; ++i) {
				//전송할 데이타 작성
				String sendMsg = "한글 정송"+i;
				//전송할 데이타를 바이트 배열로 변경
				//(string -> byte 배열로 변경)
				byte[] byteBuf = sendMsg.getBytes("UTF-8");
				//datagrampacket 생성
				//전송할 ip,port
				String ip= "localhost";
				int port =5002;
				//udp이므로 전송할 packet에 ip./port 반드시 넣어준다
				DatagramPacket packet = new DatagramPacket(
					byteBuf,byteBuf.length,
					new InetSocketAddress(ip,port));
				
				//데이타 전송
				dataSocket.send(packet);
				System.out.println(ip+" "+port + "send ok"+i);
			}
			//소켓닫기
			dataSocket.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
				
	}
}
