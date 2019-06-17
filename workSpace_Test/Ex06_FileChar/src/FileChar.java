import java.io.*;

public class FileChar {
	final static String FILE_NAME = "d:\\sss.hangul.txt";
		
	public static void main(String[] args) throws IOException {
		//file 읽기
		
		try {
			FileInputStream inFile = new FileInputStream(FILE_NAME);
			/*한글로 된 파일을 익기 위하여 바이너리로 읽은 데이터를 
			 * 문자 집합에 맞게 읽어주기 위한 InputstreamReader 이용
			 */
			
			InputStreamReader in = new InputStreamReader(inFile,"MS949");
			
			System.out.println("인코딩 문자 집합 : "+in.getEncoding());
			
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
