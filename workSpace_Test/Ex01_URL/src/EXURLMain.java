import java.net.*;

public class EXURLMain {

	public static void main(String[] args) {
		URL url = null;
		URL homePage = null;
		
		try {
			homePage = new URL("http://news.hankooki.com:80");
			url = new URL(homePage,"opinion/editorial.htm");
		}catch(MalformedURLException e) {
			System.out.println("잘못된 경로");
		}
		
		System.out.println("protocol : " + url.getProtocol());
		System.out.println("host : " + url.getHost());
		System.out.println("port : " +url.getPort());
		System.out.println("path : " +url.getPath());
		System.out.println("filename : "+ url.getFile());
	}

}
