
public class ThreadExample {

	public static void main(String[] args) {
		MusicRunnable Runnable = new MusicRunnable();
		Thread thread1 = new MovieThread();
		thread1.start();
		
		Thread thread2= new Thread(Runnable);
		thread2.start();
	}

}
