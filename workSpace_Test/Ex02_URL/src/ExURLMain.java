import java.net.*;
import java.io.*;
////��������������������///////////����������/��
public class ExURLMain {

	public static void main(String[] args) {
		URL url;
		try {
			url = new URL("http://www.daum.com");
			
			
			// url�����ϱ�
			URLConnection uc = url.openConnection();
			
			
			//bufferedReader �ڿ���������
			BufferedReader in = 
					new BufferedReader(new InputStreamReader(
											uc.getInputStream()));
			String inputLine;
			//���� �о����
			while(null != (inputLine = in.readLine() )) {
				System.out.println(inputLine);
			}
			
			//BufferedReader �ݱ� (�ڿ�����)
			in.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}	
}
