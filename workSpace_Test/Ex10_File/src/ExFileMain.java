import java.io.*;
public class ExFileMain {
	
	public static void dir(File fd) {
		String[] fileName = fd.list();
		for(String str : fileName) {
			File file = new File(fd,str);
			long t = file.lastModified();
			System.out.print(str);
			System.out.print("\t 파일크기"+file.length());
			System.out.printf("\t 수정한 시간 :  %b %d %a %t"+t,t,t,t);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		//File 클래스를 이용한 파일 관리
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
		
		//디렉토리 존재 확인
		if(false == fileTmp.exists()) {
			// 디렉토리 생성하기
			if(fileTmp.mkdirs()) {
				//디렉토리 생성 실패
				System.out.println("디렉토리 생성 실패");
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
