package week02;

public class W15 {

	public static void main(String[] args) {
		// for문
		for(int idx = 0; idx < 10; idx++) {
			System.out.println(idx + "하이");
		}
		
		// 향상된 for문 
		// 기존 : for문 안에 3개의 표현이 들어감 (초가값; 조건문; 증가연산)
		
		// 향상된 for문 : 2개로 줄여줌
		int[] numbers = {3, 4, 5, 6, 7, 10};
		for(int number : numbers) {
			System.out.println(number);
		}
	}

}
