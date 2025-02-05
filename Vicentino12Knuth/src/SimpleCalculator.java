import java.util.Scanner;

public class SimpleCalculator { // Removed .java from class name
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            
            double addition = num1 + num2;
            double subtraction = num1 - num2;
            double multiplication = num1 * num2;
            double division = (num2 != 0) ? num1 / num2 : Double.NaN; // Avoid division by zero
            
            System.out.println("\nAddition: " + addition);
            System.out.println("Subtraction: " + subtraction);
            System.out.println("Multiplication: " + multiplication);
            System.out.println("Division: " + (num2 != 0 ? division : "Undefined (division by zero)"));
        }
    }
} // Ensure this closing brace is present
