
//import scanner class from java.util package
import java.util.Scanner;

public class CookieCalorieCounter {
    public static void main(String[] args) {
        // set up scanner to read user input
        Scanner scanner = new Scanner(System.in);
        // prompt user for number of cookies eaten
        System.out.print("Enter number of cookies eaten: ");
        // store number of cookies eaten in variable
        int cookies = scanner.nextInt();
        // output number of calories consumed
        System.out.println("Your calorie intake was: " + (cookies * 75) + " calories");
        // close scanner to prevent resource leak
        scanner.close();

    }
}