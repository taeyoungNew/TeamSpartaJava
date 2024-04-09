package week01;

import java.util.Arrays;

public class TestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// (1) boolean
		// 변수를 선언 => 타입 이름 = 값;
		final boolean flag = true;
		//The final local variable flag cannot be assigned. It must be blank and not using a compound assignment
//		flag = false; 
		System.out.println(flag);
		
		// (2) char
		// 쌍따옴표는 문자열로 인식이 되기때문에 ''로 하자
		char alphabet = 'a';
		System.out.println(alphabet);
		
		// (3) 정수형(byte, short, int, long)
		byte byteNum = 127;
		short shortNum = 32767;
		int intNum = 2147483647;
		long longNum = 2147483647L;
		System.out.println(byteNum);
		System.out.println(shortNum);
		System.out.println(intNum);
		System.out.println(longNum);
	
		// (4) 실수형 float, double
		// float(4byte), double(8byte)
		float floatNum = 0.123F;
		double doubleNum = 0.123123123;
		
		
		// (5) 문자형 String 
		// 5-1 문자열 변수
		String helloWorld = "Hello world";
		System.out.println(helloWorld);
		// 5-2 배열 자바에서는 배열값을 초기화할 때 중괄호를 사용하네 ㄷㄷ Node에서는 그냥 대괄호인데
		int[] a = {1, 2, 3};
		System.out.println(Arrays.toString(a));	// 배열에 담은 값들을 바로 읽기위해선 Arrays.toString()메서드를 사용해야한다.
		
		// 5-3 래퍼클래스(Wrapper Class변수)
		int number = 21;
//		Integer num = new Integer(number); //deprecated 지원이 종료된 방식
		Integer num = number; // 최신래핑방식
		System.out.println(num);
	}
}
