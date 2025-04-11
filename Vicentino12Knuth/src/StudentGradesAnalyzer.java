import java.util.Scanner;
 
public class StudentGradesAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("How many grades do you want to enter? ");
        int n = scanner.nextInt();
 
        int[] grades = new int[n];
 
        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }
 
        System.out.print("\nStudent Grades: ");
        for (int grade : grades) {
            System.out.print(grade + " ");
        }
 
        int max = grades[0], min = grades[0], sum = 0;
        for (int grade : grades) {
            if (grade > max) max = grade;
            if (grade < min) min = grade;
            sum += grade;
        }
 
        double avg = (double) sum / n;
 
        System.out.println("\nHighest Grade: " + max);
        System.out.println("Lowest Grade: " + min);
        System.out.println("Average Grade: " + avg);

        scanner.close();
    }
}