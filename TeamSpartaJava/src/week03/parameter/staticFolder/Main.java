package week03.parameter.staticFolder;

public class Main {

	public static void main(String[] args) {
		// 클래스 필드 company확인
		System.out.println(Car.company);
		// 클래스 필드 변경 및 확인
		// static메서드(클래스메서드) 
		Car.company = "Audi";	// 인스턴스화 안하고 바로 접근 가능
		
		System.out.println(Car.company);
		
		// 클래스 메서드 호출
		String companyNamString = Car.setCompany("Benz");
		System.out.println("companyNam = " + companyNamString);
		
		
		Car.company = "Ferrari";
		System.out.println(Car.company);
		
		
		
	}

}
