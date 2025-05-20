package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleCalculator calc = new SimpleCalculator();

        // 사용자 입력 받기
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int a = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int b = scanner.nextInt();

        // 연산 결과 출력
        System.out.println("덧셈 결과: " + calc.add(a, b));
        System.out.println("곱셈 결과: " + calc.multiply(a, b));
        System.out.println("뺄셈 결과: " + Calculator.subtract(a, b));

        scanner.close();
    }
}
