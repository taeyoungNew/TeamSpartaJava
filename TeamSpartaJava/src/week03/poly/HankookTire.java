package week03.poly;

public class HankookTire extends Tire {

    public HankookTire(String company) {
        super(company);
    }

    // Tire의 rideComfort를 오버라이드
    @Override
    public void rideComfort() {
        System.out.println(super.company + " 타이어 승차감은 " + 100);
    }
}