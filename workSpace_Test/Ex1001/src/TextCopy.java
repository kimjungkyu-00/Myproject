import java.io.*;

public class TextCopy {

	public static void main(String[] args) {
		File src = new File("c:\\windows\\system.ini"); // �ҽ�����
		File dst = new File("c:\\tmp\\system.txt"); // ��������
		FileReader fr = null;
		FileWriter fw= null;
		BufferedReader in = null;
		BufferedWriter out = null;
		int c;
		
		try {
			fr= new FileReader(src);
			fw= new FileWriter(dst);
			in= new BufferedReader(fr);
			out= new BufferedWriter(fw);
		} catch (IOException e) {
			System.out.println("���� ���� ����");
			e.printStackTrace();
		}
		
	}

}
