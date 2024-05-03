package week05.thread;

public class Main {

	public static void main(String[] args) {
		// testThread를 인스턴스화
		// TestThread에서 오버라이딩한 run메서드를 start라는 메서드로 실행할 수 있다.
		// start메서드는 
		
		// Runnable은 interface, TestRunnable은 Runnable을 implements한 클래스
		Runnable run = new TestRunnable();
		// Thread는 Runnable를 implements하고 있다.
		Thread testThred = new Thread(run);
		
		testThred.start();
		
		// 람다식 : 엄청 많이 쓰인다네 ㄷㄷ
		Runnable task= () -> {
			int sum = 0;
			for(int idx = 0; idx < 50; idx++) {
				sum += 1;
				System.out.println(sum);
			}
			System.out.println(Thread.currentThread().getName() + " 최종 합 : " + sum);
		};
		
		Thread thread1 = new Thread(task);
		thread1.setName("임의의 이름");
		thread1.start();
	}
	

}
