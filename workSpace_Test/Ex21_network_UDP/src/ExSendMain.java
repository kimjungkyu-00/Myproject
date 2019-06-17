/*
 * udp send
 */
import java.io.*;
import java.net.*;

public class ExSendMain {
	
	public static void main(String[] args) throws Exception{
		//udp datagram ����
		//1.���ϻ���(udp -> DatagramSocket ����)
		int port = 5000;
		DatagramSocket dataSocket = new DatagramSocket();
		
		//packet ����
		String sendMsg = "hi server";
		byte[] byteBuf = sendMsg.getBytes("UTF-8");
		
		//������ ���� Dataram ����
		DatagramPacket packet = new DatagramPacket(byteBuf,byteBuf.length,
								new InetSocketAddress("localhost",port));
		
		//data ����
		dataSocket.send(packet);
		
		System.out.println("send Ok");
		
		//datasocket �ݱ�
		dataSocket.close();
	}
	
}
