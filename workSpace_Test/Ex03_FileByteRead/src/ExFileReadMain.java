import java.io.FileInputStream;
import java.io.IOException;

public class ExFileReadMain {

	public static void main(String[] args) {
		//������ �о �����ֱ�
		//File�� �б����� FileInputStream ����
		FileInputStream inFile = null;
		try {
			//���� ������ ���+���ϸ��� �־ ������
			inFile = new FileInputStream("C:\\Program Files");
			int c;
			//���� �� (-1)�϶����� �о�´� (1byte�� �о��)
			while(-1 != (c= inFile.read() )) {
				//���� ������ �����ֱ�
				System.out.print((char)c);				
			}
			//���� �ݱ�(�ڿ�����)
			inFile.close();
		}catch (IOException e) {
			System.out.print(e.getMessage());
		}
	}

}
