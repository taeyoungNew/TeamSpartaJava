package week02.array;

public class Array08 {

	public static void main(String[] args) {
		// 최대값구하기
		int[] arr = {2,3,4,2,1,1};
		
		// 최대값 구하기 출력
		int max = arr[0];
		int min = arr[0];
		// 최대값 구하기 로직
		for(int num : arr) {
			if(num > max) {
				max = num;
			}
			
			if(num < min) {
				min = num;
			}
		}
		
		
		
		System.out.println(max + ", " +  min);

	}

}
