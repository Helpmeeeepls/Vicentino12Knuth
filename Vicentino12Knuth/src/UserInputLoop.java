 
import java.util.Scanner;
 
public class UserInputLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter a word (type 'exit' to stop): ");
            String input = scanner.next();
 
            if (input.equals("exit")) {
                System.out.println("Program stopped.");
                break;
            }
        }
    }
}
 
 
 