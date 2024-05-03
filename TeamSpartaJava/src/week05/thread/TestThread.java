package week05.thread;

// 자바에서 쓰레드사용하기
// 1. Thread classs를 이용한다.(상속)
public class TestThread extends Thread {
	// Thread안에 run이라는 메서드를 오버라이딩한다.
	public void run() {
		System.out.println("테스트입니다.");
		for(int idx = 0; idx < 100; idx++) {
			System.out.print("*");
		}
	}
	
	// Thread를 상속받으면 사용자지정의 메서드를 따로 만들 수 없나?
//	public void stop() {
//		System.out.println("멈춰!");
//	}
}
