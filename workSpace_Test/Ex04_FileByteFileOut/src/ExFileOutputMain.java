import java.io.*;

public class ExFileOutputMain {

	public static void main(String[] args) throws IOException{
		//file ����
		//file �������� FileOutputStream
		FileOutputStream file;
		try {
			//FileOutputStream �����ÿ� ������ ��ġ+���ϸ� ���
			file =new FileOutputStream("D:\\sss\\test.out");
			
			//file�� ���� ����
			int[] num= {1,4,-1,88,50};
			byte[] b = {7,51,3,4,1,24};
			
			for(int i=0; i<num.length ; ++i) {
				//���Ͽ� int(4byte) ���̳ʸ��� ������
				file.write(num[i]);
			}
			
			//byte�迭 ��ü ����
			file.write(b);
			
			
			//����Ϸ��ϱ�(�ڿ�����)
			file.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
