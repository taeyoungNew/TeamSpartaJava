package week03.interSample;

public class Main {

	public static void main(String[] args) {
		A a1 = new B();
		a1.a();	// B에서 오버라이딩한 메소드이기때문에 사용가능
//		a1.b();	// 사용불가능 왜냐면 현재 자동형변환이 된 A타입이고 A객체는 가지고 있지 않기 때문이다.
		
		// 한번 변경했던 내용만이 강제변환도 가능하다
		B a2 = (B) a1;
		
		
		a2.b();
		
		
		A a3 = new C();
		a3.a();
//		a3.b();	// 불가능
//		a3.c();	// 불가능

		C a4 = new C();
		a4.b();
		a4.c();
	}
	
	

}
interface A {
	void a();
}

class B implements A {
	public void a() {
		System.out.println("B의 a()");
	}
	
	public void b() {
		System.out.println("B의 b()");
	}
}

class C extends B {
	
	public void c() {
		System.out.println("C의 C()");
		
	}
	
}