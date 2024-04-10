package week02;

public class W16 {

	public static void main(String[] args) {
		// do while, while
		int num = 0;
		
		// ~하는동안
		while(num < 3) {
			System.out.println(num);
			num++;
		}
		
		// do ~ while
		// 조건이 만족하지 않더라도 어떤 작업을 선행해야할 때 쓴다.
		int num2 = 4;
		
		do {
			// 이 블록안의 로직을 먼저 수행한 후
			System.out.println("num2: " + num2);
			num2++;
			// 반복문을 돌린다.
		} while (num2 < 10);
		
		//  break;
		// 가장 가까운 블록의 for문 또는 while, switch문의 반복작업을 중단시킨다.
		
		int num3 = 0;
		while(num3 < 3) {
			System.out.println(num3 + "출력");
			num3++;
			if(num3 == 2) {
				break;
			}
		}
		
		for(int idx = 0; idx < 10; idx++) {
			System.out.println("idx :  " + idx);
			if(idx == 2) {
				break; // idx가 2일때 가장 바깥 반복문이 종료
			}
			
			for(int idx2 = 0; idx2 < 10; idx2++) {
				System.out.println("idx2 : " + idx2);
				if(idx2 == 2) {
					break;
				}
			}
			
		}
		// continue 
		int num4 = 0;
		while(num4 < 3) {
			num4++;
			if(num4 == 2) {
				continue;	// continue는 밑에 있는 로직들은 모두 생략하고 다음 반복으로 넘어간다 
				
			}
			
			// 1출력
			// 
			// 3출력 
			// 2출력은 continue로 인해 생략되버림
			System.out.println(num4 + "출력");
		}
	}

}
