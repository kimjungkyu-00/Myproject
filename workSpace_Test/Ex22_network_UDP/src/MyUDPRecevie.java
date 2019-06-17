
import java.io.*;
import java.net.*;

public class MyUDPRecevie extends Thread {
	
	@Override
	public void run() {
		//1. udp�� socket����
		int port= 5002;
		try {
			DatagramSocket dataSocket = new DatagramSocket(port);
			
			//2.data�ޱ�
			boolean run = true;
			while(run){
				//����Ÿ�� �ޱ� ���켭 ������� ����
				byte[] byteBuf = new byte[1024];
				//����Ÿ�� �ޱ� ���� datagrampacket ����
				DatagramPacket packet = new DatagramPacket(byteBuf,byteBuf.length);
				
				//����Ÿ �ޱ�
				dataSocket.receive(packet);
				
				//��������Ÿ ���
				//packet���� ����Ÿ�� ���ڿ� ��ȯ
				String recvMsg = new String( packet.getData(),0,packet.getLength(),"UTF-8");
				
				// ȭ�� ���
				System.out.println("recv Msg : " +recvMsg);
			}
			
			//3.���� �ݱ�
			dataSocket.close();
						
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
