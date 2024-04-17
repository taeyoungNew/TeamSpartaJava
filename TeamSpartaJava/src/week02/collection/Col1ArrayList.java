package week02.collection;

import java.util.ArrayList;

public class Col1ArrayList {

	public static void main(String[] args) {
		// List 
		// 순서가 있는 데이터의 집합 => Array와 비슷
		// Array : 정적배열
		// List : 처음에 길이를 몰라도 만들 수 있다. => 동적배열(크기가 가변적으로 늘어난다.)
		// 			- 생성시점에 작은 연속된 공간을 요청해서 참조형 변수들을 담는다.
		// 			- 값이 추가 될 때 더 큰 공간이 필요하면 더 큰 공간을 받아서 저장한다. 
		
		// <>안에 기본형의 래퍼타입을 넣어줘야함 예) int _> Integer
		ArrayList<Integer> intList = new ArrayList<Integer>();	// 선언 + 생성
		
		// 추가
		intList.add(1);
		intList.add(2);
		intList.add(22);
		
		// 조회
		System.out.println(intList.get(1));
		
		// 수정 2번째 있는 값을 15로 바꾸자
		intList.set(1, 15);
		
		System.out.println(intList.get(1));
		
		// 삭제
		System.out.println(intList.get(1));
		intList.remove(1);
		
		// 1번째 데이터가 사라지고 기존의 2번째 데이터가 당겨져서 조회됨
		System.out.println(intList.get(1));
		
		System.out.println("클리어전 = " + intList.toString());
		
		// 전체 삭제
		intList.clear();
		System.out.println("클리어후 = " + intList.toString());
		
	}

}
