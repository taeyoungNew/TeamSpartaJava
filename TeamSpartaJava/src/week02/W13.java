package week02;

import java.util.Objects;
import java.util.Scanner;

public class W13 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("A입력 : ");
		String aHand = kb.nextLine();
		
		//B에게 값 입력
		System.out.println("B입력 : ");
		String bHand = kb.nextLine();
		
		// 두개의 값을 비교하는 메서드, => Objects.equals(좌, 우) : 좌 우가 같은 경우 true, 다른경우는 false
		if(Objects.equals(aHand, "가위")) {
			if(Objects.equals(bHand, "가위")) {
				System.out.println("A와 b는 비겼습니다.");
			}
		}
	}

}
