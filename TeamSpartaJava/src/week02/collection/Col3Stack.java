package week02.collection;

import java.util.Stack;

public class Col3Stack {

	public static void main(String[] args) {
		// stack
		// 수직으로 값을 쌓아놓고 넣었다가 뺀다. FILO
		// push(추가), peek(가장 마지막에 넣은 데이터를 조회), pop(가장 마지막에 넣은 데이터순으로 꺼내기) size(스택의 길이? 높이?)
		// 최근 저장된 데이터를 나열 또는 데이터의 중복처리를 막고 싶을 때 사용
		Stack<Integer> intStack = new Stack<Integer>();
		
		// 데이터 추가 push
		intStack.push(10);
		intStack.push(20);
		intStack.push(50);
		intStack.push(20);
		
		// isEmpty() : Stack이 비워져있으면 true, 데이터가 있으면 false를 리턴한다.
		// pop으로 출력을 하면 빠져나가는구나
		while(!intStack.isEmpty()) {
			// pop제일 위에 있는 데이터가 출력이 되면 서 빠져나간다.
			System.out.println(intStack.pop());
			System.out.println(intStack.toString());
			// 가장 늦게 쌓인 데이터순으로 출력이 된다.
//			20
//			[10, 20, 50]
//			50
//			[10, 20]
//			20
//			[10]
//			10
//			[]
		}
		// 다시 추가
		intStack.push(10);
		intStack.push(15);
		intStack.push(1);
		
		// peak 제일 위의 데이터를 조회 
		System.out.println(intStack.peek());
		System.out.println(intStack.size());
		
	}

}
