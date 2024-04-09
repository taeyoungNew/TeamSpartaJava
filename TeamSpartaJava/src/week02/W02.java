package week02;

public class W02 {

	public static void main(String[] args) {
		System.out.println(4 + 2);
		System.out.println(4 - 2);
		System.out.println(4 * 2);
		System.out.println(4 / 2);	
		System.out.println(5 / 2);// 2 몫만 출력
		System.out.println(4 % 2);
		System.out.println(5 % 2);
		System.out.println("-----------------------------");
		// 우선순위 연산
		// * / % 가 우선순위
		System.out.println(2 + 2 * 2);
		// ()안에 있는것이 우선순위
		System.out.println((2 + 2) * 2);
		
		// 변수를 이용한 연산
		int a = 20;
		int b = 10;
		int c;
		
		// 덧셈 
		c = a + b;
		
		// 뺼셈
		c = a - b;
		
		System.out.println(c);
	}

}
