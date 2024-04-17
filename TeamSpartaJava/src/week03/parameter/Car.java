package week03.parameter;

import week03.Door;
import week03.Handle;
import week03.Tire;

public class Car {
	// 클래스는 객체생성을 위한 설계도이다!!
	// [우리가 클래스를 만들기 위해서는 4가지 STEP이 필요]
	// 1. 만들려고 하는 설계도를 선언한다.(클래스선언) => 클래스생성임
	// 2. 객체가 가지고 있어야할 속성(필드)을 정의한다. => 전역변수?
	// 3. 객체를 생성하는 방식을 정의한다.(생성자) => constructer
	// 4. 객체가 가지고 있어야할 행위를 정의한다.(메서드)
	
	// 속성(필드)선언	<필드영역>
	// 1) 고유 데이터 영역 (변하지 않는 데이터)
	String companyString;	// 자동차 회사
	String model = "Gv80";				// 자동차 모델
	String color;				// 자동차 색상
	
	// 2) 상태 데이터 영역 (변하는데이터)
	double price;				// 자동차 가격
	double speed;				// 자동차 속도
	char gear;					// 자동차 기어상태(P, R, N, D)
	boolean lights = true; 			// 자동차 조명상태(true, false)
	
	// 객체데이터영역 (하위객체로 둘수 있는 객체데이터)
	Tire tire = new Tire();
	Door door;
	Handle handle;
	
	
	// 생성자생성	<생성자영역>
	// 처음 객체가 생성될 떄 어떤 로직을 수행해야 하며
	// 어떤 겂이 필수로 들어와야 하는지 정의
	public Car() {
		// logic
		// 기본생성자 : 생략이 가능
		
	}
	
	// 메서드정의 <메서드영역>
	// gasPedal
	// input : kmh, output : speed
	public double gasPedal(double kmh) {
		speed = kmh;
		return speed;
	}
	
	
	// breakPedal
	// input : X , output speed
	public double breakPedal(char type) {
		speed = 0;
		type = 'P';
		changeGear(type);
		return speed;
	}
	
	
	// changeGear
	// input : gear(P, R, N, D), output : gear(P, R, N, D)
	public char changeGear(char gear) {
		this.gear = gear;
		return this.gear;
		
	}
	
	
	// onOffLight
	// input : x, output : boolean
	public boolean onOffLight() {
		this.lights = !this.lights;
		return this.lights;
	}
	
	
	// horn
	// input : x, output : x
	public void horn() {
		System.out.println("빵빵");
	}

	
}
