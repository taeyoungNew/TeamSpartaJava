package week05.thread.join;

public class Main {
	public static void main(String[] args) {
			System.out.println(System.currentTimeMillis());
		Runnable task = () -> {
			try {
				Thread.sleep(5000); // 5초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		Thread thread = new Thread(task, "thread");	// new

		thread.start(); // new => Runnable

		long start = System.currentTimeMillis();

		try {
			// 시간을 지정하기 않았기 때문에 thread가 작업을 끝낼때 까지 main쓰레드는 기다리게 된다.
			thread.join();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// thread 의 소요시간인 5000ms 동안 main 쓰레드가 기다렸기 때문에 5000이상이 출력됩니다.
		System.out.println("소요시간 = " + (System.currentTimeMillis() - start));
	}
}