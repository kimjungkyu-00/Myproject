/*
 * udp send
 */
import java.io.*;
import java.net.*;

public class ExSendMain {
	
	public static void main(String[] args) throws Exception{
		//udp datagram 积己
		//1.家南积己(udp -> DatagramSocket 积己)
		int port = 5000;
		DatagramSocket dataSocket = new DatagramSocket();
		
		//packet 傈价
		String sendMsg = "hi server";
		byte[] byteBuf = sendMsg.getBytes("UTF-8");
		
		//傈价阑 困茄 Dataram 积己
		DatagramPacket packet = new DatagramPacket(byteBuf,byteBuf.length,
								new InetSocketAddress("localhost",port));
		
		//data 傈价
		dataSocket.send(packet);
		
		System.out.println("send Ok");
		
		//datasocket 摧扁
		dataSocket.close();
	}
	
}
