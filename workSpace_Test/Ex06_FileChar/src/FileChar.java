import java.io.*;

public class FileChar {
	final static String FILE_NAME = "d:\\sss.hangul.txt";
		
	public static void main(String[] args) throws IOException {
		//file �б�
		
		try {
			FileInputStream inFile = new FileInputStream(FILE_NAME);
			/*�ѱ۷� �� ������ �ͱ� ���Ͽ� ���̳ʸ��� ���� �����͸� 
			 * ���� ���տ� �°� �о��ֱ� ���� InputstreamReader �̿�
			 */
			
			InputStreamReader in = new InputStreamReader(inFile,"MS949");
			
			System.out.println("���ڵ� ���� ���� : "+in.getEncoding());
			
			int readInt;
			
			while( -1 !=(readInt=in.read()) ) {
				System.out.println(readInt);
			}
			
			inFile.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
