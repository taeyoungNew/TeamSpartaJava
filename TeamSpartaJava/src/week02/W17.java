package week02;

import java.util.Scanner;

public class W17 {

	public static void main(String[] args) {
		// 입력받는 단을 제외하고 출력
		Scanner kbScanner = new Scanner(System.in);
//		int passNum = kbScanner.nextInt();
		int inputNum = kbScanner.nextInt();
		
		// 구구단
//		for(int idx1 = 2; idx1 <= 9; idx1++) {
//			if(idx1 == passNum) {
//				continue;
//			}
//			for(int idx2 = 1; idx2 <= 9; idx2++) {
//				System.out.println(idx1 + "*" + idx2 + " = " + idx1 * idx2 + " ");
//			}
//			
//		}
		
		// 특정값만 출력하는 구구단 
		for(int idx1 = 1; idx1 <= 9; idx1++) {
			System.out.println(inputNum + "*" + idx1 + " = " + inputNum * idx1 + " ");
		}
	}

}
