package week04.homeworkCalc;

import java.util.Objects;
import java.util.regex.Pattern;

// parse : 어떤한 값으로 변형한다.
public class Parser {
	// 상수static멤버
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    // calcurator인스턴스 생성
    private final Calculator calculator = new Calculator();

    public Parser parseFirstNum(String firstInput) throws Exception {
    	// 예외처리
    	// 정규식표현식에 맞는지 확인
    	if(!Pattern.matches(NUMBER_REG, firstInput)) {
    		throw new BadInputException("정수값");
		} 
    	
    	// int타입으로 바꾼 데이터를 calcurator의 setFirtNumber로 세팅
    	this.calculator.setFirstNumber(Integer.parseInt(firstInput));
    	// this는 Parser를 의미
    	return this;
    }


	public Parser parseSecondNum(String secondInput) throws Exception {
    	
    	if(!Pattern.matches(NUMBER_REG, secondInput)) {
    		throw new BadInputException("정수값");
    		
		} 
    	this.calculator.setSecondNumber(Integer.parseInt(secondInput));
    	return this;
    }

    public Parser parseOperator(String operationInput) throws Exception {
    	// 구현 1.
    	if(!Pattern.matches(OPERATION_REG, operationInput)) {
    		throw new BadInputException("사칙연산자");
    	}
    	
    	// 입력한 연산자에 따라 Operation클래스객체를 calculator에 setOperation한다.
    	switch (operationInput) {
			case "+": {
				// AddOperation을 등록
				this.calculator.setOperation(new AddOperation());
				break;
			}
			case "-": {
				this.calculator.setOperation(new SubstractOperation());
	
				break;
			}
			case "*": {
				this.calculator.setOperation(new MultiplyOperation());
	
				break;
			}
			case "/": {
				this.calculator.setOperation(new DivideOperation());
				break;
			}
    	}
    	return this;
    }

    // 숫자와 연산자를 모두 set하면 마지막으로 연산을 하는 executeCalculator를 실행하면 
    // 계산결과가 나온다.
    public double executeCalculator() {
        return calculator.calculate();
    }
}