package week04.sample01;

// '예외 클래스'를 만들어서 예외를 정의 
// 예외를 클래스에서 정의한다 (node에서는 꽤 뒤에서 나온 기법인데 여긴 금방나오네)
// Exception이라는 상위클래스를 상속받는다.
public class OurBadException extends Exception {
	// 생성자가 호출이 될때
	public OurBadException() {
		super("위험한 행동을 하면 예외처리를 꼭해야함");
	}
}
