import java.io.FileInputStream;
import java.io.IOException;

public class ExFileReadMain {

	public static void main(String[] args) {
		//파일을 읽어서 보여주기
		//File을 읽기위한 FileInputStream 생성
		FileInputStream inFile = null;
		try {
			//읽을 파일의 경로+파일명을 넣어서 생성함
			inFile = new FileInputStream("C:\\Program Files");
			int c;
			//파일 끝 (-1)일때까지 읽어온다 (1byte씩 읽어옴)
			while(-1 != (c= inFile.read() )) {
				//읽은 파일을 보여주기
				System.out.print((char)c);				
			}
			//파일 닫기(자원해제)
			inFile.close();
		}catch (IOException e) {
			System.out.print(e.getMessage());
		}
	}

}
