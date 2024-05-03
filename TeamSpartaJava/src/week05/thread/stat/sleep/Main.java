package week05.thread.stat.sleep;

public class Main {
	public static void main(String[] args) {
		// Runnable정의
		Runnable task = () -> {
			try {
				// 쓰레드 timewaitting
				// 2초동안 일시정지
				// 쓰레드의 sleep은 static메서드이다
				// sleep은 exeption처리를 해야하기 때문에 try catch로 감싸줘야한다.
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// 현재 실행중인 쓰레드 이름 출력
			System.out.println("task : " + Thread.currentThread().getName());
		};
		// 쓰레드 생성
		Thread thread = new Thread(task, "Thread");
		// 쓰레드 실행
		thread.start(); // new => RUNNABLE로 바뀜

		try {
			// 쓰레드 1초동안 일시정지
			// 그런데 의문은 Thread라는 이름의 쓰레드가 종료되면 자동으로 main으로 바뀌는건가?
			// 아 기본적으로 Thread는 main인거임 
			// thread가 실행이 종료 되고 밑에 있는 try catch문 안에 있는 Thread를 참조 했을 때
			// 기본적으로 main Thread이다.
			// 인스턴스를 참조한 것을 통해서 sleep에 접근 =
			thread.sleep(1000); // == Thread.sleep(1000)과 같다
			// 현재 실행중인 쓰레드의 이름 출력
			System.out.println("sleep(1000) : " + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// 결과
	// 1초 있다가 main이 출력되고 2초 후에 Thread가 출력된다.
	// 이유는 thread라는 이름의 쓰레드는 sleep으로 인해 2초동안 일시 정지 되었다가 실행되고
	// main이라는 thread는 sleep으로 인해 1초동안 일시 정지 되었다가 실행되기 때문이다.
	// 이 코드의 흐름은
}