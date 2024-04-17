package week02.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Col4Queue {

	public static void main(String[] args) {
		// Queue : 생성자가 없는 인터페이스, FIFO 원통모양 
		// 먼저 들어간 데이터가 먼저 나온다.
		// add(추가), peek(가장 먼저 넣은 데이터를 조회), poll(가장 먼저 넣은 데이터 순으로 꺼내기)
		
		// Queue는 생성자가 없기 때문에 직접 객체를 Queue로 만들수 없고 LinkedList로 만들어야 한다.
		Queue<Integer> intQueue = new LinkedList<>();	// 
		
		// 데이터 추가
		intQueue.add(1);
		intQueue.add(5);
		intQueue.add(9);
		
		// while문으로 조회
		while(!intQueue.isEmpty()) {
			// 앞서 Stack의 pop과 마찬가지로 poll로 데이터를 꺼내면 Queue안에 데이터는 사라짐
			// 단 Stack은 가장 마지막에 넣은 데이터가 나온다면 
			// Queue는 가장 먼저 들어간 데이터가 나옴
			System.out.println(intQueue.poll());
			// 1, 5, 9
		}
		// []
		System.out.println(intQueue.toString());

		// 데이터 추가
		intQueue.add(1);
		intQueue.add(5);
		intQueue.add(9);
		
		// peek(가장 먼저 넣은 데이터를 조회)
		System.out.println(intQueue.peek());	// 1
//		intQueue.add(1, 4); 중간에 추가하거나 수정은 안되네
		System.out.println(intQueue.size());
				
	}

}
