/*
 * 
 */
import java.net.*;
import java.io.*;
public class ExServer {

	public static void main(String[] args) {
		//���� �����
		ServerSocket serverSocket=null; //������ ����
		Socket clientSocket=null; //Ŭ���̾�Ʈ�� ����
		BufferedReader input =null; //Ŭ���̾�Ʈ�� ������ �ޱ� ���� ��Ʈ��
		int port = 5001; // ���� ��Ʈ
		
		try {
			//1. serverSocket ����� (�ڽ��� �����ΰ�� ip ���� �ʿ����)
			 serverSocket = new ServerSocket(port);
			
			//2. client ������ ��ٸ���.
			// ������ �Ǹ� client�� socket�� �����
			 clientSocket = serverSocket.accept();
			System.out.println("client ����");
			
			//2. server <------ msg ------- client
			//2.1����Ÿ�� �ޱ� ���� inputStream ����
			InputStreamReader in =new InputStreamReader( clientSocket.getInputStream()) ;
			 input = new BufferedReader(in);
			
			//2.2 client ���� ����Ÿ �ޱ�
			String recvMsg = input.readLine();
			
			//2.3 ���� ����Ÿ Ȯ��
			System.out.println("client msg" +recvMsg);
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			//3 client ������ �޴´�
			try{
				clientSocket.close();
			
			System.out.println("client ����");
			
			//4 ��������
			serverSocket.close();
			System.out.println("server ����");
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
