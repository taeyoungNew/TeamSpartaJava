package week04.homeworkCalc;

// 입력받은 숫자와 연산자를 세팅
public class Calculator {
	// 입력받은 숫자
    private int firstNumber;
    private int secondNumber;
    // 입력받은 연산자
    // 타입이 인터페이스의 AbstractOperation
    private AbstractOperation operation;

    public Calculator() {
    
    }
    
    public Calculator(AbstractOperation operation) {
        this.operation = operation;
    }

    
    
    // 연산자 초기화
    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }
    // 첫번째 숫자 초기화
    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }
    // 두번째 숫자 초기화
    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    // 초기화한 연산자를 통한 계산
    public double calculate() {
        double answer = 0;
        answer = operation.operate(this.firstNumber, this.secondNumber);
        return answer;
    }

}
