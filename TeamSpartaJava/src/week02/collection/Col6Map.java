package week02.collection;

import java.util.HashMap;
import java.util.Map;

public class Col6Map {

	public static void main(String[] args) {
		// Map : key : value 쌍으로 이루어진 자료구조
		// put(키 값 추가), get(key) => 그 key와 쌍으로된 value를 가져옴
		// key라는 값으로 unique하게 보장
		// Map는 생성자가 없으므로  => HashMap, TreeMap으로 응용가능하다.
		
		// key타입과 value타입을 정한다.
		Map<String, Integer> intMap = new HashMap<String, Integer>();
		
		// 키 값 추가
		intMap.put("일", 1);
		intMap.put("이", 2);
		intMap.put("삼", 3);
		intMap.put("사", 4);
		intMap.put("오", 5);
		intMap.put("육", 6);
		intMap.put("육", 15);
		
		// key값 전체를 출력(keySet())
		for(String key : intMap.keySet()) {
			System.out.println(key);
			// 데이터 조회가 순서대로 나오지 않는다.
			// 중복된 키는 마지막으로 초기화한 value만 저장된다.
//			육
//			이
//			오
//			일
//			삼
//			사

		}
		
		// value값 전체를 출력(.values())
		for(Integer val : intMap.values()) {
			System.out.println(val);
//			15	=> 마지막으로 저장한 "육"의 15라는 value가 저장
//			2
//			5
//			1
//			3
//			4
		}
		
		// 키를 이용하여 value를 가져오는 방식
		System.out.println(intMap.get("삼"));
	}

}
