package week02;

public class W06 {

	public static void main(String[] args) {
		// 대입연산자에서 주의해야 할 점
		// ++, --
		int a = 10;
		int b = 10;
		int val = ++a + b--; // 11 + 9 = 20 일까?
		System.out.println(val); // 실제는 21이 출력된다.
		
		// ++가 앞에 있으면 a에 먼저 1을 더하고 연산이 된다. 
		// ++가 뒤에 있으면 연산이 끝난 뒤에 a에 1을 더하게 된다.
		System.out.println(a);
		System.out.println(b);
		System.out.println(a + b);

	}

}
