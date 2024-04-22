package week03.abs;

public class Main {

	public static void main(String[] args) {
		Car car1 = new AudiCar();
		Car car2 = new BenzCar();
		Car car3 = new GenesisCar();
		
		car1.horn();
		car2.horn();
		car3.horn();

	}

}
