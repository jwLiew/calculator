import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.print("Please Input Valid Number\n");
            System.out.print("Enter first number: ");
        }
        double num1 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.print("Please Input Valid Number\n");
            System.out.print("Enter second number: ");
        }

        double num2 = scanner.nextDouble();

        double result;

        result = switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> {
                if ( num2 == 0) {
                    System.out.println("Cant divide by zero");
                    yield 0;
                } else {
                    yield num1 / num2;
                }
            }
            default -> {
                    System.out.println("Invalid Operator");
                    yield 0;
            }
        };

        System.out.println("Result: " + result);
    }
}