package week03.sample;

public class Main {
	// final필드 
	// final필드는 초기값이 저장되면 해당값을 프로그램이 실행하는 도중에는 절대로 수정할 수 없음
	// 또한 final필드는 반드시 초기값을 지정해야한다.
	final String companyString = "Genesis";
	
	// 상수
	// 상수의 특징은 반드시 한개이며 불변의 값을 의미
	// 따라서 인스턴스마다 상수를 저장할 필요가 없음
	// 상수는 알파벳 대문자로 작성하는것이 관례이다.
	static final String COMPANY = "GENESIS";
	
	
	// 지역변수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		
		
		System.out.println(main.COMPANY);
		System.out.println(main.getNum());
		System.out.println(main.getNum());
	}

	public int getNum() {
		// 지역변수 <=> 전역변수
		// 해당 메서드가 실행될 떄 마다 독립적인 값을 저장하고 관리
		// 이 지역변수는 메서드 내부에서 정의될 때 생성된다.
		// 지역변수를 가지고 있는 메서드가 실행이 종료되면 해당 지역변수도 소멸된다.
		int num = 1;
		num += 1;
		
		return num;
	}
	
}
