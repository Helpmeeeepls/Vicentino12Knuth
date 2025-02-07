import java.util.Scanner;
 
public class UserInput {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("enter your name: ");
            String name = scanner.nextLine();
 
            System.out.print("enter your age: ");
            int age = scanner.nextInt();

            System.out.print("enter your height: ");
            float height = scanner.nextFloat();
 
            System.out.print("enter your favorite number: ");
            int favoriteNumber = scanner.nextInt();
 
            int result = favoriteNumber * 2;
 
            System.out.println("Hello, " + name + "! You are " + age + " years old. your height is " + height + " meters tall. Your favorite number is " + favoriteNumber + ".");
            System.out.println("Your favorite number multiplied by 2 is: " + result);
        }
    }
}
