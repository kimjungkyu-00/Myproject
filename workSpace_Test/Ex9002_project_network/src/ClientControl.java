import java.net.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.*;
public class ClientControl extends Thread{

	Socket socket;
	private DataInputStream reader;
	private DataOutputStream writer;
	int port;
	
	public static int Kawi=0;
	public static int Bo=1;
	public static int Bawi=2;
	
	public ClientControl(int port ) {
		this.port=port;
		
	}
	
	private void connect() {
		try {
			socket= new Socket("localhost",7777);
			System.out.println("game start");
			
			reader=new DataInputStream(socket.getInputStream());
			writer=new DataOutputStream(socket.getOutputStream());
			
		}catch(Exception e) {
			System.out.println("quit");
		}
	}
	public void action(ActionEvent ae) {
		
		int player=-1;
		int server=-1;
			if(1==Kawi)
				 player=K;
			else  if(ae.getSource()==Bawi)
		    	 player=Bawi;
			else  if(ae.getSource()==Bo)
		    	 player=Bo;
			
	}
}
