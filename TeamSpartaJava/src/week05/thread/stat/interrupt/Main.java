package week05.thread.stat.interrupt;

public class Main {
	public static void main(String[] args) {
//		Runnable task = () -> {
//			try {
//				Thread.sleep(1000);
//				int num1 = 0;
//				int num2 = 0;
//				System.out.println(num1 + num2);
//				System.out.println(Thread.currentThread().getName());
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println("task : " + Thread.currentThread().getName());
//		};
//
//		Thread thread = new Thread(task, "Thread");
//		thread.start();
//
//		// 쓰레드가 일시정지되어있는 동안에 interrupt가 발생하여 catch문으로 넘어가게 된다.
//		thread.interrupt();
//
//		// 현재 interrupted상태인지 출력
//		System.out.println("thread.isInterrupted() = " + thread.isInterrupted());

		System.out.println("==================");
        Runnable task = () -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    break;
                }
            }
            System.out.println("task : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "Thread");
        thread.start();

        thread.interrupt();

        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());
	}
}