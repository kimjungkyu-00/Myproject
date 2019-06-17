import java.io.*;

public class FileReaderMain {

	public static void main(String[] args) throws IOException {
		try {
			//file 읽기위해서 - file용 fileReader 생성(경로와파일명)
			FileReader fileReader = new FileReader("C:\\kimjunggyu\\kimjjj.txt");
			
			int readInt;
			//FileReader를 통하여 파일 내용 읽어오기
			while(-1 != (readInt = fileReader.read()) ) {
				System.out.print((char)readInt);
			}
			//파일읽기후 파일닫기(자원해제)
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
