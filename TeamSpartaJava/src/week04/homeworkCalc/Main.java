package week04.homeworkCalc;
// AbstractOperation인터페이스에서 각 공통점인 '계산'을 추상메서드로 만든다.
// 더하기, 빼기. 나누기, 곱하기를 하는 각 클래스에서 AbstractOperation을 implements하여
// 각 클래스에 맞게 '계산'메서드를 구현한다.
// 그리고 흩어져있는 클래스들을 하나의 클래스에서 사용하기 쉽게하기위해 calculater클래스를 만들어서
// 거기서 멤버변수를 AbstractOperation타입으로 만들어 주고
// 생성자나 setOperation을 통해서 AbstractOperation인터페이스를 implements한 클래스의 객체(다형성)를 초기화를 한다.
// 그리고 calcurate메서드를 구현하여 두 정수를 받아서 AbstractOperation객체의 operate메서드에 두 정수를 보내어 
// 결과값을 리턴한다.


public class Main {
    public static void main(String[] args) {
    	boolean calculateEnded = false;
		// 구현 2.
       while(!calculateEnded) {
    	   try {
    		   calculateEnded = CalculatorApp.start();
    	   } catch (Exception e) {
    		   // TODO Auto-generated catch block
    		   System.out.println(e.getMessage());
    	   }
        	
        }
    }
}
