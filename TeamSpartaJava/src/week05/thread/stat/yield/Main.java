package week05.thread.stat.yield;

// yield : 남은 시간을 다음 쓰레드에게 양보하고 쓰레드 자신을 실행대기 상태가된다.

// 5초뒤에 thread1에서 InterruptedExeption이 
// 발생하면서 Thread.yield(); 이 실행되어 thread1은 
// 실행대기 상태로 변경되면서 남은 시간은 thread2에게 양보된다.

public class Main {
	public static void main(String[] args) {
		Runnable task = () -> {
			// Thread를 1초동안 멈췄다가 Thread의 이름을 출력하는걸 10번 반복함
			try {
				for (int i = 0; i < 10; i++) {
					Thread.sleep(1000);
					System.out.println(Thread.currentThread().getName());
				}
				// Thread가 Interrupted가 되었을때 실행되는 catch문
			} catch (InterruptedException e) {
				// 해당 쓰레드가 yiled를 하게 되면 리소스를 양보하게된다.
				System.out.println("실행대기하기");
				System.out.println("Interrupted된 쓰레드이름 : " + Thread.currentThread().getName());
				Thread.yield();
			}
		};
		// 쓰레드 객체 생성
		Thread thread1 = new Thread(task, "thread1");
		Thread thread2 = new Thread(task, "thread2");

		// thread1과 thread2를 실행
		thread1.start();
		thread2.start();

		try {
			// main스레드를 5초 멈춤
			Thread.sleep(5000);
			System.out.println("Thread이름 : " +  Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		 5초 후에 thread1은 interrupt된다. 실행대기시켜버림
		thread1.interrupt();
		System.out.println("thread1.currentThread().getName() = " + thread1.currentThread().getName());

	}
}