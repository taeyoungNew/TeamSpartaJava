package week02;

public class W04 {
	// 논리연산자
	// 비교연산의 결과값으로 받을 수 있는 boolean값을 연결하는 연산자
	// 조건을 연결하였ㄱ을 때 boolean값들을 조합하여 참 또는 거짓값인 boolean값을 출력
	// &&(AND), ||(OR), !(NOT) 

	public static void main(String[] args) {
		boolean flagOne = true;
		boolean flagTwo = true;
		boolean flagThree = true;
//		System.out.println();
//		System.out.println();
//		System.out.println();

		// (1) 피연산자 중 하나라도 true면 true => 또는 (or : ||)
		System.out.println("&&");
		System.out.println(flagOne || flagTwo || flagThree);
		System.out.println("=====================");
		
		// (2) 피연산자 모두 true이면 true => 그리고 (AND :  &&)
		System.out.println("||");
		System.out.println(flagOne && flagThree && flagThree);
		
		System.out.println("=====================");
		
		// (3) AND 하나라도 false면 false임
		System.out.println((5 > 3) && (3 > 1)); // true
		System.out.println((5 > 3) && (3 < 1)); // false
		
		// (4) OR 하나라도 true면 true임
		System.out.println((5 < 3) || (3 > 1)); // true
		System.out.println((5 > 3) || (3 < 1)); // true
		
		// (5) 논리부정연산자(! : NOT) true => false, false => true
		System.out.println("!===============");
		System.out.println(!flagOne); // true => false
		System.out.println(!(5 == 5));
		System.out.println(!(3 == 5));
		
		
	}

}
