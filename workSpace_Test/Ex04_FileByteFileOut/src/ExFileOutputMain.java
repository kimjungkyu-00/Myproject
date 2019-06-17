import java.io.*;

public class ExFileOutputMain {

	public static void main(String[] args) throws IOException{
		//file 쓰기
		//file 쓰기위한 FileOutputStream
		FileOutputStream file;
		try {
			//FileOutputStream 생성시에 저장할 위치+파일명 기록
			file =new FileOutputStream("D:\\sss\\test.out");
			
			//file에 내용 쓰기
			int[] num= {1,4,-1,88,50};
			byte[] b = {7,51,3,4,1,24};
			
			for(int i=0; i<num.length ; ++i) {
				//파일에 int(4byte) 바이너리로 저장함
				file.write(num[i]);
			}
			
			//byte배열 전체 저장
			file.write(b);
			
			
			//저장완료하기(자원해제)
			file.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
