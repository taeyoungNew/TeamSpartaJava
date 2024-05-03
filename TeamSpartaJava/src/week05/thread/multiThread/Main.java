package week05.thread.multiThread;

public class Main {
    public static void main(String[] args) {
    	
    	// 간단히 말해서 주 쓰레드인 main쓰레드 안에
    	// task가 두개이므로 멀티쓰레드
    	
    	// 비동기적으로 실행되므로 task가 실행되면서 실행이 끝나기도 전에 task2가 실행되므로 
    	// &와 *가 거의 동시에 나온다.
    	// 운영체제의 상황에 따라 걸리는 시간이나 동작을 예측할 수가 없다.
    	// 1st
    	Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("$");
            }
        };
        
        // 2nd
        Runnable task2 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("*");
            }
        };


	    Thread thread1 = new Thread(task);
	    thread1.setName("thread1");
	    Thread thread2 = new Thread(task2);
	    thread2.setName("thread2");
	
	    thread1.start();
	    thread2.start();
    
    }
}