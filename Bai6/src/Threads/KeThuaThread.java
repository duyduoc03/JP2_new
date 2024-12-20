package Threads;

public class KeThuaThread extends Thread {
	@Override
	public void run() {
		for(int i =0; i<10; i++) {
			System.out.println("A"+i);
		}
	}
}
