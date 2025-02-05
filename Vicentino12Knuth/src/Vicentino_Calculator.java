import java.util.Scanner;

public class Vicentino_Calculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("enter your first numebr here ");
            double num1 = scanner.nextDouble();
            
            System.out.print("enter your sencon numebr here");
            double num2 = scanner.nextDouble();
            
            double addition = num1 + num2;
            double subtraction = num1 - num2;
            double multiplication = num1 * num2;
            double division = (num2 != 0) ? num1 / num2 : Double.NaN;
            
            System.out.println("Addition: " + addition);
            System.out.println("Subtraction: " + subtraction);
            System.out.println("Multiplication: " + multiplication);
            System.out.println("Division: " + (num2 != 0 ? division : "Undefined (division by zero)"));
        }
    }
}
