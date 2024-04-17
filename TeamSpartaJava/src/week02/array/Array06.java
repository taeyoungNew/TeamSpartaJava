package week02.array;

public class Array06 {

	public static void main(String[] args) {
		// 반복문을 통한 초기화
		int[][] array = new int[2][3];
		
		for(int idx = 0; idx < array.length; idx++) {
			for(int idx2 = 0; idx2 < array[idx].length; idx2++) {
				array[idx][idx2] = idx2;
			}
		}

	
		
	}

}
