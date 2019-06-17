package project37;

public class WaitNotifyExample {
	public static void main(String[] args) {
		
		DataBox dataBox = new DataBox();
		
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread ConsumerThread = new ConsumerThread(dataBox);
		
		producerThread.start();
		ConsumerThread.start();
	}
}