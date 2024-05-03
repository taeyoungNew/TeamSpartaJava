package week05.thread.stat.sync;

public class Main {
	public static void main(String[] args) {
		// AppleStore객체 생성
		AppleStore appleStore = new AppleStore();

		// 쓰레드로 사용할 task생성
		Runnable task = () -> {
			// appleStore의 getStoredApple의 갯수가 0보다 클경우
			while (appleStore.getStoredApple() > 0) {
				// 
				appleStore.eatApple();
				System.out.println("남은 사과의 수 = " + appleStore.getStoredApple());
			}

		};

		// 3개의 쓰레드를 한꺼번에 만들어서 start를 한다
		// 생성(NEW)과 동시에 start(NEW => RUNNABLE)
		for (int i = 0; i < 3; i++) {
			new Thread(task).start();
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class AppleStore {
	private int storedApple = 10;

	// 현재 storeApple의 값을 리턴
	public int getStoredApple() {
		return storedApple;
	}

	public void eatApple() {
		// storeApple이 0보다 큰경우 
		// ! 여기서의 오류는 비동기적인 흐름때문에 
		// storeApple이 0인 상태에서도 쓰레드들은 try문 안으로 들어서게 된다. 
		// 이유는 storeApple이 0이 아닌때 try문으로 들어가는데 먼저 1초를 멈췄다 실행된 
		// 쓰레드가 storeApple를 먹었기 때문이다.
//		if (storedApple > 0) {
//			try {
//				// Thread를 1초 멈춘뒤에 
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			// storeApple에서 1을 뺸다.
//			storedApple -= 1;
//		}
		
		// 위의 오류현상을 잡기 위해 synchroized를 활용한다.
		// synchroized는 한 쓰레드가 진입을 하면 다른 쓰레드들은 해당 쓰레드가 
		// 작업을 완료할 때 까지 기다리게 하는 비동기처리적인 로직이다.
		synchronized (this) {
			if(storedApple > 0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				storedApple -= 1;
				
			}
			
		}
	}
}