package week02.collection;

import java.util.HashSet;
import java.util.Set;

public class Col5Set {

	public static void main(String[] args) {
		// Set(집합 ): 순서와 중복이 없다.
		// 순서가 보장되지 않는 대신
		// 중복을 허용되지 않도록 하는 프로그램에서 사용할 수 있는 자료구조
		// Set => 그냥 쓸 수도 있고, HashSet, TreeSet 등으로 응용해서 같이 사용가능
		// Set은 Queue와 마찬가지로 생성자가 없다.
		// 생성자가 존재하는HashSet을 활용하여 객체를 생성
		
		Set<Integer> intSet = new HashSet<Integer>(); // 선언 및 생성
		
		// 데이터 추가
		intSet.add(1);
		intSet.add(12);
		intSet.add(5);
		intSet.add(9);
		intSet.add(1);
		intSet.add(12);
		
		// 중복이 된 1과 12는 하나씩만 저장된다.
		for(Integer value: intSet) {
			System.out.println(value);
//			1
//			5
//			9
//			12
		}
		
		// contains : 포함여부를 true false로 리턴
		System.out.println(intSet.contains(1));	// true
		System.out.println(intSet.contains(2));	// false
		
		
		
	}

}
