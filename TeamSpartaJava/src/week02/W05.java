package week02;

public class W05 {
	// 대입연산자
	public static void main(String[] args) {
		// 변수를 바로 연산해서 그 자리에서 저장하는 연산자
		// =(기본연산자), +=, -=, *=, /= ... (복합대입연산자)
		// ++ : += 1 증
		// -- : -= 1 감
		
		// 기본대입연산자
		int num = 10;
		num = num + 2;
		System.out.println(num);
		
		num = num -2;
		System.out.println(num);
		
		System.out.println("=======================");
		// 복합대입연산자
		num = 10;
		
		num += 2; // num + 2
		
		num -= 2;
		System.out.println(num);
		
		System.out.println("================");
		// ++, --
		num = 10;
		num++;
		System.out.println(num);
		num--;
		System.out.println(num);
	}

}
