import java.net.*;
import java.io.*;
////さけけけけけけけいさ///////////さささささ/さ
public class ExURLMain {

	public static void main(String[] args) {
		URL url;
		try {
			url = new URL("http://www.daum.com");
			
			
			// url羨紗馬奄
			URLConnection uc = url.openConnection();
			
			
			//bufferedReader 切据亜閃神奄
			BufferedReader in = 
					new BufferedReader(new InputStreamReader(
											uc.getInputStream()));
			String inputLine;
			//鎧遂 石嬢神奄
			while(null != (inputLine = in.readLine() )) {
				System.out.println(inputLine);
			}
			
			//BufferedReader 丸奄 (切据背薦)
			in.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}	
}
