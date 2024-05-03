package week05.thread.priority;

// 쓰레드 우선순위 : setPriority안에 숫자를 넣는다. 
// 숫자가 클수록 우선순위가 높아진다.
// 따로 설정을 안하면 5의 순위를 가진다.
public class Main {
    public static void main(String[] args) {
	        Runnable task1 = () -> {
	            for (int i = 0; i < 100; i++) {
	                System.out.print("$");
	                
	            }
	        };
	
	        Runnable task2 = () -> {
	            for (int i = 0; i < 100; i++) {
	                System.out.print("*");
	            }
	        };
	
	        Thread thread1 = new Thread(task1);
	        thread1.setPriority(8);	// 우선순위 설정
	        int threadPriority = thread1.getPriority();
	        System.out.println("threadPriority = " + threadPriority);
	
	        Thread thread2 = new Thread(task2);
	        thread2.setPriority(2);	// 우선순위 설정
	
	        thread1.start();
	        System.out.println();
	        thread2.start();
    }
}