package week05.thread;

public class TestRunnable implements Runnable {

	// Runnable을 implements를 하면 아래의 메서드를 오버라이딩해야함
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int idx = 0; idx < 100; idx++) {
			System.out.print("$");
		}
	}
	
}
