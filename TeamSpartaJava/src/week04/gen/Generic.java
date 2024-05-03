package week04.gen;
// generic :  타입의 유연석
// 1. 제네릭은 클래스 또는 메서드에 사용가능
// <>안에 들어가야할 타입을 명시
// <T>를 붙여주면 Generic클래스가 된다.
//1.
public class Generic<T> {
     // 2. 내부필드에 String
	 private T t;
	 // 3.
	 public T get() {
	     return this.t;
	 }
	
	 public void set(T t) {
	     this.t = t;
	 }
	
	 public static void main(String[] args) {
          // 4.
	     Generic<String> stringGeneric = new Generic<>();
          // 5.
	     stringGeneric.set("Hello World");
	                             
	     String tValueTurnOutWithString = stringGeneric.get();
	
	     System.out.println(tValueTurnOutWithString);
	 }
}
