package week01;

public class TestThree {

	public static void main(String[] args) {
		// 작은 크키의 타입이 큰 크기의 타입과 '계산'될 때
		// 자동으로 큰 크기의 타입으로 형 변환이 된다.
		int intVal = 10;
		double doubleVal = 10.2;
		double result = intVal + doubleVal;
		System.out.println(result);
		
		// 1) 정수로 나누기
		int iResult = intVal / 4;
		System.out.println("iResult = " + iResult);
		// 2) 실수로 나누기
		double dResult = intVal / 4.0;
		System.out.println("dResult = " + dResult);
		
		// 변수 타입별 크기순서 
		// 아래의 형변환은 자동으로 가능
		// byte(1) => short(2) => int(4) => long(8) => float(4) => double(8)
		// (1)  byte => int
		byte byteNum = 10;
		int intNum = byteNum; // byte => int로 자동변환
		
		// (2) char(1byte) => int(4) 형변환
		char charAl = 'A';
		intNum = charAl;	// char => int로 자동변환
		System.out.println(intNum);	// A => 65 : A가 가지고 있는 유니코드가 출력됨 
		
		// (3) int(4) => long(8) 변환
		intNum = 100;
		long longNum = intNum; // int => long 자동변환 
		
		// (4) int => double 
		intNum = 200;
		double doubleNum = intNum;	// int => double 자동변환
		System.out.println(doubleNum); // 200.0
		
		
		// 형변환 예제 : 변수의 타입을 바꾸는 방법
		// 문자열 	=> 	숫자
		// 정수 		=> 	실수
		// 실수 		=> 	정수
		// double or float => int
//		double doubleNum = 10.101010;
//		float floatNum = 10.1010f;
		
		// 변환 (int)
//		int intNum1 = (int) doubleNum;
//		int intNum2 = (int) floatNum;
//		System.out.println("doubleNum = " + doubleNum + ", " + floatNum);
//		System.out.println("intNum1 = " + intNum1);
//		System.out.println("intNum2 = " +  intNum2);
//		
//		double doubleNum3 = (double) intNum1;
//		double floatNum3 = (float) intNum2;
		
	}

}
