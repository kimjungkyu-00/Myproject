
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
			//2.1 ����Ÿ �ޱ�
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
			
			//2.2 ����Ÿ ������
			Thread sendThread = new Thread(()-> {
				try {
					send(msg);
				} catch (IOException e) {e.printStackTrace();
				}	
			});
			sendThread.start();
						
			
			//3. ���� �ݱ�
			try {
				//�ΰ��� thread�� �����Ҷ����� ��ٸ�
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
		
		//����Ÿ ������
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
		//inputstream �ޱ�(����)
		//����Ÿ �ޱ�(byte�迭�� ����Ÿ ����)
		readByte = input.read(byteBuf);
		//����Ÿ�� �޾ƿ��� ���Ѱ�� �ٽ��ѹ� ����
		while( readByte < 0) {
			System.out.println("wait.");
			readByte = input.read(byteBuf);
		}
		//byte�迭�� String��ȯ
		recvMsg = new String(byteBuf,0,readByte,"UTF-8");
		//���� ����Ÿ ���
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
