package week02.array;

public class Array07 {

	public static void main(String[] args) {
		// 가변배열
		int[][]isArray= new int[3][];
		
		// 배열 원소마다 각기 다른 크기로 지정
		isArray[0] = new int[2];
		isArray[1] = new int[4];
		isArray[2] = new int[19];
		
		// 중괄호로 초기화를 아예 해버릴 때도 가능
		int[][] isArray2	= {
				{12,3,4,5,2},
				{2,3,2},
				{32,12,2}
		};
		

	}

}
