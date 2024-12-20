package Threads;

public class Main {
	public static void main(String[] args) {
		//Thread
		// multithreading
		KeThuaThread thread1 = new KeThuaThread();
		
		
		TrienKhaiRunable runable = new TrienKhaiRunable();
		Thread thread2 = new Thread(runable);
		
		thread1.start();
		thread2.start();
	}
}
