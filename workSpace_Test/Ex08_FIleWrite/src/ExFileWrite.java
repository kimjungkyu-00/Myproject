import java.io.*;

public class ExFileWrite {

	public static void main(String[] args) {
		//Ű���� �Է¹ޱ� (Ű���� �Է�:system.in)
		InputStreamReader keyboard = new InputStreamReader(System.in);
		
		try {
			FileWriter file = new FileWriter("C:\\kimjunggyu\\in.txt");
			
			int readInt;
			
			System.out.println("���Ͽ� ������ ������ �Է��ϼ���");
			// keyboard�� �Է¹޴´�.
			while( -1 != (readInt = keyboard.read())) {
				//keyboard�� �Է¹��� ����Ÿ�� ���Ͽ� ����
				file.write(readInt);
			}
			//�Է��� ������ Ű������� �ݱ�
			keyboard.close();
			file.close();
			System.out.println("exit~~~");
		} catch (IOException e) {
			System.out.println(e.getMessage());}
		
		
		
	}

}
