import java.io.*;
public class ExfileBufferedMain {

	public static void main(String[] args) {
		
		try {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedOutputStream output = new BufferedOutputStream(System.out, 5);
		
		int readInt=0;
		System.out.println("입력 : ");
		do {
				readInt=input.read();
				output.write(readInt);
		}while(readInt != -1);
		
		// buffer 비워준다
		output.flush();
		
		if(null !=input) {
			input.close();
			output.close();
		}
		System.out.println("bye~!~");
		
	} catch (IOException e) {
		System.out.println(e.getMessage());
		}			
		
		
		
	}

}
