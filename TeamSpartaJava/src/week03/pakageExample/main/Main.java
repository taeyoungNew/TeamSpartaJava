package week03.pakageExample.main;

import week03.pakageExample.pk1.Car;

public class Main {

	public static void main(String[] args) {
		// import로 패키지안에 있는 클래스에 접근하기
		Car car = new Car();
		car.horn();
		
		
		// 직접 패키지안에 있는 클래스에 접근하기
		week03.pakageExample.pk2.Car car2 = new week03.pakageExample.pk2.Car();
		car2.horn();
	}

}
