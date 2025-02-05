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
            double division = num1 / num2;
                    
            System.out.println("addition: " + addition);
            System.out.println("subtraction: " + subtraction);
            System.out.println("mltiplication: " + multiplication);
            System.out.println("division: " + division);
        }
    }
}
