import java.util.Scanner;

public class LargerThanN {
    public static void main(String[] args) {
        // call the largerThanN method with default values
        LargerThanInt(null, 0);

        // call the largerThanN method with set array and n
        int[] array = { 10, 12, 15, 24 };
        LargerThanInt(array, 12);

    }

    public static void LargerThanInt(int[] array, int n) {
        if (array == null) {
            // initialize the scanner
            Scanner scanner = new Scanner(System.in);
            // prompt the user for input
            System.out.print("Enter a list of numbers separated by spaces: ");
            // store the user input in a string
            String input = scanner.nextLine();
            // split the string into an array of strings
            String[] numbers = input.split(" ");
            // initialize the array to the length of the numbers array
            array = new int[numbers.length];
            // loop through the numbers array and convert each string to an integer
            for (int i = 0; i < numbers.length; i++) {
                array[i] = Integer.parseInt(numbers[i]);
            }
            // prompt the user for a number
            System.out.print("Enter a number: ");
            // store the user input in the variable n
            n = scanner.nextInt();
            // loop through the array and print the numbers that are larger than n
            for (int i = 0; i < array.length; i++) {
                if (array[i] > n) {
                    System.out.println(array[i]);
                }
            }

        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > n) {
                    System.out.println(array[i]);
                }
            }

        }

    }

}
