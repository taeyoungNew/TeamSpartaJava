package week02.array;

public class Array02 {

	public static void main(String[] args) {
		// 초기화
		
		// 1. 배열에 특정값 대입해서 선언
		int[] intArr = {1, 2, 3, 4, 5};
		String[] strArrStrings = {"a", "b", "c"};
		
		// 2. for문을 통해서 대입
		for(int idx = 0; idx < intArr.length; idx++) {
			intArr[idx] = idx;
		}
		
		// 다건 출력
		for(int idx = 0; idx < intArr.length; idx++) {
			System.out.println(intArr[idx]);
		}
		
	}

}
