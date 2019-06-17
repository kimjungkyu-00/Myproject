import java.io.*;
import java.net.*;

public class MyUDPSend extends Thread{
	
	@Override
	public void run() {
		//1. UDP�� Socket ���� (datagramSocket)
		try {
			DatagramSocket dataSocket = new DatagramSocket();
			//2. packet�� ���� ����Ÿ ����
			for(int i =1; i<6; ++i) {
				//������ ����Ÿ �ۼ�
				String sendMsg = "�ѱ� ����"+i;
				//������ ����Ÿ�� ����Ʈ �迭�� ����
				//(string -> byte �迭�� ����)
				byte[] byteBuf = sendMsg.getBytes("UTF-8");
				//datagrampacket ����
				//������ ip,port
				String ip= "localhost";
				int port =5002;
				//udp�̹Ƿ� ������ packet�� ip./port �ݵ�� �־��ش�
				DatagramPacket packet = new DatagramPacket(
					byteBuf,byteBuf.length,
					new InetSocketAddress(ip,port));
				
				//����Ÿ ����
				dataSocket.send(packet);
				System.out.println(ip+" "+port + "send ok"+i);
			}
			//���ϴݱ�
			dataSocket.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
				
	}
}
