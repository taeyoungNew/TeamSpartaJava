package week01;
// 클래스
// public : 접근제어자 (public은 어떠한 접근이라도 허용)
public class TestOne {
	// [JDK]
	// (1) compiler : .java => .class
	// (2) JRE :  
	// (3) JDB : 디버깅 => 에러없애는

	// () : 소괄호
	// {} : 중괄호
	// [] : 대괄호
	
	// main 메소드
	// 자바프로젝트는 제일 먼저 클래스의 main메소드를 실행시킨다.
	// = JVM의 약속
	// static : 이 프로그램이 시작될 때 무조건 실행되는 녀석이라네...
	
	// void : 메서드의 출력값의 데이터타입
	// void : "아무것도 없음 " => 출력값 즉 리턴값이 없음 
	
	// String[] args : 매개변수 자리
	public static void main(String[] args) {
		System.out.println(args.length);
		// 객체 : 특징(속성, 변수), 행동(메소드)
		// print -> 줄바꿈 X 
		// println -> 줄바꿈 O
		System.out.println("Our First Project! :)");
		System.out.println(System.out);
		
		System.out.println(7);
		System.out.println(3);
		System.out.println(3.14);
		System.out.println("JAVA");
	}
}
