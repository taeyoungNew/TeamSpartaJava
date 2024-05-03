package week05.thread.modern;

import java.util.ArrayList;
import java.util.List;

// 함수를 넘겨주는 식으로 리팩토링

// 주차장 예제 
// 티켓, 파킹머니 => 주차하게 하는 
public class LambdaAndStream {
	public static void main(String[] args) {
		
		// 주차대상 차량
		ArrayList<Car> carsWantToPark = new ArrayList<>();
		
		// 주차장
		ArrayList<Car> parkingLot = new ArrayList<>();

		// 주말 주차장
		// 검증조건 : 티켓 + 돈 1000원 이상
		ArrayList<Car> weekendParkingLot = new ArrayList<>();
		
		// 5개의 car instance를 생성
		Car car1 = new Car("Benz", "Class E", true, 0);
		Car car2 = new Car("BMW", "Series 7", false, 100);
		Car car3 = new Car("BMW", "X9", false, 0);
		Car car4 = new Car("Audi", "A7", true, 0);
		Car car5 = new Car("Hyundai", "Ionic 6", false, 10000);

		// carsWantToPark라는 ArrayList에 하나씩 저장
		carsWantToPark.add(car1);
		carsWantToPark.add(car2);
		carsWantToPark.add(car3);
		carsWantToPark.add(car4);
		carsWantToPark.add(car5);

		
		// 티켓을 가지고 있는 차량인지 검증
		// parkingCarWithTicket메서드에 ArrayList를 매개변수로 넘긴다.
		// 리턴한 검증된 Car인스턴스가 담긴 cars ArrayList를 parkingLot ArrayList에 다시 담는다.
//		parkingLot.addAll(parkingCarWithTicket(carsWantToPark));
		
		
		// 돈이 있는 차량인지 검증
		// parkingCarWithTicket메서드에 ArrayList를 매개변수로 넘긴다.
//		parkingLot.addAll(parkingCarWithMoney(carsWantToPark));
		
		// 주차비나 티켓을 가지고 있는 인스턴스를 선별해서 parkingLot에 저장
		parkingLot.addAll(parkCars(carsWantToPark, Car::hasTicket));
		
		parkingLot.addAll(parkCars(carsWantToPark, Car::noTicketButMoney));
		
		// 익명함수 적용
		// 자바스크립트의 익명함수랑 비슷하네
		parkingLot.addAll(parkCars(carsWantToPark, (Car car) -> {return car.hasParkingTicket() && car.getParkingMoney() > 1000;}));
		
		
		
//		System.out.println("parkingLot = ");
		for (Car car : parkingLot) {
			System.out.println("Parked Car : " + car.getCompany() + "-" + car.getModel());
		}

	}
	
	// 매개변수로 메서드를 받을 때 타입을 어떻게 지정해야할까?
	// 타입 => (함수형) interface
	// 인터페이스는 타입 역할을 할 수 있기 때문이다.
	// 함수형 인터페이스 : 추상 메서드를 딱 하나만 가지고 있음 
	
	

	
	// 아래의 두개의 메서드는 유사하므로 하나로 합쳐보자
	// 티켓이 있는지 검증하는 메서드
//	public static List<Car> parkingCarWithTicket(List<Car> carsWantToPark) {
//		ArrayList<Car> cars = new ArrayList<>();
//		
//		// 매개변수로 넘겨받은 carsWantToPark ArrayList를
//		
//		for (Car car : carsWantToPark) {
//			// for:로 돌리면서 각 Car의 인스턴스중 hasParkingTicket이 true인 경우에만
//			if (car.hasParkingTicket()) {
//				// 위에서 선언만 cars ArrayList에 다시 add한다.
//				cars.add(car);
//			}
//		}
//		// 그리고 선별된 Car인스턴스들을 참조하고 있는 cars ArrayList를 리턴한다.
//		return cars;
//	}
//
//	// 돈이 1000원이상 있는 인스턴스인지 검증하는 메서드
//	public static List<Car> parkingCarWithMoney(List<Car> carsWantToPark) {
//		ArrayList<Car> cars = new ArrayList<>();
//	
//		for (Car car : carsWantToPark) {
//			// hasParkingTicket이 false이고 돈이 1000원이상 있으면
//			if (!car.hasParkingTicket() && car.getParkingMoney() > 1000) {
//				// cars ArrayList에 add한다.
//				cars.add(car);
//			}
//		}
//		// 그리고 선별된 Car인스턴스들을 add한 cars를 리턴한다.
//		return cars;
//	}
	
	
	// 위의 두 메서드를 하나로 : 내부 주요 로직을 함수로 전달받자
	public static List<Car> parkCars(List<Car> carsWantToPark, Predicate<Car> function) {
		List<Car> cars = new ArrayList<>();
		
		// 매개변수로 
		for(Car car : carsWantToPark) {
			System.out.println("car = " + car);
			// 전달된 함수를 사용하여 구현
			// function에서 테스트한다.
			if(function.test(car)) {
				cars.add(car);
			}
		}
		return cars;
	}
	
	
}

class Car {
	private final String company; // 자동차 회사
	private final String model; // 자동차 모델

	private final boolean hasParkingTicket;
	private final int parkingMoney;

	public Car(String company, String model, boolean hasParkingTicket, int parkingMoney) {
		this.company = company;
		this.model = model;
		this.hasParkingTicket = hasParkingTicket;
		this.parkingMoney = parkingMoney;
	}

	public String getCompany() {
		return company;
	}

	public String getModel() {
		return model;
	}

	public boolean hasParkingTicket() {
		return hasParkingTicket;
	}

	public int getParkingMoney() {
		return parkingMoney;
	}
	
	public static boolean hasTicket(Car car) {
		return car.hasParkingTicket;
	}
	
	public static boolean noTicketButMoney(Car car) {
		return !car.hasParkingTicket && car.getParkingMoney() > 1000;
	}
}

// 제네릭한 타입으로 no
interface Predicate<T> {
	boolean test(T t);
}
