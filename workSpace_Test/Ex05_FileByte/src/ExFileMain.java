import java.io.*;
public class ExFileMain {

	final static String FILE_NAME = "C:\\Windows\\system.ini";
	
	public static void main(String[] args) throws IOException {
		//file�� �о �����ϱ�.
		
		//���� �б� -FileInputStream ����
		FileInputStream readFile;
		
		//filewrite -FileOutputStram ����
		FileOutputStream writeFile;
		try {
			readFile = new FileInputStream(FILE_NAME);
			//������ ��ġ�� ���ϸ��� �־ ����
			
			writeFile = new FileOutputStream("C:\\Users\\������\\Desktop");
			
			//�����б� - ������ readFile�� ������ �о�´�.
			int readInt;
			
			while(-1 != (readInt=readFile.read()) ) {
				System.out.print((char)readInt);
				//filewrite - ���� ���� ������ ����.
				writeFile.write(readInt);
			}
			
			//���� �б� - ������ ������ �ݱ� �ڿ�����
			readFile.close();
			//filewrite - �����Ŀ� ���� �ݱ�
			writeFile.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
