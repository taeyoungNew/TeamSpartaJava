package week03;

public class Main {

	public static void main(String[] args) {
		// Car설계도를 통해 생성한 실체 객체
		Car car = new Car();
		
		System.out.println("car.model = " + car.model);
		System.out.println("car.color = " + car.color);
		System.out.println();
		
		System.out.println("car.speed = " + car.speed);
		System.out.println("car.gear = " + car.gear);
		System.out.println("car.lights = " + car.lights);
		System.out.println();
		
		System.out.println("car.tire = " +  car.tire);
		System.out.println("car.door = " + car.door);
		System.out.println();
		
		
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
