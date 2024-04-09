package week01;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstWeekHomework {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("제목을 입력해주세요.");
			String title = sc.nextLine();
			System.out.println("요리 별점을 1 ~ 5사이의 소수점이 있는 실수로 입력해주세요.");
			float cookGrid = sc.nextFloat();
			String [] recipes = new String[10];
			String input1 = sc.nextLine();
			String input2 = sc.nextLine();
			String input3 = sc.nextLine();
			String input4 = sc.nextLine();
			String input5 = sc.nextLine();
			String input6 = sc.nextLine();
			String input7 = sc.nextLine();
			String input8 = sc.nextLine();
			String input9 = sc.nextLine();
			String input10 = sc.nextLine();
			
			int intRate = (int) cookGrid;
			System.out.println(intRate);
			double percentageRate = intRate * 100 / 5.0; 
			System.out.println(percentageRate);
			System.out.println("1." + input1);
			System.out.println("2." + input2);
			System.out.println("3." + input3);
			System.out.println("4." + input4);
			System.out.println("5." + input5);
			System.out.println("6." + input6);
			System.out.println("7." + input7);
			System.out.println("8." + input8);
			System.out.println("9." + input9);
			System.out.println("10." + input10);
//			int cnt = 0;
//			while(cnt < recipes.length) {
//				
//				try {
//					String content;
//					content = kb.nextLine();
//					recipes[cnt] = content;
//					cnt++;
//				} catch(Exception e) {
//					System.out.println(e);
//				}
//	
//			}
//			System.out.println(Arrays.toString(recipes));
//			
//			System.out.println("[" + title + "]");
//			System.out.println("별점 : " + cookGrid);
//			
//			
//			for(int idx = 0; idx < recipes.length; idx++) {
//				System.out.println(idx + 1 + "." + recipes[idx]);
//			}
//			
//			kb.close();
//		} catch(InputMismatchException e) {
//			e.printStackTrace();
//		}
	}
}
