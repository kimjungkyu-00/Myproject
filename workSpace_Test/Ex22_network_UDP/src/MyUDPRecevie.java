
import java.io.*;
import java.net.*;

public class MyUDPRecevie extends Thread {
	
	@Override
	public void run() {
		//1. udp용 socket생성
		int port= 5002;
		try {
			DatagramSocket dataSocket = new DatagramSocket(port);
			
			//2.data받기
			boolean run = true;
			while(run){
				//데이타를 받기 위헤서 저장공간 생성
				byte[] byteBuf = new byte[1024];
				//데이타를 받기 위한 datagrampacket 생성
				DatagramPacket packet = new DatagramPacket(byteBuf,byteBuf.length);
				
				//데이타 받기
				dataSocket.receive(packet);
				
				//받은데이타 출력
				//packet받은 데이타를 문자열 변환
				String recvMsg = new String( packet.getData(),0,packet.getLength(),"UTF-8");
				
				// 화면 출력
				System.out.println("recv Msg : " +recvMsg);
			}
			
			//3.소켓 닫기
			dataSocket.close();
						
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
