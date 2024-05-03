package week05.thread.singleThread;

public class Main {
    public static void main(String[] args) {
		 // 람다식
		 // 주가되는 main쓰레드가 있고 그 main쓰레드가 
		 // thread1을 실행시킨 후에 종료되면 main쓰레드도 종료
	    Runnable task = () -> {
	    	System.out.println("2번 => " + Thread.currentThread().getName()); // 쓰레드이름 : Thread1
		    
	    	for (int i = 0; i < 100; i++) {
	            System.out.print("$");
	        }
	    };
	
	    System.out.println("1번 => " + Thread.currentThread().getName()); // 쓰레드이름 : main
	    Thread thread1 = new Thread(task);
	    thread1.setName("thread1");
	
	    thread1.start();
    }
}