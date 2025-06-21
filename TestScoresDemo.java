import java.util.InputMismatchException;
import java.util.Scanner;
public class TestScoresDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test scores: ");
        int numScores = sc.nextInt();
        int[] scores = new int[numScores];
        
            
           
            
            for(int i = 0; i < numScores; i++) {
                try{
                    if(numScores >= 0 || numScores <= 100) {
                        System.out.print("\nEnter score " + (i + 1) + ": ");
                        scores[i] = sc.nextInt();
                    }else{
                        throw new IllegalArgumentException("Number of scores must be greater than 0.");
                    }
                  }catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                 }
                  catch(IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                 }
                }
                
            
            TestScores test1 = new TestScores(scores);
            System.out.println("Average score: " + test1.getAverage());
       
       
    }
}