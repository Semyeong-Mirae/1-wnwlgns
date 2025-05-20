import java.util.Scanner;
interface Calculator {
    int add(int a, int b);

    default int multiply(int a, int b) {
        return a * b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }
}
 class SimpleCalculator implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleCalculator calc = new SimpleCalculator();

        int a = scanner.nextInt();


        int b = scanner.nextInt();

        System.out.println( calc.add(a, b));
        System.out.println( calc.multiply(a, b));
        System.out.println( Calculator.subtract(a, b));

        scanner.close();
    }
}
