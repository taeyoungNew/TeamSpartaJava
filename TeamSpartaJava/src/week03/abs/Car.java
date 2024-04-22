package week03.abs;

public abstract class Car {

	double speed;

	
	public double gasPedal(double kmh) {
		this.speed = kmh;
		return speed;
	}
	
	public double breakePadal() {
		speed = 0;
		return speed;
		
		
	}
	
	public abstract void horn() ;
}
