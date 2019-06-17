/*
 * UDP 통신
 */
import java.io.*;
import java.net.*;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class ExReceiveMain {

	public static void main(String[] args) throws Exception{
		// datagram
		
		int port = 5000;
		//1. udp 소켓을 만든다
		DatagramSocket dataSocket = new DatagramSocket(port);
		
		//2. udp 데이타를 받기위한 패키지 생성
		DatagramPacket packet = new DatagramPacket(new byte[100],100);
		
		System.out.println("data packet wait...");
		//3. 데이타 받기
		dataSocket.receive(packet);
		
		String recvMsg = new String(packet.getData()
									,0,packet.getLength(),"UTF-8");
		System.out.println("recvMsg "+recvMsg);
		
		//4. 소켓닫기
		dataSocket.close();
		
		
		
	}

}
