/*
 * 1:1 server

 * 
 * server����Ű���� �Է¹��� ����Ÿ�� client���� ����
 * 
 * pg ��� ����
 * client �����Ѵ�
 * server ---- ���� �޽��� -----> client
 * server <------client msg -------- client
 * server -----------server msg -------->client
 * ����޽��� ("quit")������ ���� --��ҹ��� ���� ���� �ʴ´�.
 */
import java.net.*;
import java.io.*;
import java.util.*;



public class ExServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket clientSocket = null;
		BufferedReader input = null;
		BufferedWriter output = null;
		//1. ������ ���� ����� (ServerSocket ����)
		
		
		//2. client ������ ��ٸ� , client������ �Ǹ� client������ �Ǹ� client�� Socket�� �����
		
		
		//3. server <------- msg ----------> client ���
				//3.0 ��� ���� Input/OutputStream
		
		//3.1 ����Ÿ ������ server <----msg ----- client
		
		
		//3.2����Ÿ �ޱ� server <<------msg -----client
		
		//3.2 ���Ṯ�ڸ� ������ �����Ѵ�
		
		//3.3. Ű���带 ���Ͽ� ����Ÿ ����
		//3.3.1 Ű����� �Է¹ޱ�
		
		//3.3.2 ����Ÿ ����(server -----> client)

		//3.4 ���� �޽��� �Է����� Ȯ��
		
		//4. client ���� ����
		
		//5. server ����
		

	}

}
