import java.util.Scanner;

public class StudentGradeChecker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your grade (A-F): ");
            char grade = Character.toUpperCase(scanner.next().charAt(0));

        String message = switch (grade) {
            case 'A' -> "Excellent!";
            case 'B' -> "Good job!";
            case 'C' -> "You passed.";
            case 'D' -> "Needs improvement.";
            case 'F' -> "Failed.";
            default -> "Invalid grade.";
        };
        System.out.println(message);

            scanner.close();
            }
        }
    }

