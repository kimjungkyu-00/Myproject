import java.io.*;
public class ExFileMain {
	
	public static void dir(File fd) {
		String[] fileName = fd.list();
		for(String str : fileName) {
			File file = new File(fd,str);
			long t = file.lastModified();
			System.out.print(str);
			System.out.print("\t ����ũ��"+file.length());
			System.out.printf("\t ������ �ð� :  %b %d %a %t"+t,t,t,t);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		//File Ŭ������ �̿��� ���� ����
		File fileWindows = new File("C:\\windows\\system.ini");
		File fileMy = new File("C:\\kimjunggyu");
		File fileTmp = new File("C:\\tmp");
		
		String res;
		
		if(fileWindows.isFile()) {
			res="file";
		}else {
			res="dir";
		}
		System.out.println(fileWindows.getPath()+": "+res);
		
		//���丮 ���� Ȯ��
		if(false == fileTmp.exists()) {
			// ���丮 �����ϱ�
			if(fileTmp.mkdirs()) {
				//���丮 ���� ����
				System.out.println("���丮 ���� ����");
			}
		}
		if(false==fileMy.isFile()) {
			res = "file";
		}else {
			res = "dir";
		}
		System.out.println(fileMy.getPath()+" : "+res);
		
		dir(fileMy);
	}
}
