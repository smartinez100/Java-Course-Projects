import java.io.*;

public class NumbersFile {
    public static void main(String[] args) throws IOException {
        // create a new file writer object
        FileWriter fileWriter = new FileWriter("numbers.txt");
        // create a variable to store the length of the fibonacci sequence
        int fibonacciLength = 10;
        // initialize the first two numbers in the sequence
        int f0 = 0;
        int f1 = 1;
        // write header to file
        fileWriter.write("Fibonacci Sequence:\n");
        // write the first two numbers to the file
        fileWriter.write("f(0): " + f0 + "\n");
        fileWriter.write("f(1): " + f1 + "\n");
        // loop through the rest of the numbers
        for (int i = 3; i <= fibonacciLength; i++) {
            // calculate the next number in the sequence
            int f2 = f0 + f1;
            // update the previous two numbers
            f0 = f1;
            f1 = f2;
            // intialize mutable variable
            int j = i - 1;
            // write the number to the file
            fileWriter.write("f(" + j + "): " + f2 + "\n");
        }
        // close the file writer
        fileWriter.close();

    }
}
