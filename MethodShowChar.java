import java.util.Scanner;
public class MethodShowChar {
    public static void main(String[] args){
        // call showChar method with default values
        showChar(null, 0);
        

    }
    public static void showChar(String text, int number){ 
        // initialize the scanner
        Scanner scanner = new Scanner(System.in);
        // prompt the user for input
        System.out.print("Enter a line of text: ");
        text = scanner.nextLine();
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        // print the result using .charAt method
        System.out.println("The character at index " + number + " is " + text.charAt(number));
        // close the scanner
        scanner.close();
    
    }
    
}
