package week02.array;

public class Array01 {

	public static void main(String[] args) {
		// 배열생성 
		// 선언 = 객체생성
		int[] intArray = new int[3];// {0, 0, 0} 
		boolean[] booleanArray = new boolean[3];
		String[] stringArrayStrings = new String[3];
		
		// 배열 선언 먼저 => 나중에 초기화
		int[] intArray2;
		intArray2 = new int[3];
		
		// 생성한 배열을 '순회' =>배열의 값을 하나씩 뽑아서 조회
		// (1) 단건 조회
//		System.out.println(intArray[1]);
		// (2) 다건 조회
		for(int idx = 0; idx < 3; idx++) {
			System.out.println(intArray[idx]);
		}
	}

}
