package week02.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class CollectionHomWork {

	public static void main(String[] args) {
		// HW. 2주차 숙제
		// 자료구조 요리 레시피 메모장 만들기
		Scanner kb = new Scanner(System.in);
	
		// 자료구조를 입력하면 그 자료구조로 레시피를 만든다.
		System.out.println("자료구조를 입력해주세요");
		String inCollection = kb.nextLine();

		System.out.println("요리제목을 입력해주세요");
		String title = kb.nextLine();
		
		if(inCollection.equalsIgnoreCase("List")) {
			try {

				ArrayList<String> recipesList = new ArrayList<>();
				System.out.println("레시피를 적어주세요");
				while(true) {
					String textString = kb.nextLine();
					if(Objects.equals(textString, "끝")) {
						break;
					}
					recipesList.add(textString);
				}
				
				System.out.println("[" + inCollection + "으로저장된 " + title + "]");
				for(int idx = 0; idx < recipesList.size(); idx++) {
					System.out.println(idx + 1 + ". " + recipesList.get(idx));
				}
			} catch (IndexOutOfBoundsException e) {
				System.out.println(e);
			}
		} else if(inCollection.equalsIgnoreCase("Set")) {
			try {
				LinkedHashSet<String> recipeSet = new LinkedHashSet<>();
				System.out.println("레시피를 적어주세요");
				while(true) {
					String textString = kb.nextLine();
					if(Objects.equals(textString, "끝")) {
						break;
					}
					recipeSet.add(textString);
				}
				System.out.println("[" + inCollection + "으로저장된 " + title + "]");
				int cnt = 1;
				for(String valueInteger : recipeSet) {
					System.out.println(cnt + ". " + valueInteger);
					cnt++;
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}


		} else if(inCollection.equalsIgnoreCase("Map") ) {
			Map<Integer, String>	recipeMap = new HashMap<Integer, String>();
			System.out.println("레시피를 적어주세요");
			int cnt = 1;
			while(true) {
				String textString = kb.nextLine();
				if(Objects.equals(textString, "끝")) {
					break;
				}
				recipeMap.put(cnt, textString);
				cnt++;
			}
			int cnt2 = 1;
			System.out.println("[" + inCollection + "으로 저장된 " + title);
			for(String valString : recipeMap.values()) {
				System.out.println(cnt2 + ". " + valString);
				cnt2++;
			}

		} else {
			System.out.println("알수 없는 명령어 입니다.");
		}
		kb.close();
		
	}

}
