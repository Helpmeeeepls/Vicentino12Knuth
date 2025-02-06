import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        double num1;
        double num2;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("enter 1st num here: ");
            num1 = scanner.nextDouble();
            System.out.println("enter 2nd num: " );
            num2 = scanner.nextDouble();
        }

        double result;

        result = num1 + num2;
        System.out.println("Addition: " + result);
 
        result = num1 - num2;
        System.out.println("Subtraction: " + result);
 
        result = num1 * num2;
        System.out.println("Multiplication: " + result);
 
        result = (double) num1 / num2;
        System.out.println("Division: " + result);
    }
}
