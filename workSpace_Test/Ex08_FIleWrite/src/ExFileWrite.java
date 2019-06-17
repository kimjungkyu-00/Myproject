import java.io.*;

public class ExFileWrite {

	public static void main(String[] args) {
		//키보드 입력받기 (키보드 입력:system.in)
		InputStreamReader keyboard = new InputStreamReader(System.in);
		
		try {
			FileWriter file = new FileWriter("C:\\kimjunggyu\\in.txt");
			
			int readInt;
			
			System.out.println("파일에 저장할 내용을 입력하세요");
			// keyboard로 입력받는다.
			while( -1 != (readInt = keyboard.read())) {
				//keyboard로 입력받은 데이타를 파일에 저장
				file.write(readInt);
			}
			//입력이 끝나면 키보드부터 닫기
			keyboard.close();
			file.close();
			System.out.println("exit~~~");
		} catch (IOException e) {
			System.out.println(e.getMessage());}
		
		
		
	}

}
