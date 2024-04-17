package week02.collection;

import java.util.LinkedList;

public class Col2LinkedList {

	public static void main(String[] args) {
		// linked list
		// 메모리에 남는 공간을 요청해서 여기 저기 나누어서 실제값을 담아놓는다.
		// 실제 값이 있는 주소값으로 목록을 구성하고 저장하는 자료구조이다.
		
		// 기본적 기능 => ArrayList와 동일
		// 단점 : 여기저기 나누어서 조회하는 속도가 느리다.
		// 장점 : 값을 추가하거나 삭제하는 속도는 빠르다.
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		// 데이터 추가
		linkedList.add(5);
		linkedList.add(10);
		linkedList.add(3);
		
		System.out.println(linkedList.get(0));
		System.out.println(linkedList.get(1));
		System.out.println(linkedList.get(2));
		
		// 데이터의 양이 많아 질수록 arrayList보다 조회속도가 현저히 느린것을 알수 있다.
		System.out.println(linkedList.toString());	
		
		linkedList.add(200);
		// [5, 10, 3, 200]
		System.out.println(linkedList.toString());	
		
		// 값을 중간에 추가할 수 있다.
		linkedList.add(2, 4);
		// [5, 10, 4, 3, 200]
		System.out.println(linkedList.toString());	
		
		// 데이터 수정
		// 1번째 요소를 30으로 바꾸기
		linkedList.set(1, 30);
		// [5, 30, 4, 3, 200]
		System.out.println(linkedList.toString());	
				
		// 데이터 삭제 
		// 1번째 요소 삭제
		linkedList.remove(1);
		// [5, 4, 3, 200]
		System.out.println(linkedList.toString());
		
	}

}
