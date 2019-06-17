import java.io.*;

public class FileReaderMain {

	public static void main(String[] args) throws IOException {
		try {
			//file �б����ؼ� - file�� fileReader ����(��ο����ϸ�)
			FileReader fileReader = new FileReader("C:\\kimjunggyu\\kimjjj.txt");
			
			int readInt;
			//FileReader�� ���Ͽ� ���� ���� �о����
			while(-1 != (readInt = fileReader.read()) ) {
				System.out.print((char)readInt);
			}
			//�����б��� ���ϴݱ�(�ڿ�����)
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
