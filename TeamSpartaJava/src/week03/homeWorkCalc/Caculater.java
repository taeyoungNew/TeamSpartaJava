package week03.homeWorkCalc;


public class Caculater {
	
	// AbstracOperation인터페이스타입의 객체를 생성
	private AbstractOperation operation;
	
	
	// 생성자
	public Caculater(AbstractOperation operation) {
		this.operation = operation;
	}
	
	public void setOperaion(AbstractOperation operaion) {
		this.operation = operaion;
	}
	
	public double calculate(int num1, int num2) {
		double answer = 0;
		answer = operation.operate(num1, num2);
		return answer;
	}
	
	
	
	
//	private final AddOperation addOperation;
//	private final SubstractOperation substractOperation;
//	private final DivideOperation divideOperation;
//	private final MultiplyOperation multiplyOperation;
//	
//	public Caculater(AddOperation addOperation, SubstractOperation substractOperation, DivideOperation divideOperation, MultiplyOperation multiplyOperation) {
//		this.addOperation = addOperation;
//		this.substractOperation = substractOperation;
//		this.divideOperation = divideOperation;
//		this.multiplyOperation = multiplyOperation;
//	}
////		AddOperation addOperation = new AddOperation();
////		DivideOperation divideOperation = new DivideOperation();
////		SubstractOperation substractOperation = new SubstractOperation();
////		MultiplyOperation multiplyOperation = new MultiplyOperation();
//		
//		
//		
//		
//	public  double calcurate(String op, int num1, int num2) {
//		double result = 0;
//		switch (op) {
//			case "+": {
//				result = addOperation.addOperation(num1, num2);
//				break;
//			}
//			case "-": {
//				result = substractOperation.substractOperation(num1, num2);	
//				break;
//			}
//			case "*": {
//				result = multiplyOperation.multiplyOperation(num1, num2);
//				break;
//			}
//			
//			case "/": {
//				result =  divideOperation.divideOperation(num1, num2);
//				break;
//			}
//			
//			case "%": {
//				result = num1 % num2;
//				break;
//			}
//		}
//		
//		return result;
//	}

}
