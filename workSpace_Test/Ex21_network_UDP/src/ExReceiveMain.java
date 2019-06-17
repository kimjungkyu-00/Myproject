/*
 * UDP ���
 */
import java.io.*;
import java.net.*;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class ExReceiveMain {

	public static void main(String[] args) throws Exception{
		// datagram
		
		int port = 5000;
		//1. udp ������ �����
		DatagramSocket dataSocket = new DatagramSocket(port);
		
		//2. udp ����Ÿ�� �ޱ����� ��Ű�� ����
		DatagramPacket packet = new DatagramPacket(new byte[100],100);
		
		System.out.println("data packet wait...");
		//3. ����Ÿ �ޱ�
		dataSocket.receive(packet);
		
		String recvMsg = new String(packet.getData()
									,0,packet.getLength(),"UTF-8");
		System.out.println("recvMsg "+recvMsg);
		
		//4. ���ϴݱ�
		dataSocket.close();
		
		
		
	}

}
