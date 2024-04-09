package week02;

public class W07 {

	// 기타연산자
	public static void main(String[] args) {
		// (1) 형변환 연산자
		int intNum = 93 + (int)98.9;
		System.out.println(intNum); // 소수점아래는 버려짐
		double doubleNum = (double) 93 + 98.8;
		System.out.println(doubleNum);
		
		// (2) 삼항연산자
		// 비교연산자와 항상 함께 쓰인다
		// 비교연산자의 결과 : true or false => 이 결과의 값에 따라 결정되는 식
		int x = 1;
		int y = 9;
		boolean b = (x == y) ? true : false;
		System.out.println(b);
		
		String s = (x != y) ? "정답" : "오답";
		System.out.println(s);
		
		int max = (x > y) ? x : y;
		System.out.println(max);
		
		int min = (x < y) ? x : y;
		System.out.println(min);
		
		// (3) instance of(3주차 => 클래스, 객체)
		// 피연ㅅ간자가 조건에 명시된 클래스의 객체인지 비교하여
		// 맞으면 => true
		// 틀리면 => false

	}

}
