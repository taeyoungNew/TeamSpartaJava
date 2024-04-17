package week03.parameter;

import week03.parameter.Car;

public class Main {

	public static void main(String[] args) {
		// Car설계도를 통해 생성한 실체 객체
		Car car = new Car();
		Tire tire = new Tire();
		
		// 기본형 매개변수
		char type = 'D';
		car.breakPedal(type);
		
		// 메소드 실행완료 후 전달할 매개변수값으로 지정된 type값 확인
		System.out.println("type = " + type);	// D
		
		// 메서드 실행 완료 후 반환된 car인슨터스의 gear타입 확인
		System.out.println("gear = " + car.gear); // P
		
		System.out.println("------------------------------");
		
		Tire tire2 = new Tire();
		
		tire2.comppany = "금호";
		
	
		
		
		
		
		
		
//		System.out.println("car.model = " + car.model);
//		System.out.println("car.color = " + car.color);
//		System.out.println();
//		
//		System.out.println("car.speed = " + car.speed);
//		System.out.println("car.gear = " + car.gear);
//		System.out.println("car.lights = " + car.lights);
//		System.out.println();
//		
//		System.out.println("car.tire = " +  car.tire);
//		System.out.println("car.door = " + car.door);
//		System.out.println();
		
		
		// 필드 사용
		car.color = "blue";	// 필드 colordp "blue"데이터를 저장
		car.speed = 100;	 	
		car.lights = false;
		
		System.out.println("car.color = " + car.color);
		System.out.println("car.speed = " + car.speed);
		System.out.println("car.lights = " + car.lights);
		
		String numString = "하이";
		String numString2 = numString;
		
		System.out.println(numString + ", " + numString2); // 하이, 하이
		
		numString = "바이";
		System.out.println(numString + ", " + numString2); // 바이, 하이
	}

}
