package week02;

public class W08 {

	// [연산자 우선순위 : 산술 > 비교 > 논리 > 대입]
	// 연산자 ㅇ러개가 함께 있는 연산을 계산할 때는 우선순위가 있다.
	// 위 우선순위에 따라서 최종적인 응답값이 결정
	// 단 괄호로 감싸주면 괄호안의 연산이 최우선순위로 계산
	public static void main(String[] args) {
		int x = 2;
		int y = 9;
		int z = 10;
		
		// 비교 => 논리 => 대입 순으로 우선순위 
		boolean result = x < y && y < z;
		
		result = x + 10 < y && y < z; // false && true => false
		System.out.println(result);
		
		System.out.println("====================");
		
		result =  x + 2 * 3 > y;
		System.out.println(result);

		System.out.println("===================");
		result = (x + 2) * 3 > y;
		System.out.println(result);
		

	}

}
