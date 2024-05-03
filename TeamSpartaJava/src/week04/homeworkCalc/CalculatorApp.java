package week04.homeworkCalc;

import java.util.Scanner;

public class CalculatorApp {

    public static boolean start() throws Exception{
    	// Parser인스턴스를 생성하고
        Parser parser = new Parser();
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력해주세요!");
        // 첫번째 숫자를 입력
        String firstInput = scanner.nextLine();
        parser.parseFirstNum(firstInput);

        // 연산자를 입력
        System.out.println("연산자를 입력해주세요!");
        String operator = scanner.nextLine();
        parser.parseOperator(operator);
        // 두번재 숫자를 입력
        System.out.println("두번째 숫자를 입력해주세요!");
        String secondInput = scanner.nextLine();
        parser.parseSecondNum(secondInput);

         // 모든 숫자와 연산자를 입력했다면 마지막으로 계산을 하는 메서드를 실행하여 
         // 결과값을 인출
        System.out.println("연산 결과 : " + parser.executeCalculator());
        return true;
    }


}