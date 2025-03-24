import java.util.Scanner;
import java.io.*;

public class CharCounter {
    public static void main(String[] args) throws IOException {
        // initialize FileWriter
        FileWriter fileWriter = new FileWriter("mydata.txt");
        // create the data.txt file
        fileWriter.write("Tony Gaddis said:\r\n" +
                "a program is a set of instructions a computer follows in order to perform a task.\r\n" +
                "a programming language is a special language used to write computer programs.");
        // close the fileWriter
        fileWriter.close();
        // prompt user for input
        System.out.print("Enter a char: ");
        Scanner scanner = new Scanner(System.in);
        // store user input
        char c = scanner.next().charAt(0);
        // File reader
        File file = new File("mydata.txt");
        if (file.exists()) {
            // initialize counter
            int counter = 0;
            // initialize scanner
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                // read file
                String data = fileScanner.nextLine();
                // loop through the string
                for (int i = 0; i < data.length(); i++) {
                    // check if the char is equal to the user input
                    if (data.charAt(i) == c) {
                        // increment counter
                        counter++;
                    }
                }
            }
            // print the counter
            System.out.printf("The character '%c' appears %d times in the file mydata.txt", c, counter);

            // close fileScanner
            fileScanner.close();
        } else {
            System.out.println("File not found");
        }
        scanner.close();

    }

}
