import java.io.*;

public class TextCopy {

	public static void main(String[] args) {
		File src = new File("c:\\windows\\system.ini"); // 소스파일
		File dst = new File("c:\\tmp\\system.txt"); // 목적파일
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
			System.out.println("파일 복사 오류");
			e.printStackTrace();
		}
		
	}

}
