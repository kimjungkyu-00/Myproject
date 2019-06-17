import java.io.*;
public class ExFileMain {

	final static String FILE_NAME = "C:\\Windows\\system.ini";
	
	public static void main(String[] args) throws IOException {
		//file을 읽어서 복사하기.
		
		//파일 읽기 -FileInputStream 생성
		FileInputStream readFile;
		
		//filewrite -FileOutputStram 생성
		FileOutputStream writeFile;
		try {
			readFile = new FileInputStream(FILE_NAME);
			//복사할 위치와 파일명을 넣어서 생성
			
			writeFile = new FileOutputStream("C:\\Users\\김정규\\Desktop");
			
			//파일읽기 - 생성한 readFile의 내용을 읽어온다.
			int readInt;
			
			while(-1 != (readInt=readFile.read()) ) {
				System.out.print((char)readInt);
				//filewrite - 읽은 파일 내용을 쓴다.
				writeFile.write(readInt);
			}
			
			//파일 읽기 - 다읽은 파일은 닫기 자원해제
			readFile.close();
			//filewrite - 복사후에 파일 닫기
			writeFile.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
